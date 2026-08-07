package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public class k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f20211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.volley.a.C0410a f20212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VolleyError f20213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20214d;

    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    public interface b<T> {
        void onResponse(T t11);
    }

    private k(T t11, com.android.volley.a.C0410a c0410a) {
        this.f20214d = false;
        this.f20211a = t11;
        this.f20212b = c0410a;
        this.f20213c = null;
    }

    public static <T> k<T> a(VolleyError volleyError) {
        return new k<>(volleyError);
    }

    public static <T> k<T> c(T t11, com.android.volley.a.C0410a c0410a) {
        return new k<>(t11, c0410a);
    }

    public boolean b() {
        return this.f20213c == null;
    }

    private k(VolleyError volleyError) {
        this.f20214d = false;
        this.f20211a = null;
        this.f20212b = null;
        this.f20213c = volleyError;
    }
}
