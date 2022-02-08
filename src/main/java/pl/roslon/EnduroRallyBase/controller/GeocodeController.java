package pl.roslon.EnduroRallyBase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.roslon.EnduroRallyBase.service.GeocodeService;


@Controller
//@RestController
public class GeocodeController {

    private final GeocodeService geocodeService;
    public GeocodeController(GeocodeService geocodeService) {
        this.geocodeService = geocodeService;
    }

//    @GetMapping("/point")
//    public Point getPoint() throws IOException {
//        return geocodeService.pointReader();
//    }

    @GetMapping("/index")
    public String getGeo(Model model){
        model.addAttribute("geocode", geocodeService.getGeocode("Golkow"));
        return "index";
    }

}
