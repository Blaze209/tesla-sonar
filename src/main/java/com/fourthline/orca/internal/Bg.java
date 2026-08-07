package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Bg extends Uf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bg(String workflowId, JSONObject data) {
        super("geolocationDataUpload", workflowId, data);
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(data, "data");
    }
}
