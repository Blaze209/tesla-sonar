package com.fourthline.scanners.config.orca.common;

import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/JsonError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "errorCode", "", "getErrorCode", "()I", "toFailJson", "Lorg/json/JSONObject;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JsonError extends Exception {
    private final String errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonError(String errorMessage) {
        super(errorMessage);
        s.k(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
    }

    public abstract int getErrorCode();

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final JSONObject toFailJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", getErrorCode());
        JSONObject jSONObjectPut = jSONObject.put("errorDescription", this.errorMessage);
        s.j(jSONObjectPut, "with(...)");
        return jSONObjectPut;
    }
}
