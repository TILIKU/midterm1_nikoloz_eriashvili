package midterm.nikoloz_eriashvili_1.task3;

import java.util.ArrayList;
import java.util.List;
public class GardenManagementSystem {
    // Mapping with Flower and the number of this flowers in the library
    private List<Flower> garden = new ArrayList<Flower>();
    // adds the flower to the garden
    public void addFlower(Flower flower) {
        garden.add(flower);
    }
    // removes the flower from the garden
    public boolean removeFlower(Flower flower) {
        boolean removed = false;
        for (int i = 0; i < garden.size(); i++) {
            Flower f = garden.get(i);
            if (f.getSpecies().equals(flower.getSpecies()) && f.getColor().equals(flower.getColor())) {
                garden.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }
    public void printGarden() {
        if (garden.isEmpty()) {
            System.out.println("The garden is empty");
        } else {
            for (Flower f : garden) {
                System.out.println(f.getSpecies() + ", " + f.getColor() + ", allergy provoking:" + f.getAllergyProvoking());
                System.out.println();
            }
        }
    }
}