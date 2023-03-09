## Read Me

### Fork this repo before
- Once you are done forking, and once you have your own repo
- Now open your terminal or GIT Bash
- type `git clone` and paste your forked repo.
- once you have clone it, do `cd <pathName>`
- once you are on the cloned repo folder
- type this: 
  - `git remote add upstream https://github.com/anishniroula1/entireAcademyAssignments` 
  - `git fetch upstream`
  - `git merge upstream/main`

### Next time when you want to pull from original repo
- `git fetch upstream`
- `git merge upstream/main`
- If you run into merge, let me know or google how to fix merge issue.

### Exercise Navigation
 - CLick on src
 - Click on main -> Java -> com.entireAcademy
 - Find the exercise that you want to do
 - You will see two file, one class Note and other one says exercise
 - Open the exercise and start working on that

### Once you finished working on that, you can commit to you change and push it.
- `git status` to check your changes
- `git add -A` add your changes
- `git commit -m "messageAny"` add your message to that commit
- `git push origin main` This will push your changes and the changes from the original repository to your forked repository.