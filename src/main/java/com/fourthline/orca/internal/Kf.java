package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.orca.workflow.WorkflowBuilder;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowErrorKt;
import p013kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes4.dex */
public final class Kf implements Ts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnProductCompleted f26578a;

    public Kf(OnProductCompleted completionBlock) {
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        this.f26578a = completionBlock;
    }

    @Override // com.fourthline.orca.internal.Ts
    public void a(Object obj) {
        WorkflowError workflowError;
        Object objB;
        OnProductCompleted onProductCompleted = this.f26578a;
        Throwable thE = jn0.s.e(obj);
        if (thE == null) {
            objB = jn0.s.b(jn0.h0.f84049a);
        } else {
            if (thE instanceof KycError) {
                workflowError = WorkflowBuilder.getWorkflowError((KycError) thE);
            } else if (thE instanceof QesError) {
                workflowError = WorkflowBuilder.getWorkflowError((QesError) thE);
            } else if (thE instanceof BavError) {
                workflowError = WorkflowBuilder.getWorkflowError((BavError) thE);
            } else {
                if (!(thE instanceof AbstractC3594nE)) {
                    AbstractC3989wg.a("Wrong error type is provided to `WorkflowProductResultRepository`: " + thE);
                    throw new KotlinNothingValueException();
                }
                workflowError = WorkflowErrorKt.getPublic((AbstractC3594nE) thE);
            }
            objB = jn0.s.b(jn0.t.a(workflowError));
        }
        onProductCompleted.onResult(objB);
    }
}
