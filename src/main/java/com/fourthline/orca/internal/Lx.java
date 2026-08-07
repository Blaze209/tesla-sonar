package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Lx extends Xf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lx(String workflowId, List bodyParts) {
        super("biometricsImageUpload", workflowId, bodyParts, null, 8, null);
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(bodyParts, "bodyParts");
    }
}
