package com.DH.instituto.model;

import com.DH.instituto.exception.OfertaAcademicaFactoryException;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instance;

    public static final String CODIGO_FULL_STACK = "full-stack";
    public static final String CODIGO_FRONT_END = "front-end";
    public static final String CODIGO_BACK_END = "back-end";
    public static final String CODIGO_INTRO_TESTING = "intro-testing";
    public static final String CODIGO_ADVANCE_TESTING = "advanced-testing";
    public static final String CODIGO_QA = "qa";

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance(){
        if(instance == null)
            instance = new OfertaAcademicaFactory();
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException {
        switch (codigo){
            case CODIGO_BACK_END:
                return new Curso("back-end", "se ensenia back-end", 20.0, 2.0, 900.0);
            case CODIGO_FRONT_END:
                return new Curso("front-end", "se ensenia front-end", 16.0, 2.0, 1000.0);
            case CODIGO_INTRO_TESTING:
                return new Curso("intro-testing", "se ensenia testing inicial", 16.0, 2.0, 1000.0);
            case CODIGO_ADVANCE_TESTING:
                return new Curso("advanced-testing", "se ensenia testing avanzado", 16.0, 2.0, 1000.0);
            case CODIGO_QA:
                ProgramaIntensivo programaIntensivoQa = new ProgramaIntensivo("qa", "todo sobre qa inicial", 10.0);
                programaIntensivoQa.agregarOfertaAcademica(generarOfertaAcademica(CODIGO_INTRO_TESTING));
                programaIntensivoQa.agregarOfertaAcademica(generarOfertaAcademica(CODIGO_ADVANCE_TESTING));
                return programaIntensivoQa;
            case CODIGO_FULL_STACK:
                ProgramaIntensivo programa = new ProgramaIntensivo("full-stack", "se ve de todo", 20.0);
                programa.agregarOfertaAcademica(generarOfertaAcademica(CODIGO_BACK_END));
                programa.agregarOfertaAcademica(generarOfertaAcademica(CODIGO_FRONT_END));
                programa.agregarOfertaAcademica(generarOfertaAcademica(CODIGO_QA));
                return programa; 
            default:
                throw new OfertaAcademicaFactoryException(codigo + " no es un codigo de curso o programa valido");
        }

    }

}
