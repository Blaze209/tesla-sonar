package tx;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import xx.b;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ux.a f115162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f115163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Point[] f115164c;

    @KeepForSdk
    public a(@NonNull ux.a aVar) {
        this(aVar, null);
    }

    public Rect a() {
        return this.f115163b;
    }

    public Point[] b() {
        return this.f115164c;
    }

    public int c() {
        int format = this.f115162a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public String d() {
        return this.f115162a.c();
    }

    public int e() {
        return this.f115162a.a();
    }

    @KeepForSdk
    public a(@NonNull ux.a aVar, Matrix matrix) {
        this.f115162a = (ux.a) Preconditions.checkNotNull(aVar);
        Rect rectB = aVar.b();
        if (rectB != null && matrix != null) {
            b.e(rectB, matrix);
        }
        this.f115163b = rectB;
        Point[] pointArrD = aVar.d();
        if (pointArrD != null && matrix != null) {
            b.b(pointArrD, matrix);
        }
        this.f115164c = pointArrD;
    }
}
