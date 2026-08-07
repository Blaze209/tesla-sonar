package androidx.p003lifecycle;

import androidx.camera.view.i;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/r;", "a", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/r;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v {
    public static final r a(Lifecycle lifecycle) {
        s sVar;
        s.k(lifecycle, "<this>");
        do {
            s sVar2 = (s) lifecycle.c().get();
            if (sVar2 != null) {
                return sVar2;
            }
            sVar = new s(lifecycle, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        } while (!i.a(lifecycle.c(), null, sVar));
        sVar.f();
        return sVar;
    }
}
