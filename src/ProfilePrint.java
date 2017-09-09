
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
