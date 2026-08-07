package l3;

import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Ll3/a0;", "Ll3/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lk3/p1;", "n", "(FFFFLl3/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 extends c {
    public a0(String str, int i11) {
        super(str, b.INSTANCE.c(), i11, null);
    }

    @Override // l3.c
    public float[] b(float[] v11) {
        float f11 = v11[0];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        v11[0] = f11;
        float f12 = v11[1];
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        v11[1] = f12;
        float f13 = v11[2];
        float f14 = f13 >= -2.0f ? f13 : -2.0f;
        v11[2] = f14 <= 2.0f ? f14 : 2.0f;
        return v11;
    }

    @Override // l3.c
    public float e(int component) {
        return 2.0f;
    }

    @Override // l3.c
    public float f(int component) {
        return -2.0f;
    }

    @Override // l3.c
    public long j(float v11, float v12, float v13) {
        if (v11 < -2.0f) {
            v11 = -2.0f;
        }
        if (v11 > 2.0f) {
            v11 = 2.0f;
        }
        if (v12 < -2.0f) {
            v12 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(v11)) << 32) | (((long) Float.floatToRawIntBits(v12 <= 2.0f ? v12 : 2.0f)) & 4294967295L);
    }

    @Override // l3.c
    public float[] l(float[] v11) {
        float f11 = v11[0];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        v11[0] = f11;
        float f12 = v11[1];
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        v11[1] = f12;
        float f13 = v11[2];
        float f14 = f13 >= -2.0f ? f13 : -2.0f;
        v11[2] = f14 <= 2.0f ? f14 : 2.0f;
        return v11;
    }

    @Override // l3.c
    public float m(float v11, float v12, float v13) {
        if (v13 < -2.0f) {
            v13 = -2.0f;
        }
        if (v13 > 2.0f) {
            return 2.0f;
        }
        return v13;
    }

    @Override // l3.c
    public long n(float x11, float y11, float z11, float a11, c colorSpace) {
        if (x11 < -2.0f) {
            x11 = -2.0f;
        }
        if (x11 > 2.0f) {
            x11 = 2.0f;
        }
        if (y11 < -2.0f) {
            y11 = -2.0f;
        }
        if (y11 > 2.0f) {
            y11 = 2.0f;
        }
        if (z11 < -2.0f) {
            z11 = -2.0f;
        }
        return r1.a(x11, y11, z11 <= 2.0f ? z11 : 2.0f, a11, colorSpace);
    }
}
