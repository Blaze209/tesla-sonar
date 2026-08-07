package kd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.tesla.domain.model.DataRestrictedCountry;
import com.tesla.logging.TeslaLog;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkd0/d;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "enabled", "Ljn0/h0;", "a", "(Landroid/content/Context;Z)V", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f85939a = new d();

    private d() {
    }

    public final void a(Context context, boolean enabled) {
        s.k(context, "context");
        if (!DataRestrictedCountry.INSTANCE.c(context)) {
            hw.e.c().f(enabled);
        } else {
            TeslaLog.INSTANCE.i("Monitoring", "Data restricted country detected, not enabling monitoring");
            hw.e.c().f(false);
        }
    }
}
