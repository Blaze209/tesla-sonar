package le0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001d0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lle0/a;", "", "<init>", "()V", "Ljn0/h0;", "e", "", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lud0/a;", "remoteLog", "f", "(Lud0/a;)V", "b", "vin", "c", "(Ljava/lang/String;)V", "txid", "Lle0/b;", AnalyticsAttribute.Reason, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lle0/b;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "sessionLogged", "", "sentTxids", "", "firstWakeTimes", "firstWakeReasons", "g", "Lud0/a;", "wake_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f89960a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("WakeFreshDataTelemetryManager");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Boolean> sessionLogged = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, List<String>> sentTxids = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Long> firstWakeTimes = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, b> firstWakeReasons = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static ud0.a remoteLog;

    private a() {
    }

    private final String a(String str) {
        return "REDACTED";
    }

    private final void e() {
        for (Map.Entry<String, List<String>> entry : sentTxids.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            ConcurrentHashMap<String, Boolean> concurrentHashMap = sessionLogged;
            if (!concurrentHashMap.contains(key)) {
                String strY0 = v.y0(value, null, null, null, 0, null, null, 63, null);
                b bVar = firstWakeReasons.get(key);
                if (bVar == null) {
                    bVar = b.UNKNOWN;
                }
                concurrentHashMap.put(key, Boolean.TRUE);
                g gVar = logger;
                a aVar = f89960a;
                gVar.j("recording wakes for incomplete wake to fresh bookend. " + aVar.a(key) + " wakes: " + aVar.a(strY0));
                if (remoteLog == null) {
                    s.B("remoteLog");
                }
                ud0.a.b(v0.m(x.a("type", "mobile-app-wake-telemetry"), x.a("wake_txids", strY0), x.a("wake_reason", bVar.getValue()), x.a("complete", Boolean.FALSE)), false, null, 4, null);
            }
        }
    }

    public final void b() {
        e();
        sessionLogged.clear();
        sentTxids.clear();
        firstWakeTimes.clear();
        firstWakeReasons.clear();
        logger.j("application foregrounded, all state reset.");
    }

    public final void c(String vin) {
        String strY0;
        s.k(vin, "vin");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = sessionLogged;
        Boolean bool = concurrentHashMap.get(vin);
        Boolean bool2 = Boolean.TRUE;
        if (s.f(bool, bool2)) {
            return;
        }
        List<String> list = sentTxids.get(vin);
        if (list == null || (strY0 = v.y0(list, null, null, null, 0, null, null, 63, null)) == null) {
            strY0 = "";
        }
        g gVar = logger;
        gVar.j("fresh vehicle data received! " + a(vin) + ". wakes: " + (strY0.length() == 0 ? "NONE" : a(strY0)));
        concurrentHashMap.put(vin, bool2);
        Long l11 = firstWakeTimes.get(vin);
        if (l11 == null) {
            gVar.j(a(vin) + " can't compute wake duration (no wakes recorded before vehicle came ONLINE)");
            return;
        }
        b bVar = firstWakeReasons.get(vin);
        if (bVar == null) {
            bVar = b.UNKNOWN;
        }
        if (remoteLog == null) {
            s.B("remoteLog");
        }
        ud0.a.b(v0.m(x.a("type", "mobile-app-wake-telemetry"), x.a("wake_txids", strY0), x.a("wake_reason", bVar.getValue()), x.a("duration", Long.valueOf(System.currentTimeMillis() - l11.longValue())), x.a("complete", bool2)), false, null, 4, null);
    }

    public final void d(String vin, String txid, b reason) {
        s.k(vin, "vin");
        s.k(txid, "txid");
        s.k(reason, "reason");
        logger.j("wake sent! " + a(vin) + " - " + txid + " - " + reason.getValue());
        ConcurrentHashMap<String, List<String>> concurrentHashMap = sentTxids;
        if (concurrentHashMap.get(vin) == null) {
            concurrentHashMap.put(vin, new ArrayList());
            firstWakeTimes.put(vin, Long.valueOf(System.currentTimeMillis()));
            firstWakeReasons.put(vin, reason);
        }
        List<String> list = concurrentHashMap.get(vin);
        if (list != null) {
            list.add(txid);
        }
    }

    public final void f(ud0.a remoteLog2) {
        s.k(remoteLog2, "remoteLog");
        remoteLog = remoteLog2;
    }
}
