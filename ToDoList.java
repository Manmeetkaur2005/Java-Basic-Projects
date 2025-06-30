import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n<----- TO-DO LIST MENU ----->");
            System.out.println("(1) Add Task");
            System.out.println("(2) View Tasks");
            System.out.println("(3) Mark Task As Done");
            System.out.println("(4) Remove Task");
            System.out.println("(5) Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println(" Task added successfully!");
                    break;

                case 2:
                    System.out.println("\n Your Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the task number to mark as done:");
                    int doneIndex = scanner.nextInt() - 1;
                    if (doneIndex >= 0 && doneIndex < tasks.size()) {
                        String doneTask = tasks.get(doneIndex);
                        tasks.set(doneIndex, doneTask + " [Done]");
                        System.out.println("Task marked as done.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("Enter the task number to remove:");
                    int removeIndex = scanner.nextInt() - 1;
                    if (removeIndex >= 0 && removeIndex < tasks.size()) {
                        tasks.remove(removeIndex);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Have a productive day!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
