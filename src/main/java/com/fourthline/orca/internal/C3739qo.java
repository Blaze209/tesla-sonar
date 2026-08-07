package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3739qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3696po f34867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3696po f34868b;

    public C3739qo(C3696po cellStyle1, C3696po cellStyle2) {
        p013kotlin.jvm.internal.s.k(cellStyle1, "cellStyle1");
        p013kotlin.jvm.internal.s.k(cellStyle2, "cellStyle2");
        this.f34867a = cellStyle1;
        this.f34868b = cellStyle2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3739qo)) {
            return false;
        }
        C3739qo c3739qo = (C3739qo) obj;
        return p013kotlin.jvm.internal.s.f(this.f34867a, c3739qo.f34867a) && p013kotlin.jvm.internal.s.f(this.f34868b, c3739qo.f34868b);
    }

    public int hashCode() {
        return (this.f34867a.hashCode() * 31) + this.f34868b.hashCode();
    }

    public String toString() {
        return "OrcaCells(cellStyle1=" + this.f34867a + ", cellStyle2=" + this.f34868b + ")";
    }
}
