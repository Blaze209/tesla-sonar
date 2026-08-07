package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.core.util.Consumer;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.fourthline.vision.internal.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4260p2 implements androidx.camera.core.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4267q2 f38744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zx.e f38745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zx.d f38746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D2 f38747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y0.c f38748e;

    public C4260p2(Executor mainExecutor, int i11, InterfaceC4267q2 callback) {
        zx.d i12;
        p013kotlin.jvm.internal.s.k(mainExecutor, "mainExecutor");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.f38744a = callback;
        zx.e eVarA = new zx.e.a().f(1).d(1).c(1).b(2).e(0.4f).a();
        p013kotlin.jvm.internal.s.j(eVarA, "build(...)");
        this.f38745b = eVarA;
        try {
            i12 = zx.c.a(eVarA);
        } catch (MlKitException unused) {
            i12 = new I0();
        }
        this.f38746c = i12;
        this.f38747d = new D2("CameraXSelfie", 0L, 2, null);
        this.f38748e = new y0.c(p013kotlin.collections.v.e(i12), i11, mainExecutor, new Consumer() { // from class: com.fourthline.vision.internal.db
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                C4260p2.mlKitAnalyzer$lambda$2(this.f38245a, (y0.c.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mlKitAnalyzer$lambda$2(C4260p2 c4260p2, y0.c.a aVar) {
        List<? extends zx.a> list = (List) aVar.c(c4260p2.f38746c);
        if (list != null) {
            c4260p2.f38744a.onFacesDetection(list);
        }
        Throwable thB = aVar.b(c4260p2.f38746c);
        if (thB == null || !C3.isMissingModelsException(thB)) {
            return;
        }
        c4260p2.f38744a.onModelsMissing();
    }

    @Override // androidx.camera.core.f.a
    public void analyze(androidx.camera.core.n image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        this.f38747d.monitor();
        this.f38748e.analyze(image);
    }

    @Override // androidx.camera.core.f.a
    public Size getDefaultTargetResolution() {
        Size defaultTargetResolution = this.f38748e.getDefaultTargetResolution();
        p013kotlin.jvm.internal.s.j(defaultTargetResolution, "getDefaultTargetResolution(...)");
        return defaultTargetResolution;
    }

    public int getTargetCoordinateSystem() {
        return this.f38748e.d();
    }

    public void updateTransform(Matrix matrix) {
        this.f38748e.f(matrix);
    }
}
