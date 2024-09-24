package student_management;

import java.util.*;

/*
-- 학생관리
-- 학생등록
-- 학생 재적목록 출력
-- 학생 신체정보 입력
-- 학생 성적 입력
-- 학생 정보 출력 -- 키 / 몸무게 / 성적

 */
public class StudentMain {

    static List<StudentVO> studentList = new ArrayList<>();

    public static void main(String[] args) {
        // 학생관리 시스템
        Scanner scan = new Scanner(System.in);

        boolean pass = true;
        while (pass) {
            int sysNum = 0;
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("------------- 학생관리 시스템 -------------");
            System.out.println("---------------------------------------");

            System.out.println("-- 시스템 목록");
            System.out.println(" 1. 학생등록 ");
            System.out.println(" 2. 학생 재적 목록 출력 ");
            System.out.println(" 3. 학생 신체정보 입력 ");
            System.out.println(" 4. 학생 성적 입력 ");
            System.out.println(" 5. 학생 정보 출력 ");
            System.out.println(" 0. 종료 ");

            System.out.println("---------------------------------------");
            System.out.print("-- 실행 : ");

            try {
                pass = scan.hasNextInt();

                if (pass) {
                    sysNum = scan.nextInt();
                    pass = systemCall(sysNum);
                } else {
                    System.out.println(" >> 0 ~ 5 만 입력하세요! 시스템 강제 종료");
                }

            } catch (RuntimeException e) {
                System.out.println(" >> 에러 발생 체크 필요 : " + e);
            }

            System.out.println("---------------------------------------");
        }
    }
    public static boolean systemCall(int sysCall){

        //String callName = "";
        boolean callSign = true;
        if(sysCall == 1) {
            System.out.println(" ---- 학생등록 ---- ");
            studentAdd();
            callSign = true;

        } else if(sysCall == 2){
            System.out.println(" ---- 학생 재적 목록 ---- ");
            studentList();
            callSign = true;

        } else  if(sysCall == 3){
            System.out.println(" ---- 학생 신체정보 입력 ----- ");

            callSign = true;

        } else if(sysCall == 4){
            System.out.println(" ---- 학생 성적 입력 ---- ");

            callSign = true;

        } else if(sysCall == 5){
            System.out.println(" ---- 학생 정보 출력 ---- ");
            studentPrint();
            callSign = true;

        }else if(sysCall == 0 ){
            System.out.println(" ---- 시스템 종료 ---- ");

            callSign = false;
        }

        return callSign;
    }

    public static void studentAdd(){
        StudentVO vo = new StudentVO();

        Scanner scanName = new Scanner(System.in);
        Scanner scanGrade = new Scanner(System.in);
        Scanner scanHeight = new Scanner(System.in);
        Scanner scanWeight = new Scanner(System.in);
        Scanner scanUID = new Scanner(System.in);

        System.out.print(">>>> 학생 이름 입력 : ");
        vo.setName(scanName.nextLine());

        System.out.print(">>>> 학년 입력 : ");
        vo.setGrade(scanGrade.nextInt());

        System.out.print(">>>> 키 입력 : ");
        vo.setHeight(scanHeight.nextInt());

        System.out.print(">>>> 몸무게 입력 : ");
        vo.setWeight(scanWeight.nextInt());

        System.out.print(">>>> 고유번호 입력 : ");
        vo.setUid(scanUID.nextLine());

        studentList.add(vo);

    }

    public static void studentPrint(){
        System.out.println(" >>>>>>>>>>>>>>>>>>>>> 학생 신상 정보 출력 ");
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(" >>>> 학생 : " + studentList.get(i).getName() );
            System.out.println(" 이름 : " + studentList.get(i).getName());
            System.out.println(" 학년 : " + studentList.get(i).getGrade());
            System.out.println(" 키 : " + studentList.get(i).getHeight());
            System.out.println(" 몸무게 : " + studentList.get(i).getWeight());
            System.out.println(" 고유번호 : " + studentList.get(i).getUid());
            System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>> ");
        }

    }

    public  static  void studentList(){
        System.out.println(" >>>>>>>>>>>>>>>>>>>>> 학생 현황 ");
        System.out.println(" >>> 총 제적 학생 : " + studentList.size() + " 명 ");
        int gradeNo1 = 0;
        int gradeNo2 = 0;
        int gradeNo3 = 0;

        for(int i = 0; i <  studentList.size(); i++){
            if(studentList.get(i).getGrade() == 1){
                gradeNo1++;

            } else if(studentList.get(i).getGrade() == 2) {
                gradeNo2++;

            } else {
                gradeNo3++;
            }
        }

        System.out.println(" 1학년 학생 : " + gradeNo1 + " 명, 2학년 학생 : " + gradeNo2 + " 명, 3학년 학생 : " + gradeNo3);

    }

}
