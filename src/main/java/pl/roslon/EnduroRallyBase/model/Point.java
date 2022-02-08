package pl.roslon.EnduroRallyBase.model;

import lombok.*;
import org.springframework.stereotype.Component;
import pl.roslon.EnduroRallyBase.webclient.ResultsDto;
import pl.roslon.EnduroRallyBase.webclient.SummaryDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
@Builder
public class Point {

    private SummaryDto summary;
    private ResultsDto[] results;

}
