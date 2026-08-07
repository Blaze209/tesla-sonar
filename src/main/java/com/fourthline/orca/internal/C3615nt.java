package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3615nt implements qj0.e {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nt$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C3615nt f33992a = new C3615nt();
    }

    public static C3615nt a() {
        return a.f33992a;
    }

    public static C3572mt c() {
        return new C3572mt();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3572mt get() {
        return c();
    }
}
