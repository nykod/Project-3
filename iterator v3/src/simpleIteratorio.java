import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class simpleIteratorio<T> implements Iterable<T> {

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		String name = null;

		Scanner sn = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		Scanner sv = new Scanner(System.in);

		System.out.println("Zadej jmeno: ");
		name = sn.next();

		System.out.println("Pridej predmet, ktery mas ve skole rad: ");
		String tr = ss.next();

		al.add(tr);
		String vyber = "ano";

		System.out.println("Chces pridat jeste? Napis:");
		System.out.println("Ano");
		System.out.println("Ne");
		vyber = sv.next();

		while (!vyber.equalsIgnoreCase("ne")) {

			System.out.println("Napis predmet: ");
			tr = ss.next();

			al.add(tr);

			System.out.println("Chces pridat jeste? Napis:");
			System.out.println("Ano");
			System.out.println("Ne");
			vyber = sv.next();
		}

		Iterator<String> i = al.iterator();

		System.out.println("Tve jmeno: " + name);
		System.out.print("Predmety, ktere sis pridal: ");

		while (i.hasNext()) {
			System.out.print(i.next());
			if (i.hasNext() == true)
				System.out.print(", ");
		}

	}

}
