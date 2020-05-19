package io.github.majortim.quickstart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.majortim.quickstart.domain.Entertainer;
import io.github.majortim.quickstart.mapper.EntertainerMapper;
import io.github.majortim.quickstart.vo.Criteria;

@Service
public class EntertainerServiceImpl implements EntertainerService {
	private EntertainerMapper mapper;
	
	public EntertainerServiceImpl(EntertainerMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public Entertainer getEntertainer(int seq) {
		return mapper.getEntertainer(seq);
	}

	@Override
	public List<Entertainer> getEntertainerList(Criteria criteria) {
		return mapper.getEntertainerList(criteria);
	}
}
