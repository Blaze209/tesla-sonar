package io.ktor.client.plugins;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/client/plugins/ResponseException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lyk0/c;", "response", "", "cachedResponseText", "<init>", "(Lyk0/c;Ljava/lang/String;)V", "a", "Lyk0/c;", "getResponse", "()Lyk0/c;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ResponseException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final transient yk0.c response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(yk0.c response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + CoreConstants.DOUBLE_QUOTE_CHAR);
        s.k(response, "response");
        s.k(cachedResponseText, "cachedResponseText");
        this.response = response;
    }
}
