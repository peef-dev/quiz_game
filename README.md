# Quiz game to learn Kotlin and TypeScript

I want to learn 2 new languages and here are some steps i will follow, based on my research:

1. Choose a project: i choosed the quiz game i want to have a specific goal in mind that will help me stay focus and motivated.

2. Find good resources: 

    a. Kotlin videos: https://www.youtube.com/playlist?list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2
    b. Kotlin offical documentation: https://kotlinlang.org/docs/getting-started.html
    c. TypeScript videos: https://www.youtube.com/playlist?list=PL4cUxeGkcC9gUgr39Q_yD6v-bSyMwKPUI
    d. TypeScript offical documentation: https://www.typescriptlang.org/docs/
    e. Create a web page with TypeScript: https://medium.com/@jaeho.kim/how-to-install-typescript-and-create-a-simple-webpage-cd60371a4bb3

3. Learn the basics: I will focus only on understanding the fundamental concepts: syntax, data types, control structures and functions...

4. Practice by writing code regularly

	a. Kotlin probelm solving: https://exercism.org/tracks/kotlin
	b. TypeScript problem solving: https://exercism.org/tracks/typescript

5. Start building the quiz game to help me apply what i have learned and identify areas where i need to improve.

6. Now in this step, i can improve my skills by learning advanced topics and best practices : books, blogs, articles, conferences or workshops and find challenging projects.


Learning these languages is a gradual process, i have to take time, be patient and stay motivated.


# Overview of the quiz game

It is a game that asks users a series of questions and keeps track of their score and provide feedback to the user after each question.

## Backend

The backend API is built on Kotlin and provide the following functionalities:

- Retrieve a list of questions from a database (PostgreSQL is the one i like)
- Randomize the order of the questions each time the game is played
- Calculate the user's score based on the number of correct answers
- Keep in mind that: wrong answer: -1, no answer: 0, correct answer: +1
- Do not forget unit test

I don't know, maybe I have to choose a framework like Ktor (https://kotlinlang.org/docs/multiplatform-full-stack-app.html), Spring Boot or Jooby

## Frontend

The frontend UI is built using TypeScript without any framework to make it simple so that i can learn more

- Display a welcome screen with a "start game" button
- Display each question one at a time, along with a list of possible answers
- Highlight the correct answer after the user submits their choice
- Display the user's score at the end of the game
- Do not forget unit test


## Final target is to learn


- Server-side and frontend languages (Kotlin and TypeScript) and later Deno, instead of NodeJS
- Cloud environments/ distributed systems/ microservices
- Relational database
- Testing frameworks (Cypress, JUnit)
- Observability and monitoring (Datadog)
- DevOps culture and tools (GitHub Actions, Gradle, Terraform)

I'm already using [Peef](www.peef.dev) to learn more about Python development (API, Services)
