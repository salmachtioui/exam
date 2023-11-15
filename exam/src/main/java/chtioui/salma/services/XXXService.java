package chtioui.salma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chtioui.salma.dao.IDao;
import chtioui.salma.entities.XXX;
import chtioui.salma.repositories.XXXRepository;

@Service
public class XXXService implements IDao<XXX> {

	@Autowired
	private XXXRepository repository;

	@Override
	public XXX create(XXX o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(XXX o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public XXX update(XXX o) {
		return repository.save(o);
	}

	@Override
	public XXX findById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<XXX> findAll() {
		return repository.findAll();
	}
	
	

}
