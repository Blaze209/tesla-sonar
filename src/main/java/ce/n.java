package ce;

import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Lce/n;", "", "<init>", "()V", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Ljn0/h0;", "callback", "a", "(Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "b", "", "Lkotlinx/coroutines/Job;", "Ljava/util/List;", "observerJobs", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<Job> observerJobs = new ArrayList();

    public final <T> void a(Flow<? extends T> flow, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, wn0.l<? super T, h0> callback) {
        p013kotlin.jvm.internal.s.k(flow, "<this>");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.observerJobs.add(le.f.a(flow, lifecycleOwner, coroutineScope, callback));
    }

    public final void b() {
        if (this.observerJobs.isEmpty()) {
            return;
        }
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = n.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "cleaning up existing observer", null);
        }
        Iterator<T> it = this.observerJobs.iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
        }
        this.observerJobs.clear();
    }
}
