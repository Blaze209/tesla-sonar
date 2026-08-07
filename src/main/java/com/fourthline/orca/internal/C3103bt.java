package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3103bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3103bt f30707a = new C3103bt();

    private C3103bt() {
    }

    public static /* synthetic */ void a(C3103bt c3103bt, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = p013kotlin.collections.v0.i();
        }
        c3103bt.a(str, map);
    }

    public static /* synthetic */ void b(C3103bt c3103bt, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = p013kotlin.collections.v0.i();
        }
        c3103bt.b(str, map);
    }

    public static /* synthetic */ void c(C3103bt c3103bt, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = p013kotlin.collections.v0.i();
        }
        c3103bt.c(str, map);
    }

    public final void a(String screen, Map attributes) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        a(this, "orca_screen_backward", null, p013kotlin.collections.v0.s(attributes, jn0.x.a(AnalyticsContext.Screen, screen)), 2, null);
    }

    public final void b(String screen, Map attributes) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        a(this, "orca_screen_forward", null, p013kotlin.collections.v0.s(attributes, jn0.x.a(AnalyticsContext.Screen, screen)), 2, null);
    }

    public final void c(String screen, Map attributes) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        a(this, "orca_screen_start", null, p013kotlin.collections.v0.s(attributes, jn0.x.a(AnalyticsContext.Screen, screen)), 2, null);
    }

    public static /* synthetic */ void a(C3103bt c3103bt, String str, Throwable th2, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            map = p013kotlin.collections.v0.i();
        }
        c3103bt.b(str, th2, map);
    }

    public final void b(String message, Throwable th2, Map attributes) {
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        FourthlineAnalytics.INSTANCE.i(message, th2, a(attributes));
    }

    public final void a(String message, Throwable th2, Map attributes) {
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        FourthlineAnalytics.INSTANCE.e(message, th2, a(attributes));
    }

    private final Map a(Map map) {
        if (p013kotlin.jvm.internal.s.f(map.get("isPublic"), Boolean.FALSE)) {
            return map;
        }
        Map mapD = p013kotlin.collections.v0.D(map);
        mapD.put("isPublic", Boolean.TRUE);
        return mapD;
    }
}
