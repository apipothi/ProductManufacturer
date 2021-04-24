package com.apipothi.warehouse.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductManufacturer")
public class WarehouseProduct {

	@Id 
	private int id;
	
	private String wproductid;
	private String wproductname;
	private long wproductprice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getWproductid() {
		return wproductid;
	}

	public void setWproductid(String wproductid) {
		this.wproductid = wproductid;
	}

	public String getWproductname() {
		return wproductname;
	}

	public void setWproductname(String wproductname) {
		this.wproductname = wproductname;
	}

	public long getWproductprice() {
		return wproductprice;
	}

	public void setWproductprice(long wproductprice) {
		this.wproductprice = wproductprice;
	}

	@Override
	public String toString() {
		return "WarehouseProduct [id=" + id + ", wproductid=" + wproductid + ", wproductname=" + wproductname
				+ ", wproductprice=" + wproductprice + "]";
	}

}
