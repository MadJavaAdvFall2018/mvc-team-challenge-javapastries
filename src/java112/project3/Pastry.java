package java112.project3;

public class Pastry {

    private int od;
    private boolean nuts;  //allergy
    private String flavor;
    private String pastryName;
    private String pastryMessage;
/*
int od;  How many times have you overdosed on pastries in the past week? 0; 1-2; 3-5; 6+
bool nuts; Are you allergic to nuts? y / n
String flavor; cherry; ~apple~ lemon; chocolate; vanilla; (edited)

OD: 0-2 whatever, 3+ Death By Chocolate,
Nutallergy - whatever, no nut allergy whatever
Flavors: one option each for no-OD, one for OD

*/


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
        if (od > 2) {
            chooseIntensePastry();
        } else {
            chooseMildPastry();
        }
    }

    public void chooseIntensePastry() {
        if (flavor == "chocolate") {
            pastryName = "Death by Chocolate";
        } else if (flavor == "vanilla" ) {
            pastryName = "Foot Long Eclair";
        } else if (flavor == "cherry" ) {
            pastryName = "Mulled Cherry Bomb Pie";
            /* https://www.halfbakedharvest.com/mulled-cherry-bomb-pie/ */
        } else if (flavor == "lemon" ) {
            pastryName = "Limoncello Lemon Bar";
        }
    }

    public void chooseMildPastry() {
        if (flavor == "chocolate") {
            pastryName = "Baby Chocolate Puff";
        } else if (flavor == "vanilla" ) {
            pastryName = "Sugar Cookie";
        } else if (flavor == "cherry" ) {
            pastryName = "Mini Cherry Turnover";
        } else if (flavor == "lemon" ) {
            pastryName = "Lemon Tartlet";
        }
    }

    public void createMessage() {
        pastryMessage = "Sweet - your pastry personality is:" + pastryName + "!";
        if (nuts) {
            pastryMessage += "\n Always fun, never nuts!";
        }
    }

    public void run() {
        choosePastry();
        createMessage();
    }

}
