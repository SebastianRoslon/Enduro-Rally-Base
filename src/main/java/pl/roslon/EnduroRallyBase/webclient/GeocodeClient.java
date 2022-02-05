package pl.roslon.EnduroRallyBase.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.roslon.EnduroRallyBase.model.PointDto;
import pl.roslon.EnduroRallyBase.webclient.dto.GeocodePositionDto;

@Component
public class GeocodeClient {

    private static final String URL = "https://api.tomtom.com/search/2/geocode/piaseczno.json?key=I8DPoFkgjahuvD6XKl2K9NdXHiSJjGWQ&limit=1";
    private RestTemplate restTemplate = new RestTemplate();

//    ObjectMapper objectMapper = new ObjectMapper();
  //  Point point;


//    {
//        try {
//            point = objectMapper.readValue(new URL(URL), Point.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    private final Point point;
//
//    @Autowired
//    public GeocodeClient(Point point) {
//        this.point = point;
//    }

    public PointDto getGeocodeForCity() {
        GeocodePositionDto geocodePositionDto = callGetMethod("https://api.tomtom.com/search/2/geocode/piaseczno.json?key=I8DPoFkgjahuvD6XKl2K9NdXHiSJjGWQ&limit=1",
                GeocodePositionDto.class);
        return PointDto.builder()
                .lat(geocodePositionDto.getLat())
                .lon(geocodePositionDto.getLon())
                .build();
    }


    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject((url), responseType, objects);
    }

}
