package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Iv implements qj0.e {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iv f26389a = new Iv();
    }

    public static Iv a() {
        return a.f26389a;
    }

    public static Hv c() {
        return new Hv();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Hv get() {
        return c();
    }
}
