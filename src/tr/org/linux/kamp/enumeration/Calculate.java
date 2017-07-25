package tr.org.linux.kamp.enumeration;

public enum Calculate {

	TOPLA, CIKAR, CARP, BOL;

	int calculator(int x, int y) {
		int z = 0;
		switch (this) {
		case TOPLA:
			return x + y;
		case CIKAR:
			if (x > y) {
				return x - y;
			} else
				return y - x;
		case CARP:
			return x * y;
		case BOL:
			return x / y;
		default:
			return 0;

		}

	}

}
