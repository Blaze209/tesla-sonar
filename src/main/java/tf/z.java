package tf;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f113401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f113402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f113403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f113404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f113405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f113406f;

    public z(int i11, int i12, String str, String str2, String str3) {
        this.f113401a = i11;
        this.f113402b = i12;
        this.f113403c = str;
        this.f113404d = str2;
        this.f113405e = str3;
    }

    public z a(float f11) {
        z zVar = new z((int) (this.f113401a * f11), (int) (this.f113402b * f11), this.f113403c, this.f113404d, this.f113405e);
        Bitmap bitmap = this.f113406f;
        if (bitmap != null) {
            zVar.g(Bitmap.createScaledBitmap(bitmap, zVar.f113401a, zVar.f113402b, true));
        }
        return zVar;
    }

    public Bitmap b() {
        return this.f113406f;
    }

    public String c() {
        return this.f113404d;
    }

    public int d() {
        return this.f113402b;
    }

    public String e() {
        return this.f113403c;
    }

    public int f() {
        return this.f113401a;
    }

    public void g(Bitmap bitmap) {
        this.f113406f = bitmap;
    }
}
