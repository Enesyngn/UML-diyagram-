public class evSahibi {


        private String ad;//ad değişkenini tanımkladık
        private String soyad;//soyad değişkenini tanımkladık
        private Bina bina;//bina değişkenini tanımkladık

        public evSahibi(String ad, String soyad,Bina bina) {
            this.ad = ad;//değişkenleri denkledik
            this.soyad = soyad;//değişkenleri denkledik
            this.bina = bina;//değişkenleri denkledik
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

        public Bina getBina() {//çağrıldığında bina yansıtıcak
            return bina;
        }

        public void setBina(Bina bina) {//çağrıldığında bina atanan değeri değiştirecek
            if (this.bina != null) {
                throw new RuntimeException("Ev Sahibinin binası Yok yani Ev sahibi değil ");
            }
            this.bina = bina;
        }

        public void displayInfo() {
            System.out.println("Ev sahibi adı: " + ad);
            System.out.println("Ev Sahibinin soyadı: " + soyad);
            System.out.println("*****************************************************************");


        }


}
