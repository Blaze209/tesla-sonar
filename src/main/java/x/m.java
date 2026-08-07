package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class m extends l {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final OutputConfiguration f122464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f122465b = 1;

        a(@NonNull OutputConfiguration outputConfiguration) {
            this.f122464a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f122464a, aVar.f122464a) && this.f122465b == aVar.f122465b;
        }

        public int hashCode() {
            int iHashCode = this.f122464a.hashCode() ^ 31;
            return Long.hashCode(this.f122465b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    m(int i11, @NonNull Surface surface) {
        this(new a(new OutputConfiguration(i11, surface)));
    }

    static m l(@NonNull OutputConfiguration outputConfiguration) {
        return new m(new a(outputConfiguration));
    }

    @Override // x.l, x.k, x.j.a
    public String a() {
        return null;
    }

    @Override // x.l, x.k, x.j.a
    public void e(long j11) {
        ((a) this.f122466a).f122465b = j11;
    }

    @Override // x.l, x.k, x.j.a
    public void f(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }

    @Override // x.l, x.k, x.j.a
    @NonNull
    public Object h() {
        u5.h.a(this.f122466a instanceof a);
        return ((a) this.f122466a).f122464a;
    }

    m(@NonNull Object obj) {
        super(obj);
    }
}
