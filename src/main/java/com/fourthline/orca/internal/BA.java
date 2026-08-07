package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class BA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AA f25078a;

    public BA(AA aa2) {
        this.f25078a = aa2;
    }

    public static C4106zA b(AA aa2) {
        return (C4106zA) qj0.h.d(aa2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4106zA get() {
        return b(this.f25078a);
    }

    public static BA a(AA aa2) {
        return new BA(aa2);
    }
}
