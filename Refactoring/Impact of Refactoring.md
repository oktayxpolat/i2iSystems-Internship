# Impact of Refactoring

In order to understand the impact and importance of refactoring we will have a look at Kickstarter's story.

**In 2014, Kickstarter engineers were having trouble with an expensive Mysql query that was causing performance degradation.**

**They had implemented it straightforward when they needed it, but then when Kickstarter started to get millions of users, they found out that it wasn't fine. So they decided to refactor that Mysql query to Redis.**

**And Kiskstarter Engineering wrote full story here:**

https://kickstarter.engineering/refactoring-for-performance-2ed00b2372fc

**After refactoring, they managed to cut over 100ms off typical load times for their most prolific backers. Now their site is faster for everyone.**

