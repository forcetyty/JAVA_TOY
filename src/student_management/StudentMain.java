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
    static  List<StudentInfoVO> studentInfoList = new ArrayList<>();

    static  List<StudentScoreVO> studentScoreList = new ArrayList<>();

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

        Scanner scan = new Scanner(System.in);

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
            studentAddInfo();
            callSign = true;

        } else if(sysCall == 4){
            System.out.println(" ---- 학생 성적 입력 ---- ");
            studentScore();
            callSign = true;

        } else if(sysCall == 5){
            System.out.println(" ---- 학생 정보 출력 ---- ");
            System.out.print(" >>>>>> 1. 학생 신상정보 출력, 2. 학생 성적정보 출력, 3. 학생 정보 통계 출력");
            int choseNum = scan.nextInt();
            studentPrint(choseNum);

            callSign = true;

        }else if(sysCall == 0 ){
            System.out.println(" ---- 시스템 종료 ---- ");

            callSign = false;
        }

        return callSign;
    }

    // 학생 성적 입력 기능
    public  static void studentScore(){
        StudentScoreVO scoreVO = new StudentScoreVO();
        Scanner scan = new Scanner(System.in);
        System.out.println(" >>>> 학생 성정 입력 ");

        // 등록된 학생 출력
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(" >>>>>> 학생이름 : " + studentList.get(i).getName() + " 고유번호 : " + studentList.get(i).getUid());
        }
        System.out.print(" >>>> 성적 입력할 학생의 고유번호를 입력해주세요 : ");
        scoreVO.setUid(scan.nextLine());

        System.out.print(">>>> 수학성적 입력 : " );
        scoreVO.setMath(scan.nextInt());

        System.out.print(">>>> 영어성적 입력 : ");
        scoreVO.setEnglish(scan.nextInt());

        System.out.print(">>>> 국어성적 입력 : ");
        scoreVO.setKorean(scan.nextInt());

        studentScoreList.add(scoreVO);

        for(int j = 0; j < studentList.size(); j++){
            if(studentList.get(j).getUid().equals(scoreVO.getUid())){
                System.out.println(" >>>> " + studentList.get(j).getName() + " 학생의 성적이 입력 되었습니다. ");
            }
        }

    }

    public static void studentAdd(){
        StudentVO vo = new StudentVO();

        Scanner scanName = new Scanner(System.in);
        Scanner scanGrade = new Scanner(System.in);
        Scanner scanUID = new Scanner(System.in);

        System.out.print(">>>> 학생 이름 입력 : ");
        vo.setName(scanName.nextLine());

        System.out.print(">>>> 학년 입력 : ");
        vo.setGrade(scanGrade.nextInt());

        System.out.print(">>>> 고유번호 입력 : ");
        vo.setUid(scanUID.nextLine());

        studentList.add(vo);

    }

    public static void studentAddInfo(){
        StudentInfoVO infoVo = new StudentInfoVO();
        Scanner scanWeight = new Scanner(System.in);
        Scanner scanHeight = new Scanner(System.in);
        Scanner scanUid = new Scanner(System.in);

        System.out.println(" >>>>>>>>>>>>>>>>>>>> 학생 목록 및 고유번호 ");
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(" >>>>>> 학생이름 : " + studentList.get(i).getName() + " 고유번호 : " + studentList.get(i).getUid());
        }

        System.out.print(" >>>>> 학생 고유번호를 입력하세요 : ");
        infoVo.setUid(scanUid.nextLine());
        System.out.print(" >>>>> 학생 키를 입력하세요 : ");
        infoVo.setHeight(scanHeight.nextInt());
        System.out.print(" >>>>> 학생 몸무게를 입력하세요 : ");
        infoVo.setWeight(scanWeight.nextInt());

        studentInfoList.add(infoVo);

        //String studentName = "";
        // int studentNum = studentInfoList.size() - 1;
        for(int j = 0; j < studentList.size(); j++){
            //System.out.println(studentInfoList.get(j).getUid());
            //System.out.println(studentList.get(j).getUid() + " - " + studentNum);

            // 왜 studentInfoList.get( studentInfoList.size() ).getUid() 이건 안되지
            // IndexOutOfBoundsException 발생이유 - 갯수는 1개 / index는 0
            /*
            if( studentInfoList.get( j ).getUid().equals(studentList.get(j).getUid()) ){
                studentName = studentList.get(j).getName();
            }
            */

            if(studentList.get(j).getUid().equals(infoVo.getUid())){
                System.out.println(" >>>>> " + studentList.get(j).getName() + " 학생 정보가 입력 완료 되었습니다." );
            }
        }

        // System.out.println(" >>>>> " + studentName + " 학생 정보가 입력 완료 되었습니다." );
    }

    public static void studentPrint(int choseNum){

        if(choseNum == 1){
            System.out.println(" >>>>>>>>>>>>>>>>>>>>> 학생 신상 정보 출력 ");
            for(int i = 0; i < studentList.size(); i++){
                System.out.println(" >>>> 학생 신상 정보 <<<< " );
                System.out.println(" 이름 : " + studentList.get(i).getName());
                System.out.println(" 학년 : " + studentList.get(i).getGrade());
                System.out.println(" 고유번호 : " + studentList.get(i).getUid());

                // uid를 키값으로 키와 몸무게 Get
                for(int j = 0; j < studentInfoList.size(); j++){
                    if(studentList.get(i).getUid().toString().equals(studentInfoList.get(j).getUid().toString())){
                        System.out.println(" 키 : " + studentInfoList.get(j).getHeight());
                        System.out.println(" 몸무게 : " + studentInfoList.get(j).getWeight());
                    }
                }
            }

        }else if(choseNum == 2) {
            System.out.println(" >>>>>>>>>>>>>>>>>>>>> 학생 성적 정보 출력 ");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(" >>>> 학생 성적 정보 <<<< ");
                System.out.println(" 이름 : " + studentList.get(i).getName());
                System.out.println(" 학년 : " + studentList.get(i).getGrade());
                System.out.println(" 고유번호 : " + studentList.get(i).getUid());

                for (int j = 0; j < studentScoreList.size(); j++) {
                    if (studentList.get(i).getUid().equals(studentScoreList.get(j).getUid())) {
                        System.out.println(" 수학성적 : " + studentScoreList.get(j).getMath());
                        System.out.println(" 국어성적 : " + studentScoreList.get(j).getKorean());
                        System.out.println(" 영어성적 : " + studentScoreList.get(j).getEnglish());
                    }
                }
            }
        } else if (choseNum == 3) {
            System.out.println(" >>>>>>>>>>>>>>>>>>>>> 학생 정보 통계 출력 ");

            System.out.println(" >>>> 등록된 학생 수 : " + studentList.size() + " 명");
            int socreNum = studentScoreList.size();

            if( socreNum > 0 ){
                int mathAvr = 0;
                int englishAvr = 0;
                int koreaAvr = 0;
                for(int i = 0; i < socreNum; i++){
                    mathAvr += studentScoreList.get(i).getMath();
                    englishAvr += studentScoreList.get(i).getEnglish();
                    koreaAvr += studentScoreList.get(i).getKorean();
                }

                System.out.println(" >>>> 전체 학생 수학 성적 평균 : " + mathAvr/socreNum);
                System.out.println(" >>>> 전체 학생 영어 성적 평균 : " + englishAvr/socreNum);
                System.out.println(" >>>> 전체 학생 국어 성적 평균 : " + koreaAvr/socreNum);
            }


            int infoNum = studentInfoList.size();

            if( infoNum > 0 ){
                int weightAvr = 0;
                int heightAvr = 0;
                for(int j = 0; j < infoNum; j++){
                    weightAvr += studentInfoList.get(j).getWeight();
                    heightAvr += studentInfoList.get(j).getHeight();
                }

                System.out.println(" >>>> 전체 학생 키 평균 : " + weightAvr/infoNum);
                System.out.println(" >>>> 전체 학생 몸무게 평균 : " + weightAvr/infoNum);
            }


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
