package com.tesla.oapi;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface OwnerAPIRequestCallback {
    void onCompletion(JSONObject jSONObject);

    void onFailure(OwnerAPIError ownerAPIError);

    void onTimeout();
}
