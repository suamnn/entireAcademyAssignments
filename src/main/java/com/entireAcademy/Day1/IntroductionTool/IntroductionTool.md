# Welcome to Java Course 2023
### Today Plan
1. Sign up on GitHub.com 
2. Download git bash 
3. Navigate files using the UI (Windows Explorer)
4. Find and open a command line application (Git BASH)
5. Understand and use the command line 
6. Understand Pathing and Hierarchical Structures (Parent & Child folders and file structures)
7. Remember the basic BASH commands cd, ls, and pwd 
8. Understand what source control is 
9. Understand what Git is and the workflow
10. Download IntelliJ and Java 17
11. Git clone project

# Now go to [GitHub.com](https://github.com/) and signup if you don't have an account

## How to download Git bash on Window
- Go to this website: [https://git-scm.com/download/](https://git-scm.com/download/)
- Chose `Windows` from the option
- ![gitImage.png](https://github.com/anishniroula1/entireAcademyAssignments/raw/main/src/main/java/com/entireAcademy/Day1/IntroductionTool/gitImage.png)
- Choose the 64 bit option, as shows in the image
- Once it asks to save, save it.
- Double-click on just downloaded file and follow the instruction to finish the installation.

## How to download Git bash on Mac
- First open your terminal and type `git --version`
- If you see: `git version 2.37.1 (Apple Git-137.1)` or something similar that means git is in your laptop already
- If you don't see it, follow the instruction bellow:
  - You will need to download the homebrew
  - In your terminal type : `/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`
  - Once Homebrew is installed
  - type this: `brew install git`
  - Once it's done type this to check the latest version: `git --version`

## Assume you have GitHub account now
- You will need to configure your git
- First: `git config --global user.name "Emma Paris"`
- second: `git config --global user.email "eparis@atlassian.com"`

## What is a File System:
- Files are like papers in a folder, but on a computer. They hold information we want to keep.
- Folders are like big containers that hold other containers called sub-folders and files. All the files are inside a folder on a computer.
- Files and folders have special information called metadata that tells us things like when they were last changed, who owns them, and who can look at them. This special information is part of the computer's filing system.

For Window please use GIT BASH and for Mac Use Terminal.

## To move around in your folders, you can type "cd" followed by a command: Tilde
- `cd ~ /user/name/jjd` takes you back to your main folder, called the home directory.
- `cd "directory name` takes you to a specific folder, like a room in a house.
- `cd ..` moves you up one level in the folder structure.
- To see what folder you're in, type `pwd` - Print working directory.
- To see what files are in a folder, type `ls`.
- These are just short ways to type out longer words: `cd` means change directory,
  - ***`ls` means list, and `pwd` means print working directory.***

#### ***Sometimes we need to change the computer's files and folders.***

## Here are some ways we can do it:
- To make a new folder, we can use the command `mkdir <dirName>`.
- To delete an empty folder, we use the command `rmdir <directoryname>`.
- To delete a file, we use the command `rm <filename.extension>`.
- But be careful! If we add `-r` to the delete folder command, it will delete everything in the folder, even other folders and files inside. So we need to be very careful when using `rm -r <directoryname>`.

## Source Control:
- Source control is like a way for computer programmers to keep track of their work. 
- They use special software, like git or bitbucket, to save different versions of their code. 
- This helps them keep organized and go back to older versions if they need to.
- With git, the programmer has a copy of their work on their own computer, and also on a main computer somewhere else. This means they can work on their own and then share their changes with others.

## When programmers want to save their work using git, they need to follow these steps:
1. They can check what files they have changed by typing `git status`.
2. Then they need to tell git which files to save by typing `git add -A`. This is like putting the files in a box to be saved.
3. Next, they need to actually save the files to their computer by typing `"git commit -m "<commit message>"`. 
4. This is like putting the box of files on a shelf in their room. 
5. Finally, they can share their saved work with others by typing `git push origin main`. This is like taking the box of files from their shelf and putting it in a shared storage room.

## Few More Git Commands
1. git init: Initializes a new git repository in the current directory.
2. git clone: Creates a copy of an existing repository.
3. git pull: Downloads changes from a remote repository to the local repository.
4. git branch: Lists all branches in the repository.
5. git checkout: Switches between different branches in the repository.
6. git merge: Combines changes from two or more branches into a single branch.

## How to download IntelliJ in Mac and window
- Go to this link: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
- ![image](https://user-images.githubusercontent.com/42947580/228818340-67ff9dfb-e0e5-4f81-8725-e04c279c959d.png)
- For window, choose the Community edition and click on download
- For mac, choose the Community edition and click on download

#### ***To set up java 17, and how to clone this project we will go over in the Video***
