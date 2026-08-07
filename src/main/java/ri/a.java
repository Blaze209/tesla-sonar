package ri;

import ii.f;
import ii.g;
import ii.v;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lri/a;", "", "Lii/v$a;", "D", "Lii/f;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lii/g;", "a", "(Lii/f;)Lkotlinx/coroutines/flow/Flow;", "Ljn0/h0;", "dispose", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface a {
    <D extends v.a> Flow<g<D>> a(f<D> request);

    void dispose();
}
