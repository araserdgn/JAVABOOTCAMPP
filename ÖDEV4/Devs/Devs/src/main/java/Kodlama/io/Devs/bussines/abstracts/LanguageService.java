package Kodlama.io.Devs.bussines.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguageService {
	List<Languages> getAll();
	Languages getById(int id);
	void add(Languages language) throws Exception;
	void update(Languages language);
	void delete(int id);
}
