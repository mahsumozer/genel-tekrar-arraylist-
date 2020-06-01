package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static String dizigonder(ArrayList<String> dizi){
        System.out.println(dizi);
        return null;
    }

        public static void main(String[] args) {
            int dizi[]={21,3,5,3,2,11};
            for(int eleman:dizi){
                System.out.println("for each dizi " +
                        "elemanlari ="+ eleman);
            }
            ////////////
            for(int eleman=0;eleman<dizi.length;eleman++){
                System.out.print(dizi[eleman]+"-");
            }


            System.out.println();


            //isimler dizimin olmasi lazim
            ArrayList<String> arrayList=new ArrayList<String>();
            arrayList.add("mehmet");
            arrayList.add("ayse");

        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println("===");
        dizigonder(arrayList);
        arrayList.add("mahsum");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
            System.out.println("===");
        try{
            System.out.println(arrayList.get(4));
        }catch(Exception e){
            System.out.println(e);
        }

        ////
            System.out.println("===");
        /////
            ArrayList<Object> a = new ArrayList<Object>();
            a.add("merhaba");
            a.add(454);
            System.out.println(a);
            System.out.println(a.contains(212));//boolean deger

            System.out.println("==");
        /////
            ArrayList b = new ArrayList();
            b.addAll(a);//liste kopyalama,,,
            System.out.println("Yeni dizi = " + b);
            //b.add(111);

            /////
            System.out.println(kontrol(a,b));
            System.out.println(b.equals(a));
//
            System.out.println("===");

            //onemsiz
            int []aa={21,222,1,44};
            int []aa2={21,222,44};
            Arrays.sort(aa);
            Arrays.sort(aa2);
            int k=Arrays.binarySearch(aa,2);
            System.out.println("sonuc="+k);
            System.out.println("ayni mi="+Arrays.equals(aa,aa2));
//ayni sonucu vermesi icin ikisinin de siralanmis yada siralanmamais olasi gerekiyor...
            System.out.println("===");
            ///
            Arrays.sort(aa,1,2);
            //sadece 1 ve 2. elemanlar
            //arasindaki elemanlari siraliyoruz bu sekilde...
            for (int eleman:aa) {
                System.out.println(eleman);
            }
            ///
            Arrays.fill(aa,100);
            //aa dizisinin tum elemanlarina
            //100 atadik
            ///

            //dizi kopyalama
            System.out.println("dizi kopyalama isi=");
            int dizimiz[]={21,2,11,1,6};
            int bos_dizimiz[]=Arrays.copyOf(dizimiz,10);
            bos_dizimiz[dizimiz.length]=99;
            bos_dizimiz[dizimiz.length+1]=999;
            for (int el:bos_dizimiz) {
                System.out.print("="+el);
            }
            //
            System.out.println();
            int aqq= (int) ((100) * Math.random());
            System.out.println("aqq="+aqq);
            //
            System.out.println("===");
            ArrayList deneme=new ArrayList();
            deneme.add(21);
            deneme.add(0,43);
            System.out.println(deneme);
        }
        static boolean kontrol(ArrayList a,ArrayList b){
            if (b.equals(a)) {
                return true;
        }
        return false;
        }
}
