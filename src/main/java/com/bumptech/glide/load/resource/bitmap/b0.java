package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements dj.j<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nj.g f20777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.d f20778b;

    public b0(nj.g gVar, gj.d dVar) {
        this.f20777a = gVar;
        this.f20778b = dVar;
    }

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Bitmap> a(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        fj.c<Drawable> cVarA = this.f20777a.a(uri, i11, i12, hVar);
        if (cVarA == null) {
            return null;
        }
        return r.a(this.f20778b, cVarA.get(), i11, i12);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull dj.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
