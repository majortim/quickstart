package io.github.majortim.quickstart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.majortim.quickstart.domain.UserInfo;
import io.github.majortim.quickstart.mapper.UserInfoMapper;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	private UserInfoMapper userInfoMapper;
	
	public UserInfoServiceImpl(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}

	
	@Override
	public UserInfo getUserInfo(String userId) {
		return userInfoMapper.getUserInfo(userId);
	}

	@Override
	public List<UserInfo> getUserInfoList() {
		return userInfoMapper.getUserInfoList();
	}

}
