public class Quine {
	public static void main(String[] args) {
		char q = 34;
		char t = 9;
		String s = """
public class Quine {
%spublic static void main(String[] args) {
%s%schar q = 34;
%s%schar t = 9;
%s%sString s = %s%s%s
%s%s%s%s;
%s%sSystem.out.printf(s, t, t, t, t, t, t, t, q, q, q, s, q, q, q, t, t, t);
%s}
}""";
		System.out.printf(s, t, t, t, t, t, t, t, q, q, q, s, q, q, q, t, t, t);
	}
}