package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3842t5 f25479c;

    public Dl(int i11, Map headers, C3842t5 body) {
        p013kotlin.jvm.internal.s.k(headers, "headers");
        p013kotlin.jvm.internal.s.k(body, "body");
        this.f25477a = i11;
        this.f25478b = headers;
        this.f25479c = body;
    }

    public final C3842t5 a() {
        return this.f25479c;
    }

    public final Map b() {
        return this.f25478b;
    }

    public final int c() {
        return this.f25477a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dl)) {
            return false;
        }
        Dl dl2 = (Dl) obj;
        return this.f25477a == dl2.f25477a && p013kotlin.jvm.internal.s.f(this.f25478b, dl2.f25478b) && p013kotlin.jvm.internal.s.f(this.f25479c, dl2.f25479c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f25477a) * 31) + this.f25478b.hashCode()) * 31) + this.f25479c.hashCode();
    }

    public String toString() {
        return "NetworkResponse(statusCode=" + this.f25477a + ", headers=" + this.f25478b + ", body=" + this.f25479c + ")";
    }
}
