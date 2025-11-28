import java.io.*;
import java.util.*;

class LoginSystemBuffer{
    Map<String, String> accountMap = new HashMap<>();
    BufferedReader bf;
    Scanner sc;
    LoginSystemBuffer(BufferedReader bf, Scanner sc){
        this.bf = bf;
        this.sc = sc;
        try{
            String sentence;
            while((sentence = bf.readLine()) != null){
                String[] word = sentence.trim().split("\\s+");
                accountMap.put(word[0], word[1]);
            }
        }catch(Exception e){
            System.out.println(e);
        }
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

public class Homework9{
    public static void main(String args[]){
        try{
            BufferedReader bf = new BufferedReader(new FileReader("db.txt"));
            Scanner sc = new Scanner(System.in);
            LoginSystemBuffer login = new LoginSystemBuffer(bf,sc);
            
            login.auth();
            sc.close();
            bf.close();
        }catch(Exception e){
        System.out.println(e);
        }
    }
}