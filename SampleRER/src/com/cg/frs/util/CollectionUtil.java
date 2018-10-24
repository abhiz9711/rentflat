package com.cg.frs.util;

import java.util.List;
import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public class CollectionUtil {

	static ArrayList<FlatRegistrationDTO> clist = new ArrayList<FlatRegistrationDTO>();
	static {
		clist.add(123);
		clist.add(343);
		clist.add(567);
	}
	public static ArrayList<Integer> getAllOwnerIds(){
		return clist;
	}

}
