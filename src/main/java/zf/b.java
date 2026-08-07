package zf;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import hg.e;
import hg.l;
import java.io.IOException;
import java.util.Map;
import tf.c;
import tf.z;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f128135d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f128136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f128137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, z> f128138c;

    public b(Drawable.Callback callback, String str, c cVar, Map<String, z> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f128137b = str;
        } else {
            this.f128137b = str + '/';
        }
        this.f128138c = map;
        d(cVar);
        if (callback instanceof View) {
            this.f128136a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f128136a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f128135d) {
            this.f128138c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        z zVar = this.f128138c.get(str);
        if (zVar == null) {
            return null;
        }
        Bitmap bitmapB = zVar.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f128136a;
        if (context == null) {
            return null;
        }
        String strC = zVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return c(str, l.m(bitmapDecodeByteArray, zVar.f(), zVar.d()));
                    }
                    e.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e11) {
                    e.d("Unable to decode image `" + str + "`.", e11);
                    return null;
                }
            } catch (IllegalArgumentException e12) {
                e.d("data URL did not have correct base64 format.", e12);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f128137b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f128137b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, l.m(bitmapDecodeStream, zVar.f(), zVar.d()));
                }
                e.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e13) {
                e.d("Unable to decode image `" + str + "`.", e13);
                return null;
            }
        } catch (IOException e14) {
            e.d("Unable to open asset.", e14);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f128136a == null;
        }
        if (this.f128136a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f128136a;
    }

    public void d(c cVar) {
    }
}
