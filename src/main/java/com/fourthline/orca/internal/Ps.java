package com.fourthline.orca.internal;

import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ps {
    public static final Throwable a(Os os2, ProductConfig config, String message) {
        p013kotlin.jvm.internal.s.k(os2, "<this>");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(message, "message");
        if (config instanceof WorkflowConfig) {
            return new WorkflowError.Unexpected(message);
        }
        throw new IllegalStateException(("FL developer error. " + config + " is not handled!").toString());
    }
}
