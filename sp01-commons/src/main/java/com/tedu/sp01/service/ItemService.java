package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//�õ���Ʒ�б�
	List<Item> getItems(String orderId);
	//ɾ����Ʒ����
	void decreaseNumbers(List<Item> list);
}
