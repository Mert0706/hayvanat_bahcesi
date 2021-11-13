package com.bilgeadam.hayvanatbahcesi;


//Inheritance
//Superclass'ın özelliklerini subclass alıyor.
//Extends ile sağlanır.
public  class Kopek extends Hayvan {

    private String kopekCins;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }


    // Method overriding
    //Super Class Metodunu kendimize özgü yeniden yazıyoruz.
    public void sesCikar(){
        System.out.println("Auuuuuuu Hav hav");

    }

    @Override
    public String toString() {
        return  "Adı:"+getAd()+ "\n" +
                "Uzunluk:"+getUzunluk()+ "\n" +
                "Ağırlık:"+getAgirlik()+  "\n" +
                "Cins:" +getKopekCins();
    }
}
