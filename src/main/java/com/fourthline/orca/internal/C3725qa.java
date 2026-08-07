package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3725qa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C3725qa f34787c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34788a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qa$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3725qa a() {
            return C3725qa.f34787c;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f34786b = new a(defaultConstructorMarker);
        f34787c = new C3725qa(0L, 1, defaultConstructorMarker);
    }

    public C3725qa(long j11) {
        this.f34788a = j11;
    }

    public final long b() {
        return this.f34788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3725qa) && this.f34788a == ((C3725qa) obj).f34788a;
    }

    public int hashCode() {
        return Long.hashCode(this.f34788a);
    }

    public String toString() {
        return "DocumentReadyPopupConfig(appearanceDelay=" + this.f34788a + ")";
    }

    public /* synthetic */ C3725qa(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1500L : j11);
    }
}
