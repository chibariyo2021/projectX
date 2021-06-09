public static String convertToString(ArrayList<E> a1, ArrayList<E> a2) {
	String str = “”;

	Iterator<E> i = a1.iterator();
	while (i.hasNext()) {
		str += i.next().toString() + “,”;
	}

	Iterator<E> i2 = a2.iterator();
	while (i.hasNext()) {
		str += i.next().toString() + “,”;
	}

	return str.toString();
}
