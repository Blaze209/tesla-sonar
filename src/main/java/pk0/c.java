package pk0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.ktor.utils.io.g;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0014X\u0094D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lpk0/c;", "Lpk0/a;", "Lok0/a;", "client", "Lwk0/b;", "request", "Lyk0/c;", "response", "", "responseBody", "<init>", "(Lok0/a;Lwk0/b;Lyk0/c;[B)V", "Lio/ktor/utils/io/g;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "[B", "", IntegerTokenConverter.CONVERTER_KEY, "Z", "b", "()Z", "allowDoubleReceive", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final byte[] responseBody;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDoubleReceive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ok0.a client, wk0.b request, yk0.c response, byte[] responseBody) {
        super(client);
        s.k(client, "client");
        s.k(request, "request");
        s.k(response, "response");
        s.k(responseBody, "responseBody");
        this.responseBody = responseBody;
        h(new d(this, request));
        i(new e(this, responseBody, response));
        this.allowDoubleReceive = true;
    }

    @Override // pk0.a
    /* JADX INFO: renamed from: b, reason: from getter */
    protected boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    @Override // pk0.a
    protected Object f(Continuation<? super g> continuation) {
        return io.ktor.utils.io.d.a(this.responseBody);
    }
}
