package xf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0011\u001a\u00020\u00102\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Ltf/i;", "composition", "", "isPlaying", "restartOnPlay", "reverseOnRepeat", "Lxf/j;", "clipSpec", "", "speed", "", "iterations", "Lxf/i;", "cancellationBehavior", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "Lxf/h;", "c", "(Ltf/i;ZZZLxf/j;FILxf/i;ZZLr2/l;II)Lxf/h;", "wasPlaying", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: xf.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {73, 78}, m = "invokeSuspend", n = {}, s = {})
    static final class C2673a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123295n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f123296o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f123297p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ b f123298q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ tf.i f123299r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f123300s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f123301t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ float f123302u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ j f123303v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ i f123304w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f123305x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f123306y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2673a(boolean z11, boolean z12, b bVar, tf.i iVar, int i11, boolean z13, float f11, j jVar, i iVar2, boolean z14, p1<Boolean> p1Var, Continuation<? super C2673a> continuation) {
            super(2, continuation);
            this.f123296o = z11;
            this.f123297p = z12;
            this.f123298q = bVar;
            this.f123299r = iVar;
            this.f123300s = i11;
            this.f123301t = z13;
            this.f123302u = f11;
            this.f123303v = jVar;
            this.f123304w = iVar2;
            this.f123305x = z14;
            this.f123306y = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C2673a(this.f123296o, this.f123297p, this.f123298q, this.f123299r, this.f123300s, this.f123301t, this.f123302u, this.f123303v, this.f123304w, this.f123305x, this.f123306y, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        
            if (xf.b.a.a(r0, r2, 0, r3, r4, r5, r6, r7, false, r9, false, r11, r16, ch.qos.logback.core.net.SyslogConstants.SYSLOG_PORT, null) == r15) goto L25;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r12 = r16
                java.lang.Object r15 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r12.f123295n
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L20
                if (r0 == r2) goto L1c
                if (r0 != r1) goto L14
                jn0.t.b(r17)
                goto L70
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1c:
                jn0.t.b(r17)
                goto L3e
            L20:
                jn0.t.b(r17)
                boolean r0 = r12.f123296o
                if (r0 == 0) goto L3e
                r2.p1<java.lang.Boolean> r0 = r12.f123306y
                boolean r0 = xf.a.a(r0)
                if (r0 != 0) goto L3e
                boolean r0 = r12.f123297p
                if (r0 == 0) goto L3e
                xf.b r0 = r12.f123298q
                r12.f123295n = r2
                java.lang.Object r0 = xf.d.e(r0, r12)
                if (r0 != r15) goto L3e
                goto L6f
            L3e:
                r2.p1<java.lang.Boolean> r0 = r12.f123306y
                boolean r2 = r12.f123296o
                xf.a.b(r0, r2)
                boolean r0 = r12.f123296o
                if (r0 != 0) goto L4c
                jn0.h0 r0 = jn0.h0.f84049a
                return r0
            L4c:
                xf.b r0 = r12.f123298q
                tf.i r2 = r12.f123299r
                int r3 = r12.f123300s
                boolean r4 = r12.f123301t
                float r5 = r12.f123302u
                xf.j r6 = r12.f123303v
                float r7 = r0.getProgress()
                xf.i r9 = r12.f123304w
                boolean r11 = r12.f123305x
                r12.f123295n = r1
                r1 = r2
                r2 = 0
                r8 = 0
                r10 = 0
                r13 = 514(0x202, float:7.2E-43)
                r14 = 0
                java.lang.Object r0 = xf.b.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                if (r0 != r15) goto L70
            L6f:
                return r15
            L70:
                jn0.h0 r0 = jn0.h0.f84049a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: xf.a.C2673a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C2673a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final h c(tf.i iVar, boolean z11, boolean z12, boolean z13, j jVar, float f11, int i11, i iVar2, boolean z14, boolean z15, p020r2.l lVar, int i12, int i13) {
        lVar.H(683659508);
        boolean z16 = (i13 & 2) != 0 ? true : z11;
        boolean z17 = (i13 & 4) != 0 ? true : z12;
        boolean z18 = (i13 & 8) != 0 ? false : z13;
        j jVar2 = (i13 & 16) != 0 ? null : jVar;
        float f12 = (i13 & 32) != 0 ? 1.0f : f11;
        int i14 = (i13 & 64) != 0 ? 1 : i11;
        i iVar3 = (i13 & 128) != 0 ? i.Immediately : iVar2;
        boolean z19 = (i13 & 256) != 0 ? false : z14;
        boolean z21 = (i13 & 512) != 0 ? false : z15;
        if (p020r2.o.J()) {
            p020r2.o.S(683659508, i12, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i14 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i14 + ").").toString());
        }
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f12 + ".").toString());
        }
        b bVarD = d.d(lVar, 0);
        lVar.H(-180606964);
        Object objI = lVar.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(Boolean.valueOf(z16), null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        lVar.T();
        lVar.H(-180606834);
        if (!z19) {
            f12 /= hg.l.f((Context) lVar.U(AndroidCompositionLocals_androidKt.g()));
        }
        float f13 = f12;
        lVar.T();
        Function0.h(new Object[]{iVar, Boolean.valueOf(z16), jVar2, Float.valueOf(f13), Integer.valueOf(i14)}, new C2673a(z16, z17, bVarD, iVar, i14, z18, f13, jVar2, iVar3, z21, p1Var, null), lVar, 72);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return bVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }
}
