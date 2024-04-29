package com.nandan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.nandan.model.Books;


public interface BooksRepository extends JpaRepository<Books, Integer>
{
}
