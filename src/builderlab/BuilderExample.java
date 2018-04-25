/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderlab;

/**
 *
 * @author boonjv
 */
/** A driver class for building some value meals 
 *
 * @author Jerod Weinman
 */
public class BuilderExample {

  
  /**
   * A program that creates a cook and uses it with various meal builders
   * to construct meals.
   *
   * @param args unused command-line arguments
   */
  public static void main(String[] args) {

    Cook cook = new Cook();
    Meal meal;

    BurgerMealBuilder burgerBuilder = new BurgerMealBuilder();
    HealthyMealBuilder healthyBuilder = new HealthyMealBuilder();

    
//    Order up! A burger with a side of fries and a cola
    
    cook.setMealBuilder (burgerBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);


//Order up! A chicken sandwich with a side of carrot sticks and a diet cola
    cook.setMealBuilder (healthyBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);
    
    
//    Order up! A chicken sandwich with a side of carrot sticks and a diet cola
    cook.setMealBuilder (healthyBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);
    
    
    
//    Order up! A burger with a side of fries and a cola
    cook.setMealBuilder (burgerBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);
  }
}