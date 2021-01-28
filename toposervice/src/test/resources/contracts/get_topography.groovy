import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return the topography of the city"

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

Contract.make {
    description "Should return the topography of the city"

    request {
        url "/api/topographicdetails/Alicante"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                id: 2,
                landscape: "Flat"
        )
    }
}