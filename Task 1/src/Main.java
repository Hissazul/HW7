import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        System.out.println("\n*** Welcome to the our elixir craft studio! ***\n");
        System.out.println("Here you can prepare the following elixirs: \n");
        System.out.println("1. The forbidden elixir: - 4 toad eyes - 5 ghoul tears - 3 raven bones - 10 dumplings\n"+
                           "2. The vigilance elixir: - 3 toad eyes - 1 raven bones\n" +
                           "3. The endurance elixir: - 3 raven bones - 4 dumplings\n" +
                           "4. The secrecy elixir: - 2 toad eyes - 7 ghoul tears - 1 dumplings\n");
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир
        System.out.println("        What you have ingredients?\n");
        System.out.print("Toad eyes: - ");
        int toadEyes = new Scanner(System.in).nextInt();
        System.out.print("Ghoul tears: - ");
        int ghoulTears = new Scanner(System.in).nextInt();
        System.out.print("Raven bones: - ");
        int ravenBones = new Scanner(System.in).nextInt();
        System.out.print("Dumplings: - ");
        int dumplings = new Scanner(System.in).nextInt();

        int forbiddenElixir = 0;
        int vigilanceElixir = 0;
        int enduranceElixir = 0;
        int secrecyElixir = 0;

        toadEyesCount = toadEyes;
        ghoulTearsCount = ghoulTears;
        ravenBonesCount = ravenBones;
        dumplingsCount = dumplings;

        while (toadEyesCount >= 4 && ghoulTearsCount >= 5 && ravenBonesCount > 3 && dumplingsCount >= 10) {
                toadEyesCount = toadEyes - 4;
                ghoulTearsCount = ghoulTears - 5;
                ravenBonesCount = ravenBones - 3;
                dumplingsCount = dumplings - 10;
                forbiddenElixir++;
        }
        while (toadEyesCount >= 3 && ravenBonesCount >= 1) {
                toadEyesCount = toadEyes - 3;
                ravenBonesCount = ravenBones - 1;
                vigilanceElixir++;
        }
        while (ravenBonesCount >= 3 && dumplingsCount >= 4) {
                ravenBonesCount = ravenBones - 3;
                dumplingsCount = dumplings - 4;
                enduranceElixir++;
        }
        while (toadEyesCount >= 2 && ghoulTearsCount >= 7 && dumplingsCount >= 1) {
                toadEyesCount = toadEyes - 2;
                ghoulTearsCount = ghoulTears - 7;
                dumplingsCount = dumplings - 1;
                secrecyElixir++;
        }
        if (forbiddenElixir == 0 && vigilanceElixir == 0 && enduranceElixir == 0 && secrecyElixir == 0){
            System.out.println("You don't have enough ingredients for more than one elixir!");
        } else {
            System.out.println("The forbidden elixir: - " + forbiddenElixir + "\nThe vigilance elixir: - " + vigilanceElixir +
                    "\nThe endurance elixir: - " + enduranceElixir + "\nThe secrecy elixir: - " + secrecyElixir);
        }
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
    }
}
