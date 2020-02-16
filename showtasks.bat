call runcrud.bat
if "%ERRORLEVEL%" == "0" goto browser
goto faisl

:browser
start chrome --new-window http://localhost:8080/crud/v1/task/getTasks
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.