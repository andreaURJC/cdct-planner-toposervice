import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return the topography of the city Leon"

    request {
        url "/api/topographicdetails/Leon"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                id: 1,
                landscape: "Mountain"
        )
    }
}
