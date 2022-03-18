package capsule.human;

public class HumanNoCapsule {
	public String name;
	public int age;
	
	public HumanNoCapsule(String name, int age) {
		//publicのアクセス修飾子のため、外部から参照可能
		this.name = name;
		this.age = age;
	}
}
