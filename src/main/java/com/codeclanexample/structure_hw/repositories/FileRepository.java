package com.codeclanexample.structure_hw.repositories;

import com.codeclanexample.structure_hw.models.File;
import com.codeclanexample.structure_hw.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
