package home.lev;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by pc-users on 7/12/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/servlet-context.xml")
public class ControllerTest {

    @Autowired
    WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
public void setUp(){
     this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
}

    @Test
    public void RunMe() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
        .andExpect(content().string("Hello world"))
        .andDo(print())
        ;
    }
}
