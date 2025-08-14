package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 5));

    }
    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23) {
            return false;
        }
        if(isBarking && (clock >= 20 || clock < 8)) { // isBarking true ise ve köpek akşam 8-sabah 8 arası havlıyorsa true dönüyor
            return true; // metod true döndü
        }

        return false;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if( (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19)) {
           return true;
       } else  {
           return false;
       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
      int temp2 = isSummer ? 45 : 35;

      return (temp >= 25 && temp <= temp2);
    }

    public static double area(double width, double height) {
       if(width <= 0 || height <= 0) {
           return -1;
       } else {
           return width * height;
       }
    }

    public static double area(double radius) {
        if(radius <= 0) {
            return -1;
        } else {
            return radius*radius*Math.PI;
        }
    }
}
