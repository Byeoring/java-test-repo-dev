package service;

import bean.mmpm1000.MMPM1000A01;
import service.dto.RSMPM1000A01Input;
import service.dto.RSMPM1000A01Output;

public class RSMPM1000A01 {
    // 서비스 메소드
    public RSMPM1000A01Output processService(RSMPM1000A01Input input) {
        // 서비스 로직 작성
        RSMPM1000A01Output output = new RSMPM1000A01Output();
        MMPM1000A01 mMPM1000A01 = new MMPM1000A01();
        output = mMPM1000A01.process(input);
        return output;
    }
}