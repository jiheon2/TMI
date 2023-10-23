package poly.persistance.mapper;

import org.apache.ibatis.annotations.Mapper;
import poly.dto.TraderDTO;

import java.util.List;

@Mapper
public interface ITraderMapper {
    int insertTraderInfo(TraderDTO pDTO) throws Exception; // 회원가입
    TraderDTO getTraderIdExists(TraderDTO pDTO) throws Exception; // 아이디 중복여부
    TraderDTO getTraderInfo(TraderDTO pDTO) throws Exception; // 상인 정보 가져오기
    TraderDTO getTraderId(TraderDTO pDTO) throws Exception; // 상인 아이디 가져오기 > 정보 코드에서 ID만 추출하면 되지 않을까?
    void updateTraderInfo(TraderDTO pDTO) throws Exception; // 상인 정보 업데이트
    void deleteTraderInfo(TraderDTO pDTO) throws Exception; // 상인 회원탈퇴 기능
}
