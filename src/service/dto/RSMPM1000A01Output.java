package service.dto;

public class RSMPM1000A01Output {
    // 필드 선언
    private String cusno;
    private String trxGb;
    private String prdtCd;

    // 기본 생성자
    public RSMPM1000A01Output() {
        this.cusno = "";
        this.trxGb = "";
        this.prdtCd = "";
    }

    // 필드 값 가져오기 메소드
    public String getCusno() {
        return this.cusno;
    }

    public String getTrxGb() {
        return this.trxGb;
    }

    public String getPrdtCd() {
        return this.prdtCd;
    }

    // 필드 값 설정 메소드
    public void setCusno(String cusno) {
        this.cusno = cusno;
    }

    public void setTrxGb(String trxGb) {
        this.trxGb = trxGb;
    }

    public void setPrdtCd(String prdtCd) {
        this.prdtCd = prdtCd;
    }
}
