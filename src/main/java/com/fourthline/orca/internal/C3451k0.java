package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3451k0 implements InterfaceC3408j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3281g0 f32863c;

    public C3451k0(long j11, boolean z11, InterfaceC3281g0 popupStrategy) {
        p013kotlin.jvm.internal.s.k(popupStrategy, "popupStrategy");
        this.f32861a = j11;
        this.f32862b = z11;
        this.f32863c = popupStrategy;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3408j0
    public boolean c() {
        return this.f32862b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3408j0
    public InterfaceC3281g0 d() {
        return this.f32863c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3408j0
    public long e() {
        return this.f32861a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3451k0)) {
            return false;
        }
        C3451k0 c3451k0 = (C3451k0) obj;
        return this.f32861a == c3451k0.f32861a && this.f32862b == c3451k0.f32862b && p013kotlin.jvm.internal.s.f(this.f32863c, c3451k0.f32863c);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f32861a) * 31) + Boolean.hashCode(this.f32862b)) * 31) + this.f32863c.hashCode();
    }

    public String toString() {
        return "AnalysisStepRepositoryBundle(imageUploadTimeoutMs=" + this.f32861a + ", isDynamicStepsEnabled=" + this.f32862b + ", popupStrategy=" + this.f32863c + ")";
    }
}
