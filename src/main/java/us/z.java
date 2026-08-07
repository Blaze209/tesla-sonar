package us;

import android.os.Bundle;
import com.plaid.internal.EnumC4419g;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f116707e = new z(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f116708f = p0.t0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f116709g = p0.t0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f116710h = p0.t0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f116711i = p0.t0(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<z> f116712j = new com.google.android.exoplayer2.g.a() { // from class: us.y
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return z.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f116716d;

    public z(int i11, int i12) {
        this(i11, i12, 0, 1.0f);
    }

    public static /* synthetic */ z a(Bundle bundle) {
        return new z(bundle.getInt(f116708f, 0), bundle.getInt(f116709g, 0), bundle.getInt(f116710h, 0), bundle.getFloat(f116711i, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f116713a == zVar.f116713a && this.f116714b == zVar.f116714b && this.f116715c == zVar.f116715c && this.f116716d == zVar.f116716d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + this.f116713a) * 31) + this.f116714b) * 31) + this.f116715c) * 31) + Float.floatToRawIntBits(this.f116716d);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f116708f, this.f116713a);
        bundle.putInt(f116709g, this.f116714b);
        bundle.putInt(f116710h, this.f116715c);
        bundle.putFloat(f116711i, this.f116716d);
        return bundle;
    }

    public z(int i11, int i12, int i13, float f11) {
        this.f116713a = i11;
        this.f116714b = i12;
        this.f116715c = i13;
        this.f116716d = f11;
    }
}
