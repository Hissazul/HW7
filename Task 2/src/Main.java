public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников

        /*for (int i = 1; i <= 100 ; i++){
            if (i % 2 == 0) {
                System.out.println("Уволен айтишник с id - " + i);
            }
        }*/
        int count = 0;
        int i = 1;
        while ( i <= 100 ) {
            i++;
            count++;
            while ( i <=100 && i % 2 == 0 ) {
                i++;
                count++;
                System.out.println("Уволен айтишник с id - " + count);
            }
        }
    }
}
