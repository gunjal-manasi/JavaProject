class Methodoverloading{
    
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Methodoverloading m= new Methodoverloading();
       System.out.println(m.add(2,3));
       System.out.println(m.add(2,3,4));

    }
}