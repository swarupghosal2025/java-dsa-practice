import java.util.Scanner;

public class Search_In_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = in.next();
        System.out.print("Enter the Character you want to find : ");
        char target = in.next().charAt(0);

        System.out.println(isFind2(str, target));

    }
    // static boolean isFind(String str, char target){
    //     if(str.length() == 0){
    //         return false;
    //     }
    //     for(int i = 0; i < str.length(); i ++){
    //         if(target == str.charAt(i)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    static boolean isFind2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target)
                return true;
        }
        return false;
    }
    
}
