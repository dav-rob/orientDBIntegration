package com.entendior.screener.domain;

import java.util.Collection;
import java.util.LinkedList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import screener.OrientDBIntegration.DataLocatorTest;

public class FixedSizeLinkedList<E> extends LinkedList<E> {
	
	private static final long serialVersionUID = 1L;
	private Log LOG = LogFactory.getLog(DataLocatorTest.class);
	
	private int maxSize;
	
	public FixedSizeLinkedList(Collection<? extends E> collection, int maxSize) {
		super(collection);
		if (collection.size() > maxSize){
			throw new IllegalStateException("Collection is bigger than max size.");
		}
		this.maxSize = maxSize;
		
	}
	
	public FixedSizeLinkedList(int maxSize) {
		super();
		this.maxSize = maxSize;
	}

	@Override
	public void addFirst(E e) {
		if (this.size() >= maxSize){
			LOG.info("List at max size, removing last item, before adding first.");
			this.removeLast();
			this.addFirst(e);
		} else {
			super.addFirst(e);
		}
	}
	
	@Override
	public void addLast(E e) {
		if (this.size() >= maxSize){
			LOG.info("List at max size,not adding any new items to end of list.");
		} else {
			super.addLast(e);
		}
	}

}
