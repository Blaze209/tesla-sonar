package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4208i implements InterfaceC4258p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f38389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VisionDynamicStepsEvaluator f38390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Iterator f38392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private J5 f38393e;

    public AbstractC4208i(wn0.a<? extends List<? extends J5>> subStepsFactory, VisionDynamicStepsEvaluator<Object> visionDynamicStepsEvaluator) {
        p013kotlin.jvm.internal.s.k(subStepsFactory, "subStepsFactory");
        this.f38389a = subStepsFactory;
        this.f38390b = visionDynamicStepsEvaluator;
        Iterator<J5> it = getSubSteps().iterator();
        this.f38392d = it;
        this.f38393e = it.next();
    }

    static /* synthetic */ <SCANNER_STEP> Object process$suspendImpl(AbstractC4208i abstractC4208i, Image image, Continuation<? super Try<? extends K5>> continuation) {
        return abstractC4208i.f38393e.process(image, continuation);
    }

    protected final J5 getCurrentStep() {
        return this.f38393e;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0, com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        return this.f38393e.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public int getStepsCount() {
        return getSubSteps().size();
    }

    protected final List<J5> getSubSteps() {
        return (List) this.f38389a.invoke();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f38391c;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public void moveToNext() {
        this.f38393e.stop();
        jn0.h0 h0Var = jn0.h0.f84049a;
        VisionDynamicStepsEvaluator visionDynamicStepsEvaluator = this.f38390b;
        if (visionDynamicStepsEvaluator != null && visionDynamicStepsEvaluator.isScannerCompleted(this.f38393e.getStepConfig().getStepType())) {
            setCompleted(true);
        } else {
            if (!this.f38392d.hasNext()) {
                setCompleted(true);
                return;
            }
            J5 j11 = (J5) this.f38392d.next();
            j11.start();
            this.f38393e = j11;
        }
    }

    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public void reset() {
        this.f38393e.stop();
        setCompleted(false);
        Iterator<J5> it = getSubSteps().iterator();
        this.f38392d = it;
        J5 next = it.next();
        next.start();
        this.f38393e = next;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4258p0
    public abstract /* synthetic */ void resetStep();

    public void setCompleted(boolean z11) {
        this.f38391c = z11;
    }

    protected final void setCurrentStep(J5 j11) {
        p013kotlin.jvm.internal.s.k(j11, "<set-?>");
        this.f38393e = j11;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        this.f38393e.start();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        this.f38393e.stop();
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }

    public /* synthetic */ AbstractC4208i(wn0.a aVar, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? null : visionDynamicStepsEvaluator);
    }
}
