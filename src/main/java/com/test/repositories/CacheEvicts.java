package com.test.repositories;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

@Repository("cacheEvicts")
public class CacheEvicts {

	@CacheEvict(value="myCache", allEntries=true)
	public String evictGetAllUsers() {
		return "done";
	}
}
