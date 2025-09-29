import java.util.Scanner;

class Cricketer {
    Scanner sc = new Scanner(System.in);
    int c_id;
    String c_name;

    void setCricketer() {
        System.out.println("\n=== Cricketer Details ===");
        System.out.println("C_ID   : " + c_id);
        System.out.println("C_Name : " + c_name);
    }

    void getCricketer() {
        System.out.print("Enter C_ID   : ");
        c_id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter C_Name : ");
        c_name = sc.nextLine();
    }
}

class Batsman extends Cricketer {
    int b_id;
    String b_name;

    void setBatsman() {
        setCricketer();
        System.out.println("--- Batsman Details ---");
        System.out.println("B_ID   : " + b_id);
        System.out.println("B_Name : " + b_name);
    }

    void getBatsman() {
        getCricketer();
        System.out.print("Enter B_ID   : ");
        b_id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter B_Name : ");
        b_name = sc.nextLine();
    }
}

class Bowler extends Cricketer {
    int bw_id;
    String bw_name;

    void setBowler() {
        setCricketer();
        System.out.println("--- Bowler Details ---");
        System.out.println("BW_ID   : " + bw_id);
        System.out.println("BW_Name : " + bw_name);
    }

    void getBowler() {
        getCricketer();
        System.out.print("Enter BW_ID   : ");
        bw_id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter BW_Name : ");
        bw_name = sc.nextLine();
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Batsman bb = new Batsman();
        Bowler b1 = new Bowler();

        System.out.println("Press 1 for Batsman and 2 for Bowler");
        int choice = sc.nextInt(); sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\n--- Enter Batsman Info ---");
                bb.getBatsman();
                System.out.println("\n--- Display Batsman Info ---");
                bb.setBatsman();
                break;
            case 2:
                System.out.println("\n--- Enter Bowler Info ---");
                b1.getBowler();
                System.out.println("\n--- Display Bowler Info ---");
                b1.setBowler();
                break;
            default:
                System.out.println("Invalid choice! Please press 1 or 2.");
        }
    }
}
