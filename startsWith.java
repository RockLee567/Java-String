public class startsWith {
    /*
        public boolean startsWith(String prefix)  
        public boolean startsWith(String prefix, int offset) 
    */
    public static void main(String[] args) {
        String nameIT = "C C++ Java C# Javascript PHP Python" ; 
        System.out.println( nameIT.startsWith( "C" ) );
        System.out.println( nameIT.startsWith( "C++" ,2 ) );
        System.out.println( nameIT.startsWith( "Java" ,6 ) );

        System.out.println( nameIT.startsWith( "C#", 9 ));
    }
}
