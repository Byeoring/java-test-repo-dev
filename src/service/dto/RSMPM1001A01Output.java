package service.dto;

public class RSMPM1001A01Output {
    // 필드 선언
    private String date;
    private String time;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String memo;

    // 기본 생성자
    public RSMPM1001A01Output() {
        this.date = "";
        this.time = "";
        this.name = "";
        this.phone = "";
        this.address = "";
        this.email = "";
        this.memo = "";
    }

    // 필드 값 가져오기 메소드
    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMemo() {
        return this.memo;
    }

    // 필드 값 설정 메소드
    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
