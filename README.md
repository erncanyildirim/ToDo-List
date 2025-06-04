# ToDo List

Bu depo, Kotlin ile geliştirilmiş basit bir yapılacaklar listesi (To-Do List) uygulamasını içerir. Uygulama, kullanıcıların yeni görevler eklemesine ve uzun basarak silebilmesine olanak tanır.

## Klasör Yapısı

- `app/` - Android uygulama modülü
  - `src/main/java/` - Kotlin kaynak kodları
  - `src/main/res/` - XML düzen dosyaları ve diğer kaynaklar
- `gradle/` - Gradle yapılandırmaları ve Wrapper
- `build.gradle.kts` ve `settings.gradle.kts` - üst düzey Gradle betikleri

## Gereksinimler

- **compileSdk**: 35
- **targetSdk**: 35
- **minSdk**: 26
- **Kotlin**: 2.0.21

### Kullanılan Önemli Kütüphaneler

- AndroidX Core KTX
- AppCompat
- Material Components
- Activity KTX
- ConstraintLayout
- RecyclerView `1.2.1`
- CardView `1.0.0`

## Projeyi Derleme

### Android Studio

1. Depoyu klonladıktan sonra Android Studio ile `Open` seçeneğinden projeyi açın.
2. Gerekli Gradle eşitlemesi tamamlandıktan sonra `Run` düğmesine basarak uygulamayı bir cihaz veya emülatörde çalıştırabilirsiniz.

### Komut Satırı (Gradle)

Aşağıdaki komutları projenin kök dizininden çalıştırabilirsiniz:

```bash
./gradlew assembleDebug   # Debug APK oluşturur
./gradlew installDebug    # Bağlı cihazda uygulamayı kurar
```

Gradle Wrapper ilk çalışmada gerekli eklentileri indirmeye çalışacaktır.

