package com.objective.package05;

public class ObjectivePractice05_main {
    public static void main(String[] args){
//    オブジェクトの１の作成
        ObjectivePractice05 index = new ObjectivePractice05("名前","出身" );
        ObjectivePractice05 morita = new ObjectivePractice05("森田","奈良" );
        ObjectivePractice05 kimura = new ObjectivePractice05("木村","埼玉" );
        ObjectivePractice05 takayama = new ObjectivePractice05("高山","東京" );
        ObjectivePractice05 sigeki = new ObjectivePractice05("茂木","沖縄" );

        index.kadai();
        morita.kadai();
        kimura.kadai();
        takayama.kadai();
        sigeki.kadai();
    }
}
