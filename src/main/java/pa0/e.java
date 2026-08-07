package pa0;

import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.ProcessLifecycleOwner;
import androidx.p003lifecycle.k0;
import androidx.p003lifecycle.w;
import cc0.f;
import cc0.h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001e\u0010\u0004R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100¨\u00062"}, d2 = {"Lpa0/e;", "Lpa0/d;", "Landroidx/lifecycle/w;", "<init>", "()V", "Lcc0/d;", "eventName", "", "Lcc0/f;", "parameters", "", "e", "(Lcc0/d;Ljava/util/List;)Z", "Ljn0/h0;", "h", "g", DateTokenConverter.CONVERTER_KEY, "Lpa0/a;", "destination", "c", "(Lpa0/a;)V", "Lcc0/c;", "event", "f", "(Lcc0/c;)V", "a", "(Lcc0/d;)V", "b", "(Lcc0/d;Ljava/util/List;)V", "onResumed", "onAppBackgrounded", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "events", "", "oemEvents", "destinations", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "", "Ljava/lang/Long;", "enteredBackgroundAt", "Ljava/util/UUID;", "Ljava/util/UUID;", "sessionId", "", "", "Ljava/util/Set;", "sampleCommandSet", "analytics_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements d, w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final g f102049i = g.INSTANCE.a("TeslaAnalyticsService");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedDeque<cc0.c> events = new ConcurrentLinkedDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedDeque<Object> oemEvents = new ConcurrentLinkedDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedDeque<a> destinations = new ConcurrentLinkedDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Long enteredBackgroundAt;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private UUID sessionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Set<String> sampleCommandSet;

    public e() {
        UUID uuidRandomUUID = UUID.randomUUID();
        s.j(uuidRandomUUID, "randomUUID(...)");
        this.sessionId = uuidRandomUUID;
        this.sampleCommandSet = d1.i("authentication_response", "get_status_information_request", "get_ephemeral_public_key_information_request");
    }

    private final boolean e(cc0.d eventName, List<f> parameters) {
        Object next;
        if (eventName != cc0.d.SEND_COMMAND && eventName != cc0.d.SEND_COMMAND_ATTEMPT) {
            return true;
        }
        Iterator<T> it = parameters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f) next).getKey() != cc0.g.COMMAND);
        f fVar = (f) next;
        if (fVar != null) {
            Set<String> set = this.sampleCommandSet;
            h hVar = fVar.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField.TYPE java.lang.String();
            if (v.g0(set, hVar != null ? hVar.getValue() : null) && zn0.c.INSTANCE.d(100) >= 1) {
                return false;
            }
        }
        return true;
    }

    private final void g() {
        Long l11 = this.enteredBackgroundAt;
        if (l11 != null) {
            if (System.currentTimeMillis() - l11.longValue() > 10000) {
                f102049i.j("We've been in the background for longer than 10 seconds, rotating session id.");
                this.sessionId = UUID.randomUUID();
                h();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h() {
        cc0.g gVar = cc0.g.FOREGROUND_SESSION_ID;
        String string = this.sessionId.toString();
        s.j(string, "toString(...)");
        f fVar = new f(gVar, null, null, null, new h(string, null, 2, 0 == true ? 1 : 0), null, 46, null);
        f102049i.j("Setting default event parameter " + fVar);
        Iterator<T> it = this.destinations.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(v.e(fVar));
        }
    }

    @Override // pa0.d
    public void a(cc0.d eventName) {
        s.k(eventName, "eventName");
        f(new cc0.c(eventName, null, null, 6, null));
    }

    @Override // pa0.d
    public void b(cc0.d eventName, List<f> parameters) {
        s.k(eventName, "eventName");
        s.k(parameters, "parameters");
        if (e(eventName, parameters)) {
            f(new cc0.c(eventName, parameters, null, 4, null));
            return;
        }
        f102049i.m("Skip record for event " + eventName.name() + " value " + parameters);
    }

    @Override // pa0.d
    public void c(a destination) {
        s.k(destination, "destination");
        if (!this.initialized.get()) {
            this.destinations.add(destination);
            h();
            return;
        }
        g gVar = f102049i;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("Destination cannot be added because service is initialized");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    @Override // pa0.d
    public void d() {
        if (this.initialized.getAndSet(true)) {
            return;
        }
        ProcessLifecycleOwner.l().getLifecycle().a(this);
        f102049i.j("currentState: " + ProcessLifecycleOwner.l().getLifecycle().getState());
        ConcurrentLinkedDeque<cc0.c> concurrentLinkedDeque = this.events;
        for (cc0.c cVar : concurrentLinkedDeque) {
            s.h(cVar);
            f(cVar);
        }
        concurrentLinkedDeque.clear();
    }

    public void f(cc0.c event) {
        s.k(event, "event");
        synchronized (this) {
            try {
                try {
                    if (this.initialized.get()) {
                        Iterator<T> it = this.destinations.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).a(event);
                        }
                        h0 h0Var = h0.f84049a;
                    } else {
                        this.events.add(event);
                    }
                } catch (Exception e11) {
                    f102049i.d("Error recording analytics event", e11);
                    h0 h0Var2 = h0.f84049a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @k0(Lifecycle.a.ON_PAUSE)
    public final void onAppBackgrounded() {
        f102049i.j("ON_PAUSE");
        synchronized (this) {
            this.enteredBackgroundAt = Long.valueOf(System.currentTimeMillis());
            h0 h0Var = h0.f84049a;
        }
    }

    @k0(Lifecycle.a.ON_RESUME)
    public final void onResumed() {
        f102049i.j("ON_RESUME");
        synchronized (this) {
            g();
            this.enteredBackgroundAt = null;
            h0 h0Var = h0.f84049a;
        }
    }
}
