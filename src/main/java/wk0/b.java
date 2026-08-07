package wk0;

import bl0.HttpMethod;
import bl0.k0;
import bl0.q;
import com.google.android.gms.common.internal.ImagesContract;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lwk0/b;", "Lbl0/q;", "Lkotlinx/coroutines/CoroutineScope;", "Lpk0/a;", "I", "()Lpk0/a;", "call", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lbl0/t;", "getMethod", "()Lbl0/t;", "method", "Lbl0/k0;", "getUrl", "()Lbl0/k0;", ImagesContract.URL, "Ldl0/b;", "getAttributes", "()Ldl0/b;", "attributes", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b extends q, CoroutineScope {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static CoroutineContext a(b bVar) {
            return bVar.I().getCoroutineContext();
        }
    }

    pk0.a I();

    dl0.b getAttributes();

    CoroutineContext getCoroutineContext();

    HttpMethod getMethod();

    k0 getUrl();
}
