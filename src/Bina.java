public class Bina extends Konut{


        private String ad;//Ad değişkenini tanımkladık
        private int katsayisi;//Katsayi değişkenini tanımkladık


        public Bina(String ad, int katsayisi) {
            super("hakan sok./karlıdere cad./cumhuriyet mah./Üsküdar/İstanbul");//Süper sayesinde kalıtım yaptığımız classa değer atadık
            this.ad = ad;//değişkenleri denkledik
            this.katsayisi = katsayisi;//değişkenleri denkledik

        }

        public String getAd() {//çağrıldığında adı yansıtıcak
            return ad;
        }

        public void setAd(String ad) {//çağrıldığında ada atanan değeri değiştirecek
            this.ad = ad;
        }

        public int getKatsayisi() {//çağrıldığında katsayisinı yansıtıcak
            return katsayisi;
        }

        public void setKatsayisi(int katsayisi) {//çağrıldığında katsayisini atanan değeri değiştirecek
            this.katsayisi = katsayisi;
        }



        public void displayInfo() {
            System.out.println("Binanın adı :" + ad) ;
            System.out.println("Binanın Katsayısı :"+katsayisi);
            super.displayInfo();
            System.out.println("---------------------------------------------------------------------------------------------");
            }
        }


