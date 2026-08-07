package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class I6 extends Uf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I6(String workflowId, JSONObject data) {
        super("deviceMetadataUpload", workflowId, data);
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(data, "data");
    }
}
