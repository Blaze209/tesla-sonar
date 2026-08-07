package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements dj.j<Bitmap, Bitmap> {

    private static final class a implements fj.c<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f20792a;

        a(@NonNull Bitmap bitmap) {
            this.f20792a = bitmap;
        }

        @Override // fj.c
        @NonNull
        public Class<Bitmap> a() {
            return Bitmap.class;
        }

        @Override // fj.c
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f20792a;
        }

        @Override // fj.c
        public int getSize() {
            return xj.l.i(this.f20792a);
        }

        @Override // fj.c
        public void recycle() {
        }
    }

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Bitmap> a(@NonNull Bitmap bitmap, int i11, int i12, @NonNull dj.h hVar) {
        return new a(bitmap);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Bitmap bitmap, @NonNull dj.h hVar) {
        return true;
    }
}
