import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scaneer;

    public UserInterface (TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scaneer = scanner;
    }

    public void start () {
        while (true) {
            System.out.print("Command: ");
            String command = scaneer.nextLine();

            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("add")) {
                     System.out.print("Task: ");
                     String task = scaneer.nextLine();
                     todoList.add(task);
            }
            else if (command.equals("list")) {
                     todoList.print();
            }
            else if (command.equals("remove")) {
                     System.out.println("Which one is removed? ");
                     int number = Integer.parseInt(scaneer.nextLine());
                     todoList.remove(number);
            }
        }
    }
}
