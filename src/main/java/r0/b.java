package r0;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f106289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f106292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f106293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f106294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f106295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f106296h;

    b(UUID uuid, int i11, int i12, Rect rect, Size size, int i13, boolean z11, boolean z12) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f106289a = uuid;
        this.f106290b = i11;
        this.f106291c = i12;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f106292d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f106293e = size;
        this.f106294f = i13;
        this.f106295g = z11;
        this.f106296h = z12;
    }

    @Override // r0.f
    @NonNull
    public Rect a() {
        return this.f106292d;
    }

    @Override // r0.f
    public int b() {
        return this.f106291c;
    }

    @Override // r0.f
    public int c() {
        return this.f106294f;
    }

    @Override // r0.f
    @NonNull
    public Size d() {
        return this.f106293e;
    }

    @Override // r0.f
    public int e() {
        return this.f106290b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f106289a.equals(fVar.f()) && this.f106290b == fVar.e() && this.f106291c == fVar.b() && this.f106292d.equals(fVar.a()) && this.f106293e.equals(fVar.d()) && this.f106294f == fVar.c() && this.f106295g == fVar.g() && this.f106296h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // r0.f
    @NonNull
    UUID f() {
        return this.f106289a;
    }

    @Override // r0.f
    public boolean g() {
        return this.f106295g;
    }

    public int hashCode() {
        return ((((((((((((((this.f106289a.hashCode() ^ 1000003) * 1000003) ^ this.f106290b) * 1000003) ^ this.f106291c) * 1000003) ^ this.f106292d.hashCode()) * 1000003) ^ this.f106293e.hashCode()) * 1000003) ^ this.f106294f) * 1000003) ^ (this.f106295g ? 1231 : 1237)) * 1000003) ^ (this.f106296h ? 1231 : 1237);
    }

    @Override // r0.f
    public boolean k() {
        return this.f106296h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f106289a + ", getTargets=" + this.f106290b + ", getFormat=" + this.f106291c + ", getCropRect=" + this.f106292d + ", getSize=" + this.f106293e + ", getRotationDegrees=" + this.f106294f + ", isMirroring=" + this.f106295g + ", shouldRespectInputCropRect=" + this.f106296h + "}";
    }
}
