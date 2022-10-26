package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository { // VERİTABANDA kullanılacak şeyler anla isimden
	// İŞ YAPAN SINIFI somut oluşturmayacağız.
	// Önce SOYUT(interface) sonra SoMUT yapacagız
	
	List<Brand> getAll(); // getALL cagıran birisi markaları listeler yani
}
