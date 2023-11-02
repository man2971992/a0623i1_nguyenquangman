package _04_oop.practice;

class Test {
    int a = 1;
}

class Test1 {

    static Test c = new Test();

    public static void main(String[] args) {
        System.out.println(c.a);
    }

    int number() {
        return 5;
    }

//    String number() {
//        return "5";
//    }
}

class Test2 {
}