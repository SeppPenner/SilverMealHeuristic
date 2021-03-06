package silvermeal;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {
    private static final DecimalFormat DF = new DecimalFormat("#.00"); 
    
    public static void main(String[] args) {
        SilverMeal silverMeal = new SilverMeal();
        checkEightEight(silverMeal);
        checkEightNine(silverMeal);
        checkNineNine(silverMeal);
        checkNineTen(silverMeal);
        checkNineEleven(silverMeal);
        checkElevenEleven(silverMeal);
        checkElevenTwelve(silverMeal);
    }
    
    private static final HashMap<Integer, Integer> DEMANDS;
    static{
        DEMANDS = new HashMap<>();
        DEMANDS.put(1,0);
        DEMANDS.put(2,0);
        DEMANDS.put(3,0);
        DEMANDS.put(4,0);
        DEMANDS.put(5,0);
        DEMANDS.put(6,0);
        DEMANDS.put(7,0);
        DEMANDS.put(8,27);
        DEMANDS.put(9,22);
        DEMANDS.put(10,13);
        DEMANDS.put(11,19);
        DEMANDS.put(12,12);
    }
    
    private static void checkEightEight(SilverMeal silverMeal){
        double eightEight = silverMeal.calculate(8,8,200,10, DEMANDS);
        System.out.println(DF.format(eightEight));
        //200 correct
    }
    
    private static void checkEightNine(SilverMeal silverMeal){
        double EightNine = silverMeal.calculate(8,9,200,10, DEMANDS);
        System.out.println(DF.format(EightNine));
        //210 correct
    }
    
    private static void checkNineNine(SilverMeal silverMeal){
        double NineNine = silverMeal.calculate(9,9,200,10, DEMANDS);
        System.out.println(DF.format(NineNine));
        //200 correct
    }
    
    private static void checkNineTen(SilverMeal silverMeal){
        double NineTen = silverMeal.calculate(9,10,200,10, DEMANDS);
        System.out.println(DF.format(NineTen));
        //165 correct
    }
    
    private static void checkNineEleven(SilverMeal silverMeal){
        double NineEleven = silverMeal.calculate(9,11,200,10, DEMANDS);
        System.out.println(DF.format(NineEleven));
        //236,66 correct
    }
    
    private static void checkElevenEleven(SilverMeal silverMeal){
        double ElevenEleven = silverMeal.calculate(11,11,200,10, DEMANDS);
        System.out.println(DF.format(ElevenEleven));
        //200 correct
    }
    
    private static void checkElevenTwelve(SilverMeal silverMeal){
        double ElevenTwelve = silverMeal.calculate(11,12,200,10, DEMANDS);
        System.out.println(DF.format(ElevenTwelve));
        //160 correct
    }
}