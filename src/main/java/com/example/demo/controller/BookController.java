package com.example.demo.controller;

import com.example.demo.entity.BookEntity;
import com.example.demo.exception.ValidationExceptionBook;
import com.example.demo.responce.BaseResponce;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.BookListResponse;
import com.example.demo.response.BookResponse;
import com.example.demo.servise.BookService;
import com.example.demo.utils.BookValidationUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
    private final BookService service;
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<BaseResponse> getAll() {
        return ResponseEntity.ok(new BookListResponse(service.getAll()));
    }

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> add(@RequestBody BookEntity data) {
        try {
            System.out.println(data.toString());
            BookValidationUtils.bookValidationUtils(data);
            service.save(data);
            return ResponseEntity.ok(new BaseResponse(true, "Книга добавлена"));
        } catch (ValidationExceptionBook e) {
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        } catch (Exception e) {
                return ResponseEntity.badRequest().body(new BaseResponse(false,e.getMessage()));
        }
    }

    @PutMapping("/update")
    public ResponseEntity <BaseResponse> update(@RequestBody BookEntity data){
        try{
            BookValidationUtils.bookValidationUtils(data);
            service.save(data);
            return ResponseEntity.ok(new BaseResponse(true,"В книгу внесены изменения"));
        }
        catch (ValidationExceptionBook e){
            return ResponseEntity.badRequest().body(new BaseResponse(false,e.getMessage()));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false,e.getMessage()));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <BaseResponse> delete(@PathVariable Long id){
        try{
            service.delete(id);
            return ResponseEntity.ok(new BaseResponse(true,"Издательство удалено"));
        }
        catch(Exception e){
            return ResponseEntity.ok(new BaseResponse(false,e.getMessage()));
        }
    }


    @GetMapping()
    public ResponseEntity<BaseResponse> getPublisher(@RequestParam String title,@RequestParam String city){
        return ResponseEntity.ok(new BookListResponse((service.getPublisher(title,city))));
    }


}

