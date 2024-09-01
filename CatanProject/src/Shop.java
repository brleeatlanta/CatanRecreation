import java.util.ArrayList;
public class Shop {
    private int wood;
    private int brick;
    private int stone;
    private int wool;
    private int wheat;
    private int paper;
    private int coin;
    private int cloth;

    private int chits;
    private int fishHauls;
    private int spiceSacks;
    private int defenderOfCatan;

    private Metropolis[] metropolis;
    private boolean longestRoad;
    private boolean largestArmy;

    private ArrayList<Card> developmentCards;
    private ArrayList<Card> greenProgressCards;
    private ArrayList<Card> blueProgressCards;
    private ArrayList<Card> yellowProgressCards;

    public void initializeBase() {
        wood = brick = stone = wool = wheat = 19;
        initializeDevelopmentCards();
        longestRoad = true;
        largestArmy = true;
    }
    public void initializeBaseExpansion() {
        wood = brick = stone = wool = wheat = 24;
        initializeDevelopmentCards();
        longestRoad = true;
        largestArmy = true;
    }
    public void initializeCitiesKnights() {
        initializeBase();
        paper = coin = cloth = 12;
        defenderOfCatan = 6;
        metropolis = new Metropolis[3];
        metropolis[0] = new Metropolis("green");
        metropolis[1] = new Metropolis("blue");
        metropolis[2] = new Metropolis("yellow");
        initializeProgressCards();
    }
    public void initializeSeafarers() {
        initializeBase();
        chits = 50;
    }

