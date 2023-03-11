package com.bezkoder.spring.mssql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bezkoder.spring.mssql.repository.TutorialRepository;
import com.bezkoder.spring.mssql.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bezkoder.spring.mssql.model.Tutorial;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {

//	@Autowired
//	TutorialRepository tutorialRepository;
	@Autowired
	TutorialService tutorialService;

	@GetMapping("/all")
	public Iterable<Tutorial> getAll() {
			//TutorialService tutorialservice = new TutorialService();
			Iterable<Tutorial> tutorials = tutorialService.FindAll();
			System.out.println("tutorials = " + tutorials);
			return tutorials;
	}

//	@GetMapping("/all1")
//	public Iterable<Tutorial> getAll1() {
//		TutorialService tutorialservice = new TutorialService();
//		Iterable<Tutorial> tutorials = tutorialservice.findAll();
//		System.out.println("tutorials = " + tutorials);
//		return tutorials;
//	}

//	@GetMapping("/tutorials")
//	public List<Tutorial> getAllTutorials(@RequestParam(required = false) String title) {
//		try {
//			System.out.println("title = " + title + (title== null ? "IS Null" :"not Null"));
//
//			List<Tutorial> tutorials = new ArrayList<>();
//
//			if (title == null) {
//				tutorialRepository.findAll().forEach(e -> tutorials.add(e));
//				System.out.println("tutorials = " + tutorials);
//
//			} else
//				tutorials.addAll(tutorialRepository.findByTitle(title));
//
//			if (tutorials.isEmpty()) {
////				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//				return null;
//			}
//
//			return tutorials;
//		} catch (Exception e) {
//			return null;
//		}
//
//	}
//
//	@GetMapping("/tutorials/{id}")
//	public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
//		Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
//
//		if (tutorialData.isPresent()) {
//			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@PostMapping("/tutorials")
//	public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
//		try {
//			Tutorial _tutorial = tutorialRepository
//					.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
//			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@PutMapping("/tutorials/{id}")
//	public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
//		Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
//
//		if (tutorialData.isPresent()) {
//			Tutorial _tutorial = tutorialData.get();
//			_tutorial.setTitle(tutorial.getTitle());
//			_tutorial.setDescription(tutorial.getDescription());
//			_tutorial.setXpublished(tutorial.isXpublished());
//			return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@DeleteMapping("/tutorials/{id}")
//	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
//		try {
//			tutorialRepository.deleteById(id);
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@DeleteMapping("/tutorials")
//	public ResponseEntity<HttpStatus> deleteAllTutorials() {
//		try {
//			tutorialRepository.deleteAll();
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//
//	}
//
//	@GetMapping("/tutorials/published")
//	public ResponseEntity<List<Tutorial>> findByPublished() {
//		try {
//			List<Tutorial> tutorials = tutorialRepository.findByXpublished(true);
//
//			if (tutorials.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//			return new ResponseEntity<>(tutorials, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
}
