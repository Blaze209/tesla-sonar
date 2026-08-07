package mf0;

import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ie0.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import vc0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R.\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lmf0/g;", "", "Lmf0/i;", "connector", "", "vin", "<init>", "(Lmf0/i;Ljava/lang/String;)V", "Lvc0/u0;", "firaSessionRequest", "", "startTime", "Ljn0/h0;", "c", "(Lvc0/u0;J)V", "", "sessionId", "b", "(I)V", "Llf0/b;", "oobEvent", "a", "(Llf0/b;)Llf0/b;", "Lmf0/i;", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Ljava/util/concurrent/ConcurrentHashMap;", "lastRangingSessionSetup", "Lcom/tesla/logging/g;", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/logging/g;", "logger", "e", "J", "rangingStartIntervalMs", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i connector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ConcurrentHashMap<Integer, Pair<u0, Long>> lastRangingSessionSetup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long rangingStartIntervalMs;

    public g(i connector, String vin) {
        s.k(connector, "connector");
        s.k(vin, "vin");
        this.connector = connector;
        this.vin = vin;
        this.lastRangingSessionSetup = new ConcurrentHashMap<>();
        com.tesla.logging.g gVarP = com.tesla.logging.g.INSTANCE.a("Uwb").p("FiraMessagePreHandler");
        String strF = q0.f(vin);
        s.j(strF, "obfuscateVIN(...)");
        this.logger = gVarP.o(strF);
        this.rangingStartIntervalMs = 60000L;
    }

    public final lf0.b a(lf0.b oobEvent) {
        s.k(oobEvent, "oobEvent");
        if (!(oobEvent instanceof lf0.b.FiraSessionStart)) {
            return oobEvent;
        }
        lf0.b.FiraSessionStart firaSessionStart = (lf0.b.FiraSessionStart) oobEvent;
        List<u0> listB = firaSessionStart.getFiraRequest().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            u0 u0Var = (u0) obj;
            int sessionId = u0Var.getSessionId();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Pair<u0, Long> pair = this.lastRangingSessionSetup.get(Integer.valueOf(sessionId));
            if (pair != null) {
                u0 u0VarA = pair.a();
                if (jElapsedRealtime - pair.b().longValue() < this.rangingStartIntervalMs && u0VarA.equals(u0Var)) {
                    this.logger.n("Filtering out FiraSessionStart for sessionId " + sessionId + " due to ongoing ranging session.");
                    this.connector.g(u0Var, false);
                }
            }
            arrayList.add(obj);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String vin = firaSessionStart.getVin();
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((u0) it.next()).getSessionId()));
        }
        return new lf0.b.FiraSessionStart(vin, arrayList2, new vc0.q0(arrayList, null, 2, null));
    }

    public final void b(int sessionId) {
        this.lastRangingSessionSetup.remove(Integer.valueOf(sessionId));
    }

    public final void c(u0 firaSessionRequest, long startTime) {
        s.k(firaSessionRequest, "firaSessionRequest");
        this.lastRangingSessionSetup.put(Integer.valueOf(firaSessionRequest.getSessionId()), new Pair<>(firaSessionRequest, Long.valueOf(startTime)));
    }
}
