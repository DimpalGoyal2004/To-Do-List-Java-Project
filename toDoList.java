import java.util.*;
class toDoList{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> tasks = new ArrayList<>();
        
        while(true){
        System.out.println("\n===To Do List===");
        System.out.println("1.Add Task");
        System.out.println("2.View Tasks");
        System.out.println("3.Delete Task");
        System.out.println("4.Exit");
        
        System.out.println("Enter your Choice:");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice){
            case 1:
                System.out.println("Enter Task:");
                String task = sc.nextLine();
                tasks.add(task);
                
                System.out.println("Added Successfully!");
                break;
                
                case 2:
                    if(tasks.isEmpty()){
                        System.out.println("No Tasks Available!");
                    }
                    else{
                        System.out.println("\n Tasks:");
                    for(int i = 0; i<tasks.size(); i++){
                         System.out.println((i + 1) + ". " + tasks.get(i));

                    }
                }
                break;
                
                case 3:
                    if(tasks.isEmpty()){
                        System.out.println("No Tasks To Delete!");
                    }
                    else{
                        System.out.println("\n Tasks:");
                        for(int i=0; i<tasks.size(); i++){
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.println("Enter Task Number To Delete:");
                        int idx = sc.nextInt();
                        if (idx >= 1 && idx <= tasks.size()) {
                            tasks.remove(idx - 1);
                            System.out.println("Task Deleted Successfully!");
                        } else {
                            System.out.println("Invalid Task Number!");
                        }
                    }
    
                break;
                    
                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    
        }
        }
    
    }
}