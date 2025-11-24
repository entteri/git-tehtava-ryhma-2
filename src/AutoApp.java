public class AutoApp {
    public static void main(String[] args) throws Exception {

        // luodaan auto1 olio
        Auto auto1 = new Auto();
        auto1.merkki = "Cadillac";
        auto1.malli = "Escalade";
        auto1.bensanMaara = 100;

        auto1.naytaTiedot();
        auto1.kiihdyta();

        auto1.naytaTiedot();

        // luodaan auto2 olio
        Auto auto2 = new Auto("Cadillac", "STS", 0);

        auto2.naytaTiedot();
        auto2.kiihdyta();

        auto2.tankkaa(50);
        auto2.kiihdyta();
        auto2.naytaTiedot();

        //Akin auto-olio
        Auto auto3 = new Auto("Ford", "Mustang", 40);
        auto3.naytaTiedot();
        auto3.tankkaa(20);

        // Tuomaksen auto
        Auto auto4 = new Auto();
        
        auto3.merkki = "Mitsubishi";
        auto3.malli = "Spacestar";
        auto3.bensanMaara = 30;

        auto3.naytaTiedot();
        auto3.kiihdyta();
        auto3.naytaTiedot();

        //Veeran auto
        Auto auto5 = new Auto();
        auto5.merkki = "Toyota";
        auto5.malli = "Corolla";
        auto5.bensanMaara = 15;
        auto5.jarruta();
        auto5.tankkaa(50);
        auto5.kiihdyta();
        auto5.naytaTiedot();
        
    }
}

class Auto 
    {
    // Attribuutit

        public String merkki;
        public String malli;
        public int bensanMaara;

    // Konstruktori

    public Auto(String merkki, String malli, int bensanMaara) {
        this.merkki = merkki;
        this.malli = malli;
        this.bensanMaara = bensanMaara;
    }

    public Auto() {
        this.merkki = "Tuntematon";
        this.malli = "Tuntematon";
        this.bensanMaara = 0;
    }

    // Metodit

    public void jarruta()
        {
        System.out.println("Auto jarruttaa");
        }

    public void kiihdyta()
    {
        if (bensanMaara <= 0) 
        {
            System.out.println("Ei bensaa, ei voi kiihdyttää");
        } else {
            System.out.println("Auto kiihtyy");
            bensanMaara = this.bensanMaara - 1;
        }

    }

    public void naytaTiedot()
    {
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }

    public void tankkaa(int maara) 
    {
        System.out.println("Tankissa bensaa: " + this.bensanMaara);
        System.out.println("Tankkaus: " + maara);
        bensanMaara = this.bensanMaara + maara;
        System.out.println("Tankissa bensaa tankkauksen jälkeen: " + this.bensanMaara);
        
    }



    }
