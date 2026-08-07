package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3967w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36316b;

    public C3967w0(String tenantName, String destinationFolder) {
        p013kotlin.jvm.internal.s.k(tenantName, "tenantName");
        p013kotlin.jvm.internal.s.k(destinationFolder, "destinationFolder");
        this.f36315a = tenantName;
        this.f36316b = destinationFolder;
    }

    public final String a() {
        return this.f36316b;
    }

    public final String b() {
        return this.f36315a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3967w0)) {
            return false;
        }
        C3967w0 c3967w0 = (C3967w0) obj;
        return p013kotlin.jvm.internal.s.f(this.f36315a, c3967w0.f36315a) && p013kotlin.jvm.internal.s.f(this.f36316b, c3967w0.f36316b);
    }

    public int hashCode() {
        return (this.f36315a.hashCode() * 31) + this.f36316b.hashCode();
    }

    public String toString() {
        return "Input(tenantName=" + this.f36315a + ", destinationFolder=" + this.f36316b + ")";
    }
}
