package bean.mmpm1002;

import inf.EA_SMYP1002A001_DBSMCD9999Input;
import inf.EA_SMYP1002A001_DBSMCD9999Output;

public class MMPM1002A01 {
    public EA_SMYP1002A001_DBSMCD9999Output process(EA_SMYP1002A001_DBSMCD9999Input input) {
        // 서비스 로직 작성
        EA_SMYP1002A001_DBSMCD9999Output output = new EA_SMYP1002A001_DBSMCD9999Output();
        output.setDate(input.getDate());
        System.out.println("업데이트 되었습니다.");
        return output;
    }
}
