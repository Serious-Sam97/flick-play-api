package com.serioussam.flickplay.repository;

import com.serioussam.flickplay.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
