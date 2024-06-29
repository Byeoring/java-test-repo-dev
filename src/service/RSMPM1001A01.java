package service;

import bean.mmpm1001.MMPM1001A01;
import service.dto.RSMPM1001A01Input;
import service.dto.RSMPM1001A01Output;

public class RSMPM1001A01 {
    // 서비스 메소드
    public RSMPM1001A01Output processService(RSMPM1001A01Input input) {
        // 서비스 로직 작성
        RSMPM1001A01Output output = new RSMPM1001A01Output();
        MMPM1001A01 mMPM1001A01 = new MMPM1001A01();
        output = mMPM1001A01.process(input);
        return output;
    }
}
