package es.urjc.test.cdctesting_planner_toposervice;

import es.codeurjc.mastercloudapps.topo.controller.TopoController;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@SpringBootTest
public abstract class BaseCDC {

    @Autowired
    TopoController bookController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(bookController);
    }
}
