package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.DTO;
import persistence.mapper.AmericaMapper;
import persistence.mapper.DenmarkMapper;

import java.util.List;

public class DenmarkDAO implements DAO {
    SqlSessionFactory sqlSessionFactory;

    public DenmarkDAO(SqlSessionFactory sqlSessionFctory){
        this.sqlSessionFactory = sqlSessionFctory;
    }

    public List<DTO> selectAll(){
        List<DTO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        DenmarkMapper mapper = session.getMapper(DenmarkMapper.class);
        try{
            list = mapper.selectAll();
            session.commit();
        }catch(Exception e){
            e.getStackTrace();
            session.rollback();
        }finally {
            session.close();
        }
        return list;
    }

    public boolean insert(DTO dto){
        boolean b = false;
        SqlSession session = sqlSessionFactory.openSession();
        DenmarkMapper mapper = session.getMapper(DenmarkMapper.class);
        try{
            b = mapper.insert(dto);
            session.commit();
        }catch (Exception e) {
            e.getStackTrace();
            session.rollback();
        }finally {
            session.close();
        }
        return b;
    }
}
