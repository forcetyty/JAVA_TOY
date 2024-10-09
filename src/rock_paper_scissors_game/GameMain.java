package rock_paper_scissors_game;

import java.util.Scanner;

/*
-- 가위바위보 게임
-- 유저수 추가 기능
-- 게임 통계
 */
public class GameMain {
    public static void main(String[] args) {

        Scanner scanSelect = new Scanner(System.in);

        //초기 메뉴 구성
        System.out.println("*********************************************");
        System.out.println("*************** 가위 바위 보 게임 ***************");
        System.out.println("*********************************************");

        System.out.println(" 게임 모드 : 1 [ 1 : 1 모드 ] / 2 [ 1 : N 모드 ] ");
        System.out.print(" 선택하세요 : ");
        int gameSel = scanSelect.nextInt();

        System.out.println("********************** " + gameSel + " 모드를 선택 하셨습니다 **");

        /*
        Scanner scanUser = new Scanner(System.in);
        int ranNum = (int)((Math.random()*3)+1);
        String computerUser = "";
        int userNum = 0;

        if(ranNum == '1'){
            computerUser = "가위";

        }else if(ranNum == '2'){
            computerUser = "바위";

        }else{
            computerUser = "보";

        }

        // 가위바위보 게임 기본틀
        System.out.println(" >>>>>>>>> 가위 바위 보 게임");
        System.out.print(" >>>> 가위, 바위, 보 입력 : ");
        String user = scanUser.nextLine();

        if(user.equals(computerUser)){
            System.out.println(" >>>> 비겼습니다 - 사용자 " + user + " - 컴퓨터 " + computerUser);

        }else if(user.equals("가위") && computerUser.equals("바위")){
            System.out.println(" >>>> 컴퓨터가 이겼습니다 - 사용자 " + user + " - 컴퓨터 " + computerUser);

        }else if(user.equals("가위") && computerUser.equals("보")) {
            System.out.println(" >>>> 사용자가 이겼습니다 - 사용자 " + user + " - 컴퓨터 " + computerUser);

        }else if(user.equals("바위") && computerUser.equals("가위")){
            System.out.println(" >>>> 사용자가 이겼습니다 - 사용자 " + user + " - 컴퓨터 " + computerUser);

        }else if(user.equals("바위") && computerUser.equals("보")){
            System.out.println(" >>>> 컴퓨터가 이겼습니다 - 사용자 " + user + " - 컴퓨터 " + computerUser);

        }else if(user.equals("보") && computerUser.equals("가위")){
            System.out.println(" >>>> 컴퓨터가 이겼습니다 - 사용자 " + user + " - 컴퓨터 " + computerUser);

        }else if(user.equals("보") && computerUser.equals("바위")){
            System.out.println(" >>>> 사용자가 이겼습니다 - 사용자 " + user + " - 컴퓨터 " + computerUser);

        }
        */

    }
}
