package qj;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.y;
import dj.h;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f105590a;

    public b(@NonNull Resources resources) {
        this.f105590a = (Resources) k.d(resources);
    }

    @Override // qj.e
    public fj.c<BitmapDrawable> a(@NonNull fj.c<Bitmap> cVar, @NonNull h hVar) {
        return y.c(this.f105590a, cVar);
    }
}
