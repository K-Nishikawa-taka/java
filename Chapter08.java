public class Chapter08 {
  public static void main(String[] args) {
    //問題1
    int num = 1;
    while (num < 5) {
      System.out.println(num * num);
      num++;
    }

    //問題2
    int array[] = { 1, 4, 9, 16 };
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    //問題3
    for (int val : array) {
      if (val % 2 == 0) {
        continue;
      }
      System.out.println(val);
    }
  }
}