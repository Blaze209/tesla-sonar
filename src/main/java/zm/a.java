package zm;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import jk.d;
import jk.i;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class a extends an.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f128441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f128442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f128443e;

    public a(int i11, int i12) {
        k.b(Boolean.valueOf(i11 > 0));
        k.b(Boolean.valueOf(i12 > 0));
        this.f128441c = i11;
        this.f128442d = i12;
    }

    @Override // an.a, an.b
    public d a() {
        if (this.f128443e == null) {
            this.f128443e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f128441c), Integer.valueOf(this.f128442d)));
        }
        return this.f128443e;
    }

    @Override // an.a
    public void e(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f128441c, this.f128442d);
    }
}
