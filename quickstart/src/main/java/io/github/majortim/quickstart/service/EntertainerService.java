package io.github.majortim.quickstart.service;

import java.util.List;

import io.github.majortim.quickstart.domain.Entertainer;
import io.github.majortim.quickstart.vo.Criteria;


public interface EntertainerService {
	public Entertainer getEntertainer(int seq);
	public List<Entertainer> getEntertainerList(Criteria criteria);
}
