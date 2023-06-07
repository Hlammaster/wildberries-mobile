<h1 >Проект по мобильной автоматизации приложения Wildberries</h1>

![WB_logo.jpg](media/logo/WB_logo.jpg)

## Содержание

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Allure Report отчеты</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Telegram уведомления</a>

* <a href="#video">Пример видео прогона автотеста</a>

<a id="tools"></a>
## Технологии и инструменты

| Java                                                                                                    | IntelliJ Idea                                                                                                                | Android Studio                                                                                                                             | GitHub                                                                                                    | JUnit 5                                                                                                           | Gradle                                                                                                   | Selenide                                                                                                        |  Jenkins                                                                                                           | Jira                                                                                                                         |
|:--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a id ="tech" href="https://www.jetbrains.com/idea/"><img src="media/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://developer.android.com/studio"><img src="media/logo/Android-studio.svg" width="50" height="50"  alt="Android Studio"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> |   <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/ru/software/jira"><img src="media/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a> |


| Browserstack                                                                                                                          | Appium                                                                                                    | Allure                                                                                                                    | Allure TestOps                                                                                                      |
|:--------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.browserstack.com/"><img src="media/logo/Browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>       | <a href="https://appium.io/"><img src="media/logo/Appium.svg" width="50" height="50"  alt="Appium"/></a> | <a href="https://github.com/allure-framework"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://qameta.io/"><img src="media/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a> |


<a id="cases"></a>
##  Реализованные проверки

-  Проверка навигации по главным страницам приложения
-  Смена валюты на главном экране
-  Проверка появления сообщения о возрастном ограничении

<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test "-DdeviceHost=local"  
```

### Удаленный запуск тестов

```
gradle clean test "-DdeviceHost=browserstack" 
```

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/18-johnnyhlammaster-wildberries-mobile/)

<p align="center">

<a href="https://jenkins.autotests.cloud/job/AD_demo_mobile_wb/"><img src="media/screenshots/sborka.jpg" alt="Jenkins"/></a>

> Для запуска сборки необходимо нажать "Собрать сейчас". Клик по иконкам Allure TestOps и Allure Report позволяет перейти
> на просмотр страниц с тестовой документацией и отчетов.
</p>

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"/></a> [Allure Report](https://jenkins.autotests.cloud/job/18-johnnyhlammaster-wildberries-mobile/7/allure/) отчеты

### Основное окно

<p align="center">
<img title="Allure Dashboard" src="media/screenshots/allure.jpg">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="media/screenshots/allurecase.jpg">
</p>

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3357/dashboards)

>Allure TestOps поддерживает подход Test cases as a code, что позволяет из кода поддерживать тестовую документацию в актуальном состоянии.

<p align="center">
<img title="Allure TestOps" src="media/screenshots/dashboard.jpg">
</p>

<p align="center">
<img title="Allure TestOps" src="media/screenshots/testcase.jpg">
</p>

<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-749)

<p align="center">
<img title="Jira" src="media/screenshots/jira.jpg">
</p>

<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Telegram уведомления

<p >
<img title="telegram bot" src="media/screenshots/tele.jpg">
</p>

<a id="video"></a>
## <img src="media/logo/Browserstack.svg" width="25" height="25"/></a> Пример видео прогона автотеста

<p align="center">
  <img title="Browserstack Video" src="media/video.gif">
</p>