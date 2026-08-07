package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class FE implements PD, BE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bo f25799a;

    public FE(Bo error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f25799a = error;
    }

    public final Bo c() {
        return this.f25799a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FE) && p013kotlin.jvm.internal.s.f(this.f25799a, ((FE) obj).f25799a);
    }

    public int hashCode() {
        return this.f25799a.hashCode();
    }

    public String toString() {
        return "FinishWithError(error=" + this.f25799a + ")";
    }
}
