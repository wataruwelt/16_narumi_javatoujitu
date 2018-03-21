package com.objective.package05;

public class ObjectivePractice05 {
    public String name;
    public String shussin;


    public ObjectivePractice05(String name, String shussin){
        this.name = name;
        this.shussin = shussin;
    }

    public void kadai(){
        System.out.println(
                 this.name + this.shussin);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getshussin() {
        return shussin;
    }
    public void setshussin(String shussin) {
        this.shussin = shussin;
    }
}
