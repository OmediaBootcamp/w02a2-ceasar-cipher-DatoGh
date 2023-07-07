[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11430539&assignment_repo_type=AssignmentRepo)
# Java Spring Bootcamp 02 homework
### Week 2, Assignment 2
---

`dev.omedia.bootcamp2.cryptography` packageში   
დაწერეთ კლასი `CaesarCipher` რომელსაც ექნება:  
**მეთოდები**    
  1. `CaesarCipherMessage encrypt (String message, int shift)` რომელიც სტრიქონს დაშიფრავს კეისრის შიფრით და მნიშვნელობას ჩაწერს `CaesarCipherMessage`-ში და დააბრუნებს მას.  
  1. `String decrypt (CaesarCipherMessage message)`  გაშიფრავს `message`-ს და დააბრუნებს პირვანდელ ტექსტს.  

**კონსტრუქტორი**  
  1. რომელსაც პარამეტრად გადაეცემა სიმბოლოთა რეინჯი ( მაგ: `ა`დან`ჰ`ს ჩათვლით და`A`დან `Z`ის ჩათვლით]) და ამ რეინჯში მოქცეულ ყველა სიმბოლოს მოგვიანებით დაშიფრავს `encrypt` მეთოდში. ( მაგ "სალამი omedia" ასე დაიშიფრება თუ shift არის 1-ის ტოლი ->  "ტბმბნკ omedia")

// _შეგიძლიათ დაამატოთ  სხვა კლასებიც და მეთოდებიც საჭიროებისამებრ_
