package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4147a2 extends AbstractC4282s4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4258p0 f38133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4147a2(K2 imageSource, T2 isSteadyDataSource, InterfaceC4258p0 compositeStep, List<? extends G5> preconditions) {
        super(imageSource, isSteadyDataSource, compositeStep, preconditions);
        p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        p013kotlin.jvm.internal.s.k(compositeStep, "compositeStep");
        p013kotlin.jvm.internal.s.k(preconditions, "preconditions");
        this.f38133i = compositeStep;
    }

    private final void tryNotifyError(AbstractC4255o4.a aVar) {
        wn0.l<Try<? extends K5>, jn0.h0> stepResultListener = getStepResultListener();
        if (stepResultListener != null) {
            stepResultListener.invoke(TryKt.failure(aVar));
        }
    }

    private final void tryNotifyStepUpdate() {
        wn0.l<I5, jn0.h0> stepListener = getStepListener();
        if (stepListener != null) {
            stepListener.invoke(getStepConfig());
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4282s4, com.fourthline.vision.internal.M5
    public void moveToNext() {
        try {
            if (C4147a2.class.isAnonymousClass()) {
                String name = C4147a2.class.getName();
                if (name.length() <= 23) {
                    p013kotlin.jvm.internal.s.h(name);
                } else {
                    p013kotlin.jvm.internal.s.h(name);
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                String simpleName = C4147a2.class.getSimpleName();
                if (simpleName.length() <= 23) {
                    p013kotlin.jvm.internal.s.h(simpleName);
                } else {
                    p013kotlin.jvm.internal.s.h(simpleName);
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
            this.f38133i.moveToNext();
            if (this.f38133i.isCompleted()) {
                setCompleted(true);
            } else {
                tryNotifyStepUpdate();
            }
        } catch (AbstractC4255o4.a e11) {
            tryNotifyError(e11);
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4282s4
    public void onStepSuccess(K5 stepResult) {
        wn0.l<Try<? extends K5>, jn0.h0> stepResultListener;
        p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
        if (C4147a2.class.isAnonymousClass()) {
            String name = C4147a2.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4147a2.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(stepResult);
        if (isCompleted() || (stepResultListener = getStepResultListener()) == null) {
            return;
        }
        stepResultListener.invoke(TryKt.success(stepResult));
    }

    @Override // com.fourthline.vision.internal.AbstractC4282s4, com.fourthline.vision.internal.M5
    public void resetCurrentStep() {
        try {
            if (C4147a2.class.isAnonymousClass()) {
                String name = C4147a2.class.getName();
                if (name.length() <= 23) {
                    p013kotlin.jvm.internal.s.h(name);
                } else {
                    p013kotlin.jvm.internal.s.h(name);
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                String simpleName = C4147a2.class.getSimpleName();
                if (simpleName.length() <= 23) {
                    p013kotlin.jvm.internal.s.h(simpleName);
                } else {
                    p013kotlin.jvm.internal.s.h(simpleName);
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
            this.f38133i.resetStep();
            tryNotifyStepUpdate();
        } catch (AbstractC4255o4.a e11) {
            tryNotifyError(e11);
        }
    }
}
