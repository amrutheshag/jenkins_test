cd D:\VIPS\ecomerce
set Projectpath=D:\VIPS\ecomerce
echo %Projectpath%
set classpath=%Projectpath%\bin;%Projectpath%\lib\*
echo %classpath%
java org.testng.TestNG %Projectpath%\testng.xml
pause