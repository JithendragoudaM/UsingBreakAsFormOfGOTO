public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int target=5;
        boolean found = false;
        search:{
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    System.out.println("Found "+target+" at ("+i+", "+j+")");
                    found=true;
                    break search;
                }
            }
        }
    }
    if(!found){
        System.out.println("Element Not found");
    }
    }
}
