package hg;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f72699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f72700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f72701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f72702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f72703e = null;

    public b(float f11, float f12, float f13, int i11) {
        this.f72699a = f11;
        this.f72700b = f12;
        this.f72701c = f13;
        this.f72702d = i11;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f72702d) > 0) {
            paint.setShadowLayer(Math.max(this.f72699a, Float.MIN_VALUE), this.f72700b, this.f72701c, this.f72702d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(k.a aVar) {
        if (Color.alpha(this.f72702d) > 0) {
            aVar.f72757d = this;
        } else {
            aVar.f72757d = null;
        }
    }

    public void c(int i11, Paint paint) {
        int iL = l.l(Color.alpha(this.f72702d), j.c(i11, 0, 255));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f72699a, Float.MIN_VALUE), this.f72700b, this.f72701c, Color.argb(iL, Color.red(this.f72702d), Color.green(this.f72702d), Color.blue(this.f72702d)));
        }
    }

    public void d(int i11, k.a aVar) {
        b bVar = new b(this);
        aVar.f72757d = bVar;
        bVar.i(i11);
    }

    public int e() {
        return this.f72702d;
    }

    public float f() {
        return this.f72700b;
    }

    public float g() {
        return this.f72701c;
    }

    public float h() {
        return this.f72699a;
    }

    public void i(int i11) {
        this.f72702d = Color.argb(Math.round((Color.alpha(this.f72702d) * j.c(i11, 0, 255)) / 255.0f), Color.red(this.f72702d), Color.green(this.f72702d), Color.blue(this.f72702d));
    }

    public boolean j(b bVar) {
        return this.f72699a == bVar.f72699a && this.f72700b == bVar.f72700b && this.f72701c == bVar.f72701c && this.f72702d == bVar.f72702d;
    }

    public void k(Matrix matrix) {
        if (this.f72703e == null) {
            this.f72703e = new float[2];
        }
        float[] fArr = this.f72703e;
        fArr[0] = this.f72700b;
        fArr[1] = this.f72701c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f72703e;
        this.f72700b = fArr2[0];
        this.f72701c = fArr2[1];
        this.f72699a = matrix.mapRadius(this.f72699a);
    }

    public b(b bVar) {
        this.f72699a = BitmapDescriptorFactory.HUE_RED;
        this.f72700b = BitmapDescriptorFactory.HUE_RED;
        this.f72701c = BitmapDescriptorFactory.HUE_RED;
        this.f72702d = 0;
        this.f72699a = bVar.f72699a;
        this.f72700b = bVar.f72700b;
        this.f72701c = bVar.f72701c;
        this.f72702d = bVar.f72702d;
    }
}
