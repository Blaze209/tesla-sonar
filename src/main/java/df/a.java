package df;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ldf/a;", "", "Lne/a;", "httpClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lne/a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "a", "Lne/a;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ne.a httpClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    public a(ne.a httpClient, CoroutineDispatcher dispatcher) {
        s.k(httpClient, "httpClient");
        s.k(dispatcher, "dispatcher");
        this.httpClient = httpClient;
        this.dispatcher = dispatcher;
    }

    public /* synthetic */ a(ne.a aVar, CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
