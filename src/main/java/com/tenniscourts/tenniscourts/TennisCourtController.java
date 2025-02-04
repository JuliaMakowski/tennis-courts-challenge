package com.tenniscourts.tenniscourts;

import com.tenniscourts.config.BaseRestController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/tenniscourt")
public class TennisCourtController extends BaseRestController {

    private final TennisCourtService tennisCourtService;

    //TODO: implement rest and swagger
    @PostMapping("/create")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Void> addTennisCourt(TennisCourtDTO tennisCourtDTO) {
        return ResponseEntity.created(locationByEntity(tennisCourtService.addTennisCourt(tennisCourtDTO).getId())).build();
    }

    @PostMapping("/update")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Void> updateTennisCourt(TennisCourt tennisCourt, String name) {
        return ResponseEntity.ok(tennisCourtService.updateTennisCourt(tennisCourt,name));
    }

    //TODO: implement rest and swagger
    @GetMapping()
    @CrossOrigin(origins = "*")
    public ResponseEntity<TennisCourtDTO> findTennisCourtById(Long tennisCourtId) {
        return ResponseEntity.ok(tennisCourtService.findTennisCourtById(tennisCourtId));
    }

    //TODO: implement rest and swagger
    @GetMapping("/scheduler")
    @CrossOrigin(origins = "*")
    public ResponseEntity<TennisCourtDTO> findTennisCourtWithSchedulesById(Long tennisCourtId) {
        return ResponseEntity.ok(tennisCourtService.findTennisCourtWithSchedulesById(tennisCourtId));
    }
}
