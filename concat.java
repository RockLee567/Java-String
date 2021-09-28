
public class concat {
    public static void main(String[] args) {
        String Uzumaki = "Naruto " ;
        String Uchiha = "Sasuke" ;  
        String Hagoromo = Uzumaki.concat( Uchiha ) ; 
        System.out.println( "2 " + Hagoromo );
        System.out.println( "2 " + Uzumaki + Uchiha ); 

        String OPiece = "Luffy " ; 
        System.out.println( "2 ae " + OPiece.concat( "Zoro" )  );
        
        String AOT = "Mikasa " ; 
        AOT.concat( "Eren" ) ;
        System.out.println( "1 " + AOT  );  
    }
}
