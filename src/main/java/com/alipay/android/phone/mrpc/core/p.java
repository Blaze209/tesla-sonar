package com.alipay.android.phone.mrpc.core;

/* JADX INFO: loaded from: classes3.dex */
public class p extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f20026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f20027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HttpUrlHeader f20028h;

    public p(HttpUrlHeader httpUrlHeader, int i11, String str, byte[] bArr) {
        this.f20028h = httpUrlHeader;
        this.f20023c = i11;
        this.f20024d = str;
        this.f20049a = bArr;
    }

    public HttpUrlHeader a() {
        return this.f20028h;
    }

    public void b(long j11) {
        this.f20026f = j11;
    }

    public void a(long j11) {
        this.f20025e = j11;
    }

    public void a(String str) {
        this.f20027g = str;
    }
}
