package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.RequestHazardCentreService;

import java.util.*;
import com.model.*;

@RestController
public class RequestHazardRestController {
	
	@Autowired
	RequestHazardService service;
	
	@GetMapping("/getrequest")
	public List<HazardCentre> getAllRequest()
	{
		return service.findAllAction();
	}
	
	@PostMapping("/addrequest")
	public ResponseEntity<?> addRequest(@RequestBody RequestHazardCentre)
	{
		service.addRequest(action);
		return ResponseEntity.status(HttpStatus.OK).body("Request added Sucessfully");
	}
	
	@DeleteMapping("/deleterequest/{id}")
	public ResponseEntity<?> deleteRequest(@PathVariable int id) throws DeleteHazardCentreException
	{
		RequestHazardCentre=service.findHazardcentre(id);
		if(action==null)
		{
			throw new DeleteRequestHazardCentreException(id);
		}
		service.deleteAction(id);
		return ResponseEntity.ok("Request Deleted Succesfully");
		
		}
	
}


