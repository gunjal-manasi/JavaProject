 class Methodoverride {
    void sound(){
        System.out.println("The animals are barking");

    }
}
 class dog extends Methodoverride{
    void sound(){
        // super.sound();
        System.out.println("The dog bark..");
    }
        public static void main(String arg[])
    {
        dog m = new dog();
        m.sound();

        System.out.println("Hello");

    }

    

}
