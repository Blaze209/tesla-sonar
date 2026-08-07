package com.fourthline.vision.selfie.compose;

import android.os.Build;
import com.fourthline.vision.internal.AbstractC4221j5;
import com.fourthline.vision.internal.Z2;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.compose.SelfieScannerComposableKt;
import j3.i;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import wn0.a;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "config", "Lkotlin/Function0;", "Lj3/i;", "faceDetectionAreaProvider", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerControl;", "controls", "Lkotlin/Function1;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent;", "Ljn0/h0;", "events", "content", "SelfieScanner", "(Lcom/fourthline/vision/selfie/SelfieScannerConfig;Lwn0/a;Lkotlinx/coroutines/flow/Flow;Lwn0/l;Lwn0/p;Lr2/l;II)V", "fourthline-vision_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SelfieScannerComposableKt {
    public static final void SelfieScanner(SelfieScannerConfig selfieScannerConfig, final a<i> faceDetectionAreaProvider, final Flow<? extends SelfieScannerControl> controls, final l<? super SelfieScannerEvent, h0> events, final p<? super p020r2.l, ? super Integer, h0> content, p020r2.l lVar, final int i11, final int i12) {
        SelfieScannerConfig selfieScannerConfig2;
        int i13;
        SelfieScannerConfig selfieScannerConfig3;
        final SelfieScannerConfig selfieScannerConfig4;
        s.k(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        s.k(controls, "controls");
        s.k(events, "events");
        s.k(content, "content");
        p020r2.l lVarV = lVar.v(1450375834);
        if ((i11 & 6) == 0) {
            if ((i12 & 1) == 0) {
                selfieScannerConfig2 = selfieScannerConfig;
                int i14 = lVarV.K(selfieScannerConfig2) ? 4 : 2;
                i13 = i14 | i11;
            } else {
                selfieScannerConfig2 = selfieScannerConfig;
            }
            i13 = i14 | i11;
        } else {
            selfieScannerConfig2 = selfieScannerConfig;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(faceDetectionAreaProvider) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(controls) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(events) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= lVarV.K(content) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i13 & 9363) == 9362 && lVarV.b()) {
            lVarV.j();
            selfieScannerConfig4 = selfieScannerConfig2;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0 && !lVarV.k()) {
                lVarV.j();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
            } else if ((i12 & 1) != 0) {
                i13 &= -15;
                selfieScannerConfig2 = new SelfieScannerConfig(false, null, null, false, 15, null);
            }
            lVarV.C();
            if (o.J()) {
                o.S(1450375834, i13, -1, "com.fourthline.vision.selfie.compose.SelfieScanner (SelfieScannerComposable.kt:36)");
            }
            if (!selfieScannerConfig2.getInternalConfig().getCameraX() || Build.VERSION.SDK_INT < 28) {
                selfieScannerConfig3 = selfieScannerConfig2;
                lVarV.o(-1607518758);
                Z2.LegacySelfieScanner(selfieScannerConfig3, faceDetectionAreaProvider, controls, events, content, lVarV, i13 & 65534);
                lVarV.l();
            } else {
                lVarV.o(-1607621895);
                selfieScannerConfig3 = selfieScannerConfig2;
                AbstractC4221j5.CameraXSelfieScanner(selfieScannerConfig3, faceDetectionAreaProvider, controls, events, content, lVarV, i13 & 65534);
                lVarV.l();
            }
            if (o.J()) {
                o.R();
            }
            selfieScannerConfig4 = selfieScannerConfig3;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new p() { // from class: vp.a
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return SelfieScannerComposableKt.SelfieScanner$lambda$0(selfieScannerConfig4, faceDetectionAreaProvider, controls, events, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 SelfieScanner$lambda$0(SelfieScannerConfig selfieScannerConfig, a aVar, Flow flow, l lVar, p pVar, int i11, int i12, p020r2.l lVar2, int i13) {
        SelfieScanner(selfieScannerConfig, aVar, flow, lVar, pVar, lVar2, k2.a(i11 | 1), i12);
        return h0.f84049a;
    }
}
