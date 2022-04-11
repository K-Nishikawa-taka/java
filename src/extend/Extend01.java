package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		//Humanクラスのインスタンスを生成
		Human sugimoto = new Human("杉本", 30);
		System.out.println("Humanクラスのメソッド：名前は" + sugimoto.getName());
		
		//Studentクラスのインスタンスを生成
		Student yamamoto = new Student("山本", 23, 18);
		//サブクラスのインスタンスからスーパークラス(Humanクラス)のメソッドを呼び出し
		System.out.println("Humanクラスのメソッド：名前は" + yamamoto.getName());
		//Studentクラスに追加したgetStudentprofileメソッドを呼び出し
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + yamamoto.getStudentProfile());
		
		//Employeeクラスのインスタンスを生成して、アップキャストでHumanクラスの変数を代入
		Human human = new Employee("吉田", 28, "首位打者");
		//スーパークラス(Humanクラス)のメソッドを呼び出し
		System.out.println("Humanクラスのメソッド：名前は" + human.getName());
		//HumanクラスにはgetEmployeeProfileメソッドがないのでアクセスするとコンパイルエラー
		//System.out.println("Employeeクラスのメソッド：プロフィールを紹介します);
		//Employeeクラスの変数にダウンキャスト
		Employee yoshida = (Employee) human;
		//Employeeクラスの変数なので、Employeeクラスに追加したgetEmployeeProfileメソッドの呼び出しができる
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + yoshida.getEmployeeProfile());
		
		//printNameメソッドを呼び出して、名前を表示
		Extend01.printName(sugimoto);
		//Humanクラスのサブクラスの変数を引数にして呼び出し
		Extend01.printName(yamamoto);
		Extend01.printName(yoshida);
	}
	
	//引数がHumanクラスなので、Humanクラスか、そのサブクラスなら呼び出しできる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は" + human.getName());
	}
}
