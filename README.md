# tester
| TC ID | Technique | score | Expected return | เป้าหมาย | Actual | Status |
|:-----:|:---------:|:-----:|:---------------:|:--------:|:------:|:------:|
| TC1  | BVA (ค่าสูงสุด) | 100 | "A"  | ค่าสูงสุดที่ถูกต้อง ได้เกรด A | | Not run |
| TC2  | BVA (ขอบล่าง A) | 80 | "A"  | 80 พอดี ได้ A | | Not run |
| TC3  | BVA (ขอบบน B+) | 79 | "B+" | ต่ำกว่า A 1 คะแนน ได้ B+ | | Not run |
| TC4  | BVA (ขอบล่าง B+) | 75 | "B+" | 75 พอดี ได้ B+ | | Not run |
| TC5  | BVA (ขอบล่าง B) | 70 | "B"  | 70 พอดี ได้ B | | Not run |
| TC6  | BVA (ขอบล่าง C+) | 65 | "C+" | 65 พอดี ได้ C+ | | Not run |
| TC7  | BVA (ขอบล่าง C) | 60 | "C"  | 60 พอดี ได้ C | | Not run |
| TC8  | BVA (ขอบล่าง D+) | 55 | "D+" | 55 พอดี ได้ D+ | | Not run |
| TC9  | BVA (ขอบล่าง D) | 50 | "D"  | 50 พอดี ได้ D | | Not run |
| TC10 | BVA (ขอบบน F) | 49 | "F"  | ต่ำกว่า D 1 คะแนน ได้ F | | Not run |
| TC11 | BVA (ค่าต่ำสุด) | 0 | "F"  | ค่าต่ำสุดที่ถูกต้อง ได้ F | | Not run |
| TC12 | EP (invalid ต่ำกว่าช่วง) | -1 | IllegalArgumentException | คะแนนติดลบ ต้องโยน exception | | Not run |
| TC13 | EP (invalid เกินช่วง) | 101 | IllegalArgumentException | คะแนนเกิน 100 ต้องโยน exception | | Not run |