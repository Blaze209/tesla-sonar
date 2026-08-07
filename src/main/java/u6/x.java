package u6;

import java.io.File;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu6/x;", "", "<init>", "()V", "T", "Lu6/d0;", "serializer", "Lv6/b;", "corruptionHandler", "", "Lu6/f;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lu6/h;", "a", "(Lu6/d0;Lv6/b;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lwn0/a;)Lu6/h;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f115737a = new x();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "Lu6/s;", "a", "(Ljava/io/File;)Lu6/s;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<File, s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f115738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineScope coroutineScope) {
            super(1);
            this.f115738c = coroutineScope;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(File it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return new w(this.f115738c.getCoroutineContext(), it);
        }
    }

    private x() {
    }

    public final <T> h<T> a(d0<T> serializer, v6.b<T> corruptionHandler, List<? extends f<T>> migrations, CoroutineScope scope, wn0.a<? extends File> produceFile) {
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        p013kotlin.jvm.internal.s.k(migrations, "migrations");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(produceFile, "produceFile");
        n nVar = new n(serializer, new a(scope), produceFile);
        List listE = p013kotlin.collections.v.e(g.INSTANCE.b(migrations));
        if (corruptionHandler == null) {
            corruptionHandler = (v6.b<T>) new v6.a();
        }
        return new j(nVar, listE, corruptionHandler, scope);
    }
}
