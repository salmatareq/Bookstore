"# Bookstore" 

- Add different types of books:
  - Paper Books (with stock & shipping)
  - EBooks (with file type & email delivery)
  - Showcase Books (not for sale)
- Buy books using ISBN, email, and address
- Automatically reduce stock when buying paper books
- Send books through dummy services (Mail & Shipping)
- Remove outdated books older than a specific number of years
- Easily extensible for future book types

Project Structure

src/
├── Model

│    ├── Book

│    ├── PaperBook

│    ├── EBook

│    └── DemoBook

│
├── service

│   └── ManageInventory
│

├── bookstore

│   └── BookStore (main)


Example Run
Managers are only allowed 

Enter the number of years to remove the books that you are outdated

15

Available Books

Java Basics 

Ancient Manuscripts 

===============================

Enter your 

Email :

salma@gmail.com

Address : 

Menoufia

which book do you want

Java Basics

Quantity : 2

book store: Shipping paper book to Menoufia

....................................

Do you want to buy more Yes/NO

yes

which book do you want

cpp Basics

Quantity : 1

NOt found

....................................

Do you want to buy more Yes/NO

yes

which book do you want

java Basics

Quantity : 9

quantity is not available

....................................

Do you want to buy more Yes/NO

no

paid amount is : 200.0

    
