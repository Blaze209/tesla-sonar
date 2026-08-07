package md0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ie0.r;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.m2;
import io.sentry.b7;
import io.sentry.f5;
import io.sentry.q7;
import java.util.concurrent.atomic.AtomicBoolean;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lmd0/d;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Landroid/content/Context;)V", "", "enable", DateTokenConverter.CONVERTER_KEY, "(ZLandroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sentryEnabled", "", "c", "Ljava/lang/String;", "sentryDsn", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f91834a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean sentryEnabled = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String sentryDsn;

    static {
        sentryDsn = r.a() ? "https://70572ffa50524e1981f5ee7b57ea81a7@akamai-apigateway-sentry.tesla.cn/5" : "https://b137b6b4d8c047ba9e429ac9fb9ddf32@sentry-api.ops.na.vn.cloud.tesla.com/8";
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Context context, SentryAndroidOptions options) {
        s.k(options, "options");
        options.setDsn(sentryDsn);
        options.setDebug(false);
        options.setDiagnosticLevel(b7.INFO);
        options.setMaxBreadcrumbs(r.c() ? 50 : 1);
        options.setEnvironment("tesla");
        options.setTracesSampler(new e());
        options.setEnableAutoActivityLifecycleTracing(false);
        options.setEnableRootCheck(false);
        b.b(options, context);
    }

    public final void b(final Context context) {
        s.k(context, "context");
        if (sentryEnabled.get()) {
            m2.f(context, a.f91829a, new f5.a() { // from class: md0.c
                @Override // io.sentry.f5.a
                public final void a(q7 q7Var) {
                    d.c(context, (SentryAndroidOptions) q7Var);
                }
            });
        }
    }

    public final void d(boolean enable, Context context) {
        s.k(context, "context");
        AtomicBoolean atomicBoolean = sentryEnabled;
        if (atomicBoolean.get() == enable) {
            return;
        }
        atomicBoolean.set(enable);
        if (atomicBoolean.get()) {
            b(context);
        } else {
            f5.k();
        }
    }
}
