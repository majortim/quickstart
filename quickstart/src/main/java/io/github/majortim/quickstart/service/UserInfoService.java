package io.github.majortim.quickstart.service;

import java.util.List;
import java.util.Map;

import io.github.majortim.quickstart.domain.UserInfo;

public interface UserInfoService {
	public UserInfo getUserInfo(Map<String, Object> param);
	public List<UserInfo> getUserInfoList();
}
