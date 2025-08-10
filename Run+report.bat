call mvn clean test
TIMEOUT /T 5 /NOBREAK
CD D:\PROJECTS JAV\Californication\CalifornicationSauceProject\target
call allure serve