package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3445jv implements qj0.e {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jv$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C3445jv f32845a = new C3445jv();
    }

    public static C3445jv a() {
        return a.f32845a;
    }

    public static C3402iv c() {
        return new C3402iv();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3402iv get() {
        return c();
    }
}
