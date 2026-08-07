package pj;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dj.j<bj.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.d f103120a;

    public h(gj.d dVar) {
        this.f103120a = dVar;
    }

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Bitmap> a(@NonNull bj.a aVar, int i11, int i12, @NonNull dj.h hVar) {
        return com.bumptech.glide.load.resource.bitmap.f.c(aVar.getNextFrame(), this.f103120a);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull bj.a aVar, @NonNull dj.h hVar) {
        return true;
    }
}
