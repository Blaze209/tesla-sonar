package com.plaid.link.exception;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plaid/link/exception/LinkNoNetworkException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkNoNetworkException extends IllegalStateException {
    public static final LinkNoNetworkException INSTANCE = new LinkNoNetworkException();

    private LinkNoNetworkException() {
        super("No network is available, please check your internet connection before opening Link again.");
    }
}
