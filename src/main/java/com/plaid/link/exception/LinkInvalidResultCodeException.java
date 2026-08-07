package com.plaid.link.exception;

import jn0.e;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/plaid/link/exception/LinkInvalidResultCodeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "code", "", "(I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkInvalidResultCodeException extends IllegalStateException {
    public LinkInvalidResultCodeException(int i11) {
        super("Unknown result code: " + i11);
    }
}
