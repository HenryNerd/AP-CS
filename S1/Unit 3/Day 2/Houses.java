public class Houses
{
     // Define your methods here
     
     //Build Roof
    public static void buildRoof() {
        System.out.println("   + ");
        System.out.println("  +++");
        System.out.println(" +++++");
        System.out.println("+++++++");
    }
    
    //Build Level
    public static void buildLevel() {
        System.out.println("|     |");
        System.out.println("|  #  |");
        System.out.println("|     |");
        System.out.println("+++++++");
    }

    //Build Sidewalk
    public static void buildSidewalk() {
        System.out.println("   =   ");
        System.out.println("   =   ");
        System.out.println("====   ");
    }

    public static void main(String[] args)
    {
        //House 1
        System.out.println("House 1:");
        buildRoof();
        buildLevel();
        buildSidewalk();
        System.out.println("");
        System.out.println("");
        //House 2
        System.out.println("House 2:");
        buildRoof();
        buildLevel();
        buildLevel();
        buildLevel();
        buildSidewalk();
    }
}
