package com.test.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class AppCacheManager /* implements CachingConfigurer */ {

	@Bean
    public CacheManager cacheManager() {
		ConcurrentMapCacheManager cm = new ConcurrentMapCacheManager("myCache");
        return cm;
    }

	/**
	 * This my not necessary.
	 * @return
	 */
//	@Bean
//	public CacheManagerCustomizer<ConcurrentMapCacheManager> cacheManagerCustomizer() {
//		return new CacheManagerCustomizer<ConcurrentMapCacheManager>() {
//			@Override
//			public void customize(ConcurrentMapCacheManager cacheManager) {
//				cacheManager.setAllowNullValues(false);
//			}
//		};
//	}

}
