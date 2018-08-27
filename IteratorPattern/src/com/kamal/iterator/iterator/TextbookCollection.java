package com.kamal.iterator.iterator;

import java.util.ArrayList;
import java.util.List;

import com.kamal.iterator.model.Textbook;

/**
 * @author Kamal Chaturvedi
 *
 */
public class TextbookCollection {
	List<Textbook> allTextbooks;
	{
		allTextbooks = new ArrayList<Textbook>();
		allTextbooks.add(new Textbook("Goodwill", "English"));
		allTextbooks.add(new Textbook("Brass", "German"));
		allTextbooks.add(new Textbook("Drama", "French"));
		allTextbooks.add(new Textbook("Zarasdas", "German"));
		allTextbooks.add(new Textbook("Badwill", "English"));
	}

	public TextbookIterator getTextbookIterator() {
		return new TextbookIteratorImpl();
	}

	public TextbookIterator getTextbookTypeIterator(String textbookType) {
		return new TextbookIteratorPerTypeImpl(textbookType);
	}

	class TextbookIteratorImpl implements TextbookIterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index <= (allTextbooks.size() - 1))
				return true;
			else
				return false;
		}

		@Override
		public Textbook next() {
			return allTextbooks.get(index++);
		}

	}

	class TextbookIteratorPerTypeImpl implements TextbookIterator {
		int index;
		String textbookType;

		TextbookIteratorPerTypeImpl(String textbookType) {
			this.textbookType = textbookType;
		}

		@Override
		public boolean hasNext() {
			while (index <= allTextbooks.size() - 1) {
				Textbook book = allTextbooks.get(index);
				if (book.getBookType().equalsIgnoreCase(textbookType)) {
					return true;
				} else {
					index++;
				}
			}
			return false;
		}

		@Override
		public Textbook next() {
			return allTextbooks.get(index++);
		}

	}

}
