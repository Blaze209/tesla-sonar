package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2862Ec extends Xf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2862Ec(String workflowId, List bodyParts) {
        super("documentVideoUpload", workflowId, bodyParts, "workflow_upload_document_video");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(bodyParts, "bodyParts");
    }
}
