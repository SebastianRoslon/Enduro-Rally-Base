package pl.roslon.EnduroRallyBase.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.roslon.EnduroRallyBase.model.PointDto;
import pl.roslon.EnduroRallyBase.webclient.GeocodeClient;

@Service
@RequiredArgsConstructor
@Slf4j
public class GeocodeService {

    private final GeocodeClient geocodeClient;

    public PointDto getGeo() {
        return geocodeClient.getGeocodeForCity();
    }
}
