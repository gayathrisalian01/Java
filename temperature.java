import CToF.CelsToFahr; 
import FToC.FahrToCels; 
import java.util.Scanner; 
class temperature 
{ 
    public static void main(String[] args) 
    { 
        double Fahren;
        Scanner sc = new Scanner(System.in); 
        CelsToFahr cf = new CelsToFahr(); 
        FahrToCels fc = new FahrToCels(); 
        int ch;
         do 
         { 
            System.out.println("<---Menu--->\n1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius");
            System.out.println("Enter your choice(0 to stop)"); 
            ch = sc.nextInt(); 
            switch(ch) 
            { 
                case 1: 
                        System.out.println("<---Celsius to Fahrenheit--->"); 
                        System.out.println("Enter the temperature in Celsius"); 
                        double Celsius = sc.nextDouble(); 
                        cf.ConvertCToF(Celsius); 
                        break; 
                case 2: 
                        System.out.println("<---Fahrenheit to Celsius--->"); 
                        System.out.println("Enter the temperature in Fahrenheit"); 
                        Fahren = sc.nextDouble(); 
                        fc.ConvertFToC(Fahren); 
                        break;
                default:
                        System.out.println("Invalid choice");

            } 
        }while(ch!= 0); 
            
    } 
}