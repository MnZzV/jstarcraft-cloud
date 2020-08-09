package com.jstarcraft.cloud.governance;

import java.net.URI;
import java.util.Map;

/**
 * 治理实例
 * 
 * @author Birdy
 *
 */
public interface GovernanceInstance {

    /**
     * 获取实例标识
     * 
     * @return
     */
    String getId();

    /**
     * 获取实例名称
     * 
     * @return
     */
    String getName();

    /**
     * 获取实例协议
     * 
     * @return
     */
    String getScheme();

    /**
     * 获取实例域名
     * 
     * @return
     */
    String getHost();

    /**
     * 获取实例端口
     * 
     * @return
     */
    int getPort();

    /**
     * 获取实例URI
     * 
     * @return
     */
    URI getUri();

    /**
     * 获取实例元信息
     * 
     * @return
     */
    Map<String, String> getMetadata();

}