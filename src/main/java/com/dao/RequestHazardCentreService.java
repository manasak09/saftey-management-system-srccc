package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.RequestAction;
import java.util.List;

@Service
public class RequestHazardCentreService {
	
	@Autowired
	RequestActionDAO requestHazardCentreDAOImpl;
	public void addRequest(RequestHazardCentre hazardcentre) 
	{
		requestHazardCentreDAOImpl.addRequest(hazardCentre);
	}
	public RequestHazardCentre findHazardCentre(int id)
	{
		return requestHazardCentreDAOImpl.findRequest(id);
		
	}
	public List<RequestHazardCentre> findAllHazardCentre() 
	{
		return requestHazardCentreDAOImpl.findAllRequest();
	}
	public boolean updateHazardCentre(RequestHazardCentre hazardCentre) 
	{
		return requestHazardCentreDAOImpl.updateRequest(action);
	}
	public boolean deleteHazardCentre(int id) {
		return requestHazardCentreDAOImpl.deleteRequest(id);
	}

}