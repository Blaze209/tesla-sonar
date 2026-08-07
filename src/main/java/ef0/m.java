package ef0;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ie0.b0;
import ie0.c0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lef0/m;", "", "<init>", "()V", "", "vin", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Landroid/content/Context;)Z", "e", "(Landroid/content/Context;)Z", "Ljn0/h0;", "b", "Lye0/n;", "sender", "c", "(Lye0/n;Landroid/content/Context;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "observerMap", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "a", "()Lcom/tesla/logging/g;", "setLogger", "(Lcom/tesla/logging/g;)V", "logger", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f62910a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static ConcurrentHashMap<String, String> observerMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("UwbUpgradeHelper");

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ef0/m$a", "Lie0/b0;", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ye0.n f62913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f62914b;

        a(ye0.n nVar, Context context) {
            this.f62913a = nVar;
            this.f62914b = context;
        }

        @Override // ie0.b0
        public void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            if (s.f(value, "true")) {
                m.f62910a.a().j("sendDeviceInfoResponse uwb upgrade for " + this.f62913a.getVin());
                ye0.n.l(this.f62913a, this.f62914b, 0, null, null, false, 30, null);
            }
        }

        @Override // ie0.b0
        public void b(String str) {
            b0.a.a(this, str);
        }
    }

    private m() {
    }

    public static final void b() {
        td0.m.j().u("HAS_NOTIFIED", "1");
    }

    public static final void c(ye0.n sender, Context context) {
        s.k(sender, "sender");
        s.k(context, "context");
        if (!f62910a.e(context)) {
            ConcurrentHashMap<String, String> concurrentHashMap = observerMap;
            if (concurrentHashMap.size() <= 0) {
                concurrentHashMap = null;
            }
            if (concurrentHashMap != null) {
                Iterator<Map.Entry<String, String>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    td0.m.j().v(it.next().getValue());
                }
                return;
            }
            return;
        }
        String strQ = td0.m.j().q("HAS_UPGRADED_UWB", new a(sender, context));
        s.j(strQ, "observe(...)");
        if (observerMap.containsKey(sender.getVin())) {
            return;
        }
        observerMap.put(sender.getVin(), strQ);
        logger.j("observer for " + sender.getVin() + " set up for key HAS_UPGRADED_UWB with observeId: " + strQ);
    }

    public static final boolean d(String vin, Context context) {
        s.k(vin, "vin");
        s.k(context, "context");
        return jf0.d.e(context) && jf0.d.k(vin, false, 2, null) && !s.f(td0.m.j().h("HAS_NOTIFIED"), "1") && f62910a.e(context);
    }

    private final boolean e(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        return c0.b(context) && !c0.d(context);
    }

    public final com.tesla.logging.g a() {
        return logger;
    }
}
