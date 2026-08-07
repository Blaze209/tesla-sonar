package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4083yo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowError.ModuleError b(AbstractC3641oc abstractC3641oc) {
        return new WorkflowError.ModuleError("IdentityVerification." + abstractC3641oc.getAlias());
    }
}
