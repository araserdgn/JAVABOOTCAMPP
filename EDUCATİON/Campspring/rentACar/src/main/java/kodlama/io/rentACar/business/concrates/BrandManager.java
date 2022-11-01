package kodlama.io.rentACar.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // Ioc = Bir kere yarat nesne hereks kullansın
public class BrandManager implements BrandService{

	private BrandRepository brandRepository; 
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {

		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		// İŞ KURALLARI
		// BİR KİŞİNİN MARKALARI LİSTELEYEBİLMESİ için ... tarzı kısım bura
		
		return brandRepository.getAll();
	}

}
