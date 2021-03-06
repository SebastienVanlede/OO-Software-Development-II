package domein;

import java.util.List;

public class DomeinController {

	private final KostenRepository kostenRepository;

	public DomeinController() {

		kostenRepository = new KostenRepository();
	}

	public String[] geefTitelsBeheersKosten() {
		List<BeheersKost> lijstBeheerskosten = kostenRepository.getKostenLijst();

		String[] itemsTitel = new String[lijstBeheerskosten.size()];
		int index = 0;
		for (BeheersKost item : lijstBeheerskosten) {
			if (item instanceof Kluis) {
				itemsTitel[index++] = item.toString();
			} else {
				itemsTitel[index++] = String.format("%s, houder = %s", item.getClass().getSimpleName().toLowerCase(),
						((Rekening) item).getHouder());
			}
		}
		return itemsTitel;
	}

	public String geefDetailsBeheerskost(int index) {
		return kostenRepository.geefBeheersKost(index).toString();
	}

	public double geefBeheerskostWaarde(int index) {
		return kostenRepository.geefBeheersKost(index).geefJaarlijkseKost();
	}
}
