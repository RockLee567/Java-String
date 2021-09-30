public class lastIndexOf {
    public static void main(String[] args) {
        String s1 = "This is index of example"; 
        int lastOne = s1.lastIndexOf("is")  ;     // => 5
        int lastTwo = s1.lastIndexOf("ex")  ;     // => 17
        
        System.out.println( lastOne ); 
        System.out.println( lastTwo ); 

        /*
            int lastIndexOf(int ch)
            int lastIndexOf(int ch, int fromIndex)
            int lastIndexOf(String substring)
            int lastIndexOf(String substring, int fromIndex)
        */ 


    }
}
