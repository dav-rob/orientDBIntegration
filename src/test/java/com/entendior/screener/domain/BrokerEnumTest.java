package com.entendior.screener.domain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokerEnumTest {
  @Test
  public void f() {
	  Assert.assertEquals(BrokerEnum.valueOf("IG"), BrokerEnum.IG);
	  Assert.assertEquals(BrokerEnum.valueOf("CMC"), BrokerEnum.CMC);
	  Assert.assertEquals(BrokerEnum.valueOf("ETX"), BrokerEnum.ETX);
	  
	  Assert.assertEquals(BrokerEnum.valueOf("IG").toString(), "IG");
	  Assert.assertEquals(BrokerEnum.valueOf("CMC").toString(), "CMC");
	  Assert.assertEquals(BrokerEnum.valueOf("ETX").toString(), "ETX");
  }
}
