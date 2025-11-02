class Monitor{
    private String monitersize;
    private String color;
    private String power;

    Monitor(String monitersize, String color, String power){
        this.monitersize = monitersize;
        this.color = color;
        this.power = power;
    }

    public String getmonitersize(){return this.monitersize;}
    public String getcolor(){return this.color;}
    public String getpower(){return this.power;}
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

    public String getcpu(){return this.cpu;}
    public String getmemory(){return this.memory;}
    public String gethd(){return this.hd;}
    public String getcolor(){return this.color;}
    public String getpower(){return this.power;}

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
        System.out.println("Turning on the computer");
        System.out.println("Turning on the monitor");
    }

    public void printinfo(){
        System.out.println(
        "The spec of the computer\n" + 
        "CPU: "+computer.getcpu() + "\n" +
        "Memory: "+computer.getmemory() + "\n" +
        "HD: "+computer.gethd() + "\n" +
        "Color: "+computer.getcolor() + "\n" +
        "Power: "+computer.getpower() + "\n" +
        "The spec of the moniter"+ "\n" +
        "Size: "+monitor.getmonitersize() + "\n" +
        "Color: "+monitor.getcolor() + "\n" +
        "Power: "+monitor.getpower()
        );
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