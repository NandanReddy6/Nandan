package com.nandan.repository;

import com.nandan.model.Books;
import org.springframework.data.repository.CrudRepository;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
