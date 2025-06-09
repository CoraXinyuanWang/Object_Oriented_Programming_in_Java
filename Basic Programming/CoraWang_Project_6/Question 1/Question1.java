import java.util.*;

// interface
interface Liveble {
	public abstract int maxCapacity ();
}
// we have our abstract class named House with 2 abstract methods
abstract class House {

   public abstract String getArea();
   public abstract Date getYearBuilt();
}
// GreenHouse inherits House. Since House is abstract, GreenHouse class must implements all the abstract methods in House

class GreenHouse extends House {
     public String getArea(){
     	return "The area of GreenHouse is calculated";
     }

     public Date getYearBuilt(){
     	return new Date ();
     }
}



// Ranch House inherits House and implements interface 

class RanchHouse extends House implements Liveble {
	public String getArea(){
		return "The area of the Ranchhouse is calculated";
	}

	public Date getYearBuilt() {
        return new Date();  
    }

    public int maxCapacity() {
        return 50; 
    }
}

// ColonialHouse inherits House and implements interface 
// it also need to have a method called getStories

class ColonialHouse extends House implements Liveble {
	public String getArea(){
		return "The area of the ColonialHouse is calculated";
	}

	public Date getYearBuilt() {
        return new Date();  
    }

    public int maxCapacity() {
        return 150; 
    }
    public int getStories(){
    	return 100;
    }
}
