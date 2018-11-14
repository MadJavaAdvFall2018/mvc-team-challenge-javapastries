package java112.project3;

/**
 * A "Personal Pastry" chosen based on a user's habits and preferences.
 *
 * @author haandahl
 @ @author Team Lovelace
 */
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

    /**
     * Returns an integer representing a range of recent pastry overdoses.
     * Two digit numbers represent ends of the range, not a two-digit
     * integer.
     *
     * @return integer representing a range of recent pastry overdoses
     */
    public int getOd() {
        return od;
    }

    /**
     * Sets the "od" integer representing a range of recent pastry overdoses.
     * Two digit numbers represent ends of the range, not a two-digit
     * integer.
     *
     * @param od integer representing a range of recent pastry overdoses
     */
    public void setOd(int od) {
        this.od = od;
    }

    /**
     * Returns boolean representing whether a user is allergic to nuts
     *
     * @return boolean representing whether a user is allergic to nuts
     */
    public boolean isNuts() {
        return nuts;
    }

    /**
     * Sets
     *
     * @param
     */
    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    /**
     * Returns favorite flavor of the user
     *
     * @return favorite flavor of the user
     */
    public String getFlavor() {
        return flavor;
    }


        /**
         * Sets
         *
         * @param
         */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * Returns pastry name selected for the user
     *
     * @return pastry name selected for the user
     */
    public String getPastryName() {
        return pastryName;
    }

    /**
     * Sets pastry name selected for the user
     *
     * @param pastryName pastry name selected for the user
     */
    public void setPastryName(String pastryName) {
        this.pastryName = pastryName;
    }

    /**
     * Returns pastry message to display to the user
     *
     * @return pastry message to display to the user
     */
    public String getPastryMessage() {
        return pastryMessage;
    }

    /**
     * Sets pastry message to display to the user
     *
     * @param pastryMessage pastry message to display to the user
     */
    public void setPastryMessage(String pastryMessage) {
        this.pastryMessage = pastryMessage;
    }

    /**
     * Returns image tag corresponding to a pastry image
     *
     * @return image tag corresponding to a pastry image
     */
    public String getPastryImage() {
        return pastryImage;
    }

    /**
     * Sets image tag corresponding to a pastry image
     *
     * @param pastryImage image tag corresponding to a pastry image
     */
    public void setPastryImage(String pastryImage) {
        this.pastryImage = pastryImage;
    }

    /**
     * Chooses a pastry intensity and calls another function  to
     * choose the pastry name and image.  Calls either chooseMildPastry
     * method or chooseIntensePastry method depending on the user's level
     * of pastry overdosing in the past week.  Intense pastries are chosen
     * for people who have overdosed more than twice.
     */
    private void choosePastry() {
        if (od == 0 || od == 12) {
            chooseMildPastry();
        } else if (od == 35 || od == 6) {
            chooseIntensePastry();
        }
    }

    /**
     * Chooses among intense pastries for a user depending on their
     * favorite flavor and sets the pastry name and image.
     */
    private void chooseIntensePastry() {
        if (java.util.Objects.equals(flavor, "chocolate")) {
            pastryName = "Death by Chocolate";
            pastryImage = "<img src='images/death-by-chocolate-cake.jpg'>";
        } else if (java.util.Objects.equals(flavor, "vanilla")) {
            pastryName = "Mille Feuille";
            pastryImage = "<img src='images/mille-feuille.jpg'>";
        } else if (java.util.Objects.equals(flavor, "cherry")) {
            pastryName = "Mulled Cherry Bomb Clafoutis";
            /* https://www.halfbakedharvest.com/mulled-cherry-bomb-pie/ */
            pastryImage = "<img src='images/cherry-clafoutis.jpg'>";
        } else if (java.util.Objects.equals(flavor, "lemon")) {
            pastryName = "Lemon Curd Pavlova";
            pastryImage = "<img src='images/lemon-curd-pavlova.jpg'>";
        }
    }

    /**
     * Chooses among mild pastries for a user depending on their
     * favorite flavor and sets the pastry name and image.
     */
    private void chooseMildPastry() {
        if (java.util.Objects.equals(flavor, "chocolate")) {
            pastryName = "Cupcake";
            pastryImage = "<img src='images/choco-cupcake-vanilla-frosting.jpg'>";
        } else if (java.util.Objects.equals(flavor, "vanilla")) {
            pastryName = "Cream Pufflet";
            pastryImage = "<img src='images/vanilla-creampuff.jpg'>";
        } else if (java.util.Objects.equals(flavor, "cherry")) {
            pastryName = "Cherry Swiss Roll";
            this.pastryImage = "<img src='images/swissroll-cherry.jpg'>";
        } else if (java.util.Objects.equals(flavor, "lemon")) {
            pastryName = "Lemon Meringue Pie Cup";
            pastryImage = "<img src='images/lemon-meringue-pie-cups.jpg'>";
        }
    }
     /**
      * Creates a message for the user displaying the pastry name that fits
      * their pastry "personality" and adds a special slogan for people
      * allergic to nuts.
      */
    private void createMessage() {
        pastryMessage = "Sweet - your pastry personality is: " + pastryName + "!";
        if (nuts) {
            pastryMessage += "\n Always fun, never nuts!";
        }
    }

    /**
     * Serves as the organizing method for the Pastry class. Calls methods
     * that ultimately set the pastry name, image, and message.
     */
    public void run() {
        choosePastry();
        createMessage();
    }
}
