package com.company.Pamoka_6_static_obj;

public class Asmuo {
    public static void main(String[] args) {


    }

    private String vardas;
    private String pavarde;
    private byte amzius;

    public Asmuo(String vardas, String pavarde, byte amzius) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public byte getAmzius() {
        return amzius;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setAmzius(byte amzius) {
        this.amzius = amzius;
    }

    public void nekoNeGrazinu() {
        System.out.println("Aš neko ne grazinu");
    }

    public int grazinuSkaiciusPriimaVardas(String vard) {
        return vard.length();
    }

    public int grazinuSkaiciusNekoNePriimu() {
        return getVardas().length();
    }

    public String canDrink() {
        return amzius >= 21 ? "You can dirnk" : "you cant drink";
    }


}
