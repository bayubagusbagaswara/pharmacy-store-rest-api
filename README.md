# Online Shop REST API

Pemilik Toko Online "ABC" ingin membuat aplikasi untuk memperdagangkan jualan tokonya.
Pemilik toko ingin mendapatkan laporan hasil penjualan harian, mingguan, serta bulanan.
Setiap pelanggan yang ingin berbelanja harus mendaftarkan diri dulu ke sistemnya.
Pemilik toko juga ingin mendapatkan laporan pembelian terbanyak masing-masing customer untuk bisa membuat ranking tiap customer

1. Laporan buat pemilik toko nya, artinya hanya mempedulikan product dan order yang keluar, tidak mempedulikan customer nya siapa
2. Laporan buat customer, artinya khusus untuk customer tersebut membeli apa saja (spesifik masing-masing customer)

# User (Customer)

# Product
- Name
- Price
- Quantity (stock)

# Order Detail
- Product
- Order
- Quantity
- Price

Sample : Product = iPhone, Quantity = 4, Price = 5.000.000

# Order
- Total Price
- Date

Sample : Total Price = 20.000.000, Date = 24 July 2023

Total price diambil dari table Order Detail,


# Wishlist

- Customer
- Product
- Quantity

# Query
- Fulltext search