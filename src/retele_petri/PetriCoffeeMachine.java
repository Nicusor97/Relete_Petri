/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retele_petri;

/**
 *SSS
 * @author nicol
 */
import java.util.LinkedList;

public class PetriCoffeeMachine extends  PetriNet
{

	public Integer Credit = 0;

	public PetriCoffeeMachine()
	{
		BuildNetwork();
	}

	@Override
	protected void Execute(String _input)
	{

		switch (_input)
		{
		case "5":
			if (Credit == 0 || Credit == 5)
			{
				this.Credit += 5;
				System.out.println("Your credit is now: " + this.Credit);
			}
			else
			{
				System.out.println("You have enough credit to order something!");
			}
			break;

		case "10":
			if (Credit == 0 || Credit == 5)
			{
				this.Credit += 10;
				System.out.println("Your credit is now: " + this.Credit.toString());
			}
			else
			{
				System.out.println("You have enough credit to order something!");
			}
			break;

		case "C5":

			if (this.Credit < 5)
			{
				System.out.println("You don't have enough credit!");
			}
			else
			{
				System.out.println("You requested a  5 bucks coffee!Enjoy!");
				this.Credit -= 5;
				System.out.println("Your credit is now: " + this.Credit.toString());                        
			}
			break;

		case "C10":                    
			if (this.Credit < 10)
			{
				System.out.println("You don't have enough credit!");
			}
			else
			{
				System.out.println("You requested a 10 bucks coffee.Enjoy!");
				this.Credit = 0;
				System.out.println("Your credit is now: " + this.Credit.toString());        
			}                   
			break;

		default:
			System.out.println("This is not a valid input! Get your s#!t together and input something right!");
			break;
		}


	}

	private void BuildNetwork()
	{
		this.Credit = 0;

		Location locationZero = new Location("0", 1);
		Location locationFive = new Location("5", 0);
		Location locationTen = new Location("10", 0);
		Location locationFifteen = new Location("15", 0);

		Transition transition1 = new Transition("C5", new LinkedList<Arch>());
		transition1.AddArch(new Arch(locationFive, true, 1));
		transition1.AddArch(new Arch(locationZero, false, 1));

		Transition transition2 = new Transition("5", new LinkedList<Arch>());
		transition2.AddArch(new Arch(locationZero, true, 1));
		transition2.AddArch(new Arch(locationFive, false, 1));

		Transition transition3 = new Transition("C5", new LinkedList<Arch>());
		transition3.AddArch(new Arch(locationTen, true, 1));
		transition3.AddArch(new Arch(locationFive, false, 1));

		Transition transition4 = new Transition("10", new LinkedList<Arch>());
		transition4.AddArch(new Arch(locationZero, true, 1));
		transition4.AddArch(new Arch(locationTen, false, 1));

		Transition transition5 = new Transition("C10", new LinkedList<Arch>());
		transition5.AddArch(new Arch(locationTen, true, 1));
		transition5.AddArch(new Arch(locationZero, false, 1));

		Transition transition6 = new Transition("C10", new LinkedList<Arch>());
		transition6.AddArch(new Arch(locationFifteen, true, 1));
		transition6.AddArch(new Arch(locationFive, false, 1));

		Transition transition7 = new Transition("10", new LinkedList<Arch>());
		transition7.AddArch(new Arch(locationFive, true, 1));
		transition7.AddArch(new Arch(locationFifteen, false, 1));

		Transition transition8 = new Transition("5", new LinkedList<Arch>());
		transition8.AddArch(new Arch(locationFive, true, 1));
		transition8.AddArch(new Arch(locationTen, false, 1));

		Transition transition9 = new Transition("5", new LinkedList<Arch>());
		transition9.AddArch(new Arch(locationTen, true, 1));
		transition9.AddArch(new Arch(locationFifteen, false, 1));

		Transition transition10 = new Transition("C5", new LinkedList<Arch>());
		transition10.AddArch(new Arch(locationFifteen, true, 1));
		transition10.AddArch(new Arch(locationTen, false, 1));


		Transition transition11 = new Transition("C5", new LinkedList<Arch>());
		transition11.AddArch(new Arch(locationZero, true , 1));
		transition11.AddArch(new Arch(locationZero, false , 1));


		Transition transition12 = new Transition("C10", new LinkedList<Arch>());
		transition12.AddArch(new Arch(locationZero, true , 1));
		transition12.AddArch(new Arch(locationZero, false , 1));


		Transition transition13 = new Transition("10", new LinkedList<Arch>());
		transition13.AddArch(new Arch(locationTen, true,1));
		transition13.AddArch(new Arch(locationTen, false,1));


		Transition transition14 = new Transition("10", new LinkedList<Arch>());
		transition14.AddArch(new Arch(locationFifteen, true ,1));
		transition14.AddArch(new Arch(locationFifteen, false,1));


		Transition transition15 = new Transition("5", new LinkedList<Arch>());
		transition15.AddArch(new Arch(locationFifteen, true ,1));
		transition15.AddArch(new Arch(locationFifteen, false,1));


		Transition transition16 = new Transition("C10", new LinkedList<Arch>());
		transition16.AddArch(new Arch(locationFive, true,1));
		transition16.AddArch(new Arch(locationFive, false,1));

		this.transitionsList.clear();
		transitionsList.add(transition1);
		transitionsList.add(transition2);
		transitionsList.add(transition3);
		transitionsList.add(transition4);
		transitionsList.add(transition5);
		transitionsList.add(transition6);
		transitionsList.add(transition7);
		transitionsList.add(transition8);
		transitionsList.add(transition9);
		transitionsList.add(transition10);
		transitionsList.add(transition11);
		transitionsList.add(transition12);
		transitionsList.add(transition13);
		transitionsList.add(transition14);
		transitionsList.add(transition15);
		transitionsList.add(transition16);


	}

}

