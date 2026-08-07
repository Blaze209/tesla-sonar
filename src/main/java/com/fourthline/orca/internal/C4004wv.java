package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4004wv implements qj0.e {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wv$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C4004wv f36606a = new C4004wv();
    }

    public static C4004wv a() {
        return a.f36606a;
    }

    public static C3961vv c() {
        return new C3961vv();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3961vv get() {
        return c();
    }
}
