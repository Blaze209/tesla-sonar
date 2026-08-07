package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class V<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46756a;

    public static final class a extends V<S6> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f46757b = new a();

        public a() {
            super(p013kotlin.jvm.internal.o0.b(S6.class));
        }
    }

    public V(co0.d dVar) {
        String simpleName = vn0.a.b(dVar).getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        this.f46756a = simpleName;
    }
}
