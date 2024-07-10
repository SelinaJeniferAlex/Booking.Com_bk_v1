 package com.booking.project.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;

import com.booking.project.dto.AdminDto;
import com.booking.project.model.Admin;
import com.booking.project.repo.AdminRepo;


@RestController
@RequestMapping("/file")
public class ImageController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private AdminRepo adminRepo;

//	@PostMapping("/upload")
//	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile uploadedFile) {
//		if (uploadedFile.isEmpty()) {
//			return new ResponseEntity<>("Please select a file!", HttpStatus.OK);
//		}
//		try { 
//
//			byte[] bytes = uploadedFile.getBytes();
//
//			UUID uuid = UUID.randomUUID();
////			String uploadsLocation = env.getProperty("resource.uploads");
//			String uploadsLocation = "D://Code/My Projects/BC_fr_bk/BC_bk/src/main/resources/uploads//";
//			String fileLocation = uploadsLocation + uuid + uploadedFile.getOriginalFilename();
//			Path path = Paths.get(fileLocation);
//			Files.write(path, bytes);
//
//			File file = new File(fileLocation);
//			return ResponseEntity.status(HttpStatus.OK).body(file.getName());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.CREATED).body(e.getMessage());
//
//		}
//	}
	
	@PostMapping("/uploadHotels")
	public ResponseEntity<?> uploadProduct(@ModelAttribute AdminDto adminDto) {
		if (adminDto.getImage().isEmpty()) {
			return new ResponseEntity<>("Please select a file!", HttpStatus.OK);
		}
		try {

			byte[] bytes = adminDto.getImage().getBytes();

			UUID uuid = UUID.randomUUID();
			String uploadsLocation = env.getProperty("resource.uploads");
//			String uploadsLocation = "/home/edexadm/workspace/edexspace/demo2/src/main/resources/uploads/";
			String fileLocation = uploadsLocation + uuid + adminDto.getImage().getOriginalFilename();
			Path path = Paths.get(fileLocation);
			Files.write(path, bytes);

			File imageFile = new File(fileLocation);
			Admin admin = new Admin();
			admin.setHotelName(adminDto.getHotelName());
			admin.setGrade(adminDto.getGrade());
			admin.setDistance(adminDto.getDistance());
			admin.setMeals(adminDto.getMeals());
			admin.setPropertyType(adminDto.getPropertyType());
			admin.setFacilities(adminDto.getFacilities());
			admin.setImage(imageFile.getName());
			admin.setPlace(adminDto.getPlace());
			admin.setPlaceType(adminDto.getPlaceType());			
			Admin savedEntity = adminRepo.save(admin); 
			
			return ResponseEntity.status(HttpStatus.OK).body(savedEntity);

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.CREATED).body(e.getMessage());

		}
	}
	@GetMapping("/getAllHotels")
    public ResponseEntity<?> getAllHotels() {
        try {
            List<Admin> allHotels = adminRepo.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(allHotels);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to retrieve hotels data");
        }
    }
	

}
