package com.bshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bshop.entity.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long>{

	/*
	 * even though - your database column is title (specified by @Column)
	 * you must specify the property only 
	 * 
	 * findByTitle fails findByName works - name is the property
	 */
	Book findByName(String bookname);
	
	@Modifying
	@Query("UPDATE Book b set b.price=:price,b.authorName=:author WHERE b.id =:bookid ")
	void updateBook(@Param("bookid")  Long bookid,@Param("price")   Float price,@Param("author")  String author);

	
}
