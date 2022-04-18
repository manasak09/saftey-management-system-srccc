package com.controller;
	
	public class DeleteRequestHazardCentreException extends RuntimeException {
		
		private int id;
		public  DeleteRequestHazardCentreException(int id) {
			
		super("id "+id+" not found");
		this.id=id;
	}

	@Override
	public String toString() {
		return "id "+ id +" not available";
	}
	
}