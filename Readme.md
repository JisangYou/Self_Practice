# 변수 연습문제
- 이름, 나이, 결혼여부를 매개변수로 넣어 결과를 출력하는 프로그램

```java
public class ProfilePrint {

	byte age;
	String name;
	boolean isMarried;

	public static void main(String args[]){

		ProfilePrint pro = new ProfilePrint();
		byte age =20;
		String name ="Min";
		boolean isMarried=true;

		pro.setAge(age);
		pro.setName(name);
		pro.setMarried(isMarried);

		System.out.println(pro.getAge());
		System.out.println(pro.getName());
		System.out.println(pro.isMarried);




	}

	public void setAge(byte paramage) {

		age = paramage;
	}

	public byte getAge(){


		return age;
	}

	public void setName(String paramname){

		name = paramname;
	}

	public String getName(){



		return name;
	}

	public void setMarried(boolean paramMarried){

		isMarried= paramMarried;

	}

	public boolean isMarried(){



		return isMarried;
	}

}
```
- 다양한 변수타입을 활용하는 예제
- 각 변수의 타입에 맞게, 메소드를 만들어 주었음
- 인자를 받아야하는 메소드와 인자를 받아 결과를 출력하는 메소드들을
활용하여 만듦
