package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class o0 implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f21906b;

    class a extends i1<tk.a<um.e>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c1 f21907f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1 f21908g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.a f21909h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f21910i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, c1 c1Var, a1 a1Var, String str, c1 c1Var2, a1 a1Var2, com.facebook.imagepipeline.request.a aVar, CancellationSignal cancellationSignal) {
            super(nVar, c1Var, a1Var, str);
            this.f21907f = c1Var2;
            this.f21908g = a1Var2;
            this.f21909h = aVar;
            this.f21910i = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.i1, nk.h
        protected void d() {
            super.d();
            this.f21910i.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.i1, nk.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f21907f.a(this.f21908g, "LocalThumbnailBitmapSdk29Producer", false);
            this.f21908g.I(ImagesContract.LOCAL, "thumbnail_bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(tk.a<um.e> aVar) {
            tk.a.C(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.i1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> i(tk.a<um.e> aVar) {
            return pk.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public tk.a<um.e> c() throws IOException {
            String strE;
            Bitmap bitmapLoadThumbnail;
            Size size = new Size(this.f21909h.n(), this.f21909h.m());
            try {
                strE = o0.this.e(this.f21909h);
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            if (strE != null) {
                bitmapLoadThumbnail = rk.a.c(rk.a.b(strE)) ? ThumbnailUtils.createVideoThumbnail(new File(strE), size, this.f21910i) : ThumbnailUtils.createImageThumbnail(new File(strE), size, this.f21910i);
            } else {
                bitmapLoadThumbnail = null;
            }
            if (bitmapLoadThumbnail == null) {
                bitmapLoadThumbnail = o0.this.f21906b.loadThumbnail(this.f21909h.v(), size, this.f21910i);
            }
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            um.f fVarS = um.f.S(bitmapLoadThumbnail, mm.f.b(), um.o.f116468d, 0);
            this.f21908g.o("image_format", "thumbnail");
            fVarS.C(this.f21908g.getExtras());
            return tk.a.c0(fVarS);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.i1, nk.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(tk.a<um.e> aVar) {
            super.f(aVar);
            this.f21907f.a(this.f21908g, "LocalThumbnailBitmapSdk29Producer", aVar != null);
            this.f21908g.I(ImagesContract.LOCAL, "thumbnail_bitmap");
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f21912a;

        b(i1 i1Var) {
            this.f21912a = i1Var;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            this.f21912a.a();
        }
    }

    public o0(Executor executor, ContentResolver contentResolver) {
        this.f21905a = executor;
        this.f21906b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(com.facebook.imagepipeline.request.a aVar) {
        return xk.e.e(this.f21906b, aVar.v());
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> nVar, a1 a1Var) {
        c1 c1VarP = a1Var.p();
        com.facebook.imagepipeline.request.a aVarB = a1Var.B();
        a1Var.I(ImagesContract.LOCAL, "thumbnail_bitmap");
        a aVar = new a(nVar, c1VarP, a1Var, "LocalThumbnailBitmapSdk29Producer", c1VarP, a1Var, aVarB, new CancellationSignal());
        a1Var.H(new b(aVar));
        this.f21905a.execute(aVar);
    }
}
