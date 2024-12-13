/* 
    Lecture note example - Classes
*/
package pkg;

public class Potato{
    //Gloabal Variables
    String color;
    boolean isEdible;
    String type;
    double mass;
    
    //constructors
    public Potato(){
        color = "brown";
        isEdible = true;
        type = "French Fry";
        mass = 170.5;
    }
    
    public Potato(String c, String t, double m);
    color = c;
    isEdible = false;
    type = t;
    mass = m;
}

//methods
public boolean getEdibility(){
    return isEdible;
}
