public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public void clear(){
    size = 0;
    data = new String[10];
  }

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public boolean add(String str){
    if (data.length == size) resize();
    data[size] = str;
    size++;
    return true;
  }

  public String toString(){
    String ans = "[";
    for(int i = 0; i<size;i++){
      ans += data[i] + ", ";
    }
    if (size == 0) return "[]";
    return ans.substring(0,ans.length()-2) + "]";
  }

  public String toStringDebug(){
    String ans = "[";
    for(int i = 0; i<data.length;i++){
      ans += data[i] + ", ";
    }
    return ans.substring(0,ans.length()-2) + "]";
  }

  public String get(int index){
    if (index < 0 || index >= size()){
      System.out.println("Error: index out of range");
      return null;
    }
    return data[index];
  }

  public String set(int index, String str){
    if (index < 0 || index >= size()){
      System.out.println("Error: index out of range");
      return null;
    }
    String old = data[index];
    data[index] = str;
    return old;
  }

  private void resize(){
    String[] newData = new String[size*2];
    for(int i = 0;i < size;i++){
      newData[i] = data[i];
    }
    data = newData;
  }

}
