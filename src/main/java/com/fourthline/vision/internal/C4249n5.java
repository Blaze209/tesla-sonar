package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.fourthline.vision.internal.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4249n5 extends AbstractC4282s4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4249n5(K2 imageSource, T2 isSteadyDataSource, InterfaceC4258p0 compositeStep, List<? extends G5> preconditions) {
        super(imageSource, isSteadyDataSource, compositeStep, preconditions);
        p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        p013kotlin.jvm.internal.s.k(compositeStep, "compositeStep");
        p013kotlin.jvm.internal.s.k(preconditions, "preconditions");
    }

    @Override // com.fourthline.vision.internal.AbstractC4282s4, com.fourthline.vision.internal.M5
    public void moveToNext() {
    }

    @Override // com.fourthline.vision.internal.AbstractC4282s4
    public void onStepSuccess(K5 stepResult) {
        p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
        if (C4249n5.class.isAnonymousClass()) {
            String name = C4249n5.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4249n5.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(stepResult);
        if (isCompleted()) {
            return;
        }
        wn0.l<Try<? extends K5>, jn0.h0> stepResultListener = getStepResultListener();
        if (stepResultListener != null) {
            stepResultListener.invoke(TryKt.success(stepResult));
        }
        invokeStepUpdateOrComplete();
    }

    @Override // com.fourthline.vision.internal.AbstractC4282s4, com.fourthline.vision.internal.M5
    public void resetCurrentStep() {
    }
}
