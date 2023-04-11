package springboot.thymeleafajax.demo.mongorepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import springboot.thymeleafajax.demo.mongomodel.Texts;

public interface TextsRepo extends MongoRepository<Texts,Integer>{

}
