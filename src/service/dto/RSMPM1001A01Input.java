package service.dto;

public class RSMPM1001A01Input {
    // 필드 선언
    private String date;

    // 기본 생성자
    public RSMPM1001A01Input() {
        this.date = "";
    }

    // 필드 값 가져오기 메소드
    public String getDate() {
        return this.date;
    }

    // 필드 값 설정 메소드
    public void setCusno(String date) {
        this.date = date;
    }
}
