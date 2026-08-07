package n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import i.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f92573a;

    private a(Context context) {
        this.f92573a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f92573a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f92573a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f92573a.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600) {
            return 5;
        }
        if (i11 > 960 && i12 > 720) {
            return 5;
        }
        if (i11 > 720 && i12 > 960) {
            return 5;
        }
        if (i11 >= 500) {
            return 4;
        }
        if (i11 > 640 && i12 > 480) {
            return 4;
        }
        if (i11 <= 480 || i12 <= 640) {
            return i11 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f92573a.getResources().getDimensionPixelSize(i.d.f73760b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f92573a.obtainStyledAttributes(null, j.f73865a, i.a.f73726c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f73915j, 0);
        Resources resources = this.f92573a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(i.d.f73759a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f92573a.getResources().getBoolean(i.b.f73750a);
    }

    public boolean h() {
        return true;
    }
}
