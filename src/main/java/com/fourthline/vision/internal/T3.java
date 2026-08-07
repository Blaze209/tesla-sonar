package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T3 {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f37987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, wn0.a<jn0.h0> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37986b = z11;
            this.f37987c = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f37986b, this.f37987c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f37985a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (!this.f37986b) {
                this.f37987c.invoke();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public static final void PlayServicesGate(final wn0.a<jn0.h0> onCheckFailed, final wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(onCheckFailed, "onCheckFailed");
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(1256315143);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(onCheckFailed) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1256315143, i12, -1, "com.fourthline.visionx.internal.PlayServicesGate (PlayServicesGate.kt:15)");
            }
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(-1874658027);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new S3(context);
                lVarV.B(objI);
            }
            lVarV.l();
            Boolean bool = ((S3) objI).get();
            boolean zBooleanValue = bool.booleanValue();
            lVarV.o(-1874654425);
            if (zBooleanValue) {
                content.invoke(lVarV, Integer.valueOf((i12 >> 3) & 14));
            }
            lVarV.l();
            lVarV.o(-1874651962);
            boolean zP = ((i12 & 14) == 4) | lVarV.p(zBooleanValue);
            Object objI2 = lVarV.I();
            if (zP || objI2 == companion.a()) {
                objI2 = new a(zBooleanValue, onCheckFailed, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(bool, (wn0.p) objI2, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.vision.internal.n8
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return T3.PlayServicesGate$lambda$2(onCheckFailed, content, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 PlayServicesGate$lambda$2(wn0.a aVar, wn0.p pVar, int i11, p020r2.l lVar, int i12) {
        PlayServicesGate(aVar, pVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }
}
