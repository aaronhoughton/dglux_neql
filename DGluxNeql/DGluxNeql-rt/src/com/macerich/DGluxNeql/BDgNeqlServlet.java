package com.macerich.DGluxNeql;

import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraSlots;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.search.BSearchParams;
import javax.baja.search.BSearchService;
import javax.baja.sys.Action;
import javax.baja.sys.Flags;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.web.BWebServlet;

@NiagaraType
@NiagaraSlots(
  properties = {
  },
  actions = {
    @NiagaraAction(
      name = "search",
      parameterType = "BSearchParams",
      returnType = "BOrd",
      defaultValue = "new BSearchParams()",
      flags = Flags.OPERATOR | Flags.HIDDEN)
  },
  topics = {
  }
)

public class BDgNeqlServlet extends BWebServlet {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.macerich.DGluxNeql.BDgNeqlServlet(381089667)1.0$ @*/
/* Generated Thu Feb 10 16:25:28 MST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "search"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code search} action.
   * @see #search(BSearchParams parameter)
   */
  public static final Action search = newAction(Flags.OPERATOR | Flags.HIDDEN, new BSearchParams(), null);
  
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
  public static final Type TYPE = Sys.loadType(BDgNeqlServlet.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  private static final BSearchService SEARCH_SERVICE = new BSearchService();


}
