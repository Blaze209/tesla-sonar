package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import java.util.List;
import java.util.Objects;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4171d2 implements J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I5 f38214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O2 f38215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2 f38216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Try f38218e;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.d2$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f38222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f38224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38225g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f38227i;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38225g = obj;
            this.f38227i |= Integer.MIN_VALUE;
            return C4171d2.this.process((Image) null, (Continuation<? super Try<? extends K5>>) this);
        }
    }

    public C4171d2(I5 stepConfig, O2 imageTooDarkConsumer, W2 isSteadyWarningInteractor) {
        p013kotlin.jvm.internal.s.k(stepConfig, "stepConfig");
        p013kotlin.jvm.internal.s.k(imageTooDarkConsumer, "imageTooDarkConsumer");
        p013kotlin.jvm.internal.s.k(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        this.f38214a = stepConfig;
        this.f38215b = imageTooDarkConsumer;
        this.f38216c = isSteadyWarningInteractor;
        this.f38218e = TryKt.failure(AbstractC4255o4.f.a.f38693a);
    }

    @Override // com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        return this.f38214a;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f38217d;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }

    public void setCompleted(boolean z11) {
        this.f38217d = z11;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        setCompleted(false);
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        setCompleted(true);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) {
        a aVar;
        C4171d2 c4171d2;
        Enum[] enumArr;
        Enum[] enumArr2;
        int i11;
        int i12;
        Enum[] enumArr3;
        Enum r12;
        Object[] objArr;
        Object[] objArr2;
        C4171d2 c4171d3;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f38227i;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f38227i = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objProcess = aVar.f38225g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = aVar.f38227i;
        int i15 = 1;
        if (i14 != 0) {
            if (i14 == 1) {
                i12 = aVar.f38224f;
                i11 = aVar.f38223e;
                enumArr3 = (Enum[]) aVar.f38222d;
                enumArr = (Enum[]) aVar.f38221c;
                enumArr2 = (Enum[]) aVar.f38220b;
                c4171d2 = (C4171d2) aVar.f38219a;
                try {
                    jn0.t.b(objProcess);
                    r12 = null;
                } catch (AbstractC4255o4.g e11) {
                    e = e11;
                    r12 = (Enum) p013kotlin.collections.v.q0(e.getWarnings());
                    i12 = i11;
                    enumArr3 = enumArr;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i15 = aVar.f38223e;
                objArr = (Enum[]) aVar.f38221c;
                objArr2 = (Enum[]) aVar.f38220b;
                c4171d3 = (C4171d2) aVar.f38219a;
                jn0.t.b(objProcess);
            }
            objArr[i15] = p013kotlin.collections.v.q0((List) objProcess);
            List listR = p013kotlin.collections.v.r(objArr2);
            p013kotlin.jvm.internal.s.i(listR, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.document.DocumentScannerStepWarning>");
            return listR.isEmpty() ? c4171d3.f38218e : TryKt.failure(new AbstractC4255o4.g(listR, null, 2, null));
        }
        jn0.t.b(objProcess);
        if (C4171d2.class.isAnonymousClass()) {
            String name = C4171d2.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4171d2.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(image);
        Enum[] enumArr4 = new Enum[2];
        try {
            O2 o11 = this.f38215b;
            aVar.f38219a = this;
            aVar.f38220b = enumArr4;
            aVar.f38221c = enumArr4;
            aVar.f38222d = enumArr4;
            aVar.f38223e = 0;
            aVar.f38224f = 0;
            aVar.f38227i = 1;
            if (o11.consume(image, (Continuation<? super jn0.h0>) aVar) != coroutine_suspended) {
                c4171d2 = this;
                enumArr2 = enumArr4;
                i12 = 0;
                enumArr3 = enumArr2;
                r12 = null;
            }
        } catch (AbstractC4255o4.g e12) {
            e = e12;
            c4171d2 = this;
            enumArr = enumArr4;
            enumArr2 = enumArr;
            i11 = 0;
            r12 = (Enum) p013kotlin.collections.v.q0(e.getWarnings());
            i12 = i11;
            enumArr3 = enumArr;
        }
        return coroutine_suspended;
        enumArr3[i12] = r12;
        W2 w11 = c4171d2.f38216c;
        List<? extends T0> listM = p013kotlin.collections.v.m();
        aVar.f38219a = c4171d2;
        aVar.f38220b = enumArr2;
        aVar.f38221c = enumArr2;
        aVar.f38222d = null;
        aVar.f38223e = 1;
        aVar.f38227i = 2;
        objProcess = w11.process(listM, (Continuation<? super List<? extends DocumentScannerStepWarning>>) aVar);
        if (objProcess != coroutine_suspended) {
            objArr = enumArr2;
            objArr2 = objArr;
            c4171d3 = c4171d2;
            objArr[i15] = p013kotlin.collections.v.q0((List) objProcess);
            List listR2 = p013kotlin.collections.v.r(objArr2);
            p013kotlin.jvm.internal.s.i(listR2, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.document.DocumentScannerStepWarning>");
            if (listR2.isEmpty()) {
            }
        }
        return coroutine_suspended;
    }
}
