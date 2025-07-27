package Strings;

public class captilizeFirstWord {
    public static void main(String args[]){
        String str="hello this is rumaisha qadeer";
        System.out.println("original String: "+ str);
        str= upperCase(str);
        System.out.println("Changed String: "+ str);
    }
    public static String upperCase(String str){
        StringBuilder sb= new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int index = 1; index < str.length(); index++) {
            if(str.charAt(index)==' ' && index< str.length()-1){
            sb.append(str.charAt(index));
            index++;
            sb.append(Character.toUpperCase(str.charAt(index)));
            }else{
                sb.append(str.charAt(index));
            }
        }
        sb.append('.');
        return sb.toString();
    }
}
