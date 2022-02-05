package pl.roslon.EnduroRallyBase;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.roslon.EnduroRallyBase.model.PointDto;
import pl.roslon.EnduroRallyBase.service.GeocodeService;
import pl.roslon.EnduroRallyBase.webclient.GeocodeClient;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@Controller
public class GeocodeController {

    private final GeocodeService geocodeService;


    @GetMapping("/index")
    public String getGeo(Model model) throws IOException {
        model.addAttribute("point", geocodeService.getGeo());
        return "index";
    }

//    @GetMapping("/geo")
//    public PointDto getGeo() {
//        return geocodeService.getGeo();
//    }

}

