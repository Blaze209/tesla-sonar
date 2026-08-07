package pj;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import dj.l;
import java.security.MessageDigest;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public class f implements l<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<Bitmap> f103096b;

    public f(l<Bitmap> lVar) {
        this.f103096b = (l) k.d(lVar);
    }

    @Override // dj.l
    @NonNull
    public fj.c<c> a(@NonNull Context context, @NonNull fj.c<c> cVar, int i11, int i12) {
        c cVar2 = cVar.get();
        fj.c<Bitmap> fVar = new com.bumptech.glide.load.resource.bitmap.f(cVar2.e(), com.bumptech.glide.c.e(context).h());
        fj.c<Bitmap> cVarA = this.f103096b.a(context, fVar, i11, i12);
        if (!fVar.equals(cVarA)) {
            fVar.recycle();
        }
        cVar2.m(this.f103096b, cVarA.get());
        return cVar;
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        this.f103096b.b(messageDigest);
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f103096b.equals(((f) obj).f103096b);
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        return this.f103096b.hashCode();
    }
}
