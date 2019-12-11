package com.perye.dokit.repository;

import com.perye.dokit.entity.ServerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author perye
 * @email peryedev@gmail.com
 * @date 2019/12/10 11:26 下午
 */
public interface ServerAccountRepository extends JpaRepository<ServerAccount, String>, JpaSpecificationExecutor {
}
