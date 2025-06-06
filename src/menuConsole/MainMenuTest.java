package menuConsole;

import menuConsole.commands.Exit;
import menuConsole.commands.Listing;
import menuConsole.commands.addLeft;
import menuConsole.commands.addRight;
import simuladoAV1.q4.MyListaDuplaEncadeada;

import java.util.Scanner;

public class MainMenuTest {
    public static void main(String[] args) {
        MyListaDuplaEncadeada<String> list = new MyListaDuplaEncadeada<>();
        Scanner sc = new Scanner(System.in);

        ConsoleMenu menu = new ConsoleMenu();

        menu.addOption(new addLeft(list, sc));
        menu.addOption(new addRight(list, sc));
        menu.addOption(new Listing(list));
        menu.addOption(new Exit());

        menu.start();
    }
}
