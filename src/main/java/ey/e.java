package ey;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class e {
    static Rect a(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    static List b(zzf zzfVar) {
        double dSin = Math.sin(Math.toRadians(zzfVar.zze));
        double dCos = Math.cos(Math.toRadians(zzfVar.zze));
        double d11 = zzfVar.zza;
        double d12 = zzfVar.zzc;
        Point point = new Point((int) (d11 + (d12 * dCos)), (int) (((double) zzfVar.zzb) + (d12 * dSin)));
        double d13 = point.x;
        int i11 = zzfVar.zzd;
        double d14 = ((double) i11) * dSin;
        double d15 = ((double) pointArr[1].y) + (((double) i11) * dCos);
        Point point2 = pointArr[0];
        int i12 = point2.x;
        Point point3 = pointArr[2];
        int i13 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (d13 - d14), (int) d15), new Point(i12 + (i13 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
