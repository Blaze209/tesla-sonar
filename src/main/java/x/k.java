package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class k extends o {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final OutputConfiguration f122457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f122458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f122459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f122460d = 1;

        a(@NonNull OutputConfiguration outputConfiguration) {
            this.f122457a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f122457a, aVar.f122457a) && this.f122459c == aVar.f122459c && this.f122460d == aVar.f122460d && Objects.equals(this.f122458b, aVar.f122458b);
        }

        public int hashCode() {
            int iHashCode = this.f122457a.hashCode() ^ 31;
            int i11 = (this.f122459c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i12 = (i11 << 5) - i11;
            String str = this.f122458b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i12;
            return Long.hashCode(this.f122460d) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    k(int i11, @NonNull Surface surface) {
        this(new a(new OutputConfiguration(i11, surface)));
    }

    static k j(@NonNull OutputConfiguration outputConfiguration) {
        return new k(new a(outputConfiguration));
    }

    @Override // x.j.a
    public String a() {
        return ((a) this.f122466a).f122458b;
    }

    @Override // x.j.a
    public void c() {
        ((a) this.f122466a).f122459c = true;
    }

    @Override // x.j.a
    public void e(long j11) {
        ((a) this.f122466a).f122460d = j11;
    }

    @Override // x.j.a
    public void f(String str) {
        ((a) this.f122466a).f122458b = str;
    }

    @Override // x.o, x.j.a
    public Surface getSurface() {
        return ((OutputConfiguration) h()).getSurface();
    }

    @Override // x.j.a
    @NonNull
    public Object h() {
        u5.h.a(this.f122466a instanceof a);
        return ((a) this.f122466a).f122457a;
    }

    @Override // x.o
    boolean i() {
        return ((a) this.f122466a).f122459c;
    }

    k(@NonNull Object obj) {
        super(obj);
    }
}
