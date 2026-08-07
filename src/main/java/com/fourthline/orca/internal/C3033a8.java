package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3033a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f30316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30317b;

    public C3033a8(QA label, boolean z11) {
        p013kotlin.jvm.internal.s.k(label, "label");
        this.f30316a = label;
        this.f30317b = z11;
    }

    public final C3033a8 a(QA label, boolean z11) {
        p013kotlin.jvm.internal.s.k(label, "label");
        return new C3033a8(label, z11);
    }

    public final boolean b() {
        return this.f30317b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3033a8)) {
            return false;
        }
        C3033a8 c3033a8 = (C3033a8) obj;
        return p013kotlin.jvm.internal.s.f(this.f30316a, c3033a8.f30316a) && this.f30317b == c3033a8.f30317b;
    }

    public int hashCode() {
        return (this.f30316a.hashCode() * 31) + Boolean.hashCode(this.f30317b);
    }

    public String toString() {
        return "CheckboxState(label=" + this.f30316a + ", isSelected=" + this.f30317b + ")";
    }

    public static /* synthetic */ C3033a8 a(C3033a8 c3033a8, QA qa2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3033a8.f30316a;
        }
        if ((i11 & 2) != 0) {
            z11 = c3033a8.f30317b;
        }
        return c3033a8.a(qa2, z11);
    }

    public final QA a() {
        return this.f30316a;
    }
}
