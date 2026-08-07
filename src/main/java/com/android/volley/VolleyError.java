package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public class VolleyError extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20156b;

    public VolleyError() {
        this.f20155a = null;
    }

    void a(long j11) {
        this.f20156b = j11;
    }

    public VolleyError(h hVar) {
        this.f20155a = hVar;
    }

    public VolleyError(Throwable th2) {
        super(th2);
        this.f20155a = null;
    }
}
