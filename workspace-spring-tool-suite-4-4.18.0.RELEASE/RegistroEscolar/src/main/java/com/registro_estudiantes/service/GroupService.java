package com.registro_estudiantes.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.registro_estudiantes.model.Group;
import com.registro_estudiantes.repository.GroupRepository;

@Service
public class GroupService implements GroupRepository {
	@Autowired
	private GroupRepository groupRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub
	}
	
	public List<Group> findAllByCountry (Long id){
		List<Group> groupsRespuesta = new ArrayList<>();
		List<Group> groups=groupRepository.findAll();
		for(int i=0;i<groups.size();i++) {
			if(groups.get(i).getCountry().getId()==id) {
				groupsRespuesta.add(groups.get(i));
			}
		}
		return groupsRespuesta;
	}

	@Override
	public <S extends Group> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Group> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Group> entities) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
	}

	@Override
	public Group getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Group> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Group> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Group> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findAll() {
		// TODO Auto-generated method stub
		return groupRepository.findAll();
	}

	@Override
	public List<Group> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return groupRepository.findAllById(ids);
	}

	@Override
	public <S extends Group> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Group> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Group entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll(Iterable<? extends Group> entities) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Group> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Group> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Group> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Group> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Group> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Group> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Group, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
