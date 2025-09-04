class Example1{
    public static void main(String[] args) {
       outer:
       for(int i=0; i<5; i++){
        for (int j=1; j<5; j++){
            if(i*j==9){
                System.out.println("Breaking at i = "+i+" j = "+j);
                break outer;
            }
        }
       } 
    }
    
}