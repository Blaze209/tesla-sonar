package p7;

import android.os.Bundle;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f101328e = new e1(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f101329f = s7.q0.N0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f101330g = s7.q0.N0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f101331h = s7.q0.N0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f101334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f101335d;

    public e1(int i11, int i12) {
        this(i11, i12, 1.0f);
    }

    public static e1 a(Bundle bundle) {
        return new e1(bundle.getInt(f101329f, 0), bundle.getInt(f101330g, 0), bundle.getFloat(f101331h, 1.0f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        int i11 = this.f101332a;
        if (i11 != 0) {
            bundle.putInt(f101329f, i11);
        }
        int i12 = this.f101333b;
        if (i12 != 0) {
            bundle.putInt(f101330g, i12);
        }
        float f11 = this.f101335d;
        if (f11 != 1.0f) {
            bundle.putFloat(f101331h, f11);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            if (this.f101332a == e1Var.f101332a && this.f101333b == e1Var.f101333b && this.f101335d == e1Var.f101335d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + this.f101332a) * 31) + this.f101333b) * 31) + Float.floatToRawIntBits(this.f101335d);
    }

    public e1(int i11, int i12, float f11) {
        this.f101332a = i11;
        this.f101333b = i12;
        this.f101334c = 0;
        this.f101335d = f11;
    }
}
