package rock_paper_scissors_game;

public class User {
    private String userName;
    private int winCnt;
    private int loseCnt;

    // 생성자 초기화
    User(String userName, int winCnt, int loseCnt){
        this.userName = userName;
        this.winCnt = winCnt;
        this.loseCnt = loseCnt;
    }

    public int getLoseCnt() {
        return loseCnt;
    }

    public void setLoseCnt(int loseCnt) {
        this.loseCnt = loseCnt;
    }

    public int getWinCnt() {
        return winCnt;
    }

    public void setWinCnt(int winCnt) {
        this.winCnt = winCnt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
