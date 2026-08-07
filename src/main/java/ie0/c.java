package ie0;

import android.content.Context;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u0003R\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lie0/c;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "f", "(Landroid/content/Context;)V", "g", "Lio/reactivex/rxjava3/core/o;", DateTokenConverter.CONVERTER_KEY, "()Lio/reactivex/rxjava3/core/o;", "b", "Lie0/d;", "Lkotlin/Lazy;", "c", "()Lie0/d;", "receiver", "Lwm0/e;", "Lwm0/e;", "changeEvent", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f77575a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy receiver = jn0.m.b(new wn0.a() { // from class: ie0.b
        @Override // wn0.a
        public final Object invoke() {
            return c.e();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<jn0.h0> changeEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger;

    static {
        wm0.e eVarB0 = wm0.a.d0().b0();
        p013kotlin.jvm.internal.s.j(eVarB0, "toSerialized(...)");
        changeEvent = eVarB0;
        logger = com.tesla.logging.g.INSTANCE.a("AirplaneModeHelper");
    }

    private c() {
    }

    private final d c() {
        return (d) receiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d e() {
        return new d();
    }

    public final void b() {
        changeEvent.onNext(jn0.h0.f84049a);
    }

    public final io.reactivex.rxjava3.core.o<jn0.h0> d() {
        io.reactivex.rxjava3.core.o<jn0.h0> oVarY = changeEvent.y();
        p013kotlin.jvm.internal.s.j(oVarY, "hide(...)");
        return oVarY;
    }

    public final void f(Context context) {
        if (context != null) {
            try {
                d dVarC = c();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
                jn0.h0 h0Var = jn0.h0.f84049a;
                context.registerReceiver(dVarC, intentFilter);
            } catch (Exception e11) {
                logger.j("error register receiver " + e11.getMessage());
            }
        }
    }

    public final void g(Context context) {
        if (context != null) {
            try {
                context.unregisterReceiver(c());
            } catch (Exception e11) {
                logger.j("error unregister receiver " + e11.getMessage());
            }
        }
    }
}
