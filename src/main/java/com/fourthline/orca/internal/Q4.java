package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Q4 implements T4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27420a;

    public Q4(String newInput) {
        p013kotlin.jvm.internal.s.k(newInput, "newInput");
        this.f27420a = newInput;
    }

    public final String a() {
        return this.f27420a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q4) && p013kotlin.jvm.internal.s.f(this.f27420a, ((Q4) obj).f27420a);
    }

    public int hashCode() {
        return this.f27420a.hashCode();
    }

    public String toString() {
        return "OnChanged(newInput=" + this.f27420a + ")";
    }
}
