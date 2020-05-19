package io.github.majortim.quickstart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import io.github.majortim.quickstart.domain.UserInfo;

@Mapper
public interface UserInfoMapper {
	public UserInfo getUserInfo(@Param("userId") String userId);
	public List<UserInfo> getUserInfoList();
}
