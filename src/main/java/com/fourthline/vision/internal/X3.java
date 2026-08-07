package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.Set;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public class X3 implements J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J5 f38077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J5 f38078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Try.Success f38079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I5 f38080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Try f38081e;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38084c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38086e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38084c = obj;
            this.f38086e |= Integer.MIN_VALUE;
            return X3.process$suspendImpl(X3.this, null, this);
        }
    }

    public X3(J5 stepOne, J5 stepTwo) {
        p013kotlin.jvm.internal.s.k(stepOne, "stepOne");
        p013kotlin.jvm.internal.s.k(stepTwo, "stepTwo");
        this.f38077a = stepOne;
        this.f38078b = stepTwo;
        this.f38080d = stepOne.getStepConfig();
        this.f38081e = TryKt.failure(AbstractC4255o4.f.a.f38693a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.K5>] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.fourthline.core.internal.Try] */
    /* JADX WARN: Type inference failed for: r4v21, types: [com.fourthline.core.internal.Try] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.K5>] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    private final Try<K5> getStepResultByPriority(Try<? extends K5>... tryArr) {
        ?? r11;
        ?? r12;
        ?? r13;
        Set<DocumentValidationError> validationErrors;
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
        Try.Success success = r12 instanceof Try.Success ? (Try.Success) r12 : null;
        if (success != null) {
            K5 k11 = (K5) success.getValue();
            if (k11 instanceof InterfaceC4163c2.a) {
                Try.Success success2 = this.f38079c;
                if (success2 != null) {
                    return success2;
                }
            } else if (k11 instanceof InterfaceC4163c2.b) {
                Try.Success success3 = this.f38079c;
                if (success3 != null) {
                    Object value = success3.getValue();
                    InterfaceC4163c2.b bVar = value instanceof InterfaceC4163c2.b ? (InterfaceC4163c2.b) value : null;
                    if (((bVar == null || (validationErrors = bVar.getValidationErrors()) == null) ? Integer.MAX_VALUE : validationErrors.size()) < ((InterfaceC4163c2.b) k11).getValidationErrors().size()) {
                        return success3;
                    }
                }
            }
            return success;
        }
        int length2 = tryArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length2) {
                r13 = 0;
                break;
            }
            r13 = tryArr[i12];
            if (r13.isSuccess()) {
                break;
            }
            i12++;
        }
        if (r13 == 0) {
            int length3 = tryArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length3) {
                    r13 = 0;
                    break;
                }
                r13 = tryArr[i13];
                Try.Failure failure = r13 instanceof Try.Failure ? (Try.Failure) r13 : null;
                if ((failure != null ? failure.getException() : null) instanceof AbstractC4255o4.a) {
                    break;
                }
                i13++;
            }
            if (r13 == 0) {
                for (?? r14 : tryArr) {
                    Try.Failure failure2 = r14 instanceof Try.Failure ? (Try.Failure) r14 : null;
                    if (!p013kotlin.jvm.internal.s.f(failure2 != null ? failure2.getException() : null, AbstractC4255o4.f.a.f38693a)) {
                        r11 = r14;
                        break;
                    }
                }
                return r11 == 0 ? this.f38081e : r11;
            }
        }
        return r13;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r8 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <SCANNER_STEP> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.X3 r6, android.media.Image r7, p013kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.K5>> r8) {
        /*
            boolean r0 = r8 instanceof com.fourthline.vision.internal.X3.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.vision.internal.X3$a r0 = (com.fourthline.vision.internal.X3.a) r0
            int r1 = r0.f38086e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38086e = r1
            goto L18
        L13:
            com.fourthline.vision.internal.X3$a r0 = new com.fourthline.vision.internal.X3$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38084c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f38086e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f38083b
            com.fourthline.core.internal.Try r6 = (com.fourthline.core.internal.Try) r6
            java.lang.Object r7 = r0.f38082a
            com.fourthline.vision.internal.X3 r7 = (com.fourthline.vision.internal.X3) r7
            jn0.t.b(r8)
            goto La3
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.f38083b
            r7 = r6
            android.media.Image r7 = (android.media.Image) r7
            java.lang.Object r6 = r0.f38082a
            com.fourthline.vision.internal.X3 r6 = (com.fourthline.vision.internal.X3) r6
            jn0.t.b(r8)
            goto L6d
        L4a:
            jn0.t.b(r8)
            boolean r8 = r6.isCompleted()
            if (r8 == 0) goto L56
            com.fourthline.core.internal.Try r6 = r6.f38081e
            return r6
        L56:
            com.fourthline.vision.internal.J5 r8 = r6.f38077a
            boolean r8 = r8.isCompleted()
            if (r8 != 0) goto L86
            com.fourthline.vision.internal.J5 r8 = r6.f38077a
            r0.f38082a = r6
            r0.f38083b = r7
            r0.f38086e = r4
            java.lang.Object r8 = r8.process(r7, r0)
            if (r8 != r1) goto L6d
            goto L9e
        L6d:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            boolean r2 = r8.isSuccess()
            if (r2 == 0) goto L88
            java.lang.String r2 = "null cannot be cast to non-null type com.fourthline.core.internal.Try.Success<com.fourthline.vision.internal.step.StepResult>"
            p013kotlin.jvm.internal.s.i(r8, r2)
            com.fourthline.core.internal.Try$Success r8 = (com.fourthline.core.internal.Try.Success) r8
            r6.f38079c = r8
            com.fourthline.vision.internal.J5 r8 = r6.f38077a
            r8.start()
            com.fourthline.core.internal.Try r8 = r6.f38081e
            goto L88
        L86:
            com.fourthline.core.internal.Try r8 = r6.f38081e
        L88:
            com.fourthline.vision.internal.J5 r2 = r6.f38078b
            boolean r2 = r2.isCompleted()
            if (r2 != 0) goto Laa
            com.fourthline.vision.internal.J5 r2 = r6.f38078b
            r0.f38082a = r6
            r0.f38083b = r8
            r0.f38086e = r3
            java.lang.Object r7 = r2.process(r7, r0)
            if (r7 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        La3:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto Lac
        Laa:
            com.fourthline.core.internal.Try r7 = r6.f38081e
        Lac:
            com.fourthline.core.internal.Try[] r7 = new com.fourthline.core.internal.Try[]{r8, r7}
            com.fourthline.core.internal.Try r6 = r6.getStepResultByPriority(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.X3.process$suspendImpl(com.fourthline.vision.internal.X3, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        return this.f38080d;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f38077a.isCompleted() && this.f38078b.isCompleted();
    }

    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        this.f38079c = null;
        this.f38077a.start();
        this.f38078b.start();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        this.f38077a.stop();
        this.f38078b.stop();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }
}
