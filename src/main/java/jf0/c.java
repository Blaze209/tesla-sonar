package jf0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ie0.e0;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import v5.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ljf0/c;", "", "a", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f83668b;

    /* JADX INFO: renamed from: jf0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljf0/c$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lv5/l;", "a", "(Landroid/content/Context;)Lv5/l;", "uwbManager", "Lv5/l;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(Context context) {
            s.k(context, "context");
            if (!e0.e(context)) {
                throw new RuntimeException("UwbProvider should run in BLE process");
            }
            if (c.f83668b == null) {
                synchronized (this) {
                    try {
                        if (c.f83668b == null) {
                            c.f83668b = l.INSTANCE.a(context);
                        }
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            l lVar = c.f83668b;
            s.h(lVar);
            return lVar;
        }

        private Companion() {
        }
    }
}
