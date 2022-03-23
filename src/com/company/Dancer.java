package com.company;

public class Dancer extends PERSON {
    String bandName;
    public Dancer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    @Override
    public void leam(){
        System.out.println("tancor okyp jatat");

    }
    @Override
    public void walk(){
        System.out.println("tancor bacyp jatat");

    }
    @Override
    public void eat(){
        System.out.println("tansor ichip jatat");

    }
    public void singing(){
        System.out.println("tancor yrdap jatat");

    }
    public void playGitar(){
        System.out.println("tancor gitara oinop jatat");

    }


    @Override
    public String toString() {
        return "Dancer{name:" +getName()+"designation"+getDesignation()+
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                "bandName:"+bandName+
                '}';
    }
}


