package com.deva.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tblcategory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AutoNumber
	private Integer id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cid")
	private List<Food> foods;
	
	public Category(Integer id) {
		super();
		this.id = id;
	}
}
