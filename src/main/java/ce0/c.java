package ce0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.tesla.oapi.CommandActionExtensionsKt;
import com.tesla.oapi.CommandActionsKt;
import ie0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000f\u001a\u00020\f*\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u0011\u001a\u00020\f*\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0003\"\u0015\u0010\u001a\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lic0/e;", "", "a", "(Lic0/e;)Ljava/lang/String;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/logging/g;", "logger", "", DateTokenConverter.CONVERTER_KEY, "(Lic0/e;Landroid/content/Context;Lcom/tesla/logging/g;)[B", "Lce0/j;", "", "h", "(Lce0/j;)Z", "isWhitelistOperation", "g", "isSignedByPresentKey", "Lsc0/b;", "c", "(Lic0/e;)Lsc0/b;", "domain", "b", "commandAnalyticsName", "f", "(Lic0/e;)Z", "userInitiatedCommand", "requestmanager_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final String a(ic0.e eVar) {
        s.k(eVar, "<this>");
        return ic0.e.f77490w.encodeByteString(eVar).a();
    }

    public static final String b(ic0.e eVar) {
        String analyticsName;
        s.k(eVar, "<this>");
        ic0.c action = eVar.getAction();
        return (action == null || (analyticsName = CommandActionExtensionsKt.getAnalyticsName(action)) == null) ? Address.ADDRESS_NULL_PLACEHOLDER : analyticsName;
    }

    public static final sc0.b c(ic0.e eVar) {
        sc0.b domain;
        s.k(eVar, "<this>");
        ic0.c action = eVar.getAction();
        if (action == null || (domain = CommandActionsKt.getDomain(action)) == null) {
            throw new IllegalStateException("Command action property missing");
        }
        return domain;
    }

    public static final byte[] d(ic0.e eVar, Context context, com.tesla.logging.g gVar) {
        s.k(eVar, "<this>");
        s.k(context, "context");
        ic0.c action = eVar.getAction();
        if (action != null && action.getProxyCommand() != null) {
            return n.f("04dba395b99f8f3a22122a79435800fc315fef62b1778ecd5cf7cb6a1f817748067184e8b4561505345363c54cee9c8ee30a5a1b053e2f4c1a8cfb573751d2ada4");
        }
        try {
            return rb0.e.f107486a.d(context);
        } catch (Exception e11) {
            if (gVar == null) {
                return null;
            }
            gVar.d("Failed to retrieve public key", e11);
            return null;
        }
    }

    public static /* synthetic */ byte[] e(ic0.e eVar, Context context, com.tesla.logging.g gVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            gVar = null;
        }
        return d(eVar, context, gVar);
    }

    public static final boolean f(ic0.e eVar) {
        s.k(eVar, "<this>");
        ic0.c action = eVar.getAction();
        if (action != null) {
            return CommandActionExtensionsKt.getUserInitiated(action);
        }
        return false;
    }

    public static final boolean g(TeslaCommandRequest teslaCommandRequest) {
        ic0.e request;
        ic0.c action;
        if (teslaCommandRequest == null || (request = teslaCommandRequest.getRequest()) == null || (action = request.getAction()) == null) {
            return false;
        }
        return CommandActionExtensionsKt.isSignedByPresentKey(action);
    }

    public static final boolean h(TeslaCommandRequest teslaCommandRequest) {
        ic0.e request;
        ic0.c action;
        if (teslaCommandRequest == null || (request = teslaCommandRequest.getRequest()) == null || (action = request.getAction()) == null) {
            return false;
        }
        return CommandActionExtensionsKt.isWhitelistOperation(action);
    }
}
