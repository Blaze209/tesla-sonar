package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2916Oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k3.i3 f27164a;

    public C2916Oe(k3.i3 imageBitmap) {
        p013kotlin.jvm.internal.s.k(imageBitmap, "imageBitmap");
        this.f27164a = imageBitmap;
    }

    public final k3.i3 a() {
        return this.f27164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2916Oe) && p013kotlin.jvm.internal.s.f(this.f27164a, ((C2916Oe) obj).f27164a);
    }

    public int hashCode() {
        return this.f27164a.hashCode();
    }

    public String toString() {
        return "EnlargedState(imageBitmap=" + this.f27164a + ")";
    }
}
