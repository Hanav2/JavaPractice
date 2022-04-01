package switchDemo;

public class Enum_Switch { //enum is a class type not a datatype

	public enum vowel { a,e,i,o,u,j} //initialization
	
	public static void main(String[] args) {
		
		vowel [] var = vowel.values(); //this will bring the values of the vowels
		
		for (vowel ch: var) {
			
			switch (ch) {
			
			case a:
				System.out.print('a'+ " ");
				break;
			case e:
				System.out.print('e'+ " ");
				break;
			case i:
				System.out.print('i'+ " ");
				break;
			case o:
				System.out.print('o'+ " ");
				break;
			case u:
				System.out.print('u'+ " ");
				break;
			
				default:
					System.out.print("It is consonant");
			
			}
		}

	}

}
