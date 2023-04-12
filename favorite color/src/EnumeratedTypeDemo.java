//Robert Jones
//Alice Lin
//CSCI 2070
//March 4, 2020
//Assignment 6 


public class EnumeratedTypeDemo 
{
//defining an enumerated type which is a list of enumerated values
//each value is an identifier
//MyFavoriteColor is a type and RED,BLUE.. are values
enum MyFavoriteColor {RED, BLUE, GREEN, YELLOW};

public static void main(String[] args)
{
//declaring color variable
MyFavoriteColor color;
//holding the Green value from enumerated list   
color = MyFavoriteColor.BLUE;
System.out.println(color);
}
}

