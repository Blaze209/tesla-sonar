package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.vision.internal.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4278s0 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s0$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f38825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecordingType f38826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l f38827d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, RecordingType recordingType, wn0.l<? super t6, jn0.h0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38825b = context;
            this.f38826c = recordingType;
            this.f38827d = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f38825b, this.f38826c, this.f38827d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f38824a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            AbstractC4278s0.checkVisionPermissions(this.f38825b, this.f38826c, this.f38827d);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public static final void PermissionGate(final RecordingType recordingType, final wn0.l<? super t6, jn0.h0> onPermissionDenied, final wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(recordingType, "recordingType");
        p013kotlin.jvm.internal.s.k(onPermissionDenied, "onPermissionDenied");
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(-1072754272);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(recordingType) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(onPermissionDenied) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(content) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1072754272, i12, -1, "com.fourthline.vision.internal.PermissionGate (ContextExtensions.kt:51)");
            }
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            kq.a aVarA = kq.b.a(RecordingExtensionsKt.getRequiredPermissions(recordingType), null, lVarV, 0, 2);
            lVarV.o(1843047761);
            boolean zK = ((i12 & 14) == 4) | lVarV.K(context) | ((i12 & 112) == 32);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(context, recordingType, onPermissionDenied, null);
                lVarV.B(objI);
            }
            lVarV.l();
            Function0.g(aVarA, (wn0.p) objI, lVarV, 0);
            if (aVarA.b()) {
                content.invoke(lVarV, Integer.valueOf((i12 >> 6) & 14));
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.ib
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4278s0.PermissionGate$lambda$3(recordingType, onPermissionDenied, content, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 PermissionGate$lambda$3(RecordingType recordingType, wn0.l lVar, wn0.p pVar, int i11, p020r2.l lVar2, int i12) {
        PermissionGate(recordingType, lVar, pVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void checkVisionPermissions(Context context, RecordingType recordingType, wn0.l<? super t6, jn0.h0> onPermissionDenied) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(recordingType, "recordingType");
        p013kotlin.jvm.internal.s.k(onPermissionDenied, "onPermissionDenied");
        if (checkVisionPermissions$isPermissionDenied("android.permission.CAMERA", context)) {
            onPermissionDenied.invoke(t6.CAMERA);
        } else if (recordingType == RecordingType.VIDEO_WITH_AUDIO && checkVisionPermissions$isPermissionDenied("android.permission.RECORD_AUDIO", context)) {
            onPermissionDenied.invoke(t6.RECORD_AUDIO);
        }
    }

    private static final boolean checkVisionPermissions$isPermissionDenied(String str, Context context) {
        return androidx.core.content.f.b(context, str) != 0;
    }
}
