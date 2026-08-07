package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3239f1 implements InterfaceC3154d1, V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bo f31587a;

    public C3239f1(Bo error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f31587a = error;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3239f1) && p013kotlin.jvm.internal.s.f(this.f31587a, ((C3239f1) obj).f31587a);
    }

    public int hashCode() {
        return this.f31587a.hashCode();
    }

    public String toString() {
        return "FinishWithError(error=" + this.f31587a + ")";
    }
}
