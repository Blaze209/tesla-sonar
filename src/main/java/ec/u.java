package ec;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000e\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0006*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016*\n\u0010\u0017\"\u00020\u00002\u00020\u0000*\n\u0010\u0019\"\u00020\u00182\u00020\u0018¨\u0006\u001a"}, d2 = {"Landroid/graphics/Bitmap;", "", "shareable", "Lec/a;", "b", "(Landroid/graphics/Bitmap;Z)Lec/a;", "Lec/n;", "", Snapshot.WIDTH, Snapshot.HEIGHT, "e", "(Lec/n;II)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "f", "(Lec/n;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "c", "(Landroid/graphics/drawable/Drawable;)Lec/n;", "Landroid/content/res/Resources;", "resources", "a", "(Lec/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Bitmap", "Landroid/graphics/Canvas;", "Canvas", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final Drawable a(n nVar, Resources resources) {
        if (nVar instanceof DrawableImage) {
            return ((DrawableImage) nVar).getDrawable();
        }
        return nVar instanceof BitmapImage ? new BitmapDrawable(resources, ((BitmapImage) nVar).getBitmap()) : new o(nVar);
    }

    public static final BitmapImage b(Bitmap bitmap, boolean z11) {
        return new BitmapImage(bitmap, z11);
    }

    public static final n c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new DrawableImage(drawable, false);
    }

    public static /* synthetic */ BitmapImage d(Bitmap bitmap, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return b(bitmap, z11);
    }

    public static final Bitmap e(n nVar, int i11, int i12) {
        Bitmap.Config config = nVar instanceof BitmapImage ? ((BitmapImage) nVar).getBitmap().getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return f(nVar, i11, i12, config);
    }

    public static final Bitmap f(n nVar, int i11, int i12, Bitmap.Config config) {
        if (nVar instanceof BitmapImage) {
            BitmapImage bitmapImage = (BitmapImage) nVar;
            if (bitmapImage.getBitmap().getWidth() == i11 && bitmapImage.getBitmap().getHeight() == i12 && bitmapImage.getBitmap().getConfig() == config) {
                return bitmapImage.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, config);
        nVar.a(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap g(n nVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = nVar.getWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = nVar.getHeight();
        }
        return e(nVar, i11, i12);
    }
}
