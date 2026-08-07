package io.ktor.client.plugins;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/ktor/client/plugins/RedirectResponseException;", "Lio/ktor/client/plugins/ResponseException;", "Lyk0/c;", "response", "", "cachedResponseText", "<init>", "(Lyk0/c;Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RedirectResponseException extends ResponseException {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectResponseException(yk0.c response, String cachedResponseText) {
        super(response, cachedResponseText);
        s.k(response, "response");
        s.k(cachedResponseText, "cachedResponseText");
        this.message = "Unhandled redirect: " + response.getCall().d().getMethod().getValue() + ' ' + response.getCall().d().getUrl() + ". Status: " + response.getStatus() + ". Text: \"" + cachedResponseText + CoreConstants.DOUBLE_QUOTE_CHAR;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
