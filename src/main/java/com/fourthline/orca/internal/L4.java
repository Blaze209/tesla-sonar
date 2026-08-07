package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class L4 implements T4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26703a;

    public L4(String newInput) {
        p013kotlin.jvm.internal.s.k(newInput, "newInput");
        this.f26703a = newInput;
    }

    public final String a() {
        return this.f26703a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L4) && p013kotlin.jvm.internal.s.f(this.f26703a, ((L4) obj).f26703a);
    }

    public int hashCode() {
        return this.f26703a.hashCode();
    }

    public String toString() {
        return "OnChanged(newInput=" + this.f26703a + ")";
    }
}
