package bean.mmpm1004;

import inf.EA_SMYP1004A001_DBSMCD9999Input;
import inf.EA_SMYP1004A001_DBSMCD9999Output;

public class MMPM1004A01 {
    public EA_SMYP1004A001_DBSMCD9999Output process(EA_SMYP1004A001_DBSMCD9999Input input) {
        // 서비스 로직 작성
        EA_SMYP1004A001_DBSMCD9999Output output = new EA_SMYP1004A001_DBSMCD9999Output();
        output.setDate(input.getDate());
        return output;
    }
}
