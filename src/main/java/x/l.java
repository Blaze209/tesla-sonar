package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class l extends k {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final OutputConfiguration f122461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f122462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f122463c = 1;

        a(@NonNull OutputConfiguration outputConfiguration) {
            this.f122461a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f122461a, aVar.f122461a) && this.f122463c == aVar.f122463c && Objects.equals(this.f122462b, aVar.f122462b);
        }

        public int hashCode() {
            int iHashCode = this.f122461a.hashCode() ^ 31;
            int i11 = (iHashCode << 5) - iHashCode;
            String str = this.f122462b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f122463c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    l(int i11, @NonNull Surface surface) {
        this(new a(new OutputConfiguration(i11, surface)));
    }

    static l k(@NonNull OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // x.k, x.j.a
    public String a() {
        return ((a) this.f122466a).f122462b;
    }

    @Override // x.o, x.j.a
    public void b(@NonNull Surface surface) {
        ((OutputConfiguration) h()).addSurface(surface);
    }

    @Override // x.k, x.j.a
    public void c() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }

    @Override // x.k, x.j.a
    public void e(long j11) {
        ((a) this.f122466a).f122463c = j11;
    }

    @Override // x.k, x.j.a
    public void f(String str) {
        ((a) this.f122466a).f122462b = str;
    }

    @Override // x.k, x.j.a
    @NonNull
    public Object h() {
        u5.h.a(this.f122466a instanceof a);
        return ((a) this.f122466a).f122461a;
    }

    @Override // x.k, x.o
    final boolean i() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    l(@NonNull Object obj) {
        super(obj);
    }
}
