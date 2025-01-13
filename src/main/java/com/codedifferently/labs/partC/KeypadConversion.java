package com.codedifferently.labs.partC;
import java.util.Scanner;

public class KeypadConversion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type something");
        String str = keyboard.nextLine();
        str = str.replaceAll("\\s","");
        String[] arr = str.split("");
        String end = "";
        for(String x: arr){
          if(x.equalsIgnoreCase("a")){
              end = end + "2";
          }else if(x.equalsIgnoreCase("b")){
              end = end + "22";
          }else if(x.equalsIgnoreCase("c")){
              end = end + "222";
          }else if(x.equalsIgnoreCase("d")){
              end = end + "3";
          }else if(x.equalsIgnoreCase("e")){
              end = end + "33";
          }else if(x.equalsIgnoreCase("f")){
              end = end + "333";
          }else if(x.equalsIgnoreCase("g")){
              end = end + "4";
          }else if(x.equalsIgnoreCase("h")){
              end = end + "44";
          }else if(x.equalsIgnoreCase("i")){
              end = end + "444";
          }else if(x.equalsIgnoreCase("j")){
              end = end + "5";
          }else if(x.equalsIgnoreCase("k")){
              end = end + "55";
          }else if(x.equalsIgnoreCase("l")){
              end = end + "555";
          }else if(x.equalsIgnoreCase("m")){
              end = end + "6";
          }else if(x.equalsIgnoreCase("n")){
              end = end + "66";
          }
          else if(x.equalsIgnoreCase("o")){
              end = end + "666";
          }else if(x.equalsIgnoreCase("p")){
              end = end + "7";
          }else if(x.equalsIgnoreCase("q")){
              end = end + "77";
          }else if(x.equalsIgnoreCase("r")){
              end = end + "777";
          }else if(x.equalsIgnoreCase("s")){
              end = end + "7777";
          }else if(x.equalsIgnoreCase("t")){
              end = end + "8";
          }else if(x.equalsIgnoreCase("u")){
              end = end + "88";
          }else if(x.equalsIgnoreCase("v")){
              end = end + "888";
          }else if(x.equalsIgnoreCase("w")){
              end = end + "9";
          }else if(x.equalsIgnoreCase("x")){
              end = end + "99";
          }else if(x.equalsIgnoreCase("y")){
              end = end + "999";
          }else if(x.equalsIgnoreCase("z")){
              end = end + "9999";
          }
        }
        System.out.println(end);

    }

}
