package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tesla/messagebuilder/util/Response;", "", "encodedRoutableMessage", "", "<init>", "(Ljava/lang/String;)V", "getEncodedRoutableMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Response {
    private final String encodedRoutableMessage;

    public Response(@g(name = "routable_message") String str) {
        this.encodedRoutableMessage = str;
    }

    public static /* synthetic */ Response copy$default(Response response, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = response.encodedRoutableMessage;
        }
        return response.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncodedRoutableMessage() {
        return this.encodedRoutableMessage;
    }

    public final Response copy(@g(name = "routable_message") String encodedRoutableMessage) {
        return new Response(encodedRoutableMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Response) && s.f(this.encodedRoutableMessage, ((Response) other).encodedRoutableMessage);
    }

    public final String getEncodedRoutableMessage() {
        return this.encodedRoutableMessage;
    }

    public int hashCode() {
        String str = this.encodedRoutableMessage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Response(encodedRoutableMessage=" + this.encodedRoutableMessage + ")";
    }
}
