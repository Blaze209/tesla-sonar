package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Wx extends Xf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wx(String workflowId, List bodyParts) {
        super("biometricsVideoUpload", workflowId, bodyParts, null, 8, null);
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(bodyParts, "bodyParts");
    }
}
