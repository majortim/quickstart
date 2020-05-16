package io.github.majortim.quickstart.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.majortim.quickstart.domain.UserInfo;
import io.github.majortim.quickstart.mapper.UserInfoMapper;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}

	
	@Override
	public UserInfo getUserInfo(Map<String, Object> param) {
		return userInfoMapper.getUserInfo(param);
	}

	@Override
	public List<UserInfo> getUserInfoList() {
		return userInfoMapper.getUserInfoList();
	}

}
