package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3637oE implements Of, Of.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rf f34123a;

    public C3637oE(Rf rf2) {
        this.f34123a = rf2;
    }

    @Override // com.fourthline.orca.internal.Of.b
    public Rf a() {
        return this.f34123a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3637oE) && p013kotlin.jvm.internal.s.f(this.f34123a, ((C3637oE) obj).f34123a);
    }

    public int hashCode() {
        Rf rf2 = this.f34123a;
        if (rf2 == null) {
            return 0;
        }
        return rf2.hashCode();
    }

    public String toString() {
        return "FinishFlow(nextFlow=" + this.f34123a + ")";
    }

    @Override // com.fourthline.orca.internal.Of.b
    public void a(Rf rf2) {
        this.f34123a = rf2;
    }
}
