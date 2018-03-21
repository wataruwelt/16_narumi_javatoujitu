package com.objective.package06;

public class Coincase {
    public int gohyakumaisu;
    public int hyakumaisu;
    public int gojumaisu;
    public int jumaisu;
    public int gomaisu;
    public int itimaisu;

    public int maisu;

   public void addCoins(int shurui,int maisu){
        if(shurui==500){
           gohyakumaisu = maisu;
       }else if(shurui==100){
           hyakumaisu=maisu;
       }else if(shurui==50){
           gojumaisu=maisu;
       }else if(shurui==10){
           jumaisu=maisu;
       }else if(shurui==5){
           gomaisu=maisu;
       }else{
           itimaisu=maisu;
       }
   }

   public int getCoins(int shurui){
       if(shurui==500){
           return(gohyakumaisu);
       }else if(shurui==100){
           return(hyakumaisu);
       }else if(shurui==50){
           return(gojumaisu);
       }else if(shurui==10){
           return(jumaisu);
       }else if(shurui==5){
           return(gomaisu);
       }else{
           return(itimaisu);
       }

   }
    public int amountCoins(){
//       int sum = gohyakumaisu + hyakumaisu + gojumaisu + jumaisu + gomaisu + itimaisu;
       return(gohyakumaisu*500 + hyakumaisu*100 + gojumaisu*50 + jumaisu*10 + gomaisu*5 + itimaisu);
    }

}
