import java.util.ArrayList;
import java.util.List;

@TestAnn(value = 1, test = 3)
public class Test implements Cloneable {

  Object t;

  public List<Integer> list = new ArrayList<>();

  {
    list.add(1);
    list.add(5);
  }

  @Override
  protected Test clone() {
    try {
      return (Test) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  public void setT(Object t) {
    this.t = t;
  }

  @Override
  public String toString() {
    return "Test{" +
        "t=" + t +
        '}';
  }

  
}
