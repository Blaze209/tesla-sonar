package com.fourthline.orca.internal;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3226ep implements InterfaceC3107bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f31493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3149cx f31495c;

    public C3226ep(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f31493a = tracker;
        this.f31494b = new LinkedHashMap();
    }

    private final long e(String str) {
        Long l11 = (Long) this.f31494b.get(str);
        if (l11 == null) {
            return -1L;
        }
        return b() - l11.longValue();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void a(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f31493a.a(new C3056ap(name, e(name)));
        C3149cx c3149cx = this.f31495c;
        if (c3149cx != null) {
            this.f31493a.a(c3149cx.getIdentifier());
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void b(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f31493a.a(new C3141cp(name, e(name)));
        C3149cx c3149cx = this.f31495c;
        if (c3149cx != null) {
            this.f31493a.a(c3149cx.getIdentifier());
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void c(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f31493a.a(new C3099bp(name, e(name)));
        C3149cx c3149cx = this.f31495c;
        if (c3149cx != null) {
            this.f31493a.a(c3149cx.getIdentifier());
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void d(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f31494b.put(name, Long.valueOf(b()));
        C3149cx c3149cx = new C3149cx(name);
        this.f31493a.a(c3149cx);
        this.f31495c = c3149cx;
        this.f31493a.a(new C3183dp(name));
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }
}
