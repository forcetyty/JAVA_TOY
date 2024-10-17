package rock_paper_scissors_game;

import java.util.Arrays;
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
        game(gameSel);


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

    // 게임 실행 메소드
    public static int game(int type){

        if(type == 1){
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

            // 게임 승패를 결정하는 로직
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

        }else if( type == 2 ){
            // 최후의 승자가 남을때 까지 반복
            Scanner scanGamer = new Scanner(System.in);
            Scanner scanUser = new Scanner(System.in);
            System.out.print(" >>>> 개임 할 사용자 수를 입력하세요 : ");

            // 초기 게임 인원 설정
            int gamer = scanGamer.nextInt();

            String user = "";   // 사용자 입력 값
            String[] gameUser = new String[user.length()];
            for(int i = 0; i < gamer; i++){
                System.out.print(" >>>> " + i + " 번째 사람 : ");
                gameUser[i] = scanUser.nextLine();
            }


        }


        return 0;
    }
}
