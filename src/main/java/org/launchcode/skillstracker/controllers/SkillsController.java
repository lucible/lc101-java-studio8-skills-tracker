package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    
    // Responds to GET requests at root
    @GetMapping("")
    @ResponseBody
    public String languageList() {
        String html =
        "<html>" +
            "<body>" +
                "<h1>Skills Tracker</h1>" +
                    "<h2>A few potential programming languages to learn:</h2>" +
                    "<ol>" + 
                        "<li>TypeScript</li>" +
                        "<li>Python</li>" +
                        "<li>Racket</li>" +
                    "</ol>" +
            "</body>" +
        "</html>";
        return html;
    }

    // Responds to GET requests at /form
    @GetMapping("form")
    @ResponseBody
    public String nameForm() {
        String html =
        "<html>" +
            "<body>" +
                "<form method='post' action='/form'>" +
                    "<label for='name'>My name: </label>" +
                    "<input type='text' name='name' id='name'/><br>" +
                    "<label for='choice1'>My first programming language choice: </label>" +
                    "<select name='choice1' id='choice1'>" +
                        "<option value='TypeScript'>TypeScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Racket'>Racket</option>" +
                    "</select><br>" +
                    "<label for='choice2'>My second programming language choice: </label>" +
                    "<select name='choice2' id='choice2'>" +
                        "<option value='TypeScript'>TypeScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Racket'>Racket</option>" +
                    "</select><br>" +
                    "<label for='choice3'>My third programming language choice: </label>" +
                    "<select name='choice3' id='choice2'>" +
                        "<option value='TypeScript'>TypeScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Racket'>Racket</option>" +
                    "</select><br>" +
                    "<input type = 'submit' value = 'Submit' />" +
                "</form>" +
            "</body>" +
        "</html>";
        return html;
    }

    // Responds to POST requests at /form
    @PostMapping("form")
    @ResponseBody
    public String submittedForm(@RequestParam String name
                               , @RequestParam String choice1
                               , @RequestParam String choice2
                               , @RequestParam String choice3) {
        String html =
        "<html>" +
            "<body>" +
                "<h1>" + name + "</h1>" +
                    "<ol>" + 
                        "<li>" + choice1 + "</li>" +
                        "<li>" + choice2 + "</li>" +
                        "<li>" + choice3 + "</li>" +
                    "</ol>" +
            "</body>" +
        "</html>";
        return html;
    }
}