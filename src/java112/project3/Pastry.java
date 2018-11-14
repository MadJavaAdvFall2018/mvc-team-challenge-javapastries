package java112.project3;

public class Pastry {

    private int od; // overdose
    private boolean nuts;  // allergy
    private String flavor;
    private String pastryName;
    private String pastryMessage;
    private String pastryImage;

    /**
     * Empty constructor for Pastry object
     */
    public Pastry() {
        // TODO default stuff??
    }

    /**
     * Constructor for Pastry object with all web user answers included
     * @param od how often the user overdosed on pastries
     * @param nuts whether the user has a nuts allergy
     * @param flavor user's favorite flavor
     */
    public Pastry (int od, boolean nuts, String flavor) {
        this.od = od;
        this.nuts = nuts;
        this.flavor = flavor;
    }

    public int getOd() {
        return od;
    }

    public void setOd(int od) {
        this.od = od;
    }

    public boolean isNuts() {
        return nuts;
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getPastryName() {
        return pastryName;
    }

    public void setPastryName(String pastryName) {
        this.pastryName = pastryName;
    }

    public String getPastryMessage() {
        return pastryMessage;
    }

    public void setPastryMessage(String pastryMessage) {
        this.pastryMessage = pastryMessage;
    }

    public void choosePastry() {
        if (od == 0 || od == 12) {
            chooseMildPastry();
        } else if (od == 35 || od == 6) {
            chooseIntensePastry();
        }
    }

    public void chooseIntensePastry() {
        if (java.util.Objects.equals(flavor, "chocolate")) {
            pastryName = "Death by Chocolate";
            pastryImage = "<img href='images/death-by-chocolate-cake.jpg'>";
        } else if (java.util.Objects.equals(flavor, "vanilla")) {
            pastryName = "Mille Feuille";
            pastryImage = "<img href='images/mille-feuille.jpg'>";
        } else if (java.util.Objects.equals(flavor, "cherry")) {
            pastryName = "Mulled Cherry Bomb Clafoutis";
            /* https://www.halfbakedharvest.com/mulled-cherry-bomb-pie/ */
            pastryImage = "<img href='images/cherry-clafoutis.jpg'>";
        } else if (java.util.Objects.equals(flavor, "lemon")) {
            pastryName = "Lemon Curd Pavlova";
            pastryImage = "<img href='images/lemon-curd-pavlova.jpg'>";
        }
    }

    public void chooseMildPastry() {
        if (java.util.Objects.equals(flavor, "chocolate")) {
            pastryName = "Cupcake";
            pastryImage = "<img href='images/choco-cupcake-vanilla.jpg'>";
        } else if (java.util.Objects.equals(flavor, "vanilla")) {
            pastryName = "Cream Pufflet";
            pastryImage = "<img href='images/vanilla-creampuff.jpg'>";
        } else if (java.util.Objects.equals(flavor, "cherry")) {
            pastryName = "Cherry Swiss Roll";
            pastryImage = "<img href='images/swissroll-cherry.jpg'>";
        } else if (java.util.Objects.equals(flavor, "lemon")) {
            pastryName = "Lemon Meringue Pie Cup";
            pastryImage = "<img href='images/lemon-meringue-pie-cups.jpg'>";
        }
    }

    public void createMessage() {
        pastryMessage = "Sweet - your pastry personality is: " + pastryName + "!";
        if (nuts) {
            pastryMessage += "\n Always fun, never nuts!";
        }
    }

    public void run() {
        choosePastry();
        createMessage();
    }
}
