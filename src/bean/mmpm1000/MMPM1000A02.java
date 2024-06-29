package bean.mmpm1000;

import service.dto.RSMPM1000A02Input;
import service.dto.RSMPM1000A02Output;

public class MMPM1000A02 {
    // 서비스 메소드
    public RSMPM1000A02Output process(RSMPM1000A02Input input) {
        // 서비스 로직 작성
        RSMPM1000A02Output output = new RSMPM1000A02Output();
        System.out.println(input.getDate());
        output.setCusno("826897330");
        output.setTrxGb("01");
        output.setPrdtCd("A01");
        return output;
    }
}
