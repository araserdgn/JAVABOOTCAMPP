package Kodlama.io.Devs.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.bussines.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.Languages;

@Service
//Senden 1 tane üretelim , Herkes gelio kullansın
public class LanguageManager implements LanguageService{

	private ProgramingLanguageRepository languageRepository;
	
	
	@Autowired 
	//KİM ProgLangRep İMPLEMENT ediyo git bak
	//InMemoryLanguage ediyo , onun NEW li halini bana ver
	public LanguageManager(ProgramingLanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Languages> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public Languages getById(int id) {
		// TODO Auto-generated method stub
		return languageRepository.getById(id);
	}

	@Override
	public void add(Languages language) throws Exception {
		// TODO Auto-generated method stub
		List<Languages> languages=languageRepository.getAll();
		
		for(Languages pLang: languages) {
			if(pLang.getName().equals("") || pLang.getId()==language.getId()) {
				throw new Exception("Aynı isim veya boş girdi olmaz");
			}
		}
		languageRepository.add(language);
	}

	@Override
	public void update(Languages language) {
		// TODO Auto-generated method stub
		languageRepository.update(language);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		languageRepository.delete(id);
	}

}
