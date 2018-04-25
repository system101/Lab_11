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
/** Concrete builder for a meal with a burger, fries, and a cola. */
public class BurgerMealBuilder extends MealBuilder {
    public void build_Entree()   { 
      theMeal.setEntree("burger"); }
    public void build_Side()   { 
      theMeal.setSide("fries"); }
    public void build_Drink() {  
      theMeal.setDrink("cola"); }
 }

