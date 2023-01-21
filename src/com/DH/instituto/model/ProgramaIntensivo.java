package com.DH.instituto.model;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private List<OfertaAcademica> ofertasAcademicas;
    private Double descuento;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.ofertasAcademicas = new ArrayList<OfertaAcademica>();
        this.descuento = descuento/100;
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
        ofertasAcademicas.add(ofertaAcademica);
    }

    @Override
    public Double calcularPrecio() {
        Double sumaPrecios = 0.0;
        for(OfertaAcademica oa : ofertasAcademicas) {
            sumaPrecios += oa.calcularPrecio();
        }
        return sumaPrecios * (1 - descuento);
    }
}
