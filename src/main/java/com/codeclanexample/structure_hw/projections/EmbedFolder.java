package com.codeclanexample.structure_hw.projections;

import com.codeclanexample.structure_hw.models.File;
import com.codeclanexample.structure_hw.models.Folder;
import com.codeclanexample.structure_hw.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {
    String getTitle();
    User getUser();
    List<File> getFiles();
}
