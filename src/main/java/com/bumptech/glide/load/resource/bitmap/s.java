package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class s implements dj.l<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj.l<Bitmap> f20835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20836c;

    public s(dj.l<Bitmap> lVar, boolean z11) {
        this.f20835b = lVar;
        this.f20836c = z11;
    }

    private fj.c<Drawable> d(Context context, fj.c<Bitmap> cVar) {
        return y.c(context.getResources(), cVar);
    }

    @Override // dj.l
    @NonNull
    public fj.c<Drawable> a(@NonNull Context context, @NonNull fj.c<Drawable> cVar, int i11, int i12) {
        gj.d dVarH = com.bumptech.glide.c.e(context).h();
        Drawable drawable = cVar.get();
        fj.c<Bitmap> cVarA = r.a(dVarH, drawable, i11, i12);
        if (cVarA != null) {
            fj.c<Bitmap> cVarA2 = this.f20835b.a(context, cVarA, i11, i12);
            if (!cVarA2.equals(cVarA)) {
                return d(context, cVarA2);
            }
            cVarA2.recycle();
            return cVar;
        }
        if (!this.f20836c) {
            return cVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        this.f20835b.b(messageDigest);
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f20835b.equals(((s) obj).f20835b);
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        return this.f20835b.hashCode();
    }

    public dj.l<BitmapDrawable> c() {
        return this;
    }
}
