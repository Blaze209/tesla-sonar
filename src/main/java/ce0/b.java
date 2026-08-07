package ce0;

import com.tesla.logging.TeslaLog;
import ie0.n;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lce0/b;", "", "<init>", "()V", "", "request", "Lic0/e;", "a", "(Ljava/lang/String;)Lic0/e;", "sourceContext", "b", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f19104a = new b();

    private b() {
    }

    public final ic0.e a(String request) {
        s.k(request, "request");
        try {
            return ic0.e.f77490w.decode(n.a(request));
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("CommandRequests", "Failed to decode CommandRequest", e11);
            return null;
        }
    }

    public final ic0.e b(String sourceContext) {
        s.k(sourceContext, "sourceContext");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = UUID.randomUUID().toString();
        s.j(string, "toString(...)");
        return new ic0.e(t.T(string, "-", "", false), null, null, ic0.f.SOURCE_APP_NATIVE, null, false, false, null, null, 0L, false, false, false, false, false, false, 0L, 0L, jCurrentTimeMillis, 0, sourceContext, null, 2883574, null);
    }
}
