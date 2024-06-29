package service;

import bean.mmpm1000.MMPM1000A02;
import service.dto.RSMPM1000A02Input;
import service.dto.RSMPM1000A02Output;

public class RSMPM1000A02 {
    public RSMPM1000A02Output processService(RSMPM1000A02Input input) {
        // 서비스 로직 작성
        RSMPM1000A02Output output = new RSMPM1000A02Output();
        MMPM1000A02 mMPM1000A02 = new MMPM1000A02();
        output = mMPM1000A02.process(input);
        return output;
    }
}
