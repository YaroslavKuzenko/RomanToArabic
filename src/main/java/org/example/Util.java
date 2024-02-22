package org.example;
/*
  @author   yaroslavkuzenko
  @project   lab2_TDD
  @class  Util
  @version  1.0.0 
  @since 21.02.2024 - 18.28
*/

import java.util.HashMap;

public class Util {

    public static boolean checkTrashInRoman(String roman, HashMap<Character, Integer> mapOfNumbers){
        for (char c: roman.toCharArray()) {
            if(!mapOfNumbers.containsKey(Character.toUpperCase(c))){
                return true;
            }
        }
        return false;
    }

//    Проходимо рядок у зворотному напрямку.
//    якщо поточне значення символу більше за попереднє, то додаємо; інакше -  віднімаємо значення від числа.
//    оновлюємо попереднє значення val
    public static int convertRomanToArabic(String romanNumber){
        HashMap<Character,Integer> mapOfNumbers = new HashMap<>();
        mapOfNumbers.put('I',1);
        mapOfNumbers.put('V',5);
        mapOfNumbers.put('X',10);
        mapOfNumbers.put('L',50);
        mapOfNumbers.put('C',100);
        mapOfNumbers.put('D',500);
        mapOfNumbers.put('M',1000);

        if(romanNumber.equals("")){
            throw new IllegalArgumentException("йкес дуриствітство");
        } else if (romanNumber.equals(null)) {
            throw new NullPointerException("має бути не null");
        } else if (checkTrashInRoman(romanNumber, mapOfNumbers)) {
            throw new IllegalArgumentException("містить символи, що не є складовими римських чисел");
        } else{
            int previousValue=0;
            int ans=0;
            for(int i=romanNumber.length()-1; i>=0; i--){
                int currentValue = mapOfNumbers.get(romanNumber.charAt(i));
                if(currentValue >= previousValue)
                    ans+=currentValue;
                else
                    ans-=currentValue;
                previousValue=currentValue;
            }
            return ans;
        }

    }


}
