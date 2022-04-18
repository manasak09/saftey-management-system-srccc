package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Report;



@Repository
public interface ReportDAO {
	public void addReport(Report);
	public Report findReport(int id);
	public List<Report> findAllReport();
	public boolean updateReport(Report);
	public boolean deleteReport(int id);

}