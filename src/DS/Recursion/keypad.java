package DS.Recursion;

/**
 * keypad
 */
public class keypad {

    public static String[] singleDigit(int n){
        if(n<=1 || n>=10){
            System.exit(0);
        }
        else if(n == 2){
            String output[] = {"a","b","c"};
            return output;
        }
        else if(n == 3){
            String output[] = {"d","e","f"};
            return output;
        }
        else if(n == 4){
            String output[] = {"g","h","i"};
            return output;
        }
        else if(n == 5){
            String output[] = {"j","k","l"};
            return output;
        }
        else if(n == 6){
            String output[] = {"m","n","o"};
            return output;
        }
        else if(n == 7){
            String output[] = {"p","q","r","s"};
            return output;
        }
        else if(n == 8){
            String output[] = {"t","u","v"};
            return output;
        }
        String output[] = {"w","x","y","z"};
        return output;
        

    }

    public static String[] keypad1(int n){
        if(n == 0){
            String output[] = {""};
            return output;
        }
        String smallerNumberArray[] = keypad1(n/10);
        // for(String x: smallerNumberArray){
        //     System.out.print(x+" HI");
        // }
        String singleDigitOutput[] = singleDigit(n%10);
        System.out.println(singleDigitOutput.length);
        for(String x: singleDigitOutput){
            System.out.println(x+" ");            
        }

        return (new String[0]);
    }
    public static void main(String[] args) {
        String[] str = keypad1(234);
    }
}