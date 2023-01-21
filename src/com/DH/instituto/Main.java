package com.DH.instituto;

import com.DH.instituto.model.Instituto;
import com.DH.instituto.model.OfertaAcademicaFactory;

public class Main {
    public static void main(String[] args) {

        Instituto dh = new Instituto();

        dh.agregarOferta(OfertaAcademicaFactory.CODIGO_FRONT_END);
        dh.agregarOferta(OfertaAcademicaFactory.CODIGO_BACK_END);
        dh.agregarOferta(OfertaAcademicaFactory.CODIGO_INTRO_TESTING);
        dh.agregarOferta(OfertaAcademicaFactory.CODIGO_ADVANCE_TESTING);
        dh.agregarOferta(OfertaAcademicaFactory.CODIGO_QA);
        dh.agregarOferta(OfertaAcademicaFactory.CODIGO_FULL_STACK);
        dh.agregarOferta("sarasa");
        dh.generarInforme();

    }
}