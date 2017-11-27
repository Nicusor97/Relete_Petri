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
import java.util.List;
        
public class Transition {
    private String transitionTag;
    private List<Arch> archList;

	public Transition(String _transitionTag, List<Arch> _archList)
	{

		this.transitionTag = _transitionTag;
		this.archList = _archList;

	}

	public void setTransitionTag(String value) { 
		transitionTag = value;
	}

	public String getTransitionTag() {
		return transitionTag; 
	}


	public void setArchList(List<Arch> value) { 
		archList = value;
	}
	public List<Arch> getArchList() {
		return archList;
	}

	public void AddArch(Arch _arch)
	{
		this.archList.add(_arch);
	}


	public boolean Validate()
	{           
		for (Arch thisArch : archList)
		{
			if (!thisArch.validate())
			{
				return false;
			}
		}
		return true;
	}


	public void Run()
	{
		for(Arch thisArch : archList)
		{
			thisArch.Update();
		}
	}
}
