package com.fourthline.vision.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import m3.Stroke;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.vision.internal.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4244n0 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.n0$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f38642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p020r2.y3 f38643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f38644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C4313x0 f38645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float[] f38646g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p020r2.p1<j3.i> p1Var, p020r2.y3<? extends wn0.a<j3.i>> y3Var, p020r2.p1<List<j3.i>> p1Var2, C4313x0 c4313x0, float[] fArr, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38642c = p1Var;
            this.f38643d = y3Var;
            this.f38644e = p1Var2;
            this.f38645f = c4313x0;
            this.f38646g = fArr;
        }

        private static final j3.i invokeSuspend$toTransformedComposeRect(j3.i iVar, float[] fArr) {
            return k3.n3.h(fArr, iVar);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f38642c, this.f38643d, this.f38644e, this.f38645f, this.f38646g, continuation);
            aVar.f38641b = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x0035 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x006e A[LOOP:0: B:15:0x0068->B:17:0x006e, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f38640a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r7.f38641b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r8)
                goto L36
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f38641b
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                r1 = r8
            L23:
                boolean r8 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r8 == 0) goto L84
                r7.f38641b = r1
                r7.f38640a = r2
                r3 = 50
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r3, r7)
                if (r8 != r0) goto L36
                return r0
            L36:
                r2.p1 r8 = r7.f38642c
                r2.y3 r3 = r7.f38643d
                java.lang.Object r3 = r3.getValue()
                wn0.a r3 = (wn0.a) r3
                java.lang.Object r3 = r3.invoke()
                j3.i r3 = (j3.i) r3
                float[] r4 = r7.f38646g
                j3.i r3 = invokeSuspend$toTransformedComposeRect(r3, r4)
                r8.setValue(r3)
                r2.p1 r8 = r7.f38644e
                com.fourthline.vision.internal.x0 r3 = r7.f38645f
                java.util.List r3 = r3.getDetections$fourthline_vision_release()
                float[] r4 = r7.f38646g
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = p013kotlin.collections.v.y(r3, r6)
                r5.<init>(r6)
                java.util.Iterator r3 = r3.iterator()
            L68:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L80
                java.lang.Object r6 = r3.next()
                com.fourthline.vision.internal.c4 r6 = (com.fourthline.vision.internal.C4165c4) r6
                j3.i r6 = com.fourthline.vision.internal.AbstractC4173d4.toComposeRect(r6)
                j3.i r6 = invokeSuspend$toTransformedComposeRect(r6, r4)
                r5.add(r6)
                goto L68
            L80:
                r8.setValue(r5)
                goto L23
            L84:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.AbstractC4244n0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    private static final void DebugView(androidx.compose.ui.d dVar, final j3.i iVar, final List<j3.i> list, final boolean z11, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(-1058103349);
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
            i13 |= lVarV.n(iVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(list) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.p(z11) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1058103349, i13, -1, "com.fourthline.vision.internal.ui.DebugView (ComposeDebugView.kt:63)");
            }
            lVarV.o(-111624410);
            boolean zK = ((i13 & 7168) == 2048) | ((i13 & 112) == 32) | lVarV.K(list);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.vision.internal.xa
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC4244n0.DebugView$lambda$7$lambda$6(z11, iVar, list, (m3.f) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            q1.i.a(dVar, (wn0.l) objI, lVarV, i13 & 14);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        final androidx.compose.ui.d dVar2 = dVar;
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.ya
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4244n0.DebugView$lambda$8(dVar2, iVar, list, z11, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 DebugView$lambda$7$lambda$6(boolean z11, j3.i iVar, List list, m3.f Canvas) {
        p013kotlin.jvm.internal.s.k(Canvas, "$this$Canvas");
        float f11 = z11 ? -1.0f : 1.0f;
        long jJ0 = Canvas.J0();
        m3.d drawContext = Canvas.getDrawContext();
        long jB = drawContext.b();
        drawContext.a().u();
        try {
            drawContext.getTransform().f(f11, 1.0f, jJ0);
            DebugView$lambda$7$lambda$6$drawRect(Canvas, iVar, k3.p1.INSTANCE.e());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DebugView$lambda$7$lambda$6$drawRect(Canvas, (j3.i) it.next(), k3.p1.INSTANCE.h());
            }
            drawContext.a().o();
            drawContext.f(jB);
            return jn0.h0.f84049a;
        } catch (Throwable th2) {
            drawContext.a().o();
            drawContext.f(jB);
            throw th2;
        }
    }

    private static final void DebugView$lambda$7$lambda$6$drawRect(m3.f fVar, j3.i iVar, long j11) {
        m3.f.C0(fVar, j11, iVar.m(), iVar.k(), BitmapDescriptorFactory.HUE_RED, new Stroke(fVar.O1(w4.h.g(1)), BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 DebugView$lambda$8(androidx.compose.ui.d dVar, j3.i iVar, List list, boolean z11, int i11, int i12, p020r2.l lVar, int i13) {
        DebugView(dVar, iVar, list, z11, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: renamed from: DebugViewStateHoister-FbeBA5I, reason: not valid java name */
    public static final void m92DebugViewStateHoisterFbeBA5I(final float[] recognitionToScreenCoordsMatrix, final wn0.a<j3.i> detectionAreaProvider, final boolean z11, final C4313x0 debugConsumer, p020r2.l lVar, final int i11) {
        int i12;
        p020r2.p1 p1Var;
        p013kotlin.jvm.internal.s.k(recognitionToScreenCoordsMatrix, "recognitionToScreenCoordsMatrix");
        p013kotlin.jvm.internal.s.k(detectionAreaProvider, "detectionAreaProvider");
        p013kotlin.jvm.internal.s.k(debugConsumer, "debugConsumer");
        p020r2.l lVarV = lVar.v(883913381);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(recognitionToScreenCoordsMatrix) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(detectionAreaProvider) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.p(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.K(debugConsumer) ? 2048 : 1024;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(883913381, i13, -1, "com.fourthline.vision.internal.ui.DebugViewStateHoister (ComposeDebugView.kt:26)");
            }
            p020r2.y3 y3VarO = p020r2.n3.o(detectionAreaProvider, lVarV, (i13 >> 3) & 14);
            lVarV.o(-1256813311);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(j3.i.INSTANCE.a(), null, 2, null);
                lVarV.B(objI);
            }
            p020r2.p1 p1Var2 = (p020r2.p1) objI;
            lVarV.l();
            lVarV.o(-1256811258);
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = p020r2.s3.d(p013kotlin.collections.v.m(), null, 2, null);
                lVarV.B(objI2);
            }
            p020r2.p1 p1Var3 = (p020r2.p1) objI2;
            lVarV.l();
            lVarV.o(-1256808251);
            boolean zK = lVarV.K(recognitionToScreenCoordsMatrix) | lVarV.n(y3VarO) | lVarV.K(debugConsumer);
            Object objI3 = lVarV.I();
            if (zK || objI3 == companion.a()) {
                p1Var = p1Var2;
                a aVar = new a(p1Var, y3VarO, p1Var3, debugConsumer, recognitionToScreenCoordsMatrix, null);
                lVarV.B(aVar);
                objI3 = aVar;
            } else {
                p1Var = p1Var2;
            }
            lVarV.l();
            Function0.g(debugConsumer, (wn0.p) objI3, lVarV, (i13 >> 9) & 14);
            DebugView(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), (j3.i) p1Var.getValue(), (List) p1Var3.getValue(), z11, lVarV, ((i13 << 3) & 7168) | 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.wa
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4244n0.DebugViewStateHoister_FbeBA5I$lambda$3(recognitionToScreenCoordsMatrix, detectionAreaProvider, z11, debugConsumer, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 DebugViewStateHoister_FbeBA5I$lambda$3(float[] fArr, wn0.a aVar, boolean z11, C4313x0 c4313x0, int i11, p020r2.l lVar, int i12) {
        m92DebugViewStateHoisterFbeBA5I(fArr, aVar, z11, c4313x0, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }
}
