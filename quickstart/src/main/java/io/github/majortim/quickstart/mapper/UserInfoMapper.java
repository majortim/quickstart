package io.github.majortim.quickstart.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import io.github.majortim.quickstart.domain.UserInfo;

@Mapper
public interface UserInfoMapper {
	public UserInfo getUserInfo(Map<String, Object> param);
	public List<UserInfo> getUserInfoList();
}
