package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Ch implements qj0.e {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Ch f25225a = new Ch();
    }

    public static Ch a() {
        return a.f25225a;
    }

    public static Bh c() {
        return new Bh();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bh get() {
        return c();
    }
}
