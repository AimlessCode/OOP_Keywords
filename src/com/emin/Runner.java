package com.emin;

import com.emin.entity.Musteri;

public class Runner {
    public static void main(String[] args) {

        Musteri mst=new Musteri();
        mst.ad="ahmet";
        mst.soyad="soyadı";
       //   mst.sayac=12;
        //-------

        Musteri mst2=new Musteri();
        mst2.ad="Dursun";
        mst2.soyad="Tarkan";
        //   mst2.sayac=40;
        //-------

        /**
         * Statik deişkenlerin new leyerek erişilmesine gerek yoktur;
         *
         */

        System.out.print("Müsteri1 : ");
        System.out.println(mst.ad +" "+mst.soyad);
        System.out.print("Sayaç : "+mst.sayac);
        System.out.println();


        System.out.print("Müsteri2 : ");
        System.out.println(mst2.ad +" "+mst2.soyad);
        System.out.print("Sayaç : "+mst2.sayac);
        System.out.println();



    }
}
