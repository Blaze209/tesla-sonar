package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Q0 extends AbstractC4208i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q2 f37895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private L5 f37896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Try f37897h;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[L5.values().length];
            try {
                iArr[L5.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L5.SUCCEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L5.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37899b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f37901d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37899b = obj;
            this.f37901d |= Integer.MIN_VALUE;
            return Q0.this.process((Image) null, (Continuation<? super Try<? extends K5>>) this);
        }
    }

    public /* synthetic */ Q0(wn0.a aVar, Q2 q11, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, q11, (i11 & 4) != 0 ? null : visionDynamicStepsEvaluator);
    }

    private final void updateCompositeStepState(Try<? extends K5> r11) {
        L5 l11;
        if (r11 instanceof Try.Failure) {
            Throwable exception = ((Try.Failure) r11).getException();
            l11 = (!(exception instanceof AbstractC4255o4.d) && (exception instanceof AbstractC4255o4.a)) ? L5.FAILED : this.f37896g;
        } else {
            if (!(r11 instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            l11 = L5.SUCCEED;
        }
        this.f37896g = l11;
    }

    @Override // com.fourthline.vision.internal.AbstractC4208i, com.fourthline.vision.internal.InterfaceC4258p0
    public void moveToNext() throws AbstractC4255o4.a {
        L5 l11 = this.f37896g;
        int i11 = l11 == null ? -1 : a.$EnumSwitchMapping$0[l11.ordinal()];
        if (i11 != -1 && i11 != 1) {
            if (i11 == 2) {
                super.moveToNext();
                jn0.h0 h0Var = jn0.h0.f84049a;
                if (isCompleted()) {
                    return;
                }
                this.f37896g = L5.PROCESSING;
                return;
            }
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        super.stop();
        this.f37896g = L5.FAILED;
        throw new AbstractC4255o4.a(EnumC4241m4.MOVE_TO_NEXT_STEP_NOT_ALLOWED, null, 2, null);
    }

    @Override // com.fourthline.vision.internal.AbstractC4208i, com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }

    @Override // com.fourthline.vision.internal.AbstractC4208i, com.fourthline.vision.internal.InterfaceC4258p0
    public void reset() {
        super.reset();
        this.f37896g = null;
    }

    @Override // com.fourthline.vision.internal.AbstractC4208i, com.fourthline.vision.internal.InterfaceC4258p0
    public void resetStep() throws AbstractC4255o4.a {
        L5 l11 = this.f37896g;
        int i11 = l11 == null ? -1 : a.$EnumSwitchMapping$0[l11.ordinal()];
        if (i11 == -1 || i11 == 1) {
            super.stop();
            this.f37896g = L5.FAILED;
            throw new AbstractC4255o4.a(EnumC4241m4.RESET_CURRENT_STEP_NOT_ALLOWED, null, 2, null);
        }
        if (i11 != 2 && i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        super.stop();
        start();
    }

    @Override // com.fourthline.vision.internal.AbstractC4208i, com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        super.start();
        setCompleted(false);
        this.f37896g = L5.PROCESSING;
    }

    @Override // com.fourthline.vision.internal.AbstractC4208i, com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        super.stop();
        if (this.f37896g == L5.PROCESSING) {
            this.f37896g = L5.FAILED;
        }
        setCompleted(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(wn0.a<? extends List<? extends J5>> subStepsFactory, Q2 resultsPostProcessor, VisionDynamicStepsEvaluator<Object> visionDynamicStepsEvaluator) {
        super(subStepsFactory, visionDynamicStepsEvaluator);
        p013kotlin.jvm.internal.s.k(subStepsFactory, "subStepsFactory");
        p013kotlin.jvm.internal.s.k(resultsPostProcessor, "resultsPostProcessor");
        this.f37895f = resultsPostProcessor;
        this.f37897h = TryKt.failure(AbstractC4255o4.f.a.f38693a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r8 == r1) goto L34;
     */
    @Override // com.fourthline.vision.internal.AbstractC4208i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(android.media.Image r7, p013kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.K5>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.vision.internal.Q0.b
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.vision.internal.Q0$b r0 = (com.fourthline.vision.internal.Q0.b) r0
            int r1 = r0.f37901d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37901d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.Q0$b r0 = new com.fourthline.vision.internal.Q0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f37899b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37901d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f37898a
            com.fourthline.vision.internal.Q0 r7 = (com.fourthline.vision.internal.Q0) r7
            jn0.t.b(r8)
            goto L85
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f37898a
            com.fourthline.vision.internal.Q0 r7 = (com.fourthline.vision.internal.Q0) r7
            jn0.t.b(r8)
            goto L6e
        L40:
            jn0.t.b(r8)
            com.fourthline.vision.internal.L5 r8 = r6.f37896g
            r2 = -1
            if (r8 != 0) goto L4a
            r8 = r2
            goto L52
        L4a:
            int[] r5 = com.fourthline.vision.internal.Q0.a.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r5[r8]
        L52:
            if (r8 == r2) goto L88
            if (r8 == r4) goto L62
            if (r8 == r3) goto L88
            r7 = 3
            if (r8 != r7) goto L5c
            goto L88
        L5c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L62:
            r0.f37898a = r6
            r0.f37901d = r4
            java.lang.Object r8 = super.process(r7, r0)
            if (r8 != r1) goto L6d
            goto L84
        L6d:
            r7 = r6
        L6e:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            com.fourthline.vision.internal.Q2 r2 = r7.f37895f
            com.fourthline.vision.internal.I5 r4 = r7.getStepConfig()
            kotlin.Pair r8 = jn0.x.a(r8, r4)
            r0.f37898a = r7
            r0.f37901d = r3
            java.lang.Object r8 = r2.process(r8, r0)
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            goto L8b
        L88:
            com.fourthline.core.internal.Try r8 = r6.f37897h
            r7 = r6
        L8b:
            r7.updateCompositeStepState(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.Q0.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
