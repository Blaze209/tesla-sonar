package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c0 implements dj.j<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f20782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.b f20783b;

    static class a implements q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f20784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xj.d f20785b;

        a(a0 a0Var, xj.d dVar) {
            this.f20784a = a0Var;
            this.f20785b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void a() {
            this.f20784a.n();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void b(gj.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionC = this.f20785b.c();
            if (iOExceptionC != null) {
                if (bitmap == null) {
                    throw iOExceptionC;
                }
                dVar.c(bitmap);
                throw iOExceptionC;
            }
        }
    }

    public c0(q qVar, gj.b bVar) {
        this.f20782a = qVar;
        this.f20783b = bVar;
    }

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Bitmap> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull dj.h hVar) {
        boolean z11;
        a0 a0Var;
        if (inputStream instanceof a0) {
            a0Var = (a0) inputStream;
            z11 = false;
        } else {
            z11 = true;
            a0Var = new a0(inputStream, this.f20783b);
        }
        xj.d dVarN = xj.d.n(a0Var);
        try {
            return this.f20782a.f(new xj.i(dVarN), i11, i12, hVar, new a(a0Var, dVarN));
        } finally {
            dVarN.release();
            if (z11) {
                a0Var.release();
            }
        }
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull dj.h hVar) {
        return this.f20782a.p(inputStream);
    }
}
