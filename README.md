# Backend tutorial with Java basics
Basics for self-learner

## How to install Java on Windows?
1. First download Java 9 from this page: *https://jdk.java.net/java-se-ri/9*
2. Unpack the zip file and move jdk-9 folder to *C://Program Files/Java*.
3. After finishing the installation press *Windows* button on your keyboard and start typing *environment details*. You should be able to go to *Environment details* setup.
Go to Environments details and attach the path to your Java installation (it should be something like *C:\Program Files\Java\jdk-9\bin*) after semicolon to user variable named *PATH* (if doesn't exist, create one).
4. Now press *Windows* button on your keyboard, type *cmd* and press enter. A new command line terminal will open. Type *java -version*, if the installation went correctly you should be able to see the version of Java printed out.

## Best tool for writing the code
It doesn't seem just my opinion anymore, but major part of environment opinion, best tool is IntelliJ IDEA by JetBrains. You can download the community edition from this link:
https://www.jetbrains.com/idea/download
The power of this tool is in the shortcuts and various plugins which help you to write good quality code. Read more here: *https://www.jetbrains.com/help/idea/mastering-keyboard-shortcuts.html*

## How to install Git on Windows?
Git is the most popular tool for managing the version of your code. It tracks every change you ever made in your code and makes it possible to get back to any saved ("committed") point in the past.
1. Download the package from here: *https://git-scm.com/download/win* and go through the installation. 
2. Now open cmd and type *git --version*, you should be able to see similar message: *git version 2.17.1*

## Know your command line tool
If you installed Git on your machine you will be able to click on *Windows* button and start typing "git bash". Open it and pin to your start bar. This is a command line tool, 
which helps you interact with the machine through written commands. It is similar to CMD tool which is default for Windows operating system.
In git bash you can execute Linux commands and it is designed specifically for managing your code version with git.
Basic commands:
* ls - lists files in current directory
* pwd - prints your current directory path
* cd - allows you to change directory: *cd ..* makes you go one directory up while *cd <folder_name>* goes inside a folder in your current directory. 
**PRO TIP**: type cd and press *TAB* button on your keyboard. You will see the list of available directories. Mark one and click *Shift* + *Insert* buttons together. It will get copy-pasted in the terminal.

Those commands are Linux-specific and will not work inside CMD, get used to Git Bash.

## How to manage versioning of your code?
Simply, by Git. It is a distributed versioning system, which means there is a remote repository available on GitHub but each
developer in the team has his own version of the code. For now you will work on master branch only, which is the main verision.
Commands which you absolutely must know to start:
* *git clone* <- creates a local copy on your machine
* *git init* <- initiates a new repository on your machine
* *git status* <- prints the status of changes and newly created files
* *git add <filename>* <- adds chosen file to set of changes to be commited
* *git commit* -m "</brief description of your changes>"
* *git push* <- pushes changes to remote repository
* *git log* <- prints the history of commits in your repository (to escape this view type "q")

Each repository must have a .gitignore file which you may copy from this tutorial.


## How to get this tutorial code to your machine?
* If you don't have a GitHub account yet, register yourself. 
* Above this readme file in GitHub you will find a button *Clone or download*, click on it. Copy the link *https://github.com/AgnieszkaSzyszkowska/Backend-Java-tutorial.git*
* Open Intellij IDEA and go to *VCS -> Checkout from version control -> Git* and paste the link. Leave the default path. 
* If you are logged in to **Github** you will be able to clone the repository.
* Now you can open this project in IntelliJ IDEA. CLick *File -> Open ->* pick folder with *Java-tutorial* and click open. 
* Hello!
* If you want to get newest version simply open Git Bash, cd into folder Java-tutorial on your machine and execute command *git pull*
