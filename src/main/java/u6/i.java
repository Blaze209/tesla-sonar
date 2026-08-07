package u6;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lu6/i;", "", "<init>", "()V", "T", "Lu6/d0;", "serializer", "Lv6/b;", "corruptionHandler", "", "Lu6/f;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lu6/h;", "a", "(Lu6/d0;Lv6/b;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lwn0/a;)Lu6/h;", "Lu6/i0;", PlaceTypes.STORAGE, "b", "(Lu6/i0;Lv6/b;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Lu6/h;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f115493a = new i();

    private i() {
    }

    public final <T> h<T> a(d0<T> serializer, v6.b<T> corruptionHandler, List<? extends f<T>> migrations, CoroutineScope scope, wn0.a<? extends File> produceFile) {
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        p013kotlin.jvm.internal.s.k(migrations, "migrations");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(produceFile, "produceFile");
        return b(new n(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    public final <T> h<T> b(i0<T> storage, v6.b<T> corruptionHandler, List<? extends f<T>> migrations, CoroutineScope scope) {
        p013kotlin.jvm.internal.s.k(storage, "storage");
        p013kotlin.jvm.internal.s.k(migrations, "migrations");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        if (corruptionHandler == null) {
            corruptionHandler = (v6.b<T>) new v6.a();
        }
        return new j(storage, p013kotlin.collections.v.e(g.INSTANCE.b(migrations)), corruptionHandler, scope);
    }
}
