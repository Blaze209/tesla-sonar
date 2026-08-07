package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4131zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37363a;

    public C4131zt(String filePath) {
        p013kotlin.jvm.internal.s.k(filePath, "filePath");
        this.f37363a = filePath;
    }

    public final String a() {
        return this.f37363a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4131zt) && p013kotlin.jvm.internal.s.f(this.f37363a, ((C4131zt) obj).f37363a);
    }

    public int hashCode() {
        return this.f37363a.hashCode();
    }

    public String toString() {
        return "Output(filePath=" + this.f37363a + ")";
    }
}
