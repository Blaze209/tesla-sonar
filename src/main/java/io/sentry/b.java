package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f80273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f80274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable<byte[]> f80275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f80277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f80278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f80279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f80280h;

    public b(byte[] bArr, String str, String str2, boolean z11) {
        this(bArr, str, str2, "event.attachment", z11);
    }

    public static b a(Callable<byte[]> callable, String str, String str2, boolean z11) {
        return new b(callable, str, str2, "event.attachment", z11);
    }

    public static b b(byte[] bArr) {
        return new b(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static b c(io.sentry.protocol.j0 j0Var) {
        return new b((a2) j0Var, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String d() {
        return this.f80280h;
    }

    public Callable<byte[]> e() {
        return this.f80275c;
    }

    public byte[] f() {
        return this.f80273a;
    }

    public String g() {
        return this.f80278f;
    }

    public String h() {
        return this.f80277e;
    }

    public String i() {
        return this.f80276d;
    }

    public a2 j() {
        return this.f80274b;
    }

    boolean k() {
        return this.f80279g;
    }

    public b(byte[] bArr, String str, String str2, String str3, boolean z11) {
        this.f80273a = bArr;
        this.f80274b = null;
        this.f80275c = null;
        this.f80277e = str;
        this.f80278f = str2;
        this.f80280h = str3;
        this.f80279g = z11;
    }

    public b(a2 a2Var, String str, String str2, String str3, boolean z11) {
        this.f80273a = null;
        this.f80274b = a2Var;
        this.f80275c = null;
        this.f80277e = str;
        this.f80278f = str2;
        this.f80280h = str3;
        this.f80279g = z11;
    }

    public b(Callable<byte[]> callable, String str, String str2, String str3, boolean z11) {
        this.f80273a = null;
        this.f80274b = null;
        this.f80275c = callable;
        this.f80277e = str;
        this.f80278f = str2;
        this.f80280h = str3;
        this.f80279g = z11;
    }
}
