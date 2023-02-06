package com.orange.crackedue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrackedUeApplicationTests {

    /**
     * 生成RAS密钥对
     *
     * @throws Exception
     */
    @Test
    void genRAS() throws Exception {
        TestUE testUE = new TestUE();
        testUE.Test(new String[]{"gen-keys"});
    }

    /**
     * 生成许可证
     *
     * @throws Exception
     */
    @Test
    void genLicense() throws Exception {
        TestUE testUE = new TestUE();
        testUE.Test(new String[]{"encrypt-license"});
    }

}
