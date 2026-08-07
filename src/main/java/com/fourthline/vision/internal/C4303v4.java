package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4303v4 implements InterfaceC4258p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f39028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f39029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.l f39030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.l f39031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.l f39032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f39035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private J5 f39036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39037j;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v4$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39039b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39041d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f39039b = obj;
            this.f39041d |= Integer.MIN_VALUE;
            return C4303v4.this.process((Image) null, (Continuation<? super Try<? extends K5>>) this);
        }
    }

    public C4303v4(wn0.a<? extends List<? extends J5>> subStepsFactory, wn0.a<? extends List<Integer>> randomnessLivenessSteps, wn0.l<? super Integer, jn0.h0> onLivenessStepSuccess, wn0.l<? super Integer, jn0.h0> onLivenessStepUpdate, wn0.l<? super Integer, jn0.h0> onRandomnessLivenessStepCountUpdate) {
        p013kotlin.jvm.internal.s.k(subStepsFactory, "subStepsFactory");
        p013kotlin.jvm.internal.s.k(randomnessLivenessSteps, "randomnessLivenessSteps");
        p013kotlin.jvm.internal.s.k(onLivenessStepSuccess, "onLivenessStepSuccess");
        p013kotlin.jvm.internal.s.k(onLivenessStepUpdate, "onLivenessStepUpdate");
        p013kotlin.jvm.internal.s.k(onRandomnessLivenessStepCountUpdate, "onRandomnessLivenessStepCountUpdate");
        this.f39028a = subStepsFactory;
        this.f39029b = randomnessLivenessSteps;
        this.f39030c = onLivenessStepSuccess;
        this.f39031d = onLivenessStepUpdate;
        this.f39032e = onRandomnessLivenessStepCountUpdate;
        this.f39034g = -1;
        this.f39035h = subStepsFactory.invoke();
        this.f39036i = getSubSteps().get(this.f39033f);
    }

    private final List<J5> getSubSteps() {
        List<J5> list = (List) this.f39028a.invoke();
        J5 j11 = (J5) this.f39035h.get(this.f39033f);
        j11.stop();
        j11.start();
        this.f39035h = list;
        return list;
    }

    private final boolean randomnessLivenessEnabled() {
        return this.f39029b.invoke() != null;
    }

    public final int getCurrentRandomnessLivenessStepIndex() {
        return this.f39034g;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0, com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        return this.f39036i.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public int getStepsCount() {
        return getSubSteps().size();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f39037j;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public void moveToNext() {
        this.f39036i.stop();
        jn0.h0 h0Var = jn0.h0.f84049a;
        if (p013kotlin.collections.v.r0(getSubSteps(), this.f39033f + 1) == null) {
            setCompleted(true);
            return;
        }
        List<J5> subSteps = getSubSteps();
        int i11 = this.f39033f + 1;
        this.f39033f = i11;
        J5 j11 = subSteps.get(i11);
        j11.start();
        this.f39036i = j11;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public void reset() {
        this.f39036i.stop();
        setCompleted(false);
        this.f39033f = 0;
        this.f39036i.start();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public void resetStep() {
    }

    public void setCompleted(boolean z11) {
        this.f39037j = z11;
    }

    public final void setCurrentRandomnessLivenessStepIndex(int i11) {
        this.f39034g = i11;
        J5 j11 = this.f39036i;
        j11.stop();
        j11.start();
        this.f39031d.invoke(Integer.valueOf(this.f39034g));
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        InterfaceC4258p0.a.start(this);
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        InterfaceC4258p0.a.stop(this);
        Iterator<J5> it = getSubSteps().iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) {
        a aVar;
        C4303v4 c4303v4;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f39041d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f39041d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objProcess = aVar.f39039b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f39041d;
        if (i12 == 0) {
            jn0.t.b(objProcess);
            J5 j11 = this.f39036i;
            aVar.f39038a = this;
            aVar.f39041d = 1;
            objProcess = j11.process(image, aVar);
            if (objProcess == coroutine_suspended) {
                return coroutine_suspended;
            }
            c4303v4 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4303v4 = (C4303v4) aVar.f39038a;
            jn0.t.b(objProcess);
        }
        if (((Try) objProcess).isSuccess()) {
            if (c4303v4.f39036i.getStepConfig().getStepType() == SelfieScannerStep.SELFIE) {
                c4303v4.moveToNext();
                if (c4303v4.randomnessLivenessEnabled()) {
                    wn0.l lVar = c4303v4.f39032e;
                    List list = (List) c4303v4.f39029b.invoke();
                    if (list == null) {
                        throw new IllegalStateException("FL Developer error. Randomness suppose to be enabled here.");
                    }
                    lVar.invoke(Boxing.boxInt(list.size()));
                    c4303v4.setCurrentRandomnessLivenessStepIndex(0);
                    return objProcess;
                }
            } else {
                if (c4303v4.randomnessLivenessEnabled()) {
                    c4303v4.f39030c.invoke(Boxing.boxInt(c4303v4.f39034g));
                    List list2 = (List) c4303v4.f39029b.invoke();
                    if ((list2 != null ? (Integer) p013kotlin.collections.v.r0(list2, c4303v4.f39034g + 1) : null) == null) {
                        c4303v4.moveToNext();
                        return objProcess;
                    }
                    int i13 = c4303v4.f39034g;
                    c4303v4.setCurrentRandomnessLivenessStepIndex(i13 + 1);
                    Boxing.boxInt(i13);
                    return objProcess;
                }
                c4303v4.moveToNext();
            }
        }
        return objProcess;
    }
}
