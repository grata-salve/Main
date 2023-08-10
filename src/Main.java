import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Main {

  private void Method() {
    System.out.println("hello");
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Map<String, Integer> map = new HashMap<>();
    map.put("Two", 2);
    map.put("One", 1);
    map.put("Five", 5);

    // change 1

    // change 2

    System.out.println(void.class);

    var main = new Main();
    main.Method();

    // changes


    System.out.println(map);

    String string="111";
    System.out.println(new String("1") == new String("1"));
    System.out.println(string==String.valueOf("111"));



    StringBuilder s = new StringBuilder(new String("1"));
    s.append(new String("asd").repeat(10));




    var accounts = new ArrayList<String>();
    accounts.add("first");
    accounts.add("first");
    accounts.add("f irst");
    accounts.add("  ");
    accounts.add("third");

    var annotations = User.class.getAnnotations();
    System.out.println(Arrays.toString(annotations));

    Iterator<String> iterator = accounts.iterator();
    iterator.next();
    iterator.remove();
    System.out.println(accounts);

    HashMap<String, Integer> d = new HashMap<>(42);

    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int temp;
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length/2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(arr));

    System.out.println(Test.class);



    Collections.reverse(accounts);
    System.out.println(accounts);

    Collections.sort(accounts);
    System.out.println(Collections.binarySearch(accounts, "third"));




    String[] mas = new String[4];
    System.out.println("array: " + mas.getClass());


    System.out.println(accounts.getClass());

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(6);
    list.add(-1);
    //Collections.sort(list);

    Test test = new Test();
    Test test1 = test.clone();
    System.out.println(test1.list);
    System.out.println(test.list);
    test.list.add(5);
    System.out.println(test.list);
    System.out.println(test1.list);

    PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    priorityQueue.add("a");
    priorityQueue.add("c");
    priorityQueue.add("b");


    System.out.println(priorityQueue);


    System.out.println(list);

    var acc = accounts.clone();
    ((ArrayList<String>) acc).forEach(System.out::println);

    var isEmpty = accounts.stream()
            .filter(word -> word.contains(""))
            .collect(Collectors.groupingBy(word -> word.contains("irst"), Collectors.toList()));

    System.out.println(isEmpty);

    int[] tet = new int[4];
    test(tet);

    System.out.println(answer(1));
    System.out.println(answer(2));

    Test3 test3 = new Test3();
    try {
      Field field = Test3.class.getDeclaredField("test");
      field.setAccessible(true);
      System.out.println("reflection " + field.getInt(test3));

    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  static int answer(int num) {
    return num % 2 == 0 ? 4 : 2;
  }
    private static <T> Class<?> test(T t) {
    System.out.println(t.getClass());
    return t.getClass();
  }

}

interface A {

  default void test() {
    System.out.println("1");
  }
}

class B implements A {

  public B() {
    A.super.test();
  }
}



interface Test2 {
  default void test() {
    System.out.println("interface");
  }

  int x = 3333;
}

class Test3 implements Test2, Cloneable {

  private int test;

  {
    test = 3333;
  }

  @Override
  public void test() {
    System.out.println("class");
  }

  protected void st() {
    System.out.println("hello");
  }

  public void st(int a) {

  }

}

class Test4 extends Test3 {

  @Override
  public void st() {
    super.st();
    assert 1==1;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
  }
}