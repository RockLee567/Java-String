public class indexOf {
    public static void main(String[] args) {
        String s1 = "This is index of example" ; 

        int wStringOne = s1.indexOf("is")  ;           // => 2 
        int wStringTwo = s1.indexOf( "index" ) ;       // => 8 
        System.out.println( wStringOne );           
        System.out.println( wStringTwo ); 

        int wStringThree = s1.indexOf( "is" , 4) ;     // => 5 
        int wCharOne = s1.indexOf( 's' ) ;             // => 3 
        System.out.println( wStringThree ); 
        System.out.println( wCharOne );   
        

        int a = s1.indexOf( 3, 2) ; 
        System.out.println( a ) ;                      // => -1 

        /*
            int indexOf( String sub  )     
            int indexOf( String sub , int fromIndex ) 
            
            int indexOf( char star ) 
            
            int indexOf( int ch ) 
            int indexOf( int ch , int fromIndex ) 
        */ 

    }
}
