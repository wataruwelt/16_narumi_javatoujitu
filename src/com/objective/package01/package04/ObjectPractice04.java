package com.objective.package01.package04;

public class ObjectPractice04 {
        public String name;
    public String shussin;


    public ObjectPractice04(String name, String shussin){
        this.name = name;
        this.shussin = shussin;
    }

    public void kadai(){
        System.out.println(
                "私の名前" + this.name + "です。" +  this.shussin + "出身");
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
