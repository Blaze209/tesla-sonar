package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3614ns extends Xf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3614ns(String workflowId, List bodyParts) {
        super("poaImageUpload", workflowId, bodyParts, null, 8, null);
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(bodyParts, "bodyParts");
    }
}
