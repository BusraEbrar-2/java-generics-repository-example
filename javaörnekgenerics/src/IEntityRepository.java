public interface IEntityRepository <T extends IEntitiy> { // java da bu şekilde 
    // ekleme silme güncelleme listeleme
    void add (T entity); // entity veri tabanı nesnesi 
    void delete (T entity);
    void update(T entity);

}

// bu interface tiplerin tamamı için çalışacaktır çünkü T
// T = type 
// kullandığın sınıfta hangi nesne için kullanacğını da yazman gerek 