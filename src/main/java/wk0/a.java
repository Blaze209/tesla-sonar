package wk0;

import bl0.HttpMethod;
import bl0.k;
import bl0.k0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\r\u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lwk0/a;", "Lwk0/b;", "Lpk0/a;", "call", "Lwk0/d;", "data", "<init>", "(Lpk0/a;Lwk0/d;)V", "a", "Lpk0/a;", "I", "()Lpk0/a;", "Lbl0/t;", "b", "Lbl0/t;", "getMethod", "()Lbl0/t;", "method", "Lbl0/k0;", "c", "Lbl0/k0;", "getUrl", "()Lbl0/k0;", ImagesContract.URL, "Lcl0/b;", DateTokenConverter.CONVERTER_KEY, "Lcl0/b;", "getContent", "()Lcl0/b;", "content", "Lbl0/k;", "e", "Lbl0/k;", "()Lbl0/k;", "headers", "Ldl0/b;", "f", "Ldl0/b;", "getAttributes", "()Ldl0/b;", "attributes", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pk0.a call;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HttpMethod method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k0 url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cl0.b content;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k headers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dl0.b attributes;

    public a(pk0.a call, HttpRequestData data) {
        s.k(call, "call");
        s.k(data, "data");
        this.call = call;
        this.method = data.getMethod();
        this.url = data.getUrl();
        this.content = data.getBody();
        this.headers = data.getHeaders();
        this.attributes = data.getAttributes();
    }

    @Override // wk0.b
    /* JADX INFO: renamed from: I, reason: from getter */
    public pk0.a getCall() {
        return this.call;
    }

    @Override // bl0.q
    /* JADX INFO: renamed from: b, reason: from getter */
    public k getHeaders() {
        return this.headers;
    }

    @Override // wk0.b
    public dl0.b getAttributes() {
        return this.attributes;
    }

    @Override // wk0.b, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return getCall().getCoroutineContext();
    }

    @Override // wk0.b
    public HttpMethod getMethod() {
        return this.method;
    }

    @Override // wk0.b
    public k0 getUrl() {
        return this.url;
    }
}
