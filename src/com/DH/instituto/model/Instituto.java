package com.DH.instituto.model;

import com.DH.instituto.exception.OfertaAcademicaFactoryException;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto() {
        this.ofertasAcademicas = new ArrayList<OfertaAcademica>();
    }

    public void agregarOferta(String codigo){
        try {
            ofertasAcademicas.add(OfertaAcademicaFactory.getInstance().generarOfertaAcademica(codigo));
        } catch (OfertaAcademicaFactoryException e) {
            e.printStackTrace();
        }
    }

    public void generarInforme(){
        for(OfertaAcademica oa : ofertasAcademicas) {
            System.out.println("nombre: " + oa.getNombre() + " precio: $" + oa.calcularPrecio());
        }
    }

}
