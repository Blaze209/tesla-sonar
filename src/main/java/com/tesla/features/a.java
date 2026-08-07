package com.tesla.features;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import cm0.f;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/tesla/features/a;", "", "<init>", "()V", "Lcom/tesla/features/FeaturesConfig;", "a", "()Lcom/tesla/features/FeaturesConfig;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Landroid/content/Context;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "c", "Lcom/tesla/features/FeaturesConfig;", "config", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56261a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("Features");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static FeaturesConfig config;

    /* JADX INFO: renamed from: com.tesla.features.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class C1127a<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f56264a;

        C1127a(Context context) {
            this.f56264a = context;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean loggedIn) {
            s.k(loggedIn, "loggedIn");
            if (loggedIn.booleanValue()) {
                TeslaLog.INSTANCE.i("Features", "User is logged in, scheduling/updating features config");
                RefreshFeaturesConfigWorker.INSTANCE.a(this.f56264a);
            }
        }
    }

    private a() {
    }

    public static final FeaturesConfig a() {
        FeaturesConfig featuresConfigB;
        FeaturesConfig featuresConfig = config;
        if (featuresConfig != null) {
            return featuresConfig;
        }
        synchronized (f56261a) {
            try {
                featuresConfigB = config;
                if (featuresConfigB == null) {
                    b.Companion companion = b.INSTANCE;
                    m mVarJ = m.j();
                    s.j(mVarJ, "getDB(...)");
                    featuresConfigB = companion.a(mVarJ).b();
                    logger.j("latching active features config to '" + featuresConfigB + "'");
                    config = featuresConfigB;
                } else {
                    s.h(featuresConfigB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return featuresConfigB;
    }

    @SuppressLint({"CheckResult"})
    public final void b(Context context) {
        s.k(context, "context");
        be0.f.f17060a.h().j().N(new C1127a(context));
    }
}
