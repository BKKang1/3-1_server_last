import controller.MyBatisConnectionFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dao.AnalysisDAO;
import persistence.dto.AnalysisDTO;
import persistence.dto.ReqTableDTO;
import persistence.dto.ResTableDTO;
import persistence.dto.TableData;
import readAPI.ReadData;
import service.AnalysisService;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {

        ReadData.allDataRead("2017");
        ReadData.allDataRead("2018");
        ReadData.allDataRead("2019");
        ReadData.allDataRead("2020");
        ReadData.allDataRead("2021");
        ReadData.allDataRead("2022");
    }
}