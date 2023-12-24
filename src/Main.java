public class Main {

    public static void main(String[] args) {



        Daire daire1 = new Daire("101", 100,1);//Daire nesnesini newleyerek olduşturduk
        Daire daire2 = new Daire("101", 150, 2);//Daire nesnesini newleyerek olduşturduk
        Daire daire3 = new Daire("101", 200, 3);//Daire nesnesini newleyerek olduşturduk
        Daire daire4 = new Daire("101", 50, 4);//Daire nesnesini newleyerek olduşturduk
        Daire daire5 = new Daire("101", 125, 5);//Daire nesnesini newleyerek olduşturduk
        Daire daire6 = new Daire("101", 115, 6);//Daire nesnesini newleyerek olduşturduk




        Bina bina1 = new Bina("Pehlivan", 6);//Bina nesnesini newleyerek olduşturduk
        Bina bina2 = new Bina("Pehlivan", 6);//Bina nesnesini newleyerek olduşturduk
        Bina bina3=new Bina("Pehlivan",6);//Bina nesnesini newleyerek olduşturduk
        Bina bina4=new Bina("Pehlivan",6);//Bina nesnesini newleyerek olduşturduk
        Bina bina5=new Bina("Pehlivan",6);//Bina nesnesini newleyerek olduşturduk
        Bina bina6=new Bina("Pehlivan",6);//Bina nesnesini newleyerek olduşturduk


        evSahibi evsahibi1=new evSahibi("Batuhan", "Seyrek",bina1);//evSahibi nesnesini newleyerek olduşturduk
        evSahibi evSahibi2=new evSahibi("Arzu", "Seyrek",bina2);//evSahibi nesnesini newleyerek olduşturduk
        evSahibi evSahibi3=new evSahibi("Arzu", "Seyrek",bina3);//evSahibi nesnesini newleyerek olduşturduk
        evSahibi evSahibi4=new evSahibi("Batuhan", "Seyrek",bina4);//evSahibi nesnesini newleyerek olduşturduk
        evSahibi evSahibi5=new evSahibi("Burak", "Seyrek",bina5);//evSahibi nesnesini newleyerek olduşturduk
        evSahibi evSahibi6=new evSahibi("Serkan", "Seyrek",bina6);//evSahibi nesnesini newleyerek olduşturduk

        // Kiracı nesneleri oluştur
        Kiraci kiraci1 = new Kiraci("Ahmet", "Çalışkan", evsahibi1);//Kiracı nesnesini newleyerek olduşturduk
        Kiraci kiraci2 = new Kiraci("Batuhan", "Sal", evSahibi2);//Kiracı nesnesini newleyerek olduşturduk
        Kiraci kiraci3 = new Kiraci("Salkım", "Sal", evSahibi3);//Kiracı nesnesini newleyerek olduşturduk
        Kiraci kiraci4 = new Kiraci("Seyrek", "Sal", evSahibi4);//Kiracı nesnesini newleyerek olduşturduk
        Kiraci kiraci5 = new Kiraci("Ebru", "Sal", evSahibi6);//Kiracı nesnesini newleyerek olduşturduk
        Kiraci kiraci6 = new Kiraci("Yavuz", "Sal", evSahibi5);//Kiracı nesnesini newleyerek olduşturduk

        // Kiracılara daireler ata
        kiraci1.setDaire(daire1);//Kiracıyı bir daireye atadık
        kiraci2.setDaire(daire2);//Kiracıyı bir daireye atadık
        kiraci3.setDaire(daire3);//Kiracıyı bir daireye atadık
        kiraci4.setDaire(daire4);//Kiracıyı bir daireye atadık
        kiraci5.setDaire(daire5);//Kiracıyı bir daireye atadık
        kiraci6.setDaire(daire6);//Kiracıyı bir daireye atadık

        // Kiracıların bilgilerini göster
        System.out.println("Kiracılar:");
        System.out.println("---------------------------------------------------------------------------------------------");
        kiraci1.displayInfo();
        kiraci2.displayInfo();
        kiraci3.displayInfo();
        kiraci4.displayInfo();
        kiraci5.displayInfo();
        kiraci6.displayInfo();
        System.out.println("---------------------------------------------------------------------------------------------");
        // Dairelerin bilgilerini göster
        System.out.println("Daireler:");
        System.out.println("*****************************************************************");
        daire1.displayInfo();
        daire2.displayInfo();
        daire3.displayInfo();
        daire4.displayInfo();
        daire5.displayInfo();
        daire6.displayInfo();
        System.out.println("Binalar:");
        System.out.println("---------------------------------------------------------------------------------------------");
        bina1.displayInfo();
        bina2.displayInfo();
        bina3.displayInfo();
        bina4.displayInfo();
        bina5.displayInfo();
        bina6.displayInfo();

    }
}
