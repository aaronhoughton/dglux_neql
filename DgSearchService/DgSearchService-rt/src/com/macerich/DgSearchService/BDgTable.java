package com.macerich.DgSearchService;

import javax.baja.collection.BITable;
import javax.baja.collection.ColumnList;
import javax.baja.collection.TableCursor;
import javax.baja.naming.BHost;
import javax.baja.naming.BISession;
import javax.baja.naming.BOrd;
import javax.baja.nav.BINavNode;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.util.Iterator;

@NiagaraType
public class BDgTable extends BComponent implements BITable<BObject> {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.macerich.DgSearchService.BDgTable(2979906276)1.0$ @*/
/* Generated Mon Feb 14 16:07:43 MST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDgTable.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  @Override
  public TableCursor<BObject> cursor() {
    return null;
  }

  @Override
  public ColumnList getColumns() {
    return null;
  }

  @Override
  public BFacets getTableFacets() {
    return null;
  }

  @Override
  public BHost getHost() {
    return super.getHost();
  }

  @Override
  public BISession getSession() {
    return super.getSession();
  }

  @Override
  public boolean isMounted() {
    return super.isMounted();
  }

  @Override
  public BOrd getAbsoluteOrd() {
    return super.getAbsoluteOrd();
  }

  @Override
  public BOrd getOrdInHost() {
    return super.getOrdInHost();
  }

  @Override
  public Iterator<BINavNode> iterateNavDescendants() {
    return super.iterateNavDescendants();
  }
}
