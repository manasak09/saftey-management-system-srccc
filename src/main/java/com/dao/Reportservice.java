package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.model.InjuryCentre;

@Service
public class ReportService {
	@Autowired
	ReportDAO Reportdaoimpl;
	public void addReport(Report) {
		Reportdaoimpl.addReport(Report);
	}
	public Report findCentre(int id) {
		return Reportdaoimpl.findReport(id);
		
	}
	public List<Report> findAllReport() {
		return Reportdaoimpl.findAllReport();
	}
	public boolean updateCentre(Report) {
		return Reportdaoimpl.updateReport(Report);
	}
	public boolean deleteCentre(Report) {
		return Reportdaoimpl.deleteInjury(Report);
	}
}
