package an;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import pm.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f1762a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f1763b;

    private static void d(Bitmap bitmap, Bitmap bitmap2) {
        if (!z.a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            return;
        }
        try {
            if (f1763b == null) {
                int i11 = Bitmaps.f21718a;
                f1763b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            f1763b.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e14);
        }
    }

    @Override // an.b
    public jk.d a() {
        return null;
    }

    @Override // an.b
    public tk.a<Bitmap> b(Bitmap bitmap, mm.d dVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f1762a;
        }
        tk.a<Bitmap> aVarD = dVar.d(width, height, config);
        try {
            f(aVarD.H(), bitmap);
            return aVarD.clone();
        } finally {
            tk.a.C(aVarD);
        }
    }

    public void f(Bitmap bitmap, Bitmap bitmap2) {
        d(bitmap, bitmap2);
        e(bitmap);
    }

    @Override // an.b
    public String getName() {
        return "Unknown postprocessor";
    }

    public void e(Bitmap bitmap) {
    }
}
