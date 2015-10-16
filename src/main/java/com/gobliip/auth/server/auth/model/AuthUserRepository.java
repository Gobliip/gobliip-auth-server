package com.gobliip.auth.server.auth.model;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by lsamayoa on 10/16/15.
 */
public interface AuthUserRepository extends PagingAndSortingRepository<AuthUser, Long> {
    AuthUser findByUsername(final String username);
}
