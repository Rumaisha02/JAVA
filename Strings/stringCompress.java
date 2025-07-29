package Strings;

public class stringCompress {
    public static void main(String args[]){
        String str="aaaaaaaaabbccccdddddddd";
        System.out.println("Originally String: "+str);
        str=compress(str);
        System.out.println("Compressed String: "+ str);
    }
    public static String compress(String str){
     StringBuilder sb=new StringBuilder(" ");
     
     for (int i = 0; i < str.length(); i++) {
       Integer count=1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if(count>1){
            sb.append(count);
        }
     }
    

    return sb.toString();
    }
}
