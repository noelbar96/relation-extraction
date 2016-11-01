# relation-extraction
Relation Extraction from Natural Language Texts, Using JAVA

The idea is to implement 5 Hand-Crafted Rules, namely:

1.)such NP as {NP,}*{(or|and)} NP
	... works by such authors as Herrick, Goldsmith, and 	Shakespeare.
	hyponym(“author”, “Herrick”);
	hyponym(“author”, “Goldsmith”);
	hyponym(“author”, “Shakespeare”);

2.)NP {, NP}*{*} and other NP
	… temples, treasuries and other important civic buildings 	…
 	hyponym(“temple”, “civic building”);
 	hyponym(“treasury”, “civic building”);

3.)NP {,NP}* {,} or other NP
	Bruises, wounds, broken bones  or other injuries ….
	hyponym(“bruise”, “injury”)
	hyponym(“wound”, “injury”)
	hyponym(“broken bone”, “injury”)

4.)NP {,} including {NP,}* {or|and} NP
	All common-law countries, including Canada and England …
	hyponym(“Canada”, “common-law country”)
	hyponym(“England”, “common-law country”)

5.)NP {,} especially  {NP,}* {or|and} NP
	… most European countries, especially France, England and Spain.
	hyponym(“France”, “European country”)
	hyponym(“England”, “European country”)
	hyponym(“Spain”, “European country”)

Firstly, we used Standford Parser to add tags to each word in the sentence.
We have used Regular Expressions in order to group the words. We are not doing discourse processing.
Following that, we have used some string processing techniques to get desired outputs. These techniques have been used based on the studying the pattern. The drawback is that it requires grammatically and semantically correct input to work effectively.

The ParserDemo.java is the Stanford Parser.
The RegexMatches.java is to identify Rule 1.
The reg1.java is to identify Rule 5.

*Requirements*
1.) A GUI so that a user can enter only 1 sentence and the system can input and check which rule applies.
2.) Programs for other rules.
3.) The parser gives a Tree Output, but the Regular Expression matching classes accept string(single line) input. How to convert the pragraph like text from the TreePrint() to a single line of text?
