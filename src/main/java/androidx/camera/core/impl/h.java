package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class h extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3186a;

    h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f3186a = obj;
    }

    @Override // androidx.camera.core.impl.n1
    @NonNull
    public Object b() {
        return this.f3186a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            return this.f3186a.equals(((n1) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f3186a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f3186a + "}";
    }
}
