package com.study.data.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.data.vo.DataBoardVO;
import com.study.data.vo.DataSearchVO;


// Mapper 를 통해서 IDataBoardDao 구현체를 만들어줌
@Mapper
public interface IDataBoardDao {
  public int getBoardCount(DataSearchVO searchVO);
  public List<DataBoardVO> getBoardList(DataSearchVO searchVO) ;
  public DataBoardVO getBoard(int boNo);
  public int increaseHit(int boNo);
  public int updateBoard(DataBoardVO board);
  public int deleteBoard(DataBoardVO board);
  public int insertBoard(DataBoardVO board);
}
