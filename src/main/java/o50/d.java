package o50;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Iterator;
import java.util.Map;
import jn0.x;
import p011ja.r;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0002*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0018\u0010\u000b\u001a\u00020\u0001*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "Lo50/b;", "a", "Ljava/util/Map;", "paneToDestination", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lo50/b;", "destination", "Lja/r;", "b", "(Lja/r;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<FinancialConnectionsSessionManifest.Pane, b> f96768a;

    static {
        Pair pairA = x.a(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, b.l.f96750i);
        Pair pairA2 = x.a(FinancialConnectionsSessionManifest.Pane.CONSENT, b.i.f96747i);
        Pair pairA3 = x.a(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, b.v.f96761i);
        Pair pairA4 = x.a(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER, b.w.f96762i);
        Pair pairA5 = x.a(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER, b.a.f96734i);
        Pair pairA6 = x.a(FinancialConnectionsSessionManifest.Pane.SUCCESS, b.y.f96764i);
        Pair pairA7 = x.a(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY, b.o.f96753i);
        Pair pairA8 = x.a(FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT, b.c.f96737i);
        FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
        b.r rVar = b.r.f96757i;
        f96768a = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, x.a(pane, rVar), x.a(FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, rVar), x.a(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP, b.q.f96755i), x.a(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION, b.s.f96758i), x.a(FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION, b.t.f96759i), x.a(FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER, b.m.f96751i), x.a(FinancialConnectionsSessionManifest.Pane.LINK_STEP_UP_VERIFICATION, b.n.f96752i), x.a(FinancialConnectionsSessionManifest.Pane.RESET, b.x.f96763i), x.a(FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR, b.j.f96748i), x.a(FinancialConnectionsSessionManifest.Pane.EXIT, b.k.f96749i), x.a(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, b.d.f96738i), x.a(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS, b.p.f96754i), x.a(FinancialConnectionsSessionManifest.Pane.NOTICE, b.u.f96760i), x.a(FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED, b.C2057b.f96736i));
    }

    public static final b a(FinancialConnectionsSessionManifest.Pane pane) {
        s.k(pane, "<this>");
        b bVar = f96768a.get(pane);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("No corresponding destination for " + pane);
    }

    public static final FinancialConnectionsSessionManifest.Pane b(r rVar) {
        Object next;
        FinancialConnectionsSessionManifest.Pane pane;
        s.k(rVar, "<this>");
        Iterator<T> it = f96768a.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((b) ((Map.Entry) next).getValue()).g(), rVar.getRoute()));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (pane = (FinancialConnectionsSessionManifest.Pane) entry.getKey()) != null) {
            return pane;
        }
        throw new IllegalArgumentException("No corresponding destination for " + rVar);
    }
}
