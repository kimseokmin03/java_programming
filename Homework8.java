import java.util.*;

class LoginSystem{
    Map<String, String> accountMap = new HashMap<>();
    Scanner sc;

    LoginSystem(Scanner sc){
        this.sc = sc;
    }

    void addAccount(String id, String password){
        accountMap.put(id,password);
    }

    void auth(){
        boolean notExist = true;
        while(notExist){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputid = sc.nextLine().trim();

            if(accountMap.containsKey(inputid)){
                System.out.print("password : ");
                String inputpass = sc.nextLine().trim();

                if(accountMap.get(inputid).equals(inputpass)){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    notExist = false;
                }
                else{
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
                }
            }
            else{
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
            }
            System.out.println("");
        }
    }
}

public class Homework8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LoginSystem login = new LoginSystem(sc);

        login.addAccount("myld", "myPass");
        login.addAccount("myld2", "myPass2");
        login.addAccount("myld3", "myPass3");

        login.auth();

        sc.close();
    }
}