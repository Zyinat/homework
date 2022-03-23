package com.company;

public class Programmer extends PERSON{
    String companyName;
    public Programmer(String name, String designation, String  companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void leam() {
        System.out.println("pragramist okyp jatat");

    }@Override
    public void walk(){
        System.out.println("programist gulyet");

    }
    @Override
    public void eat() {
        System.out.println("programist kushaet");

    }
    public void coding(){
        System.out.println("programist kod jazyp jatat");

    }

    @Override
    public String toString() {
        return "Programmer{"+
                "name='" + name + '\'' +
                " designation='" + designation + '\'' +
                "companyName:"+companyName+
                '}';
    }
}


