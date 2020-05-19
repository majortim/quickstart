package io.github.majortim.quickstart.service;

import java.util.List;

import io.github.majortim.quickstart.domain.UserInfo;

public interface UserInfoService {
	public UserInfo getUserInfo(String userId);
	public List<UserInfo> getUserInfoList();
}
