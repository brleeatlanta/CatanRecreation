import java.util.ArrayList;
import java.util.List;

public class Setup {
    static Placements.Intersection[] intersections;
    static Placements.Hex[] hexes;
    static Placements.Path[] paths;
    public static class Pieces {
        private ArrayList<String> terrainHexes = new ArrayList<String>();
        private ArrayList<Integer> numberTokens = new ArrayList<Integer>();
        private ArrayList<String> harbors = new ArrayList<String>();
        public void initializeBase() {
            terrainHexes.addAll(List.of("Desert", "Brick Canyon", "Brick Canyon", "Brick Canyon", "Forest", "Forest", "Forest", "Forest", "Mountain", "Mountain", "Mountain", "Field", "Field", "Field", "Field", "Pasture", "Pasture", "Pasture", "Pasture"));
            numberTokens.addAll(List.of(5, 2, 6, 3, 8, 10, 9, 12, 11, 4, 8, 10, 9, 4, 5, 6, 3, 11));
            harbors.addAll(List.of("Brick", "Wood", "Rock", "Wheat", "Sheep", "3 for 1", "3 for 1", "3 for 1", "3 for 1"));
        }
        public void initializeExpansion() {
            terrainHexes.addAll(List.of());
            numberTokens.addAll(List.of());
            harbors.addAll(List.of());
        }
    }
    public static class Placements {
        protected class Intersection {
            static int counter = 0;
            private int name;
            private ArrayList<Intersection> connectedIntersections = new ArrayList<Intersection>();
            private ArrayList<Hex> connectedHexes = new ArrayList<Hex>();
            private ArrayList<Path> connectedPaths = new ArrayList<Path>();
            private String harbor;
            private String occupant;
            //private Knight knight;

            public Intersection() {
                name = counter++;
            }
        }
        protected class Hex {
            static int counter = 0;
            private int name;
            private int number;
            private String terrain;
            private ArrayList<Intersection> connectedIntersections = new ArrayList<Intersection>();
            private ArrayList<Hex> connectedHexes = new ArrayList<Hex>();
            private ArrayList<Path> connectedPaths = new ArrayList<Path>();
            private ArrayList<Player> adjacentPlayers = new ArrayList<Player>();
            private boolean robberPresent;
            private boolean merchantPresent;

            public Hex() {
                name = counter++;
            }
        }
        protected class Path {
            static int counter = 0;
            private int name;
            private ArrayList<Intersection> connectedIntersections = new ArrayList<Intersection>();
            private ArrayList<Hex> connectedHexes = new ArrayList<Hex>();
            private ArrayList<Path> connectedPaths = new ArrayList<Path>();
            private String occupant;
            private boolean isOnLand;

            public Path() {
                name = counter++;
            }
        }
        protected class Harbor {
            static int counter = 0;
            private int ID;
            private String name;
            private String description;
            private Intersection[] connectedIntersections = new Intersection[2];

            public Harbor(String title, String desc, Intersection a, Intersection b) {
                ID = counter++;
                name = title;
                description = desc;
                connectedIntersections[0] = a;
                connectedIntersections[1] = b;
            }
        }

        public static void createBasePlacements() {
            intersections = new Intersection[54];
            hexes = new Hex[19];
            paths = new Path[72];
        }
        public static void connectBasePlacements() {

        }
        public static void playerStart() {}
    }
    public void reset() {
        intersections = null;
        hexes = null;
        paths = null;
    }
}
