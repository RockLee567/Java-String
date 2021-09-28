public class contains {
    public static void main(String[] args) {
        String RL = "I'm RockLee and I'm fine" ; 
        String test =  "and I" ; 

        System.out.println( RL.contains(  test     ) );
        System.out.println( RL.contains( "and R"   ) );
        
        System.out.println();

        System.out.println( RL.contains( "RockLee" ) );
        System.out.println( RL.contains( "RocKLee" ) );        // Roc K Lee
 
        System.out.println();

        System.out.println( RL.contains( "Naruto" ) );
    }
}

