package oa;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.s;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.Deferred;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lkotlinx/coroutines/Deferred;", "", "tag", "Lcom/google/common/util/concurrent/s;", "b", "(Lkotlinx/coroutines/Deferred;Ljava/lang/Object;)Lcom/google/common/util/concurrent/s;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a<T> f97042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Deferred<T> f97043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, Deferred<? extends T> deferred) {
            super(1);
            this.f97042c = aVar;
            this.f97043d = deferred;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f97042c.c((T) this.f97043d.getCompleted());
            } else if (th2 instanceof CancellationException) {
                this.f97042c.d();
            } else {
                this.f97042c.f(th2);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    public static final <T> s<T> b(final Deferred<? extends T> deferred, final Object obj) {
        p013kotlin.jvm.internal.s.k(deferred, "<this>");
        s<T> sVarA = c.a(new c.InterfaceC0146c() { // from class: oa.a
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(c.a aVar) {
                return b.d(deferred, obj, aVar);
            }
        });
        p013kotlin.jvm.internal.s.j(sVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return sVarA;
    }

    public static /* synthetic */ s c(Deferred deferred, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(deferred, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Deferred this_asListenableFuture, Object obj, c.a completer) {
        p013kotlin.jvm.internal.s.k(this_asListenableFuture, "$this_asListenableFuture");
        p013kotlin.jvm.internal.s.k(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}
