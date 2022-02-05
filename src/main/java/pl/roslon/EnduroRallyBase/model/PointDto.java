package pl.roslon.EnduroRallyBase.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@AllArgsConstructor
@Getter
@Builder
//@Component
//@JsonIgnoreProperties(ignoreUnknown = true)

public class PointDto {

    private double lat;
    private double lon;


}
