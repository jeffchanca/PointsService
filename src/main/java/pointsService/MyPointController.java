package pointsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyPointController {

	MyPoint point = new MyPoint();
	
	@RequestMapping(value="/getPoints")
	public ResponseEntity<MyPoint> get() {
		point.setTotalPoints(200);
		point.setUsedPoints(50);
		
		return new ResponseEntity<MyPoint>(point, HttpStatus.OK);
	}
}
