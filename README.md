##AutoComplete

Most keyboards used in mobile devices provide the option of auto-complete, which gives a list of candidate words that you wish to type given a prefix of the word you enter. For instance, when you type "sh", it will give you a list of candidate words such as "she", "shell", "ship", etc. Our goal is to write a program that auto-completes any word given a prefix of it. Here is a demo.

    Enter a prefix: 
When the program is run, you will be prompted to enter a prefix. When you enter "sh", it will print a list of candidate words and prompt you again for picking one of the candidates.

    Enter a prefix: sh
    she
    ship
    shell
    ...
    Pick: 
When you enter "ship", it will say the word is learned and prompt you for the next prefix.

    Enter a prefix: sh
    she
    ship
    shell
    ...
    Pick: ship
    "ship" is learned.

    Enter a prefix: 
If you enter the prefix "sh" again, the program now shows a different list of candidates by having "ship" at the top of the list.

    Enter a prefix: sh
    ship
    she
    shell
    ...
    Pick: 
##Task

1. Download the dictionary file containing a list of English words.
1. Create a class called `Autocomplete`
   * This class extends [`Trie`](../master/Trie.java) and implements [`IAutocomplete`](../master/IAutocomplete.java).
1. Store all words from the dictionary file to LastNameAutocomplete.
   * The value type is a collection of strings (e.g., `List<String>`).
1. Get a prefix from the standard input and print 20 candidates matching the prefix if exists. The most recently selected candidate should appear at the top, the 2nd most recently selected candidate should appear at the 2nd, and so on. The rest of the candidate list should be filled with the shortest words matching the prefix. Make sure the same candidate does not appear more than once.
    * Define the `getCandidates` method under `Autocomplete`.
    * `@param prefix` the prefix of candidate words to return.
    * `@return` the list of candidate words for the specific prefix.
1. Get the selected candidate from the standard input. If the candidate does not exist in the trie, store it. Also, remember this is the most recently selected candidate for that particular prefix.
    * Define the `pickCandidate` method under `Autocomplete` that memorizes the specific candidate word for the specific prefix.
    * `@param prefix` the prefix.
    * `@param` candidate the selected candidate for the prefix.
1. Keep repeating 3 and 4.
* [`RunAutocomplete`](../master/t.java), [`DummyAutocomplete`](../master/t.java)

##Extra credit

* Instead of showing the most recent candidates at the top, show the most frequently used candidates first. This will require you to change the value type of the trie from `List<String>` to `List<something else implements Comparable>`.
##Notes

* Do not change the dictionary file. If you find anything peculiar about the dictionary file, please let me know so everyone works on the same copy of the dictionary file.
* Please test your program yourself. I'll evaluate your program using my unit test and measure the performance (both speed and accuracy).
* [`TrieNode`](../master/TrieNode.java) has two more methods now.
 * `getChildrenMap()` returns the children map of this node.
 * `isEndState()` returns true if this node contains the last character in any string.
* I wrote `LengthComparator`, which can be used for comparing string lengths.
* Take a look at [Map](http://docs.oracle.com/javase/7/docs/api/java/util/Map.html) if you are not familiar with methods in the standard library.
* If you are having trouble with implementing `getCandidates`, think about how to traverse the trie given any node.
* If you are having trouble with implementing `pickCandidate`, take a look at [`Trie#put`](../master/Trie.java).
* If there are more than one candidate with the same lengths, they should be sorted alphabetically.
