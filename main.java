class MainOverload {

    public static void main(String[] args) {
        System.out.println("Original Main");
        main(10);
    }

    public static void main(int x) {
        System.out.println("Overloaded Main : " + x);
    }
}