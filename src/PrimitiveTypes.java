
public class PrimitiveTypes {

	int intDefault1;
	byte byteDefault;
	short shortDefault;
	long longDefault;
	float floatDefault;
	double doubleDefault;
	char charDefault;
	boolean booleanDefault;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveTypes types = new PrimitiveTypes();

		types.checkByte();
		types.checkOtherTypes();
		types.checkChar();
		types.checkBoolean();
		types.defaultValues();
		types.defaultValuesTest();
	}

	public void checkByte() {
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println("byteMin= " + byteMin);
		System.out.println("byteMax= " + byteMax);
		byteMin = (byte) (byteMin - 1);
		byteMax = (byte) (byteMin + 1);
		System.out.println("byteMin - 1= " + byteMin);
		System.out.println("byteMax + 1= " + byteMax);
	}

	public void checkOtherTypes() {
		short shortMax = 32767;
		int intMax = 2147483647;
		long longMax = 9223372036854775807L;

	}

	public void checkChar() {
		int intValue = 'a';
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println("charMin=[" + charMin + "]");
		System.out.println("charMax=[" + charMax + "]");
		System.out.println("intValue=[" + intValue + "]");
	}

	public void checkBoolean() {
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
	}

	public void defaultValues() {

		int intDefault2 = 0; // 지역변수는 반드시 초기화 해준다. 왠만하면 다 초기화해준다.
		System.out.println(intDefault1);
		System.out.println(intDefault2);

	}

	public void defaultValuesTest() {

		System.out.println("intDefault : " + intDefault1);
		System.out.println("byteDefault : " + byteDefault);
		System.out.println("shortDefault : " + shortDefault);
		System.out.println("longDefault : " + longDefault);
		System.out.println("floatDefault : " + floatDefault);
		System.out.println("doubleDefault : " + doubleDefault);
		System.out.println("charDefault : " + charDefault);
		System.out.println("booleanDefault : " + booleanDefault);

	}

}
