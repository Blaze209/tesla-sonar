package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class l extends b3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f3214a;

    l(Throwable th2) {
        if (th2 == null) {
            throw new NullPointerException("Null error");
        }
        this.f3214a = th2;
    }

    @Override // androidx.camera.core.impl.b3.a
    @NonNull
    public Throwable a() {
        return this.f3214a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b3.a) {
            return this.f3214a.equals(((b3.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f3214a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f3214a + "}";
    }
}
