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
public class Arch {
    public int archCapacity;
    public Location archLocation;
    private boolean archDirection;
    
    public Arch(Location _location, boolean _archDirection, int _archCapacity)
    {
        this.archLocation = _location;
        this.archDirection = _archDirection;
        this.archCapacity = _archCapacity;
    }
    
    boolean validate()
    {
        if ((archLocation.getTokensCount() >= archCapacity && archDirection == true) || archDirection == false)
	    {
		return true;
	    }
        return false;
    }
    
    public void Update()
	{
		if (archDirection == true)
		{
			int a = archLocation.getTokensCount();
			a -= archCapacity;
			archLocation.setTokensCount(a);
		}
		else
		{
			int a = archLocation.getTokensCount();
			a += archCapacity;
			archLocation.setTokensCount(a);
		}
	}
}
