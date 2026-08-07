package com.fourthline.vision.internal;

import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Set;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4239m2 implements InterfaceC4232l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4232l2[] f38548a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.m2$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f38552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f38554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38555g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f38557i;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38555g = obj;
            this.f38557i |= Integer.MIN_VALUE;
            return C4239m2.this.validate(null, null, this);
        }
    }

    public C4239m2(InterfaceC4232l2... validators) {
        p013kotlin.jvm.internal.s.k(validators, "validators");
        this.f38548a = validators;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2
    public DocumentValidationError toDocumentValidationError(OcrValidationError ocrValidationError, List<? extends ValidationError> list) {
        return InterfaceC4232l2.a.toDocumentValidationError(this, ocrValidationError, list);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2
    public Set<DocumentValidationError> toDocumentValidationErrors(Set<? extends OcrValidationError> set, List<? extends ValidationError> list) {
        return InterfaceC4232l2.a.toDocumentValidationErrors(this, set, list);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:20:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.fourthline.vision.internal.InterfaceC4232l2, com.fourthline.vision.internal.T5
    public java.lang.Object validate(com.fourthline.vision.internal.K5 r9, com.fourthline.vision.internal.I5 r10, p013kotlin.coroutines.Continuation<? super java.util.Set<? extends com.fourthline.vision.document.DocumentValidationError>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.fourthline.vision.internal.C4239m2.a
            if (r0 == 0) goto L13
            r0 = r11
            com.fourthline.vision.internal.m2$a r0 = (com.fourthline.vision.internal.C4239m2.a) r0
            int r1 = r0.f38557i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38557i = r1
            goto L18
        L13:
            com.fourthline.vision.internal.m2$a r0 = new com.fourthline.vision.internal.m2$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f38555g
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f38557i
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            int r9 = r0.f38554f
            int r10 = r0.f38553e
            java.lang.Object r2 = r0.f38552d
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.f38551c
            com.fourthline.vision.internal.l2[] r4 = (com.fourthline.vision.internal.InterfaceC4232l2[]) r4
            java.lang.Object r5 = r0.f38550b
            com.fourthline.vision.internal.I5 r5 = (com.fourthline.vision.internal.I5) r5
            java.lang.Object r6 = r0.f38549a
            com.fourthline.vision.internal.K5 r6 = (com.fourthline.vision.internal.K5) r6
            jn0.t.b(r11)
            goto L73
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L45:
            jn0.t.b(r11)
            com.fourthline.vision.internal.l2[] r11 = r8.f38548a
            java.util.Set r2 = p013kotlin.collections.d1.d()
            int r4 = r11.length
            r5 = 0
            r7 = r10
            r10 = r9
            r9 = r4
            r4 = r11
            r11 = r7
        L55:
            if (r5 >= r9) goto L7e
            r6 = r4[r5]
            r0.f38549a = r10
            r0.f38550b = r11
            r0.f38551c = r4
            r0.f38552d = r2
            r0.f38553e = r5
            r0.f38554f = r9
            r0.f38557i = r3
            java.lang.Object r6 = r6.validate(r10, r11, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            r7 = r6
            r6 = r10
            r10 = r5
            r5 = r11
            r11 = r7
        L73:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Set r2 = p013kotlin.collections.d1.n(r2, r11)
            int r10 = r10 + r3
            r11 = r5
            r5 = r10
            r10 = r6
            goto L55
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.C4239m2.validate(com.fourthline.vision.internal.K5, com.fourthline.vision.internal.I5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
