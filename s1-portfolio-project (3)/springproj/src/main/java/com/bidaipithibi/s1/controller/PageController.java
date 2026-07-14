package com.bidaipithibi.s1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The site is a single scrolling page (like the original static index.html).
 * All sections (home, about, projects, skills, experience, competitive,
 * certifications, contact) live as separate fragment files under
 * templates/sections/ for easy editing, but Thymeleaf merges them all
 * into one page here, so scrolling behaves exactly like the original.
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
