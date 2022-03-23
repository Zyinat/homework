package com.company;

public class Singer extends PERSON {
    String groupName;
    public Singer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName=groupName;

    }
    @Override
    public void leam(){
        System.out.println("pevec yrdap jatat");

    }
    @Override
    public void walk(){
        System.out.println("pevec bacyp jatat");

    }
    @Override
    public void eat(){
        System.out.println("pevec ichip jatat");

    }
    public void dancing(){

    }

    @Override
    public String toString() {
        return "Singer{name:"+getName()+"designation"+getDesignation()+
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                "groupName:"+groupName+
                '}';
    }
}

