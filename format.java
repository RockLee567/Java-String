import javax.sound.midi.SysexMessage;

public class format {
    public static void main(String[] args) {
        /*
        Cho 1 so n bat ky 
            %d : nhu bt 
            %nd: neu so chu so < n thi no se cach trai them sang phai d.size() - n  
                               >= n nhu bt 
            %-nd: nguoc lai cua %nd 
            %.nd: in toi da n so               ( %.ns  -  %9.4f  - %.8f)

            ap dung cho ca %s , %f 
        */ 
        System.out.printf("Integer kieu1: %d" , 1234) ;       // tra ve nhu bt theo dung khoang cach 
        System.out.println();
        System.out.printf("Integer kieu2: %5d", 345 );        // so < 5 se cach them xa ben trai 5 - 3 = 2 o nua 
        System.out.println(); 
        System.out.printf("Integer kieu3: %-6d Ahihi" , 12);  // so < 5 se cach them xa ben phai 6 - 2 = 4 o nua 
        System.out.println();
        System.out.printf("Integer kieu4: %5d" , 123456);     // so >= 5 se nhu kieu1 
        System.out.println(); 
        // System.out.printf("Integer kieu5: %.2d", 1234);    exception in thread - chay tren jdk 11 
        System.out.println();
        // in toi da 2 so nguyen 


        System.out.printf( "Name: %s" , "RockLee" );         // Name: RockLee
        System.out.println();
        System.out.printf( "Name: %10s" , "RockLee" ); 
        System.out.println(); 
        System.out.println();
        System.out.printf( "Float: %.5f", 11.12345678);      // 11.12346 
        System.out.println(); 

        System.out.println(); 

        System.out.printf("A: %5d" , 3 ); 
        System.out.println();
        System.out.printf("A: %5d" , 12);
        System.out.println();
        System.out.printf("A: %5d" , 123);
        System.out.println();

        System.out.printf("A: %5d " , 123456); 
        System.out.println(); 
        System.out.printf("A: %-5d B", 123);

        System.out.println();
        String src1 = String.format( "Ahihi: %s" , "do ngoc" ) ; 
        String src2 = String.format( "So tu nhien: %d", 45) ; 
        String src3 = String.format( "So thuc: %f" , 11.234  ) ; 
        System.out.println( src1 );
        System.out.println( src2 );      
        System.out.println( src3 ); 


        
    }
}
