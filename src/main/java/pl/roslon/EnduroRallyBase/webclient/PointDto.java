package pl.roslon.EnduroRallyBase.webclient;

import lombok.*;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PointDto {

    private SummaryDto summary;
    private List<ResultsDto>results;


}
