package com.codeclanexample.structure_hw.projections;

import com.codeclanexample.structure_hw.models.Folder;
import com.codeclanexample.structure_hw.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {
    String getName();
    List<Folder> getFolders();
}
