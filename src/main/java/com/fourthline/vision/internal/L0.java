package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.core.util.Consumer;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class L0 implements androidx.camera.core.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0 f37816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dy.c f37817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sx.a f37818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y0.c f37819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D2 f37820e;

    public L0(Executor mainExecutor, int i11, M0 callback) {
        dy.c j11;
        sx.a h11;
        p013kotlin.jvm.internal.s.k(mainExecutor, "mainExecutor");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.f37816a = callback;
        try {
            j11 = dy.b.a(fy.a.f66714d);
        } catch (MlKitException unused) {
            j11 = new J0();
        }
        this.f37817b = j11;
        try {
            h11 = sx.c.a();
        } catch (MlKitException unused2) {
            h11 = new H0();
        }
        this.f37818c = h11;
        this.f37819d = new y0.c(p013kotlin.collections.v.p(this.f37817b, h11), i11, mainExecutor, new Consumer() { // from class: com.fourthline.vision.internal.g8
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                L0.mlKitAnalyzer$lambda$2(this.f38343a, (y0.c.a) obj);
            }
        });
        this.f37820e = new D2("CameraXDocument", 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mlKitAnalyzer$lambda$2(L0 l11, y0.c.a aVar) {
        dy.a aVar2 = (dy.a) aVar.c(l11.f37817b);
        if (aVar2 != null) {
            l11.f37816a.onTextDetected(aVar2);
        }
        List<? extends tx.a> list = (List) aVar.c(l11.f37818c);
        if (list != null) {
            l11.f37816a.onBarcodeDetected(list);
        }
    }

    @Override // androidx.camera.core.f.a
    public void analyze(androidx.camera.core.n image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        this.f37820e.monitor();
        this.f37819d.analyze(image);
    }

    @Override // androidx.camera.core.f.a
    public Size getDefaultTargetResolution() {
        Size defaultTargetResolution = this.f37819d.getDefaultTargetResolution();
        p013kotlin.jvm.internal.s.j(defaultTargetResolution, "getDefaultTargetResolution(...)");
        return defaultTargetResolution;
    }

    public int getTargetCoordinateSystem() {
        return this.f37819d.d();
    }

    public void updateTransform(Matrix matrix) {
        this.f37819d.f(matrix);
    }
}
