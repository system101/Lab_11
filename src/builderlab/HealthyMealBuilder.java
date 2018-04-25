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
public class HealthyMealBuilder extends MealBuilder {
    public void build_Entree()   { 
      theMeal.setEntree("chicken sandwich"); }
    public void build_Side()   { 
      theMeal.setSide("carrot sticks"); }
    public void build_Drink() {  
      theMeal.setDrink("diet cola"); }
 }
