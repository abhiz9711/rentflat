package com.cg.frs.service;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.ClientException;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	IFlatRegistrationDAO cliDao = null;
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		return cliDao.registerFlat(flat);
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		return cliDao.getAllOwnerIds();
	}

	@Override
	public boolean validateflatArea(double num) throws ClientException {
		// TODO Auto-generated method stub\
		Double input=new Double(num);
		String inputStr=input.toString();
		String digitPatter="[0-9]+";
		if(Pattern.matches(digitPatter, inputStr))
		{
			return true;
		}
				
		else
		{
			throw new ClientException("Invalid input"+"Only Digits are allowed ex.  4567");
		}
	}

	@Override
	public boolean validateflatrentAmt(float num) throws ClientException {
		// TODO Auto-generated method stub
		Float input=new Float(num);
		String inputStr=input.toString();
		String digitPatter="[0-9]+";
		if(Pattern.matches(digitPatter, inputStr))
		{
			return true;
		}
				
		else
		{
			throw new ClientException("Invalid input"+"Only Digits are allowed ex.  4567");
		}
	}

	@Override
	public boolean validatedepositAmt(float num) throws ClientException {
		// TODO Auto-generated method stub
		
		Float input=new Float(num);
		String inputStr=input.toString();
		String digitPatter="[0-9]+";
		if(Pattern.matches(digitPatter, inputStr))
		{
			return true;
		}
				
		else
		{
			throw new ClientException("Invalid input"+"Only Digits are allowed ex.  4567");
		}
	}

}
