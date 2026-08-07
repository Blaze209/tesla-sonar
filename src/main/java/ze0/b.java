package ze0;

import android.content.Context;
import android.os.SystemClock;
import cf0.HeartbeatPayload;
import cf0.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import cm0.f;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import io.reactivex.rxjava3.core.h;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lze0/b;", "", "<init>", "()V", "Ljn0/h0;", "h", "", "c", "()J", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "j", "e", "timestamp", "k", "(J)V", "g", "", Action.KEY_ATTRIBUTE, "f", "(Ljava/lang/String;)J", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "vin", "l", "(Landroid/content/Context;Ljava/lang/String;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f128127a = new b();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f128128a = new a<>();

        a() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Long it) {
            s.k(it, "it");
            b bVar = b.f128127a;
            bVar.j();
            bVar.i();
        }
    }

    private b() {
    }

    private final long c() {
        return f("bleservice_first_heartbeat_system_elapsed_time");
    }

    private final long d() {
        return f("bleservice_last_heartbeat_system_elapsed_time");
    }

    private final long e() {
        return f("bleservice_last_heartbeat");
    }

    private final long f(String key) {
        String strH = m.j().h(key);
        if (strH == null || t.y0(strH)) {
            return 0L;
        }
        try {
            return Long.parseLong(strH);
        } catch (Exception unused) {
            return 0L;
        }
    }

    private final long g() {
        return f("bleservice_create_time");
    }

    private final void h() {
        m.j().u("bleservice_first_heartbeat_system_elapsed_time", String.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        m.j().u("bleservice_last_heartbeat_system_elapsed_time", String.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        m.j().u("bleservice_last_heartbeat", String.valueOf(System.currentTimeMillis()));
    }

    private final void k(long timestamp) {
        m.j().u("bleservice_create_time", String.valueOf(System.currentTimeMillis()));
    }

    public final void l(Context context, String vin) {
        s.k(context, "context");
        long jE = e();
        if (jE != 0) {
            long jG = g();
            long jC = c();
            long jD = d();
            j.Companion companion = j.INSTANCE;
            if (vin == null || t.y0(vin)) {
                vin = "";
            }
            companion.a(context, new HeartbeatPayload(vin, jG, jE, jC, jD));
        }
        k(System.currentTimeMillis());
        h();
        h.l(0L, DataPersistorKt.EXPIRATION_TIME, TimeUnit.MILLISECONDS).v(a.f128128a);
    }
}
