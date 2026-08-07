package z50;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Iterator;
import java.util.List;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz50/p;", "", "Lo30/d;", "logger", "Lj40/f;", "tracker", "<init>", "(Lo30/d;Lj40/f;)V", "", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Landroid/net/Uri;", "uriString1", "uriString2", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "uri", Action.KEY_ATTRIBUTE, "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo30/d;", "Lj40/f;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j40.f tracker;

    public p(o30.d logger, j40.f tracker) {
        s.k(logger, "logger");
        s.k(tracker, "tracker");
        this.logger = logger;
        this.tracker = tracker;
    }

    private final Uri d(String str) {
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return Uri.parse(str);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            Object objB = jn0.s.b(t.a(th2));
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                j40.h.b(this.tracker, "Could not parse given URI " + str, thE, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            return (Uri) objB;
        }
    }

    public final boolean a(String uriString1, String uriString2) {
        s.k(uriString1, "uriString1");
        s.k(uriString2, "uriString2");
        Uri uriD = d(uriString1);
        Uri uriD2 = d(uriString2);
        return uriD != null && uriD2 != null && p013kotlin.text.t.N(uriD.getAuthority(), uriD2.getAuthority(), false, 2, null) && p013kotlin.text.t.N(uriD.getScheme(), uriD2.getScheme(), false, 2, null) && p013kotlin.text.t.N(uriD.getPath(), uriD2.getPath(), false, 2, null);
    }

    public final String b(String uri, String key) {
        Object objB;
        s.k(uri, "uri");
        s.k(key, "key");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Uri uriD = d(uri);
            objB = jn0.s.b(uriD != null ? uriD.getQueryParameter(key) : null);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            j40.h.b(this.tracker, "Could not extract query param " + key + " from URI " + uri, thE, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
        }
        return (String) (jn0.s.g(objB) ? null : objB);
    }

    public final Object c(String str, String str2, Continuation<? super String> continuation) {
        String fragment;
        List listF1;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Uri uriD = d(str);
            if (uriD != null && (fragment = uriD.getFragment()) != null && (listF1 = p013kotlin.text.t.f1(fragment, new String[]{"&"}, false, 0, 6, null)) != null) {
                Iterator it = listF1.iterator();
                while (it.hasNext()) {
                    List listF2 = p013kotlin.text.t.f1((String) it.next(), new String[]{"="}, false, 0, 6, null);
                    if (s.f(listF2.get(0), str2) && listF2.size() > 1) {
                        return listF2.get(1);
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            Object objB = jn0.s.b(t.a(th2));
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                j40.h.b(this.tracker, "Could not extract query param " + str2 + " from URI " + str, thE, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
            }
            if (jn0.s.g(objB)) {
                return null;
            }
            return objB;
        }
    }
}
