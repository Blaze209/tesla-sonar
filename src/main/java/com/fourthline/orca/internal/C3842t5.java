package com.fourthline.orca.internal;

import java.util.Arrays;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3842t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35548b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35549c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3842t5 f35550d = new C3842t5(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f35551a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t5$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3842t5 a() {
            return C3842t5.f35550d;
        }

        private a() {
        }
    }

    public C3842t5(byte[] content) {
        p013kotlin.jvm.internal.s.k(content, "content");
        this.f35551a = content;
    }

    public final byte[] b() {
        return this.f35551a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(C3842t5.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type com.fourthline.networking.internal.ContentBody");
        return Arrays.equals(this.f35551a, ((C3842t5) obj).f35551a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f35551a);
    }

    public String toString() {
        return new String(this.f35551a, p013kotlin.text.d.UTF_8);
    }
}
