public class Human01 {
  public String name; //メンバー変数
  public int age; //メンバー変数
  
  //引数無しのコンストラクタ
  public Human01() {
    name = "山田";
    age = 29;
  }
  
  //引数2つのコンストラクタ
  public Human01(String name, int age) {
    this.name = name;
    this.age = age;
  }
}