package com.codeclanexample.structure_hw.projections;

import com.codeclanexample.structure_hw.models.File;
import com.codeclanexample.structure_hw.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbedFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
