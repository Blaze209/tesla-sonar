package com.fourthline.vision.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p003lifecycle.LifecycleOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes4.dex */
public abstract class E {
    public static final void CameraPreview(androidx.compose.ui.d dVar, InterfaceC4264q cameraEngine, androidx.camera.core.f.a analyzer, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        final InterfaceC4264q interfaceC4264q;
        final androidx.camera.core.f.a aVar;
        final androidx.compose.ui.d dVar2;
        p013kotlin.jvm.internal.s.k(cameraEngine, "cameraEngine");
        p013kotlin.jvm.internal.s.k(analyzer, "analyzer");
        p020r2.l lVarV = lVar.v(1541604487);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(cameraEngine) : lVarV.K(cameraEngine) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(analyzer) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            aVar = analyzer;
            interfaceC4264q = cameraEngine;
            dVar2 = dVar;
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            androidx.compose.ui.d dVar3 = dVar;
            if (p020r2.o.J()) {
                p020r2.o.S(1541604487, i13, -1, "com.fourthline.visionx.internal.camera.CameraPreview (CameraPreview.kt:27)");
            }
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarF);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            CameraPreviewContent(cameraEngine, analyzer, dVar3, lVarV, ((i13 >> 3) & 126) | ((i13 << 6) & 896), 0);
            interfaceC4264q = cameraEngine;
            aVar = analyzer;
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar3;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.e7
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return E.CameraPreview$lambda$1(dVar2, interfaceC4264q, aVar, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraPreview$lambda$1(androidx.compose.ui.d dVar, InterfaceC4264q interfaceC4264q, androidx.camera.core.f.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        CameraPreview(dVar, interfaceC4264q, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    @SuppressLint({"RestrictedApi"})
    public static final void CameraPreviewContent(final InterfaceC4264q cameraEngine, final androidx.camera.core.f.a analyzer, androidx.compose.ui.d dVar, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        final androidx.compose.ui.d dVar2;
        p013kotlin.jvm.internal.s.k(cameraEngine, "cameraEngine");
        p013kotlin.jvm.internal.s.k(analyzer, "analyzer");
        p020r2.l lVarV = lVar.v(-745493958);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(cameraEngine) : lVarV.K(cameraEngine) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(analyzer) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(dVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            dVar2 = dVar;
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            androidx.compose.ui.d dVar3 = dVar;
            if (p020r2.o.J()) {
                p020r2.o.S(-745493958, i13, -1, "com.fourthline.visionx.internal.camera.CameraPreviewContent (CameraPreview.kt:43)");
            }
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) lVarV.U(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            lVarV.o(-348303218);
            boolean zK = ((i13 & 14) == 4 || ((i13 & 8) != 0 && lVarV.K(cameraEngine))) | lVarV.K(lifecycleOwner) | lVarV.K(analyzer);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.vision.internal.f7
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return E.CameraPreviewContent$lambda$4$lambda$3(cameraEngine, lifecycleOwner, analyzer, (Context) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.viewinterop.f.a((wn0.l) objI, dVar3, null, lVarV, (i13 >> 3) & 112, 4);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar3;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.g7
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return E.CameraPreviewContent$lambda$5(cameraEngine, analyzer, dVar2, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewView CameraPreviewContent$lambda$4$lambda$3(InterfaceC4264q interfaceC4264q, LifecycleOwner lifecycleOwner, androidx.camera.core.f.a aVar, Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        PreviewView previewView = new PreviewView(context);
        previewView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        interfaceC4264q.bindToPreview(previewView, lifecycleOwner, aVar);
        previewView.setImplementationMode(PreviewView.c.PERFORMANCE);
        previewView.setScaleType(PreviewView.e.FILL_CENTER);
        return previewView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 CameraPreviewContent$lambda$5(InterfaceC4264q interfaceC4264q, androidx.camera.core.f.a aVar, androidx.compose.ui.d dVar, int i11, int i12, p020r2.l lVar, int i13) {
        CameraPreviewContent(interfaceC4264q, aVar, dVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }
}
