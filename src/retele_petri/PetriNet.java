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
import java.util.LinkedList;
import java.util.List;

public abstract class PetriNet {
    	public List<Transition> transitionsList = new LinkedList<Transition>();

	public void Translate(String _transitionTag)
	{
		List<Transition> tempTransList = new LinkedList<Transition>();

		for(Transition thisTransition:transitionsList)
		{
			if(thisTransition.getTransitionTag().equals(_transitionTag))
			{
				if(thisTransition.Validate())
				{
					tempTransList.add(thisTransition);
				}
			}
		}

		for(Transition thisTransition:tempTransList)
		{
			thisTransition.Run();
			//System.out.println("Transition " + thisTransition.TransitionTag.ToString()); 
		}


		if (!tempTransList.isEmpty())
		{
			Execute(_transitionTag);
		}

	}

	protected abstract void Execute(String _input);
}
