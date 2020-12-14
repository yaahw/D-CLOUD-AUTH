package com.ynding.cloud.auth.server.admin.data;

import com.ynding.cloud.auth.server.admin.entity.Role;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author ynding
 */
public interface RoleRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {
    /**
     * 查找所有
     */
    @Override
    @Cacheable
    List<Role> findAll();
}
