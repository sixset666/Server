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
    private BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<BaseResponse> add(@RequestBody BookEntity data) {

        return ResponseEntity.ok(new BookListResponse(service.getAll()));
    }

    @PostMapping("/add")
    public ResponseEntity<BookResponse> add(@RequestBody BookEntity data) {
        try {
            BookValidationUtils.bookValidationUtils(data);
            service.save(data);
            return ResponseEntity.ok(new BookResponse(true, "Книга добавлена",data));
        } catch (ValidationExceptionBook e) {
            return ResponseEntity.badRequest().body(new BaseResponce(false, e.getMessage(),data));
        } catch (Exception e) {
                return ResponseEntity.badRequest().body(new BaseResponce(false,e.getMessage(),data));
        }
    }

}

