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

        System.out.println(" 시스템 호출 >>>> " + sysCall);

        return callSign;
    }

    public static void studentAdd(){
        StudentVO vo = new StudentVO();

        String name = "김철수";
        int grade = 1;

        vo.setGrade(grade);
        vo.setName(name);

        studentList.add(vo);

    }

    public static void studentPrint(){
        System.out.println(" 학년 : " + studentList.get(0).getGrade());
        System.out.println(" 이름 : " + studentList.get(0).getName());
    }

}
