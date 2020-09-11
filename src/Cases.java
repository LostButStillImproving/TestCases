
class selektion_1{
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;

        System.out.println(x <= 5 && z != y);
        System.out.println(x == 5 || x == y && z == 3);
        System.out.println(x / y > z / x);
        System.out.println(!( x != y - z ) == false);
        System.out.println(2 * x != x || x == 0);
        System.out.println(! true || ! false);

    }

}

class selektion_2{

    public static void selektion_2(int x, int y) {

        if (x+y > 100){
            System.out.println("Summen er større end 100");
        }
        else if (x+y < 100) {
            System.out.println("summen er mindre");
        }
        else {
            System.out.println("den er 100");
        }
    }

}


class selektion_3{
    public static void main(String[] args) {
        int first = 22;
        int second = 0;
        if (first > second) {
            System.out.println("First");
        }
        else if (first == second) {
            System.out.println("Same");
        }
        else {
            System.out.println("Second");
        }
    }


}

class selection_4{

}