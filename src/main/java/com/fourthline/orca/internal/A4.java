package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24891a;

    public A4(boolean z11) {
        this.f24891a = z11;
    }

    public final boolean a() {
        return this.f24891a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A4) && this.f24891a == ((A4) obj).f24891a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f24891a);
    }

    public String toString() {
        return "ComposeUiFeatureConfig(backButtonOnTopEnabled=" + this.f24891a + ")";
    }
}
