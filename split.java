public class split {
    /*
        public String split(String regex)
        public String split(String regex, int limit)
    */ 
    public static void main(String[] args) {
        String nameIT = "C C++ Java C# Javascript PHP Python" ; 
        String[] word = nameIT.split( "\\s" ) ; 
        for( String w : word ){
            System.out.println( w ); 
        }
 
        System.out.println(); 

        for( String w : nameIT.split( "\\s" , 1 ) ) {
            System.out.println( w );
        }

        System.out.println();

        for( String w : nameIT.split( "\\s" , 3 ) ) {
            System.out.println( w );
        }



    }
}
