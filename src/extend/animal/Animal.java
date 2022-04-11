package extend.animal;

//abstract修飾詞を宣言して、抽象クラスとして宣言
public abstract class Animal {
	protected String name;
	
	//共通メソッドを供述
	public void eat() {
		System.out.println(name + "が食事しました！");
	}
	
	//サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
	public abstract void cry();
}
