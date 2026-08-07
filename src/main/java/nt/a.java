package nt;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f95442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final V f95443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f95444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f95445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f95446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.p002activity.b f95447f;

    public a(@NonNull V v11) {
        this.f95443b = v11;
        Context context = v11.getContext();
        this.f95442a = i.g(context, zs.c.f128576k0, a6.a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f));
        this.f95444c = i.f(context, zs.c.Z, 300);
        this.f95445d = i.f(context, zs.c.f128562d0, 150);
        this.f95446e = i.f(context, zs.c.f128560c0, 100);
    }

    public float a(float f11) {
        return this.f95442a.getInterpolation(f11);
    }

    protected androidx.p002activity.b b() {
        if (this.f95447f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.p002activity.b bVar = this.f95447f;
        this.f95447f = null;
        return bVar;
    }

    public androidx.p002activity.b c() {
        androidx.p002activity.b bVar = this.f95447f;
        this.f95447f = null;
        return bVar;
    }

    protected void d(@NonNull androidx.p002activity.b bVar) {
        this.f95447f = bVar;
    }

    protected androidx.p002activity.b e(@NonNull androidx.p002activity.b bVar) {
        if (this.f95447f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.p002activity.b bVar2 = this.f95447f;
        this.f95447f = bVar;
        return bVar2;
    }
}
