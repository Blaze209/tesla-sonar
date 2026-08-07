package io.sentry.internal.gestures;

import io.sentry.util.y;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference<Object> f80666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f80667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f80668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f80669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f80670e;

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f80666a = new WeakReference<>(obj);
        this.f80667b = str;
        this.f80668c = str2;
        this.f80669d = str3;
        this.f80670e = str4;
    }

    public String a() {
        return this.f80667b;
    }

    public String b() {
        String str = this.f80668c;
        return str != null ? str : (String) y.c(this.f80669d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f80670e;
    }

    public String d() {
        return this.f80668c;
    }

    public String e() {
        return this.f80669d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (y.a(this.f80667b, bVar.f80667b) && y.a(this.f80668c, bVar.f80668c) && y.a(this.f80669d, bVar.f80669d)) {
                return true;
            }
        }
        return false;
    }

    public Object f() {
        return this.f80666a.get();
    }

    public int hashCode() {
        return y.b(this.f80666a, this.f80668c, this.f80669d);
    }
}
