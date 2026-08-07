package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4290t5 implements J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC4222k f38901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J5 f38902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J5 f38903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private J5 f38904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Try f38905e;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.t5$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38908c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38910e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38908c = obj;
            this.f38910e |= Integer.MIN_VALUE;
            return C4290t5.process$suspendImpl(C4290t5.this, null, this);
        }
    }

    public C4290t5(AbstractC4222k combinedTimeoutPrecondition, J5 initialStepInteractor, J5 afterTriggerStepInteractor) {
        p013kotlin.jvm.internal.s.k(combinedTimeoutPrecondition, "combinedTimeoutPrecondition");
        p013kotlin.jvm.internal.s.k(initialStepInteractor, "initialStepInteractor");
        p013kotlin.jvm.internal.s.k(afterTriggerStepInteractor, "afterTriggerStepInteractor");
        this.f38901a = combinedTimeoutPrecondition;
        this.f38902b = initialStepInteractor;
        this.f38903c = afterTriggerStepInteractor;
        this.f38905e = TryKt.failure(AbstractC4255o4.f.a.f38693a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r7 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <SCANNER_STEP> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.C4290t5 r5, android.media.Image r6, p013kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.K5>> r7) {
        /*
            boolean r0 = r7 instanceof com.fourthline.vision.internal.C4290t5.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.vision.internal.t5$a r0 = (com.fourthline.vision.internal.C4290t5.a) r0
            int r1 = r0.f38910e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38910e = r1
            goto L18
        L13:
            com.fourthline.vision.internal.t5$a r0 = new com.fourthline.vision.internal.t5$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38908c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f38910e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f38906a
            com.fourthline.vision.internal.t5 r5 = (com.fourthline.vision.internal.C4290t5) r5
            jn0.t.b(r7)
            goto L74
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f38907b
            r6 = r5
            android.media.Image r6 = (android.media.Image) r6
            java.lang.Object r5 = r0.f38906a
            com.fourthline.vision.internal.t5 r5 = (com.fourthline.vision.internal.C4290t5) r5
            jn0.t.b(r7)
            goto L62
        L45:
            jn0.t.b(r7)
            boolean r7 = r5.isCompleted()
            if (r7 == 0) goto L51
            com.fourthline.core.internal.Try r5 = r5.f38905e
            return r5
        L51:
            com.fourthline.vision.internal.k r7 = r5.f38901a
            jn0.h0 r2 = jn0.h0.f84049a
            r0.f38906a = r5
            r0.f38907b = r6
            r0.f38910e = r4
            java.lang.Object r7 = r7.consume(r2, r0)
            if (r7 != r1) goto L62
            goto L73
        L62:
            com.fourthline.vision.internal.J5 r7 = r5.f38904d
            if (r7 == 0) goto L7c
            r0.f38906a = r5
            r2 = 0
            r0.f38907b = r2
            r0.f38910e = r3
            java.lang.Object r7 = r7.process(r6, r0)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            com.fourthline.core.internal.Try r7 = (com.fourthline.core.internal.Try) r7
            if (r7 == 0) goto L7c
            r5.switchStepsIfTimeout(r7)
            return r7
        L7c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Processing had started before step started"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.C4290t5.process$suspendImpl(com.fourthline.vision.internal.t5, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void switchSteps() {
        J5 j11 = this.f38904d;
        if (j11 != this.f38903c) {
            if (j11 != null) {
                j11.stop();
            }
            J5 j12 = this.f38903c;
            j12.start();
            this.f38904d = j12;
        }
    }

    private final void switchStepsIfTimeout(Try<? extends K5> r11) {
        TryKt.handleError(r11, new wn0.l() { // from class: com.fourthline.vision.internal.mb
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4290t5.switchStepsIfTimeout$lambda$0(this.f38636a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 switchStepsIfTimeout$lambda$0(C4290t5 c4290t5, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof AbstractC4255o4.d) {
            c4290t5.switchSteps();
        }
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        I5 stepConfig;
        J5 j11 = this.f38904d;
        return (j11 == null || (stepConfig = j11.getStepConfig()) == null) ? this.f38902b.getStepConfig() : stepConfig;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        J5 j11 = this.f38904d;
        if (j11 != null) {
            return j11.isCompleted();
        }
        return false;
    }

    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        this.f38901a.start();
        J5 j11 = this.f38902b;
        this.f38904d = j11;
        if (j11 != null) {
            j11.start();
        }
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        this.f38901a.stop();
        J5 j11 = this.f38904d;
        if (j11 != null) {
            j11.stop();
        }
        this.f38902b.stop();
        this.f38903c.stop();
    }

    public String toString() {
        return getStepConfig().toString();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }
}
