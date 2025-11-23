interface Role {
    void performDuties();
}

class Manager implements Role {
    public void performDuties() {
        System.out.println("Managing team and projects");
    }
}

class Developer implements Role {
    public void performDuties() {
        System.out.println("Writing and testing code");
    }
}

class Tester implements Role {
    public void performDuties() {
        System.out.println("Testing software and reporting bugs");
    }
}

public class Experiment4_EmployeeRoless {
    public static void main(String[] args) {
        Role r = new Developer();
        r.performDuties();

        r = new Manager();
        r.performDuties();

        r = new Tester();
        r.performDuties();
    }
}
