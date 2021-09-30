public class join {
    /*
        public static String join(CharSequence delimiter, CharSequence... elements)  
        public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
      
    */
    public static void main(String[] args) {
        String a = String.join( "     " , "Welcome" , "to" , "Java" ) ; 
        String b = String.join( "_" , "Welcome" , "to" , "Python AI" ) ; 
        System.out.println( a );
        System.out.println( b );

        /* 
            Method join() tra ve 1 chuoi dc noi voi nhay boi dau --- Phan tach 
        */ 
    } 
}
