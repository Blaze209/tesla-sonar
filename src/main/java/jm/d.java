package jm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hm.e;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hm.a f84002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f84003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f84004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f84005d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f84006a;

        static {
            int[] iArr = new int[c.values().length];
            f84006a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84006a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84006a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84006a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void a(int i11, Bitmap bitmap);

        tk.a<Bitmap> b(int i11);
    }

    private enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(hm.a aVar, boolean z11, b bVar) {
        this.f84002a = aVar;
        this.f84003b = bVar;
        this.f84005d = z11;
        Paint paint = new Paint();
        this.f84004c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, hm.b bVar) {
        int i11 = bVar.f73164b;
        int i12 = bVar.f73165c;
        canvas.drawRect(i11, i12, i11 + bVar.f73166d, i12 + bVar.f73167e, this.f84004c);
    }

    private c b(int i11) {
        hm.b bVarC = this.f84002a.c(i11);
        hm.b.EnumC1538b enumC1538b = bVarC.f73169g;
        if (enumC1538b == hm.b.EnumC1538b.DISPOSE_DO_NOT) {
            return c.REQUIRED;
        }
        if (enumC1538b == hm.b.EnumC1538b.DISPOSE_TO_BACKGROUND) {
            return c(bVarC) ? c.NOT_REQUIRED : c.REQUIRED;
        }
        return enumC1538b == hm.b.EnumC1538b.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT;
    }

    private boolean c(hm.b bVar) {
        return bVar.f73164b == 0 && bVar.f73165c == 0 && bVar.f73166d == this.f84002a.e() && bVar.f73167e == this.f84002a.j();
    }

    private boolean d(int i11) {
        if (i11 == 0) {
            return true;
        }
        hm.b bVarC = this.f84002a.c(i11);
        hm.b bVarC2 = this.f84002a.c(i11 - 1);
        if (bVarC.f73168f == hm.b.a.NO_BLEND && c(bVarC)) {
            return true;
        }
        return bVarC2.f73169g == hm.b.EnumC1538b.DISPOSE_TO_BACKGROUND && c(bVarC2);
    }

    private void e(Bitmap bitmap) {
        e eVarF = this.f84002a.f();
        if (eVarF == null) {
            return;
        }
        eVarF.c();
    }

    private int f(int i11, Canvas canvas) {
        while (i11 >= 0) {
            int i12 = a.f84006a[b(i11).ordinal()];
            if (i12 == 1) {
                hm.b bVarC = this.f84002a.c(i11);
                tk.a<Bitmap> aVarB = this.f84003b.b(i11);
                if (aVarB != null) {
                    try {
                        canvas.drawBitmap(aVarB.H(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                        if (bVarC.f73169g == hm.b.EnumC1538b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, bVarC);
                        }
                        return i11 + 1;
                    } finally {
                        if (!this.f84005d) {
                            aVarB.close();
                        }
                    }
                }
                if (d(i11)) {
                    return i11;
                }
                i11--;
            } else {
                if (i12 == 2) {
                    return i11 + 1;
                }
                if (i12 == 3) {
                    return i11;
                }
                i11--;
            }
        }
        return 0;
    }

    public void g(int i11, Bitmap bitmap) {
        this.f84002a.k(i11, new Canvas(bitmap));
    }

    public void h(int i11, Bitmap bitmap) {
        if (this.f84005d) {
            g(i11, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int iF = !d(i11) ? f(i11 - 1, canvas) : i11; iF < i11; iF++) {
            hm.b bVarC = this.f84002a.c(iF);
            hm.b.EnumC1538b enumC1538b = bVarC.f73169g;
            if (enumC1538b != hm.b.EnumC1538b.DISPOSE_TO_PREVIOUS) {
                if (bVarC.f73168f == hm.b.a.NO_BLEND) {
                    a(canvas, bVarC);
                }
                this.f84002a.h(iF, canvas);
                this.f84003b.a(iF, bitmap);
                if (enumC1538b == hm.b.EnumC1538b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, bVarC);
                }
            }
        }
        hm.b bVarC2 = this.f84002a.c(i11);
        if (bVarC2.f73168f == hm.b.a.NO_BLEND) {
            a(canvas, bVarC2);
        }
        this.f84002a.h(i11, canvas);
        e(bitmap);
    }
}
