@echo off
echo Exécution des tests Maven
mvn test -Dgroups="alltests" 
pause
