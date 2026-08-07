package pk0;

import bl0.HttpMethod;
import bl0.k;
import bl0.k0;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lpk0/d;", "Lwk0/b;", "Lpk0/c;", "call", "origin", "<init>", "(Lpk0/c;Lwk0/b;)V", "a", "Lpk0/c;", "c", "()Lpk0/c;", "Ldl0/b;", "getAttributes", "()Ldl0/b;", "attributes", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lbl0/k;", "b", "()Lbl0/k;", "headers", "Lbl0/t;", "getMethod", "()Lbl0/t;", "method", "Lbl0/k0;", "getUrl", "()Lbl0/k0;", ImagesContract.URL, "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements wk0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c call;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ wk0.b f103157b;

    public d(c call, wk0.b origin) {
        s.k(call, "call");
        s.k(origin, "origin");
        this.call = call;
        this.f103157b = origin;
    }

    @Override // bl0.q
    /* JADX INFO: renamed from: b */
    public k getHeaders() {
        return this.f103157b.getHeaders();
    }

    @Override // wk0.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public c getCall() {
        return this.call;
    }

    @Override // wk0.b
    public dl0.b getAttributes() {
        return this.f103157b.getAttributes();
    }

    @Override // wk0.b, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f103157b.getCoroutineContext();
    }

    @Override // wk0.b
    public HttpMethod getMethod() {
        return this.f103157b.getMethod();
    }

    @Override // wk0.b
    public k0 getUrl() {
        return this.f103157b.getUrl();
    }
}
