public class Example2 {
  public static void main(String[] args) {
    boolean cond=true;
    block1: {
        System.out.println("Start of block");
        if(cond){
            break block1;
        }
        System.out.println("This won't print");
    }
    System.out.println("After block");
  }  
}
