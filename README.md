News App

https://newsapi.org/

/*****************************************************************************/


News API is a simple HTTP REST API for searching and retrieving live articles from all over the web. It can help you answer questions like:

What top stories is TechCrunch running right now?
What new articles were published about the next iPhone today?
Has my company or product been mentioned or reviewed by any blogs recently?
You can search for articles with any combination of the following criteria:

Keyword or phrase. Eg: find all articles containing the word 'Microsoft'.
Date published. Eg: find all articles published yesterday.
Source domain name. Eg: find all articles published on thenextweb.com.
Language. Eg: find all articles written in English.
You can sort the results in the following orders:

Date published
Relevancy to search keyword
Popularity of source
You need an API key to use the API - this is a unique key that identifies your requests. They're free while you're in development.

/*****************************************************************************/

Endpoints

News API has 2 main endpoints:

Everything /v2/everything – search every article published by over 80,000 different sources large and small in the last 4 years. This endpoint is ideal for news analysis and article discovery.
Top headlines /v2/top-headlines – returns breaking news headlines for countries, categories, and singular publishers. This is perfect for use with news tickers or anywhere you want to use live up-to-date news headlines.
There is also a minor endpoint that can be used to retrieve a small subset of the publishers we can scan:

Sources /v2/top-headlines/sources – returns information (including name, description, and category) about the most notable sources available for obtaining top headlines from. This list could be piped directly through to your users when showing them some of the options available.
