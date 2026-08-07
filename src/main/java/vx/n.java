package vx;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements ux.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzyb f120100a;

    public n(zzyb zzybVar) {
        this.f120100a = zzybVar;
    }

    @Override // ux.a
    public final int a() {
        return this.f120100a.zzb();
    }

    @Override // ux.a
    public final Rect b() {
        Point[] pointArrZzo = this.f120100a.zzo();
        if (pointArrZzo == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrZzo) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // ux.a
    public final String c() {
        return this.f120100a.zzm();
    }

    @Override // ux.a
    public final Point[] d() {
        return this.f120100a.zzo();
    }

    @Override // ux.a
    public final int getFormat() {
        return this.f120100a.zza();
    }
}
