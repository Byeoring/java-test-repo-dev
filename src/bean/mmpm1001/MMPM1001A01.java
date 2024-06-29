package bean.mmpm1001;

import service.dto.RSMPM1001A01Input;
import service.dto.RSMPM1001A01Output;

public class MMPM1001A01 {
    // 서비스 메소드
    public RSMPM1001A01Output process(RSMPM1001A01Input input) {
        // 서비스 로직 작성
        RSMPM1001A01Output output = new RSMPM1001A01Output();
        System.out.println(input.getDate());
        output.setAddress("서울시 강남구");
        output.setDate("2021-08-01");
        output.setMemo("메모");
        return output;
    }
}
