# Quiz game to learn Kotlin and TypeScript

I want to learn 2 new languages and here are some steps I will follow, based on my research:

1. Choose a project: I chose the quiz game because I want to have a specific goal in mind that will help me stay focus and motivated.

2. Find good resources: 

    a. Kotlin videos: https://www.youtube.com/@freecodecamp/search?query=kotlin

    b. Kotlin offical documentation: https://kotlinlang.org/docs/getting-started.html

    c. Kotlin Android documentation: https://developer.android.com/kotlin

    d. TypeScript videos: https://www.youtube.com/playlist?list=PL4cUxeGkcC9gUgr39Q_yD6v-bSyMwKPUI

    e. TypeScript offical documentation: https://www.typescriptlang.org/docs/

    f. Create a web page with TypeScript: https://medium.com/@jaeho.kim/how-to-install-typescript-and-create-a-simple-webpage-cd60371a4bb3

3. Learn the basics: I will focus only on understanding the fundamental concepts: syntax, data types, control structures and functions... and practice by writing code regularly

4. Start building the quiz game to help me apply what I have learned and identify areas where i need to improve.

5. Improve my skills by learning advanced topics and best practices : books, blogs, articles, conferences or workshops and find challenging projects.


Learning these languages is a gradual process, I have to take time, be patient and stay motivated.


# Overview of the quiz game

It is a game that asks users a series of questions and keeps track of their score and provide feedback to the user after each question.

## Rest API

The API is built on Python/Flask and provide the following routes:

- Retrieve a list of questions from a database (PostgreSQL is the one i like)
- Randomize the order of the questions each time the game is played
- Calculate the user's score based on the number of correct answers
- Keep in mind that: wrong answer: -1, no answer: 0, correct answer: +1
- Do not forget unit test

## Android and Web app

The Android app is built on Kotlin and web app is built on top of TypeScript.

They provide the following functionalities:

- Display a welcome screen with a "start game" button
- Display each question one at a time, along with a list of possible answers
- Highlight the correct answer after the user submits their choice
- Display the user's score at the end of the game
- Do not forget unit test
