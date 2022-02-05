package pl.roslon.EnduroRallyBase.webclient.dto;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class GeocodeDto {
    private GeocodeResultsDto results;
}
