package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;
	
	public Human03() {
		this.name = "山田";
		this.age = 29;
		this.profession = "二塁手";
	}
	
	//String型の戻り値を返す引数無しのメソッドを定義
	public String getProfile() {
		return "年齢は" + this.age +  "、ポジションは" + this.profession;
	}
	
	//戻り値を返さない、String型の引数を1つとるメソッドを定義
	public void greet(String friend) {
		if (friend == null) { //Stringの値はnulの可能性があるのでチェック
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは");
	}
	
}
