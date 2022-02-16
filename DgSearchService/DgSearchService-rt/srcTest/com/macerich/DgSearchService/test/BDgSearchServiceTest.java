package com.macerich.DgSearchService.test;

import com.macerich.DgSearchService.BDgSearchService;
import com.macerich.DgSearchService.BDgTable;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.search.BSearchParams;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.test.BTestNg;

@NiagaraType
public class BDgSearchServiceTest extends BTestNg {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.macerich.DgSearchService.test.BDgSearchServiceTest(2979906276)1.0$ @*/
/* Generated Mon Feb 14 16:41:54 MST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDgSearchServiceTest.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  @Test
  public void searchTest() {
    BDgSearchService searchService = new BDgSearchService();
    BOrd result = searchService.search(new BSearchParams());
    Assert.assertEquals(result, BOrd.make(""));
  }
}
