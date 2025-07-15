package Strings;
//give route "WNEENESENNN"

public class Shortestroute {
    public static void main(String[] args) {
        String route="WNEENESENNN";
        int x=0,y=0; //initial position
        for (int i = 0; i < route.length(); i++) {
            if(route.charAt(i)=='W'){x--;}
            else if(route.charAt(i)=='E'){x++;}
            else if(route.charAt(i)=='N'){y++;}
            else{y--;}
        }
        System.out.println(x + "," +y);
        int shortestPath=(int)Math.sqrt(Math.pow(x,2) + Math.pow(y,2))  ;  // Math.pow(x,2)+Math.pow(y,2)
        System.out.println("Shortest route for WNEENESENNN is:" +shortestPath);
    }}
