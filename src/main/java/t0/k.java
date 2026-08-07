package t0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.z;

/* JADX INFO: loaded from: classes.dex */
public class k implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f111998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final g3 f111999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f112000c;

    public k(@NonNull g3 g3Var, z zVar) {
        this(zVar, g3Var, -1L);
    }

    @Override // androidx.camera.core.impl.z
    public long a() {
        z zVar = this.f111998a;
        if (zVar != null) {
            return zVar.a();
        }
        long j11 = this.f112000c;
        if (j11 != -1) {
            return j11;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public g3 c() {
        return this.f111999b;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public v d() {
        z zVar = this.f111998a;
        return zVar != null ? zVar.d() : v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public x e() {
        z zVar = this.f111998a;
        return zVar != null ? zVar.e() : x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public u f() {
        z zVar = this.f111998a;
        return zVar != null ? zVar.f() : u.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public t g() {
        z zVar = this.f111998a;
        return zVar != null ? zVar.g() : t.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public y h() {
        z zVar = this.f111998a;
        return zVar != null ? zVar.h() : y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public w i() {
        z zVar = this.f111998a;
        return zVar != null ? zVar.i() : w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public s k() {
        z zVar = this.f111998a;
        return zVar != null ? zVar.k() : s.UNKNOWN;
    }

    public k(@NonNull g3 g3Var, long j11) {
        this(null, g3Var, j11);
    }

    private k(z zVar, @NonNull g3 g3Var, long j11) {
        this.f111998a = zVar;
        this.f111999b = g3Var;
        this.f112000c = j11;
    }
}
