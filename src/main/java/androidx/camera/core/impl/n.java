package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class n extends e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.b f3235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e3.a f3236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3237c;

    n(e3.b bVar, e3.a aVar, long j11) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f3235a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f3236b = aVar;
        this.f3237c = j11;
    }

    @Override // androidx.camera.core.impl.e3
    @NonNull
    public e3.a c() {
        return this.f3236b;
    }

    @Override // androidx.camera.core.impl.e3
    @NonNull
    public e3.b d() {
        return this.f3235a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e3) {
            e3 e3Var = (e3) obj;
            if (this.f3235a.equals(e3Var.d()) && this.f3236b.equals(e3Var.c()) && this.f3237c == e3Var.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.e3
    public long f() {
        return this.f3237c;
    }

    public int hashCode() {
        int iHashCode = (((this.f3235a.hashCode() ^ 1000003) * 1000003) ^ this.f3236b.hashCode()) * 1000003;
        long j11 = this.f3237c;
        return iHashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f3235a + ", configSize=" + this.f3236b + ", streamUseCase=" + this.f3237c + "}";
    }
}
