package com.withpersona.sdk2.inquiry.internal.network;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements qj0.e<String> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f58188a = new g();
    }

    public static g a() {
        return a.f58188a;
    }

    public static String c() {
        return (String) qj0.h.d(f.INSTANCE.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c();
    }
}
