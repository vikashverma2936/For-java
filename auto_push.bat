@echo off
echo Starting GitHub Auto-Sync...
cd /d "%~dp0"

echo ------------------------------------------
echo Pulling latest changes from GitHub...
git pull origin main

echo ------------------------------------------
echo Adding new files...
git add .

echo ------------------------------------------
echo Committing changes...
git commit -m "Auto-update: %date% %time%"

echo ------------------------------------------
echo Pushing to GitHub...
git push origin main

echo ------------------------------------------
echo SUCCESS! Your code is now on GitHub.
timeout /t 5
