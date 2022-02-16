package com.macerich.DgSearchService;

import javax.baja.collection.BITable;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.search.BSearchParams;
import javax.baja.search.BSearchService;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
  name = "searchScope",
  type = "baja:String",
  defaultValue = "slot:/"
)

@NiagaraAction(
  name = "search",
  parameterType = "BSearchParams",
  returnType = "BOrd",
  defaultValue = "new BSearchParams()",
  flags = Flags.OPERATOR
)
public class BDgSearchService extends BAbstractService {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.macerich.DgSearchService.BDgSearchService(2085731812)1.0$ @*/
/* Generated Mon Feb 14 16:26:18 MST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "searchScope"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code searchScope} property.
   * @see #getSearchScope
   * @see #setSearchScope
   */
  public static final Property searchScope = newProperty(0, "slot:/", null);
  
  /**
   * Get the {@code searchScope} property.
   * @see #searchScope
   */
  public String getSearchScope() { return getString(searchScope); }
  
  /**
   * Set the {@code searchScope} property.
   * @see #searchScope
   */
  public void setSearchScope(String v) { setString(searchScope, v, null); }

////////////////////////////////////////////////////////////////
// Action "search"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code search} action.
   * @see #search(BSearchParams parameter)
   */
  public static final Action search = newAction(Flags.OPERATOR, new BSearchParams(), null);
  
  /**
   * Invoke the {@code search} action.
   * @see #search
   */
  public BOrd search(BSearchParams parameter) { return (BOrd)invoke(search, parameter, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDgSearchService.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  BSearchService searchService = new BSearchService();

  @Override
  public Type[] getServiceTypes() {
    return searchService.getServiceTypes();
  }
}
