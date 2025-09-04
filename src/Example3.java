public class Example3 {
    public static void main(String[] args) {
        boolean t=true;
        First:
        {
            Second:
           {
                Third:{
                    System.out.println("Before the break");
                    if(t) break Second;
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after Second block");
        }
    }
}
