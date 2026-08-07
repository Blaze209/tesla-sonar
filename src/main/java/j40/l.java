package j40;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jn0.h0;
import jn0.t;
import m50.UserFacingEventResponse;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import w30.e0;
import w30.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0016"}, d2 = {"Lj40/l;", "", "Lwo0/b;", "json", "Lo30/d;", "logger", "<init>", "(Lwo0/b;Lo30/d;)V", "Lw30/l0;", "", "b", "(Lw30/l0;)Ljava/lang/String;", "Lm50/e;", "Lj40/i;", "c", "(Lm50/e;)Lj40/i;", "response", "Ljn0/h0;", "a", "(Lw30/l0;)Ljn0/h0;", "Lwo0/b;", "Lo30/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f82620d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wo0.b json;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    public l(wo0.b json, o30.d logger) {
        s.k(json, "json");
        s.k(logger, "logger");
        this.json = json;
        this.logger = logger;
    }

    private final String b(l0<String> l0Var) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = (!l0Var.getIsError() || (jSONObjectOptJSONObject = e0.a(l0Var).optJSONObject(AnalyticsAttribute.Error)) == null) ? null : jSONObjectOptJSONObject.optJSONObject("extra_fields");
        if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("events_to_emit")) == null || strOptString.length() <= 0) {
            return null;
        }
        return strOptString;
    }

    private final FinancialConnectionsEvent c(UserFacingEventResponse userFacingEventResponse) {
        Object objB;
        FinancialConnectionsEvent.c next;
        FinancialConnectionsEvent.a aVar;
        String errorCode;
        FinancialConnectionsEvent.a next2;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Iterator<FinancialConnectionsEvent.c> it = FinancialConnectionsEvent.c.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                next = it.next();
            } while (!s.f(next.getValue(), userFacingEventResponse.getType()));
            FinancialConnectionsEvent.c cVar = next;
            UserFacingEventResponse.Error error = userFacingEventResponse.getError();
            if (error == null || (errorCode = error.getErrorCode()) == null) {
                aVar = null;
            } else {
                Iterator<FinancialConnectionsEvent.a> it2 = FinancialConnectionsEvent.a.getEntries().iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!s.f(next2.getValue(), errorCode));
                aVar = next2;
                if (aVar == null) {
                    aVar = FinancialConnectionsEvent.a.UNEXPECTED_ERROR;
                }
            }
            UserFacingEventResponse.InstitutionSelected institutionSelected = userFacingEventResponse.getInstitutionSelected();
            String institutionName = institutionSelected != null ? institutionSelected.getInstitutionName() : null;
            UserFacingEventResponse.Success success = userFacingEventResponse.getSuccess();
            objB = jn0.s.b(new FinancialConnectionsEvent(cVar, new FinancialConnectionsEvent.Metadata(institutionName, success != null ? Boolean.valueOf(success.getManualEntry()) : null, aVar)));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.logger.error("Error mapping event response", thE);
        }
        return (FinancialConnectionsEvent) (jn0.s.g(objB) ? null : objB);
    }

    public final h0 a(l0<String> response) {
        Object objB;
        h0 h0Var;
        s.k(response, "response");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            String strB = b(response);
            if (strB != null) {
                Iterable iterable = (Iterable) this.json.d(so0.a.g(UserFacingEventResponse.INSTANCE.serializer()), strB);
                ArrayList<FinancialConnectionsEvent> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    FinancialConnectionsEvent financialConnectionsEventC = c((UserFacingEventResponse) it.next());
                    if (financialConnectionsEventC != null) {
                        arrayList.add(financialConnectionsEventC);
                    }
                }
                for (FinancialConnectionsEvent financialConnectionsEvent : arrayList) {
                    this.logger.debug("Emitting event " + financialConnectionsEvent.getName() + " with metadata " + financialConnectionsEvent.getMetadata());
                    i40.a.f75822a.b(financialConnectionsEvent.getName(), financialConnectionsEvent.getMetadata());
                }
                h0Var = h0.f84049a;
            } else {
                h0Var = null;
            }
            objB = jn0.s.b(h0Var);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.logger.error("Error decoding event response", thE);
        }
        return (h0) (jn0.s.g(objB) ? null : objB);
    }
}
