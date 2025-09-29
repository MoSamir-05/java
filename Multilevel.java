import java.util.Scanner;
class countries {
    int c_id;
    String c_name;
    Scanner sc = new Scanner(System.in);

    void setcountry() {
        System.out.print("Enter Country ID    : ");
        c_id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Country Name  : ");
        c_name = sc.nextLine();
    }

    void getcountry() {
        System.out.println("=== Country Details ===");
        System.out.println("Country ID   : " + c_id);
        System.out.println("Country Name : " + c_name);
    }
}

class States extends countries {
    int s_id;
    String s_name;

    void setstate() {
        super.setcountry();
        System.out.print("Enter State ID      : ");
        s_id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter State Name    : ");
        s_name = sc.nextLine();
    }

    void getstate() {
        super.getcountry();
        System.out.println("--- State Details ---");
        System.out.println("State ID    : " + s_id);
        System.out.println("State Name  : " + s_name);
    }
}

class district extends States {
    int d_id;
    String d_name;

    void setdistrict() {
        super.setstate();
        System.out.print("Enter District ID   : ");
        d_id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter District Name : ");
        d_name = sc.nextLine();
    }

    void getdistrict() {
        super.getstate();
        System.out.println("+++ District Details +++");
        System.out.println("District ID   : " + d_id);
        System.out.println("District Name : " + d_name);
    }
}

class taluka extends district {
    int t_id;
    String t_name;

    void settaluka() {
        super.setdistrict();
        System.out.print("Enter Taluka ID     : ");
        t_id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Taluka Name   : ");
        t_name = sc.nextLine();
    }

    void gettaluka() {
        super.getdistrict();
        System.out.println("*** Taluka Details ***");
        System.out.println("Taluka ID   : " + t_id);
        System.out.println("Taluka Name : " + t_name);
    }
}

class Multilevel {
    public static void main(String[] args) {
        taluka t1 = new taluka();
        t1.settaluka();
        System.out.println("\n\n========== Full Hierarchy ==========");
        t1.gettaluka();
    }
}
