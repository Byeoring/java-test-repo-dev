package service;

import bean.mmpm1002.MMPM1002A01;
import inf.EA_SMYP1002A001_DBSMCD9999Input;
import inf.EA_SMYP1002A001_DBSMCD9999Output;

public class RSMPM1002A01 {
    public EA_SMYP1002A001_DBSMCD9999Output processService(EA_SMYP1002A001_DBSMCD9999Input input) {
        EA_SMYP1002A001_DBSMCD9999Output output = new EA_SMYP1002A001_DBSMCD9999Output();
        MMPM1002A01 mMPM1002A01 = new MMPM1002A01();
        output = mMPM1002A01.process(input);
        return output;
    }
}
