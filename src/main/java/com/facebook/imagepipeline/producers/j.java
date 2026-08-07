package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class j implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<tk.a<um.e>> f21844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21847d;

    private static class a extends u<tk.a<um.e>, tk.a<um.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21849d;

        a(n<tk.a<um.e>> nVar, int i11, int i12) {
            super(nVar);
            this.f21848c = i11;
            this.f21849d = i12;
        }

        private void p(tk.a<um.e> aVar) {
            um.e eVarH;
            Bitmap bitmapT3;
            int rowBytes;
            if (aVar == null || !aVar.J() || (eVarH = aVar.H()) == null || eVarH.getClosed() || !(eVarH instanceof um.f) || (bitmapT3 = ((um.f) eVarH).t3()) == null || (rowBytes = bitmapT3.getRowBytes() * bitmapT3.getHeight()) < this.f21848c || rowBytes > this.f21849d) {
                return;
            }
            bitmapT3.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(tk.a<um.e> aVar, int i11) {
            p(aVar);
            o().b(aVar, i11);
        }
    }

    public j(z0<tk.a<um.e>> z0Var, int i11, int i12, boolean z11) {
        pk.k.b(Boolean.valueOf(i11 <= i12));
        this.f21844a = (z0) pk.k.g(z0Var);
        this.f21845b = i11;
        this.f21846c = i12;
        this.f21847d = z11;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> nVar, a1 a1Var) {
        if (!a1Var.c0() || this.f21847d) {
            this.f21844a.a(new a(nVar, this.f21845b, this.f21846c), a1Var);
        } else {
            this.f21844a.a(nVar, a1Var);
        }
    }
}
