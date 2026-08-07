package com.plaid.link.exception;

import com.plaid.internal.B2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/plaid/link/exception/LinkInvalidResultException;", "Lcom/plaid/internal/B2;", "", "message", "<init>", "(Ljava/lang/String;)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkInvalidResultException extends B2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInvalidResultException(String message) {
        super(message);
        s.k(message, "message");
    }
}
