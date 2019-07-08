package TestPractice;

/**
 * internet_address
 */
public class internet_address {

    public static void sol(String str) {
        String address = "";
        int k = 0;
        if(str.startsWith("http")){
            address += "http://";
            k = 4;
        }
        if(str.startsWith("ftp")){
            address += "ftp://";
            k = 3;
        }
        int i = str.indexOf("ru");
        address += (str.substring(k,i) + ".ru"); 
        i = i+2;
        if(i == str.length()){
            System.out.print(address);
            return;
        }
        else{
            address += ("/" + str.substring(i));
            System.out.println(address);
            return;
        }

    }
    public static void main(String[] args) {
        
        String str = "ftphttprururu";
        sol(str);
    }
}