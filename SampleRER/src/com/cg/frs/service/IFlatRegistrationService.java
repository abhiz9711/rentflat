package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.ClientException;

public interface IFlatRegistrationService {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);
	ArrayList<Integer> getAllOwnerIds();
public boolean validateflatArea(double num)throws ClientException;
	
	public boolean validateflatrentAmt(float num)throws ClientException;
	public boolean validatedepositAmt(float num)throws ClientException;

}
