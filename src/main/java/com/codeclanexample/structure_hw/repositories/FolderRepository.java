package com.codeclanexample.structure_hw.repositories;

import com.codeclanexample.structure_hw.models.Folder;
import com.codeclanexample.structure_hw.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
