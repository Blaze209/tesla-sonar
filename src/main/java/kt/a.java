package kt;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k5.d;
import pt.b;
import zs.c;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f89379f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f89380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f89381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f89382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f89383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f89384e;

    public a(@NonNull Context context) {
        this(b.b(context, c.B, false), ht.a.b(context, c.A, 0), ht.a.b(context, c.f128605z, 0), ht.a.b(context, c.f128599w, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i11) {
        return d.l(i11, 255) == this.f89383d;
    }

    public float a(float f11) {
        float f12 = this.f89384e;
        return (f12 <= BitmapDescriptorFactory.HUE_RED || f11 <= BitmapDescriptorFactory.HUE_RED) ? BitmapDescriptorFactory.HUE_RED : Math.min(((((float) Math.log1p(f11 / f12)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i11, float f11) {
        int i12;
        float fA = a(f11);
        int iAlpha = Color.alpha(i11);
        int iJ = ht.a.j(d.l(i11, 255), this.f89381b, fA);
        if (fA > BitmapDescriptorFactory.HUE_RED && (i12 = this.f89382c) != 0) {
            iJ = ht.a.i(iJ, d.l(i12, f89379f));
        }
        return d.l(iJ, iAlpha);
    }

    public int c(int i11, float f11) {
        return (this.f89380a && e(i11)) ? b(i11, f11) : i11;
    }

    public boolean d() {
        return this.f89380a;
    }

    public a(boolean z11, int i11, int i12, int i13, float f11) {
        this.f89380a = z11;
        this.f89381b = i11;
        this.f89382c = i12;
        this.f89383d = i13;
        this.f89384e = f11;
    }
}
