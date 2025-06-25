package com.example.ungdungmuonsach.controller;

import com.example.ungdungmuonsach.model.Book;
import com.example.ungdungmuonsach.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class LibraryController {
    @Autowired
    private ILibraryService libraryService;

    @GetMapping()
    public String listBooks(Model model) {
        model.addAttribute("books", libraryService.getAllBooks());
        return "list";
    }

    // --- Detail ---
    @GetMapping("/view/{id}")
    public String detailBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", libraryService.getBookById(id));
        return "detail";
    }

    @PostMapping("/borrow/{id}")
    public String borrow(@PathVariable Long id, Model model) {
        String code = libraryService.borrowBook(id);
        model.addAttribute("code", code);
        return "borrow-success";
    }

    @PostMapping("/return")
    public String returnBook(@RequestParam String code, Model model) {
        libraryService.returnBook(code);
        return "return-success";
    }

}
