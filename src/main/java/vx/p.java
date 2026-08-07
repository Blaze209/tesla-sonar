package vx;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements ux.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzu f120109a;

    public p(zzu zzuVar) {
        this.f120109a = zzuVar;
    }

    @Override // ux.a
    public final int a() {
        return this.f120109a.zzd;
    }

    @Override // ux.a
    public final Rect b() {
        zzu zzuVar = this.f120109a;
        if (zzuVar.zze == null) {
            return null;
        }
        int i11 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i11 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i11];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i11++;
        }
    }

    @Override // ux.a
    public final String c() {
        return this.f120109a.zzb;
    }

    @Override // ux.a
    public final Point[] d() {
        return this.f120109a.zze;
    }

    @Override // ux.a
    public final int getFormat() {
        return this.f120109a.zza;
    }
}
