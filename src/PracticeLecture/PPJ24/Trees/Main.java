package PracticeLecture.PPJ24.Trees;

public class Main {
    public static void main(String[] args) {
        Conifer conifer = new Conifer(true, 30, "Owalny", 30000, 12);
        System.out.println(conifer.toString());

        FruitTree fruitTree = new FruitTree(false, 3, "Okrągły", "Owalny", "Jabłko");
        System.out.println(fruitTree.toString());
    }
}

class Tree {
    private boolean evergreen;
    private int height;
    private String crossSection;

    public Tree(boolean evergreen, int height, String crossSection) {
        this.evergreen = evergreen;
        this.height = height;
        this.crossSection = crossSection;
    }

    @Override
    public String toString() {
        String status = (evergreen) ? "jest " : "nie jest ";
        return "Podane drzewo " + status + "wiecznie zielone \n" +
                "Przekrój drzewa: " + crossSection + "\n" +
                "Wysokość drzewa: " + height + " m\n";
    }
}

class Conifer extends Tree {
    int amountOfNeedles;
    double lengthOfCone;

    public Conifer(boolean evergreen, int height, String crossSection, int amountOfNeedles, double lengthOfCone) {
        super(evergreen, height, crossSection);
        this.amountOfNeedles = amountOfNeedles;
        this.lengthOfCone = lengthOfCone;
    }

    @Override
    public String toString() {
        return super.toString() + "Ilość igieł: " + amountOfNeedles + " \nDługość szyszki: " + lengthOfCone + "cm \n";
    }
}

class LeafyTree extends Tree {
    String leafShape;

    public LeafyTree(boolean evergreen, int height, String crossSection, String leafShape) {
        super(evergreen, height, crossSection);
        this.leafShape = leafShape;
    }

    @Override
    public String toString() {
        return super.toString() + "Kształt liścia: " + leafShape + "\n";
    }
}

class FruitTree extends LeafyTree {
    private String fruitName;

    public FruitTree(boolean evergreen, int height, String crossSection, String leafShape, String fruitName) {
        super(evergreen, height, crossSection, leafShape);
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return super.toString() + "Wydawany owoc: " + fruitName;
    }
}