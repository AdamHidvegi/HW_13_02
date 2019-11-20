package com.codeclanexample.structure_hw.components;

import com.codeclanexample.structure_hw.models.File;
import com.codeclanexample.structure_hw.models.Folder;
import com.codeclanexample.structure_hw.models.User;
import com.codeclanexample.structure_hw.repositories.FileRepository;
import com.codeclanexample.structure_hw.repositories.FolderRepository;
import com.codeclanexample.structure_hw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {
        User adam = new User("Adam");
        userRepository.save(adam);
        User daniel = new User("Daniel");
        userRepository.save(daniel);

        Folder code = new Folder("main", adam);
        folderRepository.save(code);
        Folder clan = new Folder("main", daniel);
        folderRepository.save(clan);

        File file1 = new File("CodeClan", "txt", 3, code);
        fileRepository.save(file1);
        File file2 = new File("ClanCode", "java", 3, clan);
        fileRepository.save(file2);

        code.addFiles(file1);
        folderRepository.save(code);
        clan.addFiles(file2);
        folderRepository.save(clan);
    }

}
