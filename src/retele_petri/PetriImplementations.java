/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retele_petri;

/**
 *
 * @author nicol
 */
import java.util.Scanner;

public class PetriImplementations
{ 
	String input = null;
	Scanner scanner = new Scanner(System.in);

	public void CoffeeMachine()
	{
		PetriCoffeeMachine CoffeeMachine = new PetriCoffeeMachine();

		while (true)
		{
			System.out.println("Give your input:");
			input = scanner.nextLine().toUpperCase();
			CoffeeMachine.Translate(input);
		}
	}
}

