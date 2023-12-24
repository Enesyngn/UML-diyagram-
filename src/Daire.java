public class Daire extends Konut implements Comparable<Daire>{

    private String ApartmanNo;//ApartmanNo değişkenini tanımkladık
    private int kiraFiyati;//kiraFiyati değişkenini tanımkladık
    private int daireNo;//daireNo değişkenini tanımkladık


    public Daire(String ApartmanNo, int kiraFiyati,  int daireNo) {
        super("hakan sok./karlıdere cad./cumhuriyet mah./Üsküdar/İstanbul");
        this.kiraFiyati = kiraFiyati;//değişkenleri denkledik
        this.daireNo = daireNo;//değişkenleri denkledik
        this.ApartmanNo= ApartmanNo;//değişkenleri denkledik
    }

    public String getApartmanNo() {//çağrıldığında ApartmanNo yansıtıcak
        return ApartmanNo;
    }

    public void setApartmanNo(String ApartmanNo) {//çağrıldığında ApartmanNo atanan değeri değiştirecek
        this.ApartmanNo = ApartmanNo;
    }

    public int getKiraFiyati() {//çağrıldığında kiraFiyati yansıtıcak
        return kiraFiyati;
    }

    public void setKiraFiyati(int kiraFiyati) {//çağrıldığında kiraFiyati atanan değeri değiştirecek
        this.kiraFiyati = kiraFiyati;
    }

    public  int getDaireNo() {//çağrıldığında daireNo yansıtıcak
        return daireNo;
    }

    public void setDaireNo(int daireNo) {//çağrıldığında daireNo atanan değeri değiştirecek
        this.daireNo = daireNo;
    }
    public void displayInfo() {
        System.out.println("Apartman Numarası " + ApartmanNo);
        System.out.println("Kira bedeli: " + kiraFiyati);
        System.out.println("Daire Nosu: " + daireNo);
        super.displayInfo();
        System.out.println("*****************************************************************");
    }

    @Override
    public int compareTo(Daire otherDaire) {//Karşılaştırmayı sağlayan implament bu fiyatları karşılaştırmayı sağlıyor
        return Integer.compare(this.kiraFiyati, otherDaire.kiraFiyati);
    }
}
