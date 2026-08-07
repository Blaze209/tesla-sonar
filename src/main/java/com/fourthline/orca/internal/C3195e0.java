package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3195e0 extends Uf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3195e0(String workflowId, JSONObject data) {
        super("addressDataUpload", workflowId, data);
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(data, "data");
    }
}
