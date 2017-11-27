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
public class Location {
    public String locationTag = null;
    public int numberOfToken;
    
    public Location(String _tag, int _number_of_token)
    {
        this.locationTag = _tag;
        this.numberOfToken = _number_of_token;
    }
    
    public String getLocationg()
    {
        return locationTag;
    }
    public void setLocation(String value)
    {
        locationTag = value;
    }

    public void setNumberOfToken(int count_value)
    {
        numberOfToken = count_value;
    }
    public int getTokensCount()
    {
	return numberOfToken; 
    }
    public void setTokensCount(int value)
    {
	numberOfToken = value; 
    }
}
