linear search of element 30
  class Main {
    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int target = 30; 
    boolean found = false;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==target){
            found =true;
        }
    }
    if(found){
       System.out.println(found);  
    } else{
         System.out.println(found);
    }
       
    }
}
