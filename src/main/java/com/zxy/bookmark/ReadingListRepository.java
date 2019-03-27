package com.zxy.bookmark;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author alp.zxy
 * @date 2019/3/10
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{

    List<Book> findByReader(String reader);
}


