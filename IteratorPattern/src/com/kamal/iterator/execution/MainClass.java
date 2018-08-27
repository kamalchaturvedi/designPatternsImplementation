package com.kamal.iterator.execution;

import com.kamal.iterator.iterator.TextbookCollection;
import com.kamal.iterator.iterator.TextbookIterator;
import com.kamal.iterator.model.Textbook;
/**
 * @author Kamal Chaturvedi
 *
 */
public class MainClass {
	public static void main(String[] args) {
		TextbookCollection collection = new TextbookCollection();
		TextbookIterator iterator = collection.getTextbookIterator();
		while (iterator.hasNext()) {
			Textbook book = iterator.next();
			System.out.println(book.getBookName() + " " + book.getBookType());
		}
		System.out.println();
		TextbookIterator iteratorByType = collection.getTextbookTypeIterator("English");
		while (iteratorByType.hasNext()) {
			Textbook book = iteratorByType.next();
			System.out.println(book.getBookName() + " " + book.getBookType());
		}
	}
}
