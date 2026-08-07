package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class KA extends Xf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KA(String workflowId, List bodyParts) {
        super("tinImageUpload", workflowId, bodyParts, null, 8, null);
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(bodyParts, "bodyParts");
    }
}
