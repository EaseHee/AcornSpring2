package com.acorn.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.dto.EateriesDto;
import com.acorn.entity.Eateries;
import com.acorn.model.EateriesModel;

@Service
public class EateriesProcess {
	@Autowired
	private EateriesModel eateriesModel;
	
	public EateriesDto getEatery (int no) {
		return Eateries.fromEntity(eateriesModel.getEatery(no)); 
	}
}
