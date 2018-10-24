package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.util.CollectionUtil;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {
	
	ArrayList<FlatRegistrationDTO> arr = new ArrayList<FlatRegistrationDTO>();

	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		
		arr.add(flat);
		int flatId = (int) (1000*Math.random());
		
		
		return arr;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
	
		// TODO Auto-generated method stub
		return CollectionUtil.getAllOwnerIds();
	}
	

}
