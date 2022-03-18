package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
	public static void main(String[] args) {
		//名前や年齢が変更禁止のカプセル化されていないインスタンスを生成
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 33);
		//変更禁止だがアクセス制限がないため変更できてしまう
		human1.name = "則本";
		human1.age = 31;
		//変更されてしまうので想定外の名前と年齢になってしまう
		System.out.println("名前は" + human1.name + "で、年齢は" + human1.age + "です");
		
		//名前や年齢が変更禁止のカプセル化されたインスタンスを生成
		HumanCapsule human2 = new HumanCapsule("小林", 32);
		//privateのアクセス制限のため、以下の様にsetterを使用せず直接変更しようとするとコンパイルエラーが発生する
		//human2.name = "中田"
		//直接変更されないため、想定通りの名前と年齢が取得できる、取得はgetterメソッドを使用する
		System.out.println("名前は" + human2.getName() + "で、年齢は" + human2.getAge() + "です");
		//変更はsetterメソッドを使用する
		human2.setName("菅野");
		System.out.println("変更した名前は" + human2.getName() + "です");
	}
}
