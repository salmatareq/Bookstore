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
├──Exceptions 

│    ├──BookNotFound

│    ├──NotAvailableQuantity

├── Model

│    ├── Book

│    ├── PaperBook

│    ├── EBook

│    └── DemoBook

│
├── service

│   └── ManageInventory

│   ├──ShippingService

│   ├──Mailservice

├── bookstore

│   └── BookStore (main)


Example Run

Managers are only allowed

Enter the number of years to remove the books that you are outdated

15

Available Books

cpp Basics 

Learn AI 

===============================

Enter your 

Email :

salma@gmail.com

Address : 

Menoufia

which book do you want

cpp Basics

Quantity : 2

book store: Shipping cpp Basics book to salma@gmail.com

....................................

Do you want to buy more Yes/NO

yes

which book do you want

Java Basics

Quantity : 5

NOt found

....................................

Do you want to buy more Yes/NO

yes

which book do you want

learn Ai

Quantity : 1

book store: Shipping Learn AI book to Menoufia

....................................

Do you want to buy more Yes/NO

yes

which book do you want

cpp basics

Quantity : 9

quantity is not available

....................................

Do you want to buy more Yes/NO

no

paid amount is : 370.0
