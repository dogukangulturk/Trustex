# Trustex

## Description (Açıklama)

### English
Trustex is a backend service for a financial application that allows users to manage their assets, perform currency exchanges, and handle transfers between accounts. The service integrates with external APIs to update exchange rates and maintains a secure database of users, transactions, and assets.

### Türkçe
Trustex, kullanıcıların varlıklarını yönetmelerine, döviz değişimleri yapmalarına ve hesaplar arası transferleri gerçekleştirmelerine olanak tanıyan bir finansal uygulama için bir backend hizmetidir. Bu hizmet, döviz kurlarını güncellemek için harici API'lerle entegre olur ve kullanıcıların, işlemlerin ve varlıkların güvenli bir veritabanını tutar.

## Features (Özellikler)

### English
- **User Management**: Create, update, and delete users.
- **Asset Management**: Manage user assets with real-time exchange rates.
- **Currency Exchange**: Retrieve the latest currency exchange rates from an external API.
- **Transfers**: Perform and manage fund transfers between users.
- **Scheduled Tasks**: Automatically update exchange rates at specified intervals.
- **Exception Handling**: Custom exceptions for better error handling.

### Türkçe
- **Kullanıcı Yönetimi**: Kullanıcı oluşturma, güncelleme ve silme işlemleri.
- **Varlık Yönetimi**: Kullanıcı varlıklarını gerçek zamanlı döviz kurlarıyla yönetme.
- **Döviz Değişimi**: Harici bir API'den en güncel döviz kurlarını alma.
- **Transferler**: Kullanıcılar arasında para transferlerini gerçekleştirme ve yönetme.
- **Zamanlanmış Görevler**: Belirli aralıklarla döviz kurlarını otomatik olarak güncelleme.
- **Hata Yönetimi**: Daha iyi hata yönetimi için özel istisnalar.

## Technologies Used (Kullanılan Teknolojiler)

- **Java 21**
- **Spring Boot 3.3**
- **Hibernate & JPA**
- **MSSQL**
- **Lombok**
- **JUnit 5 & Mockito**
- **RestTemplate**

## Installation (Kurulum)

### English
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/trustex-backend.git
   cd trustex-backend
