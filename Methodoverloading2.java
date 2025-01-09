public class Methodoverloading2 {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    } 
    
}
 class A{
    public static void main(String[] args) {
        Methodoverloading2.add(1,2);
        Methodoverloading2.add(1,2,3);
        
    }
}
