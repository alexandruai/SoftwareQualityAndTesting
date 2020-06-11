package state;

public class StareOcupata implements IState{

	@Override
	public void schimbareStare(Masa masa) {
		masa.setStare(this);
		
	}

	@Override
	public void prezintaStare(int nrMasa) {
		System.out.println("Masa " + nrMasa + " este ocupata!");
		
	}

}
