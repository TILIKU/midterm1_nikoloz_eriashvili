package midterm.nikoloz_eriashvili_1.task3;

public class GardenTester {
    public static void main(String[] args) {

        Flower f1 = new Flower();
        f1.setSpecies("Rose");
        f1.setColor("Red");
        f1.setAllergyProvoking(false);


        Flower f2 = new Flower();
        f2.setSpecies("Tulip");
        f2.setColor("Orange");
        f2.setAllergyProvoking(true);


        GardenManagementSystem gms = new GardenManagementSystem();
        gms.addFlower(f1);
        gms.addFlower(f1);
        gms.addFlower(f2);
        gms.removeFlower(f1);
        gms.printGarden();
    }
}

