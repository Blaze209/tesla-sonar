package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorElement f25843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextElement f25844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ProgressElement f25845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorElement f25846d;

    public Fn(ColorElement background, TextElement instructionText, ProgressElement progress, ColorElement closeButton) {
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(instructionText, "instructionText");
        p013kotlin.jvm.internal.s.k(progress, "progress");
        p013kotlin.jvm.internal.s.k(closeButton, "closeButton");
        this.f25843a = background;
        this.f25844b = instructionText;
        this.f25845c = progress;
        this.f25846d = closeButton;
    }

    public final ColorElement a() {
        return this.f25843a;
    }

    public final ColorElement b() {
        return this.f25846d;
    }

    public final ProgressElement c() {
        return this.f25845c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fn)) {
            return false;
        }
        Fn fn2 = (Fn) obj;
        return p013kotlin.jvm.internal.s.f(this.f25843a, fn2.f25843a) && p013kotlin.jvm.internal.s.f(this.f25844b, fn2.f25844b) && p013kotlin.jvm.internal.s.f(this.f25845c, fn2.f25845c) && p013kotlin.jvm.internal.s.f(this.f25846d, fn2.f25846d);
    }

    public int hashCode() {
        return (((((this.f25843a.hashCode() * 31) + this.f25844b.hashCode()) * 31) + this.f25845c.hashCode()) * 31) + this.f25846d.hashCode();
    }

    public String toString() {
        return "NfcScannerElement(background=" + this.f25843a + ", instructionText=" + this.f25844b + ", progress=" + this.f25845c + ", closeButton=" + this.f25846d + ")";
    }
}
