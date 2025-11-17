import java.util.Scanner;
class student{
    String major, name; 
    long phone;
    int id;
    student(int i, String n, String m, long p){
        major=m;
        name=n;
        phone=p;
        id=i;
    }

    void setMajor(String m){major=m;}
    void setName(String n){name=n;}
    void setPhone(int p){phone=p;}
    void setid(int i){id=i;}

    String getMajor(){return major;}
    String getName(){return name;}
    int getId(){return id;}
    String getPhone(){
        String phone_str = Long.toString(phone);
        return "0" + phone_str.substring(0,2) + "-" + phone_str.substring(2, 6)+"-"+phone_str.substring(6,10);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] students = new student[3];
        
        for(int i=0;i<3;i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            students[i] = new student(sc.nextInt(),sc.next(),sc.next(),sc.nextLong());
        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다");
        
        System.out.printf("첫번째 학생: %d %s %s %s\n",students[0].getId(),students[0].getName(),students[0].getMajor(), students[0].getPhone());
        System.out.printf("두번째 학생: %d %s %s %s\n",students[1].getId(),students[1].getName(),students[1].getMajor(), students[1].getPhone());
        System.out.printf("세번째 학생: %d %s %s %s\n",students[2].getId(),students[2].getName(),students[2].getMajor(), students[2].getPhone());
        sc.close();
    }
}
