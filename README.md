# SilverMeal
SilverMeal is an example on how to calculate the SilverMeal-Problem: https://de.wikipedia.org/wiki/Silver-Meal_Heuristik
The example was written and tested in Java.

[![Build status](https://ci.appveyor.com/api/projects/status/9e4yxcsfu87dx008?svg=true)](https://ci.appveyor.com/project/SeppPenner/silvermealheuristic)
[![GitHub issues](https://img.shields.io/github/issues/SeppPenner/SilverMeal.svg)](https://github.com/SeppPenner/SilverMeal/issues)
[![GitHub forks](https://img.shields.io/github/forks/SeppPenner/SilverMeal.svg)](https://github.com/SeppPenner/SilverMeal/network)
[![GitHub stars](https://img.shields.io/github/stars/SeppPenner/SilverMeal.svg)](https://github.com/SeppPenner/SilverMeal/stargazers)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://raw.githubusercontent.com/SeppPenner/SilverMeal/master/License.txt)

## Basic usage:
```java
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
```

Change history
--------------

See the [Changelog](https://github.com/SeppPenner/SilverMeal/blob/master/Changelog.md).