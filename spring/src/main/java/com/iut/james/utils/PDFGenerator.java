package com.iut.james.utils;


import com.itextpdf.layout.element.Paragraph;



public class PDFGenerator {



    public static void ajouterSautLignes(Paragraph p, int number){
        for (int i=0;i<number;i++){
            p.add(new Paragraph(" "));
        }
    }
}
