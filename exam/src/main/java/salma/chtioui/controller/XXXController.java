package salma.chtioui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chtioui.salma.entities.XXX;
import chtioui.salma.services.XXXService;

@RestController
@RequestMapping("/api/v3/XXXs")
public class XXXController {

	@Autowired
	private XXXService service;

	@GetMapping
	public List<XXX> findAllXXX() {
		return service.findAll();
	}

	@PostMapping
	public XXX createXXX(@RequestBody XXX XXX) {
		XXX.setId(0);
		return service.create(XXX);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable int id) {
		XXX XXX = service.findById(id);
		if (XXX == null) {
			return new ResponseEntity<Object>("XXX avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			return ResponseEntity.ok(XXX);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateXXX(@PathVariable int id, @RequestBody XXX newXXX) {
		XXX oldXXX = service.findById(id);
		if (oldXXX == null) {
			return new ResponseEntity<Object>("XXX avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			newXXX.setId(id);
			return ResponseEntity.ok(service.update(newXXX));
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteXXX(@PathVariable int id) {
		XXX XXX = service.findById(id);
		if (XXX == null) {
			return new ResponseEntity<Object>("XXX avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			service.delete(XXX);
			return ResponseEntity.ok("filière supprimée");
		}
	}
	
}
