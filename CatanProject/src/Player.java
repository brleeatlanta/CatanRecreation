import java.util.ArrayList;
import java.util.Set;

public class Player {
    protected int ID;
    protected String name;
    protected String color;
    protected String colorHex;
    protected int victoryPoints;

    protected int wood;
    protected int brick;
    protected int stone;
    protected int wool;
    protected int wheat;
    protected int paper;
    protected int coin;
    protected int cloth;
    protected int numInHand;
    protected ArrayList<Setup.Placements.Hex> adjacentHexes;
    protected ArrayList<Setup.Placements.Harbor> accessibleHarbors;
    protected int[] developmentLevels;

    protected Settlement[] settlements;
    protected City[] cities;
    protected Road[] roads;
    protected Wall[] walls;
    protected Knight[] knights;
    protected Ship[] ships;
    protected Crew[] crews;
    protected HarborSettlement[] harborSettlements;
    protected Settler[] settlers;
    protected PlayerPirate pirateShip;
    protected Marker[] markers;
    protected Bridge[] bridges;
    protected Wagon wagon;

    public Player(int i, String playerName, String playerColor, String hexColor, String version) {
        ID = i;
        name = playerName;
        color = playerColor;
        colorHex = hexColor;
        victoryPoints = 0;
        wood = brick = stone = wool = wheat = 0;
        numInHand = 0;
        adjacentHexes = null;
        accessibleHarbors = null;
        switch (version) {
            case "base": {
                settlements = new Settlement[5];
                for (Settlement s : settlements) {
                    s = new Settlement(ID, color, colorHex);
                }
                cities = new City[4];
                for (City c : cities) {
                    c = new City(ID, color, colorHex);
                }
                roads = new Road[15];
                for (Road r : roads) {
                    r = new Road(ID, color, colorHex);
                }
            }
            case "citesAndKnights": {
                paper = coin = cloth = 0;
                developmentLevels = new int[]{1, 1, 1};
                settlements = new Settlement[5];
                for (Settlement s : settlements) {
                    s = new Settlement(ID, color, colorHex);
                }
                cities = new City[4];
                for (City c : cities) {
                    c = new City(ID, color, colorHex);
                }
                roads = new Road[15];
                for (Road r : roads) {
                    r = new Road(ID, color, colorHex);
                }
                knights = new Knight[6];
                for (int j = 0; j < 6; j++) {
                    knights[j] = new Knight(ID, color, colorHex, (j/2));
                }
                walls = new Wall[3];
                for (Wall w : walls) {
                    w = new Wall(ID, color, colorHex);
                }
            }
            case "seafarers": {
                settlements = new Settlement[5];
                for (Settlement s : settlements) {
                    s = new Settlement(ID, color, colorHex);
                }
                cities = new City[4];
                for (City c : cities) {
                    c = new City(ID, color, colorHex);
                }
                roads = new Road[15];
                for (Road r : roads) {
                    r = new Road(ID, color, colorHex);
                }
                ships = new Ship[15];
                for (Ship s : ships) {
                    s = new Ship(ID, color, colorHex);
                }
            }
            case "explorersAndPirates": {
                settlements = new Settlement[5];
                for (Settlement s : settlements) {
                    s = new Settlement(ID, color, colorHex);
                }
                cities = new City[4];
                for (City c : cities) {
                    c = new City(ID, color, colorHex);
                }
                roads = new Road[15];
                for (Road r : roads) {
                    r = new Road(ID, color, colorHex);
                }
                ships = new Ship[15];
                for (Ship s : ships) {
                    s = new Ship(ID, color, colorHex, false);
                }
                harborSettlements = new HarborSettlement[4];
                for (HarborSettlement h : harborSettlements) {
                    h = new HarborSettlement(ID, color, colorHex);
                }
                crews = new Crew[9];
                for (Crew c : crews) {
                    c = new Crew(ID, color, colorHex);
                }
                settlers = new Settler[2];
                for (Settler s : settlers) {
                    s = new Settler(ID, color, colorHex);
                }
                markers = new Marker[3];
                for (Marker m : markers) {
                    m = new Marker(ID, color, colorHex);
                }
                pirateShip = new PlayerPirate(ID, color, colorHex);
            } //unfinished |||
            case "tradersAndBarbarians": {
                settlements = new Settlement[5];
                for (Settlement s : settlements) {
                    s = new Settlement(ID, color, colorHex);
                }
                cities = new City[4];
                for (City c : cities) {
                    c = new City(ID, color, colorHex);
                }
                roads = new Road[15];
                for (Road r : roads) {
                    r = new Road(ID, color, colorHex);
                }
                knights = new Knight[6];
                for (Knight k : knights) {
                    k = new Knight(ID, color, colorHex);
                }
                bridges = new Bridge[3];
                for (Bridge b : bridges) {
                    b = new Bridge(ID, color, colorHex);
                }
                wagon = new Wagon(ID, color, colorHex);
            } //unfinished |||
            case "treasuresDragonsAndAdventures": {
                settlements = new Settlement[5];
                for (Settlement s : settlements) {
                    s = new Settlement(ID, color, colorHex);
                }
                cities = new City[8];
                for (City c : cities) {
                    c = new City(ID, color, colorHex);
                }
                roads = new Road[15];
                for (Road r : roads) {
                    r = new Road(ID, color, colorHex);
                }
            }
        }
    }

    public String getPlayerName() {
        return name;
    }
    public String getPlayerColor() {
        return color;
    }
    public String getPlayerHexColor() {
        return colorHex;
    }
    public class Settlement {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        protected Setup.Placements.Intersection placement;
        public Settlement(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            placement = null;
        }
    }
    public class City {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        protected Setup.Placements.Intersection placement;
        public City(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            placement = null;
        }
    }
    public class Road {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        protected Setup.Placements.Path placement;
        public Road(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            placement = null;
        }
    }
    public class Wall {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        protected Setup.Placements.Intersection placement;
        public Wall(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            placement = null;
        }
    }
    public class Knight {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        protected int strength;
        protected Setup.Placements.Intersection placement;
        public Knight(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            //need to add placement here |||
        }
        public Knight(int ID, String color, String hex, int str) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            strength = str;
            placement = null;
        }
    } //unfinished |||
    public class Ship {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        protected boolean occupied;
        protected Setup.Placements.Path placement;
        public Ship(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            placement = null;
        }
        public Ship(int ID, String color, String hex, boolean occ) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            occupied = occ;
            placement = null;
        }
    } //unfinished |||
    public class Crew {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        public Crew(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
        }
    } //unfinished |||
    public class HarborSettlement {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        protected Setup.Placements.Intersection placement;
        public HarborSettlement(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
            placement = null;
        }
    }
    public class Settler {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        public Settler(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
        }
    } //unfinished |||
    public class PlayerPirate {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        public PlayerPirate(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
        }
    } //unfinished |||
    public class Marker {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        public Marker(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
        }
    } //unfinished |||
    public class Bridge {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        public Bridge(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
        }
    } //unfinished |||
    public class Wagon {
        protected int playerID;
        protected String color;
        protected String colorHex;
        protected boolean placed;
        public Wagon(int ID, String color, String hex) {
            playerID = ID;
            this.color = color;
            colorHex = hex;
            placed = false;
        }
    } //unfinished |||
}
