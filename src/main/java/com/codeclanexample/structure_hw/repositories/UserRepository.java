package com.codeclanexample.structure_hw.repositories;

import com.codeclanexample.structure_hw.models.User;
import com.codeclanexample.structure_hw.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
