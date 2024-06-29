package service;

import bean.mmpm1003.MMPM1003A01;
import inf.EA_SMYP1003A001_DBSMCD9999Input;
import inf.EA_SMYP1003A001_DBSMCD9999Output;

public class RSMPM1003A01 {
    public EA_SMYP1003A001_DBSMCD9999Output processService(EA_SMYP1003A001_DBSMCD9999Input input) {
        EA_SMYP1003A001_DBSMCD9999Output output = new EA_SMYP1003A001_DBSMCD9999Output();
        MMPM1003A01 mMPM1003A01 = new MMPM1003A01();
        output = mMPM1003A01.process(input);
        return output;
    }
}