    public void initializeDevelopmentCards() {
        for (int i = 0; i < 14; i++) {
            developmentCards.add(new Card("Knight", "Move the robber. Steal 1 resource from the owner of a settlement or city adjacent to the robber's new hex."));
        }
        developmentCards.add(new Card("University", "1 Victory Point!"));
        developmentCards.add(new Card("Great Hall", "1 Victory Point!"));
        developmentCards.add(new Card("Library", "1 Victory Point!"));
        developmentCards.add(new Card("Market", "1 Victory Point!"));
        developmentCards.add(new Card("Chapel", "1 Victory Point!"));
        developmentCards.add(new Card("Road Building", "Place two new roads as if you had just built them."));
        developmentCards.add(new Card("Road Building", "Place two new roads as if you had just built them."));
        developmentCards.add(new Card("Year of Plenty", "Take any two resources from the bank. Add them to your hand. They can be two of the same resource or two different resources."));
        developmentCards.add(new Card("Year of Plenty", "Take any two resources from the bank. Add them to your hand. They can be two of the same resource or two different resources."));
        developmentCards.add(new Card("Monopoly", "When you play this card, announce one type of resource. All other players must give you all of their resources of that type."));
        developmentCards.add(new Card("Monopoly", "When you play this card, announce one type of resource. All other players must give you all of their resources of that type."));
    }
    public void initializeProgressCards() {
        greenProgressCards.add(new Card("Alchemist", "Play this card before you roll the dice. You decide what the results of both numbered dice will be. Then roll the event die normally. Resolve the event die first."));
        greenProgressCards.add(new Card("Alchemist", "Play this card before you roll the dice. You decide what the results of both numbered dice will be. Then roll the event die normally. Resolve the event die first."));
        greenProgressCards.add(new Card("Crane", "One city improvement (abbey, town hall, etc.) that you build this turn costs one less commodity than usual."));
        greenProgressCards.add(new Card("Crane", "One city improvement (abbey, town hall, etc.) that you build this turn costs one less commodity than usual."));
        greenProgressCards.add(new Card("Engineer", "You may build 1 city wall for free."));
        greenProgressCards.add(new Card("Inventor", "You may swap 2 number tokens of your choice on the game board. You may not choose any 2, 12, 6, 0r 8 tokens."));
        greenProgressCards.add(new Card("Inventor", "You may swap 2 number tokens of your choice on the game board. You may not choose any 2, 12, 6, 0r 8 tokens."));
        greenProgressCards.add(new Card("Irrigation", "You may take 2 grain cards from the bank for each fields hex which is adjacent to at least one of your cities or settlements."));
        greenProgressCards.add(new Card("Irrigation", "You may take 2 grain cards from the bank for each fields hex which is adjacent to at least one of your cities or settlements."));
        greenProgressCards.add(new Card("Medicine", "For 2 ore and 1 grain, you may upgrade one of your settlements into a city."));
        greenProgressCards.add(new Card("Medicine", "For 2 ore and 1 grain, you may upgrade one of your settlements into a city."));
        greenProgressCards.add(new Card("Mining", "You may take 2 ore cards from the bank for each mountains hex adjacent to at least one of your cities or settlements."));
        greenProgressCards.add(new Card("Mining", "You may take 2 ore cards from the bank for each mountains hex adjacent to at least one of your cities or settlements."));
        greenProgressCards.add(new Card("Printer", "1 Victory Point! Reveal this card immediately when you draw it. This card cannot be stolen by a spy."));
        greenProgressCards.add(new Card("Road Building", "When you play this card, you may place 2 roads for free (if playing with Catan: Seafarers, you may place 2 ships or 1 ship and 1 road instead)."));
        greenProgressCards.add(new Card("Road Building", "When you play this card, you may place 2 roads for free (if playing with Catan: Seafarers, you may place 2 ships or 1 ship and 1 road instead)."));
        greenProgressCards.add(new Card("Smith", "You may promote up to 2 of your knights for free (the normal rules for promoting knights still apply). Mighty knights may not be promoted."));
        greenProgressCards.add(new Card("Smith", "You may promote up to 2 of your knights for free (the normal rules for promoting knights still apply). Mighty knights may not be promoted."));

        blueProgressCards.add(new Card("Bishop", "Move the robber. You may draw 1 random card (resource or commodity) from the hand of each player who has a settlement or city adjacent to the robber's new hex."));
        blueProgressCards.add(new Card("Bishop", "Move the robber. You may draw 1 random card (resource or commodity) from the hand of each player who has a settlement or city adjacent to the robber's new hex."));
        blueProgressCards.add(new Card("Constitution", "1 Victory Point! Reveal this card immediately when you draw it. This card cannot be stolen by a spy."));
        blueProgressCards.add(new Card("Deserter", "Choose 1 opponent. They must remove 1 knight of their choice from the board. You may place 1 of your own knights on the board (its strength must be equal to the knight removed)."));
        blueProgressCards.add(new Card("Deserter", "Choose 1 opponent. They must remove 1 knight of their choice from the board. You may place 1 of your own knights on the board (its strength must be equal to the knight removed)."));
        blueProgressCards.add(new Card("Diplomat", "You may remove any open road (a road with nothing attached at one end). If you remove one of your own roads, you may place it in another location"));
        blueProgressCards.add(new Card("Diplomat", "You may remove any open road (a road with nothing attached at one end). If you remove one of your own roads, you may place it in another location"));
        blueProgressCards.add(new Card("Intrigue", "You may displace one of your opponent's knights without using a knight of your own. The knight must be on an intersection connected to one of your roads or lines of ships."));
        blueProgressCards.add(new Card("Intrigue", "You may displace one of your opponent's knights without using a knight of your own. The knight must be on an intersection connected to one of your roads or lines of ships."));
        blueProgressCards.add(new Card("Saboteur", "Each player who has as many or more victory points than you must discard half of their own cards to the bank (resource and/or commodity)."));
        blueProgressCards.add(new Card("Saboteur", "Each player who has as many or more victory points than you must discard half of their own cards to the bank (resource and/or commodity)."));
        blueProgressCards.add(new Card("Spy", "Examine an opponent's hand of progress cards. You may take 1 card of your choice and add it to your hand."));
        blueProgressCards.add(new Card("Spy", "Examine an opponent's hand of progress cards. You may take 1 card of your choice and add it to your hand."));
        blueProgressCards.add(new Card("Spy", "Examine an opponent's hand of progress cards. You may take 1 card of your choice and add it to your hand."));
        blueProgressCards.add(new Card("Warlord", "You may activate all of your knights for free."));
        blueProgressCards.add(new Card("Warlord", "You may activate all of your knights for free."));
        blueProgressCards.add(new Card("Wedding", "Each player who has more victory points than you must give you 2 cards of their choice (resource and/or commodity)."));
        blueProgressCards.add(new Card("Wedding", "Each player who has more victory points than you must give you 2 cards of their choice (resource and/or commodity)."));

        yellowProgressCards.add(new Card("Commercial Harbor", "You may offer each opponent 1 resource card from you hand. In exchange, each player must give you 1 commodity card of their choice. If they have none, your resource card is returned."));
        yellowProgressCards.add(new Card("Commercial Harbor", "You may offer each opponent 1 resource card from you hand. In exchange, each player must give you 1 commodity card of their choice. If they have none, your resource card is returned."));
        yellowProgressCards.add(new Card("Master Merchant", "Select an opponent who has more victory points than you. You may examine their hand of resource and commodity cards and select any 2 cards, which you may add to your hand."));
        yellowProgressCards.add(new Card("Master Merchant", "Select an opponent who has more victory points than you. You may examine their hand of resource and commodity cards and select any 2 cards, which you may add to your hand."));
        yellowProgressCards.add(new Card("Merchant", "Place the merchant on a land hex next to your settlement or city. While the merchant remains here, you may trade the resource produced by this terrain at a 2:1 ratio."));
        yellowProgressCards.add(new Card("Merchant", "Place the merchant on a land hex next to your settlement or city. While the merchant remains here, you may trade the resource produced by this terrain at a 2:1 ratio."));
        yellowProgressCards.add(new Card("Merchant", "Place the merchant on a land hex next to your settlement or city. While the merchant remains here, you may trade the resource produced by this terrain at a 2:1 ratio."));
        yellowProgressCards.add(new Card("Merchant", "Place the merchant on a land hex next to your settlement or city. While the merchant remains here, you may trade the resource produced by this terrain at a 2:1 ratio."));
        yellowProgressCards.add(new Card("Merchant", "Place the merchant on a land hex next to your settlement or city. While the merchant remains here, you may trade the resource produced by this terrain at a 2:1 ratio."));
        yellowProgressCards.add(new Card("Merchant", "Place the merchant on a land hex next to your settlement or city. While the merchant remains here, you may trade the resource produced by this terrain at a 2:1 ratio."));
        yellowProgressCards.add(new Card("Merchant Fleet", "For the rest of your turn, you may trade one resource or commodity with the bank at a 2:1 rate. You may make as many trades as you wish."));
        yellowProgressCards.add(new Card("Merchant Fleet", "For the rest of your turn, you may trade one resource or commodity with the bank at a 2:1 rate. You may make as many trades as you wish."));
        yellowProgressCards.add(new Card("Resource Monopooly", "Name a resource (brick, grain, ore, lumber, or wool). Each opponent must give you 2 cards of that type (if they have any)."));
        yellowProgressCards.add(new Card("Resource Monopooly", "Name a resource (brick, grain, ore, lumber, or wool). Each opponent must give you 2 cards of that type (if they have any)."));
        yellowProgressCards.add(new Card("Resource Monopooly", "Name a resource (brick, grain, ore, lumber, or wool). Each opponent must give you 2 cards of that type (if they have any)."));
        yellowProgressCards.add(new Card("Resource Monopooly", "Name a resource (brick, grain, ore, lumber, or wool). Each opponent must give you 2 cards of that type (if they have any)."));
        yellowProgressCards.add(new Card("Trade Monopoly", "Name a commodity (cloth, coin, or paper). Each opponent must give you 1 card of that type (if they have any)."));
        yellowProgressCards.add(new Card("Trade Monopoly", "Name a commodity (cloth, coin, or paper). Each opponent must give you 1 card of that type (if they have any)."));
    }

    protected class Metropolis {
        protected String color;
        protected String owner;
        protected Setup.Placements.Intersection placement;

        public Metropolis(String color) {
            this.color = color;
            owner = null;
            placement = null;
        }
    }
    protected class Card{
        protected String name;
        protected String description;
        public Card(String title, String desc) {
            name = title;
            description = desc;
        }
    }
}
