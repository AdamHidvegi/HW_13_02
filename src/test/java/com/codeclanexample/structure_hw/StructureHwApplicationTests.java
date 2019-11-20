package com.codeclanexample.structure_hw;

import com.codeclanexample.structure_hw.models.File;
import com.codeclanexample.structure_hw.models.Folder;
import com.codeclanexample.structure_hw.models.User;
import com.codeclanexample.structure_hw.repositories.FileRepository;
import com.codeclanexample.structure_hw.repositories.FolderRepository;
import com.codeclanexample.structure_hw.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StructureHwApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFolderAndUser() {
		User user = new User("Adam");
		userRepository.save(user);

		Folder folder = new Folder("main", user);
		folderRepository.save(folder);
	}

	@Test
	public void addFolderAndFile() {
		User user = new User("Adam");
		userRepository.save(user);

		Folder folder = new Folder("main", user);
		folderRepository.save(folder);

		File file = new File("CodeClan", "rb", 3, folder);
		fileRepository.save(file);

		folder.addFiles(file);
		folderRepository.save(folder);
	}

}
