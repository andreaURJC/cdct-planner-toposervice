package es.urjc.test.cdctesting_planner_toposervice;

import es.codeurjc.mastercloudapps.planner.models.LandscapeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {es.codeurjc.mastercloudapps.planner.Application.class})
@AutoConfigureStubRunner(ids = {"es.codeurjc.mastercloudapps.reactive:toposervice:+:stubs:8080"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
class ApplicationTest {

    @Test
    void verify_topography_service() {
        RestTemplate restTemplate = new RestTemplate();

        LandscapeResponse landscape = restTemplate.getForObject("http://localhost:8080/api/topographicdetails/Leon", LandscapeResponse.class);

        assertEquals("1", landscape.getId());
        assertEquals("Mountain", landscape.getLandscape());
    }
}