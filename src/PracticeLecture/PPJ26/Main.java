package PracticeLecture.PPJ26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Tree[] forest = new Tree[20];

        Conifer conifer = new Conifer(true, 10, "okrąg", "Sosna pospolita", 50000, 12);
        Conifer conifer2 = new Conifer(true, 15, "owal", "Modrzew", 10000, 5);
        LeafyTree leafyTree = new LeafyTree(false, 8, "okrąg", "Dąb", "owal");
        LeafyTree leafyTree2 = new LeafyTree(false, 8, "okrąg", "Osika", "owal");
        FruitTree fruitTree = new FruitTree(false, 3, "koło", "Morelowiec", "owal", "morela");
        FruitTree fruitTree2 = new FruitTree(false, 3, "koło", "śliwa", "owal", "śliwka");

        for (int i = 0; i < forest.length; i++) {
            if ((int) (Math.random() * 10) <= 2) {
                forest[i] = conifer;
            } else if ((int) (Math.random() * 10) <= 4) {
                forest[i] = conifer2;
            } else if ((int) (Math.random() * 10) < 6) {
                forest[i] = leafyTree;
            } else if ((int) (Math.random() * 10) <= 7) {
                forest[i] = leafyTree2;
            } else if ((int) (Math.random() * 10) <= 9) {
                forest[i] = fruitTree;
            } else {
                forest[i] = fruitTree2;
            }
        }

        for (Tree tree : forest) {
            System.out.println(tree.toString());
            try {
                tree.save();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            try {
//                tree.getFruit();
//            } catch (WithoutFruits withoutFruits) {
//                withoutFruits.printStackTrace();
//            }
        }


    }
}

class Tree {
    private String treeName;
    private boolean evergreen;
    private int height;
    private String crossSection;

    public Tree(boolean evergreen, int height, String crossSection, String treeName) {
        this.evergreen = evergreen;
        this.height = height;
        this.crossSection = crossSection;
        this.treeName = treeName;
    }

    @Override
    public String toString() {
        String status = (evergreen) ? "jest " : "nie jest ";
        return treeName + " " + status + "wiecznie zielone \n" +
                "Przekrój drzewa: " + crossSection + "\n" +
                "Wysokość drzewa: " + height + " m\n";
    }

    void getFruit() throws WithoutFruits {
        throw new WithoutFruits();
    }


    public void save() throws IOException {
    }
}

class Conifer extends Tree {
    int amountOfNeedles;
    double lengthOfCone;

    public Conifer(boolean evergreen, int height, String crossSection, String treeName, int amountOfNeedles, double lengthOfCone) {
        super(evergreen, height, crossSection, treeName);
        this.amountOfNeedles = amountOfNeedles;
        this.lengthOfCone = lengthOfCone;
    }

    @Override
    public String toString() {
        return super.toString() + "Ilość igieł: " + amountOfNeedles + " \nDługość szyszki: " + lengthOfCone + "cm \n";
    }

    public void save() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Drzewa.txt", true);
        fileOutputStream.write(toString().getBytes());
        fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}

class LeafyTree extends Tree {
    String leafShape;

    public LeafyTree(boolean evergreen, int height, String crossSection, String treeName, String leafShape) {
        super(evergreen, height, crossSection, treeName);
        this.leafShape = leafShape;
    }

    @Override
    public String toString() {
        return super.toString() + "Kształt liścia: " + leafShape + "\n";
    }

    public void save() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Drzewa.txt", true);
        fileOutputStream.write(toString().getBytes());
        fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}

class FruitTree extends LeafyTree {
    private String fruitName;

    public FruitTree(boolean evergreen, int height, String crossSection, String treeName, String leafShape, String fruitName) {
        super(evergreen, height, crossSection, treeName, leafShape);
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return super.toString() + "Wydawany owoc: " + fruitName;
    }

    @Override
    void getFruit() throws WithoutFruits {
        System.out.println("zerwano owoc " + this.fruitName);
    }

    public void save() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Drzewa.txt", true);
        fileOutputStream.write(toString().getBytes());
        fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }

}

class WithoutFruits extends Exception {

}