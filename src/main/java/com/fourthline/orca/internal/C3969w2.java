package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3969w2 implements PD, V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bo f36321a;

    public C3969w2(Bo error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f36321a = error;
    }

    public final Bo c() {
        return this.f36321a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3969w2) && p013kotlin.jvm.internal.s.f(this.f36321a, ((C3969w2) obj).f36321a);
    }

    public int hashCode() {
        return this.f36321a.hashCode();
    }

    public String toString() {
        return "FinishWithError(error=" + this.f36321a + ")";
    }
}
