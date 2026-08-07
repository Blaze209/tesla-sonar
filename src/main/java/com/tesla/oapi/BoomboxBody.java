package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tesla/oapi/BoomboxBody;", "", "action", "", "<init>", "(I)V", "getAction", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BoomboxBody {

    @g(name = "action")
    private final int action;

    public BoomboxBody(int i11) {
        this.action = i11;
    }

    public static /* synthetic */ BoomboxBody copy$default(BoomboxBody boomboxBody, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = boomboxBody.action;
        }
        return boomboxBody.copy(i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    public final BoomboxBody copy(int action) {
        return new BoomboxBody(action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BoomboxBody) && this.action == ((BoomboxBody) other).action;
    }

    public final int getAction() {
        return this.action;
    }

    public int hashCode() {
        return Integer.hashCode(this.action);
    }

    public String toString() {
        return "BoomboxBody(action=" + this.action + ")";
    }
}
