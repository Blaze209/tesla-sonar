package com.plaid.link.exception;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/link/exception/LinkException;", "", "message", "", "(Ljava/lang/String;)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkException(String message) {
        super(message);
        s.k(message, "message");
    }
}
