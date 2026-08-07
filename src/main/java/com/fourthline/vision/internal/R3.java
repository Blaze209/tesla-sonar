package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public class R3 implements J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J5 f37919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J5 f37920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I5 f37921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Try f37922d;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37925c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37927e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37925c = obj;
            this.f37927e |= Integer.MIN_VALUE;
            return R3.process$suspendImpl(R3.this, null, this);
        }
    }

    public R3(J5 stepOne, J5 stepTwo) {
        p013kotlin.jvm.internal.s.k(stepOne, "stepOne");
        p013kotlin.jvm.internal.s.k(stepTwo, "stepTwo");
        this.f37919a = stepOne;
        this.f37920b = stepTwo;
        this.f37921c = stepOne.getStepConfig();
        this.f37922d = TryKt.failure(AbstractC4255o4.f.a.f38693a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.K5>] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.fourthline.core.internal.Try] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.K5>] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    private final Try<K5> getStepResultByPriority(Try<? extends K5>... tryArr) {
        ?? r11;
        ?? r12;
        int length = tryArr.length;
        int i11 = 0;
        while (true) {
            r11 = 0;
            if (i11 >= length) {
                r12 = 0;
                break;
            }
            r12 = tryArr[i11];
            if (r12.isSuccess()) {
                break;
            }
            i11++;
        }
        if (r12 == 0) {
            int length2 = tryArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    r12 = 0;
                    break;
                }
                r12 = tryArr[i12];
                Try.Failure failure = r12 instanceof Try.Failure ? (Try.Failure) r12 : null;
                if ((failure != null ? failure.getException() : null) instanceof AbstractC4255o4.a) {
                    break;
                }
                i12++;
            }
            if (r12 == 0) {
                for (?? r13 : tryArr) {
                    Try.Failure failure2 = r13 instanceof Try.Failure ? (Try.Failure) r13 : null;
                    if (!p013kotlin.jvm.internal.s.f(failure2 != null ? failure2.getException() : null, AbstractC4255o4.f.a.f38693a)) {
                        r11 = r13;
                        break;
                    }
                }
                return r11 == 0 ? this.f37922d : r11;
            }
        }
        return r12;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r8 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <SCANNER_STEP> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.R3 r6, android.media.Image r7, p013kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.K5>> r8) {
        /*
            boolean r0 = r8 instanceof com.fourthline.vision.internal.R3.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.vision.internal.R3$a r0 = (com.fourthline.vision.internal.R3.a) r0
            int r1 = r0.f37927e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37927e = r1
            goto L18
        L13:
            com.fourthline.vision.internal.R3$a r0 = new com.fourthline.vision.internal.R3$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f37925c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37927e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f37924b
            com.fourthline.core.internal.Try r6 = (com.fourthline.core.internal.Try) r6
            java.lang.Object r7 = r0.f37923a
            com.fourthline.vision.internal.R3 r7 = (com.fourthline.vision.internal.R3) r7
            jn0.t.b(r8)
            goto L8c
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f37924b
            r7 = r6
            android.media.Image r7 = (android.media.Image) r7
            java.lang.Object r6 = r0.f37923a
            com.fourthline.vision.internal.R3 r6 = (com.fourthline.vision.internal.R3) r6
            jn0.t.b(r8)
            goto L6c
        L49:
            jn0.t.b(r8)
            boolean r8 = r6.isCompleted()
            if (r8 == 0) goto L55
            com.fourthline.core.internal.Try r6 = r6.f37922d
            return r6
        L55:
            com.fourthline.vision.internal.J5 r8 = r6.f37919a
            boolean r8 = r8.isCompleted()
            if (r8 != 0) goto L6f
            com.fourthline.vision.internal.J5 r8 = r6.f37919a
            r0.f37923a = r6
            r0.f37924b = r7
            r0.f37927e = r4
            java.lang.Object r8 = r8.process(r7, r0)
            if (r8 != r1) goto L6c
            goto L87
        L6c:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            goto L71
        L6f:
            com.fourthline.core.internal.Try r8 = r6.f37922d
        L71:
            com.fourthline.vision.internal.J5 r2 = r6.f37920b
            boolean r2 = r2.isCompleted()
            if (r2 != 0) goto L93
            com.fourthline.vision.internal.J5 r2 = r6.f37920b
            r0.f37923a = r6
            r0.f37924b = r8
            r0.f37927e = r3
            java.lang.Object r7 = r2.process(r7, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L8c:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L95
        L93:
            com.fourthline.core.internal.Try r7 = r6.f37922d
        L95:
            com.fourthline.core.internal.Try[] r7 = new com.fourthline.core.internal.Try[]{r8, r7}
            com.fourthline.core.internal.Try r6 = r6.getStepResultByPriority(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.R3.process$suspendImpl(com.fourthline.vision.internal.R3, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        return this.f37921c;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f37919a.isCompleted() && this.f37920b.isCompleted();
    }

    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        this.f37919a.start();
        this.f37920b.start();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        this.f37919a.stop();
        this.f37920b.stop();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }
}
