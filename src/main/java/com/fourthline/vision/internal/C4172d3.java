package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4172d3 implements J5, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4234l4 f38228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f38229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q2 f38230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I5 f38231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CoroutineContext f38232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38233f;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.d3$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f38237d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f38239f;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38237d = obj;
            this.f38239f |= Integer.MIN_VALUE;
            return C4172d3.this.process((Image) null, (Continuation<? super Try<? extends K5>>) this);
        }
    }

    public C4172d3(InterfaceC4234l4 scannerDetectionAreaProvider, List<? extends G5> preconditions, Q2 processor, I5 stepConfig, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(preconditions, "preconditions");
        p013kotlin.jvm.internal.s.k(processor, "processor");
        p013kotlin.jvm.internal.s.k(stepConfig, "stepConfig");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f38228a = scannerDetectionAreaProvider;
        this.f38229b = preconditions;
        this.f38230c = processor;
        this.f38231d = stepConfig;
        this.f38232e = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f38232e;
    }

    @Override // com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        return this.f38231d;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f38233f;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }

    public void setCompleted(boolean z11) {
        this.f38233f = z11;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        if (C4172d3.class.isAnonymousClass()) {
            String name = C4172d3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4172d3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        setCompleted(false);
        Iterator it = this.f38229b.iterator();
        while (it.hasNext()) {
            ((G5) it.next()).start();
        }
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        if (C4172d3.class.isAnonymousClass()) {
            String name = C4172d3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4172d3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Iterator it = this.f38229b.iterator();
        while (it.hasNext()) {
            ((G5) it.next()).stop();
        }
        this.f38230c.stop();
        setCompleted(true);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) throws Throwable {
        a aVar;
        C4172d3 c4172d3;
        Image image2;
        Iterator it;
        C4172d3 c4172d4;
        C4172d3 c4172d5;
        Try failure;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38239f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38239f = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f38237d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38239f;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (C4172d3.class.isAnonymousClass()) {
                String name = C4172d3.class.getName();
                int length = name.length();
                p013kotlin.jvm.internal.s.h(name);
                if (length > 23) {
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                String simpleName = C4172d3.class.getSimpleName();
                int length2 = simpleName.length();
                p013kotlin.jvm.internal.s.h(simpleName);
                if (length2 > 23) {
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
            Objects.toString(image);
            if (isCompleted()) {
                return TryKt.failure(AbstractC4255o4.f.a.f38693a);
            }
            Try.Companion companion = Try.INSTANCE;
            try {
                image2 = image;
                it = this.f38229b.iterator();
                c4172d4 = this;
            } catch (Throwable th2) {
                th = th2;
                c4172d3 = this;
                c4172d5 = c4172d3;
                th = th;
                if (th instanceof VirtualMachineError) {
                }
                throw th;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4172d3 = (C4172d3) aVar.f38234a;
                try {
                    jn0.t.b(obj);
                    failure = new Try.Success((K5) obj);
                } catch (Throwable th3) {
                    th = th3;
                    c4172d5 = c4172d3;
                    th = th;
                    if (th instanceof VirtualMachineError) {
                    }
                    throw th;
                }
                if (failure.isSuccess()) {
                    c4172d3.setCompleted(true);
                }
                return failure;
            }
            it = (Iterator) aVar.f38236c;
            Image image3 = (Image) aVar.f38235b;
            c4172d5 = (C4172d3) aVar.f38234a;
            try {
                jn0.t.b(obj);
                image2 = image3;
                c4172d4 = c4172d5;
            } catch (Throwable th4) {
                th = th4;
                if (th instanceof VirtualMachineError) {
                }
                throw th;
            }
        }
        while (it.hasNext()) {
            try {
                G5 g11 = (G5) it.next();
                jn0.h0 h0Var = jn0.h0.f84049a;
                aVar.f38234a = c4172d4;
                aVar.f38235b = image2;
                aVar.f38236c = it;
                aVar.f38239f = 1;
                if (g11.consume(h0Var, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th5) {
                th = th5;
                c4172d5 = c4172d4;
                if (!(th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof LinkageError)) {
                    throw th;
                }
                failure = new Try.Failure(th);
                c4172d3 = c4172d5;
            }
        }
        Q2 q11 = c4172d4.f38230c;
        Pair pairA = jn0.x.a(image2, c4172d4.f38228a.contentDetectionArea());
        aVar.f38234a = c4172d4;
        aVar.f38235b = null;
        aVar.f38236c = null;
        aVar.f38239f = 2;
        Object objProcess = q11.process(pairA, aVar);
        if (objProcess != coroutine_suspended) {
            C4172d3 c4172d6 = c4172d4;
            obj = objProcess;
            c4172d3 = c4172d6;
            failure = new Try.Success((K5) obj);
            if (failure.isSuccess()) {
                c4172d3.setCompleted(true);
            }
            return failure;
        }
        return coroutine_suspended;
    }
}
