package com.hydra.sbmr;

import com.hydra.sbmr.service.FolderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ContextLoadTest {

    @Autowired
    private FolderService folderService;

    @Test
    public void associationTest() {
        folderService.doSth();
    }

}
