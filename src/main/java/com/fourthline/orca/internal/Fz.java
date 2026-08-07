package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Fz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3689ph f25884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC3689ph f25885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC3689ph f25886c;

    public Fz(EnumC3689ph mask, EnumC3689ph overlay, EnumC3689ph successOverlay) {
        p013kotlin.jvm.internal.s.k(mask, "mask");
        p013kotlin.jvm.internal.s.k(overlay, "overlay");
        p013kotlin.jvm.internal.s.k(successOverlay, "successOverlay");
        this.f25884a = mask;
        this.f25885b = overlay;
        this.f25886c = successOverlay;
    }

    public final EnumC3689ph a() {
        return this.f25884a;
    }

    public final EnumC3689ph b() {
        return this.f25885b;
    }

    public final EnumC3689ph c() {
        return this.f25886c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fz)) {
            return false;
        }
        Fz fz2 = (Fz) obj;
        return this.f25884a == fz2.f25884a && this.f25885b == fz2.f25885b && this.f25886c == fz2.f25886c;
    }

    public int hashCode() {
        return (((this.f25884a.hashCode() * 31) + this.f25885b.hashCode()) * 31) + this.f25886c.hashCode();
    }

    public String toString() {
        return "StepMaskKeys(mask=" + this.f25884a + ", overlay=" + this.f25885b + ", successOverlay=" + this.f25886c + ")";
    }
}
