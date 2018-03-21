package com.objective.package06;

public class ObjectPractice06 {
     public
    int[] coincase = new int[5];
    public int shurui;
    public int maisu;

    int sum = coincase[0]+coincase[1]+coincase[2]+coincase[3]+coincase[4]+coincase[5];

    public ObjectPractice06(int shurui, int maisu){

        this.shurui = shurui;
        this.maisu = maisu;
    }

    public void kadai(){
        System.out.println(
         this.shurui +"円が" + this.maisu +"枚" );
    }
    public int getshurui(){
        return this.shurui;
    }
    public void setName(int shurui){
        this.shurui = shurui;
    }

    public int getCount() {
        return (sum);
    }
    public int getAmount() {
        return (sum);
    }

//    public int getmaisu() {
//        return maisu;
//    }
//    public void setmaisu(int maisu) {
//        this.maisu = maisu;
//    }
//
//
//    public final long getCount(int shurui){
//        return maisu;
//    }

}
