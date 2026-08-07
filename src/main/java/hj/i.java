package hj;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f72924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f72926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f72927d;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f72928i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f72929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f72930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f72931c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f72933e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f72932d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f72934f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f72935g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f72936h = 4194304;

        static {
            f72928i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f72933e = f72928i;
            this.f72929a = context;
            this.f72930b = (ActivityManager) context.getSystemService("activity");
            this.f72931c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f72930b)) {
                return;
            }
            this.f72933e = BitmapDescriptorFactory.HUE_RED;
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f72937a;

        b(DisplayMetrics displayMetrics) {
            this.f72937a = displayMetrics;
        }

        @Override // hj.i.c
        public int a() {
            return this.f72937a.heightPixels;
        }

        @Override // hj.i.c
        public int b() {
            return this.f72937a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f72926c = aVar.f72929a;
        int i11 = e(aVar.f72930b) ? aVar.f72936h / 2 : aVar.f72936h;
        this.f72927d = i11;
        int iC = c(aVar.f72930b, aVar.f72934f, aVar.f72935g);
        float fB = aVar.f72931c.b() * aVar.f72931c.a() * 4;
        int iRound = Math.round(aVar.f72933e * fB);
        int iRound2 = Math.round(fB * aVar.f72932d);
        int i12 = iC - i11;
        int i13 = iRound2 + iRound;
        if (i13 <= i12) {
            this.f72925b = iRound2;
            this.f72924a = iRound;
        } else {
            float f11 = i12;
            float f12 = aVar.f72933e;
            float f13 = aVar.f72932d;
            float f14 = f11 / (f12 + f13);
            this.f72925b = Math.round(f13 * f14);
            this.f72924a = Math.round(f14 * aVar.f72933e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f72925b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f72924a));
            sb2.append(", byte array size: ");
            sb2.append(f(i11));
            sb2.append(", memory class limited? ");
            sb2.append(i13 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f72930b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f72930b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f11, float f12) {
        float memoryClass = activityManager.getMemoryClass() * PKIFailureInfo.badCertTemplate;
        if (e(activityManager)) {
            f11 = f12;
        }
        return Math.round(memoryClass * f11);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i11) {
        return Formatter.formatFileSize(this.f72926c, i11);
    }

    public int a() {
        return this.f72927d;
    }

    public int b() {
        return this.f72924a;
    }

    public int d() {
        return this.f72925b;
    }
}
