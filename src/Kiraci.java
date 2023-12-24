public class Kiraci {

    private String ad;//ad değişkenini tanımkladık
    private String soyad;//soyad değişkenini tanımkladık
    public evSahibi evsahibi;//evsahibi değişkenini tanımkladık
    private Daire daire;//daire değişkenini tanımkladık
    public Kiraci(String ad, String soyad, evSahibi evsahibi) {
        this.ad = ad;//değişkenleri denkledik
        this.soyad = soyad;//değişkenleri denkledik
        this.evsahibi=evsahibi;//değişkenleri denkledik

    }

    public String getAd() {//çağrıldığında ad yansıtıcak
        return ad;
    }

    public void setAd(String ad) {//çağrıldığında ad atanan değeri değiştirecek
        this.ad = ad;
    }

    public String getSoyad() {//çağrıldığında soyad yansıtıcak
        return soyad;
    }

    public void setSoyad(String soyad) {//çağrıldığında soyad atanan değeri değiştirecek
        this.soyad = soyad;
    }
    public evSahibi getEvsahibi() {//çağrıldığında evsahibi yansıtıcak
        return evsahibi;
    }

    public void setEvsahibi(evSahibi evsahibi) {//çağrıldığında evsahibi atanan değeri değiştirecek
        this.evsahibi = evsahibi;
    }
    public Daire getDaire() {//çağrıldığında daire yansıtıcak
        return daire;
    }
    public void setDaire(Daire daire) {
        if (this.daire != null) {
            throw new RuntimeException("Kiracının birden fazla dairesi olamaz.");
        }
        this.daire = daire;
    }

    public void displayInfo() {
        System.out.println("Kiracının adı: " + ad +"   --   Kiracının soyadı:" + soyad+"   --      Kiracının evsahibi: " + evsahibi.getAd());


    }
}
