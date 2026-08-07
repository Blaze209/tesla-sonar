package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class JC implements Of, Of.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rf f26451a;

    public JC(Rf rf2) {
        this.f26451a = rf2;
    }

    @Override // com.fourthline.orca.internal.Of.b
    public Rf a() {
        return this.f26451a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JC) && p013kotlin.jvm.internal.s.f(this.f26451a, ((JC) obj).f26451a);
    }

    public int hashCode() {
        Rf rf2 = this.f26451a;
        if (rf2 == null) {
            return 0;
        }
        return rf2.hashCode();
    }

    public String toString() {
        return "FinishFlow(nextFlow=" + this.f26451a + ")";
    }

    @Override // com.fourthline.orca.internal.Of.b
    public void a(Rf rf2) {
        this.f26451a = rf2;
    }
}
