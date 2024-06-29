package service;

import bean.mmpm1004.MMPM1004A01;
import inf.EA_SMYP1004A001_DBSMCD9999Input;
import inf.EA_SMYP1004A001_DBSMCD9999Output;

public class RSMPM1004A01 {
    public EA_SMYP1004A001_DBSMCD9999Output processService(EA_SMYP1004A001_DBSMCD9999Input input) {
        EA_SMYP1004A001_DBSMCD9999Output output = new EA_SMYP1004A001_DBSMCD9999Output();
        MMPM1004A01 mMPM1004A01 = new MMPM1004A01();
        output = mMPM1004A01.process(input);
        return output;
    }
}
