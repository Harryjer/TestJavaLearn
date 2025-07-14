//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = "";

        int len = str.length();
        for(int i= len -1; i>=0; i--){
            rev = rev + str.charAt(1);
        }
        System.out.println(rev);
    }
}