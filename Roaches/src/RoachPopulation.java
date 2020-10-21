
public class RoachPopulation {
	
	private int currentPopulation;
	
	public void currentPop() {
		currentPopulation=0;
	}

	//initial population
	public void initialPopulation(int population) {
		currentPopulation= population;
	}
	
	//breed method
	public void breed() {
		currentPopulation= currentPopulation*2;
	}
	
	//spray method
	public void spray(int percent) {
		percent=currentPopulation*percent;
		percent= (int) (percent*0.01);
		currentPopulation= (currentPopulation-percent);
	}
	
	//getRoaches method
	public int getRoaches() {
		return currentPopulation;
	}
}
