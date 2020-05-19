package io.github.majortim.quickstart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import io.github.majortim.quickstart.domain.Entertainer;
import io.github.majortim.quickstart.vo.Criteria;

@Mapper
public interface EntertainerMapper {
	public Entertainer getEntertainer(@Param("seq") int seq);
	public List<Entertainer> getEntertainerList(Criteria criteria);
}
