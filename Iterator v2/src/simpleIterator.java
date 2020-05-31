import java.util.Iterator;

public class simpleIterator implements Iterator<Object>{

	public String name;
	public String[] str;
	public int inx;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public simpleIterator(String name, String[] str) {
		this.str = str;
		this.name = name;
	}

	public boolean hasNext() {
		if (inx < str.length)
			return true;

		return false;
	}

	public String next() {

		return str[inx++];
	}

	public static void main(String[] args) {

		String[] tridy2rocniku = { "A2", "C2a", "C2b", "E2" };

		simpleIterator t2r = new simpleIterator("Tridy 2. rocniku", tridy2rocniku);

		System.out.print(t2r.getName() + ": ");

		while (t2r.hasNext()) {
			System.out.print(t2r.next());
			if (t2r.hasNext() == true)
				System.out.print(", ");

		}

	}

}
