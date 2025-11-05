class Monitor{
    private String monitorsize;
    private String color;
    private String power;

    Monitor(String monitorsize, String color, String power){
        this.monitorsize = monitorsize;
        this.color = color;
        this.power = power;
    }

    public void turnon() {
        System.out.println("Turning on the monitor.");
    }

    public void printinfo() {
        System.out.println("The spec of the monitor\n"+
        " Size: " + monitorsize +'\n' +
        " Color: " + color + '\n' +
        " Power: " + power  );
    }
}
class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnon() {
        System.out.println("Turning on the computer.");
    }

    public void printinfo() {
        System.out.println("The spec of the computer\n"+
        " CPU: " + cpu + '\n'+
        " Memory: " + memory + '\n'+
        " HDD: " + hd + '\n'+
        " Color: " + color + '\n'+
        " Power: " + power  );
    }
}
class PersonalComputer{    
    private Monitor monitor;
    private Computer computer;

    PersonalComputer(String monitersize, String monitorcolor, String monitorpower, 
                    String cpu, String memory, String hd, String computercolor, String computerpower){
        this.monitor = new Monitor(monitersize, monitorcolor, monitorpower);
        this.computer = new Computer(cpu, memory, hd, computercolor, computerpower);
    }

    public void turnon(){
        monitor.turnon();
        computer.turnon();
    }

    public void printinfo(){
        monitor.printinfo();
        computer.printinfo();
    }
}

public class Homework5{
    public static void main(String arg[]){
        PersonalComputer pc = new PersonalComputer(
            "32인치", "검은색", "45W",
            "Core i7", "32GB", "2TB", "흰색", "700W");
        pc.turnon();
        pc.printinfo();
    }
}
