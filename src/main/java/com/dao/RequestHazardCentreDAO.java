package com.dao;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.model.RequestHazardCentre;


@Repository
public interface RequestHazardCentreDAO {
	public void addRequest(RequestHazardCentre hazardcentre);
	public RequestHazardCentre findRequest(int id);
	public List<RequestHazardCentre> findAllRequest();
	public boolean updateRequest(RequestHazardCentre hazardcentre);
	public boolean deleteRequest(int id);
}