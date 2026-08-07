package sj0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f111314a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f111315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f111316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f111317c;

        a(int i11, int i12, float f11) {
            this.f111315a = i11;
            this.f111316b = i12;
            this.f111317c = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f111315a == aVar.f111315a && this.f111316b == aVar.f111316b && Float.compare(aVar.f111317c, this.f111317c) == 0) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f111315a * 31) + this.f111316b) * 31;
            float f11 = this.f111317c;
            return i11 + (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0);
        }

        public String toString() {
            return "Size{width=" + this.f111315a + ", height=" + this.f111316b + ", scaleFactor=" + this.f111317c + CoreConstants.CURLY_RIGHT;
        }
    }

    public k(float f11) {
        this.f111314a = f11;
    }

    private int a(float f11) {
        return (int) Math.ceil(f11 / this.f111314a);
    }

    private int c(int i11) {
        int i12 = i11 % 64;
        return i12 == 0 ? i11 : (i11 - i12) + 64;
    }

    boolean b(int i11, int i12) {
        return a((float) i12) == 0 || a((float) i11) == 0;
    }

    a d(int i11, int i12) {
        float f11 = i11;
        int iC = c(a(f11));
        float f12 = f11 / iC;
        return new a(iC, (int) Math.ceil(i12 / f12), f12);
    }
}
