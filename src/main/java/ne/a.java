package ne;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JL\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lne/a;", "", "", "path", "jsonBody", "", "queryParameters", "headers", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: ne.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C2005a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(a aVar, String str, String str2, Map map, Map map2, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i11 & 4) != 0) {
                map = v0.i();
            }
            Map map3 = map;
            if ((i11 & 8) != 0) {
                map2 = v0.i();
            }
            return aVar.a(str, str2, map3, map2, continuation);
        }
    }

    Object a(String str, String str2, Map<String, String> map, Map<String, String> map2, Continuation<? super byte[]> continuation);
}
