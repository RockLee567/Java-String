public class intern {
    
    // public String intern()

    public static void main(String[] args) {
        String a = new String( "hello" ) ; 
        String b = "hello" ; 
        String c = a.intern() ; 

        System.out.println( a == b ); 
        System.out.println( b == c );

        /* 
            intern() 
            dc dung voi ----- tu khoa new   o String intern()
            
        */ 
    }
}
