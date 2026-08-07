package zf0;

import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<eg0.a> f128348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<fi0.c> f128349b;

    public z(qj0.i<eg0.a> iVar, qj0.i<fi0.c> iVar2) {
        this.f128348a = iVar;
        this.f128349b = iVar2;
    }

    public static z a(qj0.i<eg0.a> iVar, qj0.i<fi0.c> iVar2) {
        return new z(iVar, iVar2);
    }

    public static y c(eg0.a aVar, fi0.c cVar, s sVar, PreviewView previewView, x xVar) {
        return new y(aVar, cVar, sVar, previewView, xVar);
    }

    public y b(s sVar, PreviewView previewView, x xVar) {
        return c(this.f128348a.get(), this.f128349b.get(), sVar, previewView, xVar);
    }
}
