package zf0;

import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f128165a;

    a0(z zVar) {
        this.f128165a = zVar;
    }

    public static qj0.i<y.a> b(z zVar) {
        return qj0.f.a(new a0(zVar));
    }

    @Override // zf0.y.a
    public y a(s sVar, PreviewView previewView, x xVar) {
        return this.f128165a.b(sVar, previewView, xVar);
    }
}
