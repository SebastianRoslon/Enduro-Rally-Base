package pl.roslon.EnduroRallyBase.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.roslon.EnduroRallyBase.webclient.PointDto;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class GeocodeService {

    private final String API_URL = "https://api.tomtom.com/search/2/geocode/";
    private final String API_KEY = "I8DPoFkgjahuvD6XKl2K9NdXHiSJjGWQ";
    ObjectMapper objectMapper = new ObjectMapper();
    private RestTemplate restTemplate = new RestTemplate();


//    public Point pointReader() throws IOException {
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        return objectMapper.readValue(new URL(API_URL), Point.class);
//    }
//warszawa.json?key=I8DPoFkgjahuvD6XKl2K9NdXHiSJjGWQ&limit=1";

    public PointDto getGeocode(String city) {
        PointDto pointDto = callGetMethod("{city}.json?key={key}&limit=1", PointDto.class, city , API_KEY);
        log.info(String.valueOf(pointDto));
        return PointDto.builder()
                .summary(pointDto.getSummary())
                .results(pointDto.getResults())
                .build();
    }

//    public String getGeocodeToString(){
//        return String.valueOf(getGeocode());
//    }

    List<PointDto> pointDtoList = new ArrayList<>();


    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(API_URL + url, responseType, objects);
    }

}
