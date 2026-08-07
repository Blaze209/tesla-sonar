package com.fourthline.orca.internal;

import android.os.SystemClock;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C4126zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f37313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f37314d;

    public C4126zo(int i11) {
        this.f37311a = i11;
        this.f37312b = c();
    }

    private final long c() {
        return SystemClock.uptimeMillis();
    }

    public final void a(int i11) {
        this.f37311a = i11;
    }

    public final void b() {
        this.f37313c = Long.valueOf(c());
    }

    public final Map d() {
        long jC;
        Long l11 = this.f37313c;
        if (l11 != null) {
            jC = c() - l11.longValue();
        } else {
            jC = 0;
        }
        return p013kotlin.collections.v0.m(jn0.x.a("time_in_document", Long.valueOf(c() - this.f37312b)), jn0.x.a("time_in_zoom", Float.valueOf(this.f37314d + jC)), jn0.x.a("total_pages", Integer.valueOf(this.f37311a)));
    }

    public final boolean e() {
        return this.f37313c != null;
    }

    public final jn0.h0 a() {
        Long l11 = this.f37313c;
        if (l11 == null) {
            return null;
        }
        this.f37314d += c() - l11.longValue();
        this.f37313c = null;
        return jn0.h0.f84049a;
    }

    public /* synthetic */ C4126zo(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
