package com.plaid.link.exception;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/plaid/link/exception/LinkConfigurationInvalidLanguageException;", "Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkConfigurationInvalidLanguageException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationInvalidLanguageException INSTANCE = new LinkConfigurationInvalidLanguageException();

    private LinkConfigurationInvalidLanguageException() {
        super("Language must be an ISO 639 alpha-2 code for LinkPublicKeyConfiguration. You can get language codes from the Locale https://developer.android.com/reference/java/util/Locale", null);
    }
}
