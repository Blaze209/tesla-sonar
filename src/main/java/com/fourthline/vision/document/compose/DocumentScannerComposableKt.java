package com.fourthline.vision.document.compose;

import android.os.Build;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.compose.DocumentScannerComposableKt;
import com.fourthline.vision.internal.T1;
import com.fourthline.vision.internal.U1;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerConfig;", "config", "Lkotlin/Function0;", "Lj3/i;", "documentDetectionAreaProvider", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "controls", "Lkotlin/Function1;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "Ljn0/h0;", "events", "content", "DocumentScanner", "(Lcom/fourthline/vision/document/DocumentScannerConfig;Lwn0/a;Lkotlinx/coroutines/flow/Flow;Lwn0/l;Lwn0/p;Lr2/l;I)V", "fourthline-vision_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DocumentScannerComposableKt {
    public static final void DocumentScanner(DocumentScannerConfig config, a<i> documentDetectionAreaProvider, Flow<? extends DocumentScannerControl> controls, l<? super DocumentScannerEvent, h0> events, p<? super p020r2.l, ? super Integer, h0> content, p020r2.l lVar, final int i11) {
        int i12;
        a<i> aVar;
        Flow<? extends DocumentScannerControl> flow;
        l<? super DocumentScannerEvent, h0> lVar2;
        p<? super p020r2.l, ? super Integer, h0> pVar;
        final DocumentScannerConfig documentScannerConfig;
        s.k(config, "config");
        s.k(documentDetectionAreaProvider, "documentDetectionAreaProvider");
        s.k(controls, "controls");
        s.k(events, "events");
        s.k(content, "content");
        p020r2.l lVarV = lVar.v(1673517094);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(config) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(documentDetectionAreaProvider) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(controls) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.K(events) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= lVarV.K(content) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i12 & 9363) == 9362 && lVarV.b()) {
            lVarV.j();
            aVar = documentDetectionAreaProvider;
            flow = controls;
            lVar2 = events;
            pVar = content;
            documentScannerConfig = config;
        } else {
            if (o.J()) {
                o.S(1673517094, i12, -1, "com.fourthline.vision.document.compose.DocumentScanner (DocumentScannerComposable.kt:35)");
            }
            if (!config.getInternalConfig().getCameraX() || Build.VERSION.SDK_INT < 28) {
                aVar = documentDetectionAreaProvider;
                flow = controls;
                lVar2 = events;
                pVar = content;
                documentScannerConfig = config;
                lVarV.o(-1804089932);
                U1.LegacyDocumentScanner(documentScannerConfig, aVar, flow, lVar2, pVar, lVarV, i12 & 65534);
                lVarV.l();
            } else {
                lVarV.o(-1804199021);
                aVar = documentDetectionAreaProvider;
                flow = controls;
                lVar2 = events;
                pVar = content;
                T1.CameraXDocumentScanner(config, aVar, flow, lVar2, pVar, lVarV, i12 & 65534);
                documentScannerConfig = config;
                lVarV.l();
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            final a<i> aVar2 = aVar;
            final Flow<? extends DocumentScannerControl> flow2 = flow;
            final l<? super DocumentScannerEvent, h0> lVar3 = lVar2;
            final p<? super p020r2.l, ? super Integer, h0> pVar2 = pVar;
            w2VarX.a(new p() { // from class: up.a
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentScannerComposableKt.DocumentScanner$lambda$0(documentScannerConfig, aVar2, flow2, lVar3, pVar2, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 DocumentScanner$lambda$0(DocumentScannerConfig documentScannerConfig, a aVar, Flow flow, l lVar, p pVar, int i11, p020r2.l lVar2, int i12) {
        DocumentScanner(documentScannerConfig, aVar, flow, lVar, pVar, lVar2, k2.a(i11 | 1));
        return h0.f84049a;
    }
}
