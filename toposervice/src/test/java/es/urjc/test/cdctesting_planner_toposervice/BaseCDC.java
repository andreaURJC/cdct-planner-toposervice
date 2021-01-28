package es.urjc.test.cdctesting_planner_toposervice;

import es.codeurjc.mastercloudapps.topo.controller.TopoController;
import es.codeurjc.mastercloudapps.topo.model.City;
import es.codeurjc.mastercloudapps.topo.service.TopoService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = {es.codeurjc.mastercloudapps.topo.Application.class})
public abstract class BaseCDC {

    @Autowired
    TopoController topoController;

    @MockBean
    TopoService topoService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(topoController);

        Mockito.when(topoService.getCity("Leon"))
                .thenReturn(new City("1", "Mountain"));
    }
}
