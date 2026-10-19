package controle;

public class Projet {
	public Projet(String code, String intitule) {
		super();
		this.code = code;
		this.intitule = intitule;
	}


	private String code;
	private String intitule;

	@Override
	public String toString() {
		return "Projet [code=" + code + ", intitule=" + intitule + "]";
	}

}
