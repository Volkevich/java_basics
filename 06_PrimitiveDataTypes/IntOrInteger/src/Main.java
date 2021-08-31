public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        for (char ch = 'А'; ch < 'я'; ch++){
            int tab = ch;

            System.out.println("Символ: " + " (" + ch + ")" + " Код символа:  " + tab);

        }
        char e = 'Ё';
        char f = 'ё';
        int ee = e;
        int ff = f;
        System.out.println("Код символа Ё - " + ee);
        System.out.println("Код символа ё - " + ff);

    }
}
