package com.example.springboot.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池配置
 *
 * @author guibing.lin
 * @date 2020/7/31
 */
@Configuration
public class ExecutorConfig {

    /**
     * 核心线程数
     */
    @Value("${executor-config.thread-pool.corePoolSize}")
    private int corePoolSize;

    /**
     * 最大线程数
     */
    @Value("${executor-config.thread-pool.maxPoolSize}")
    private int maxPoolSize;

    /**
     * 队列大小
     */
    @Value("${executor-config.thread-pool.queueCapacity}")
    private int queueCapacity;

    /**
     * 持续活动时间
     */
    @Value("${executor-config.thread-pool.keepAliveSeconds}")
    private int keepAliveSeconds;

    /**
     * 线程名称前缀
     */
    @Value("${executor-config.thread-pool.threadNamePrefix}")
    private String threadNamePrefix;


    @Bean
    public Executor asyncServiceExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setKeepAliveSeconds(keepAliveSeconds);
        executor.setThreadNamePrefix(threadNamePrefix);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }


}
