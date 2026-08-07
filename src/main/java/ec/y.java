package ec;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyc/t;", "logger", "Lkotlinx/coroutines/CoroutineScope;", "c", "(Lyc/t;)Lkotlinx/coroutines/CoroutineScope;", "Lec/h$a;", "Lec/v$a;", "options", "f", "(Lec/h$a;Lec/v$a;)Lec/h$a;", "e", "(Lec/h$a;)Lec/h$a;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(((yc.i) t12).priority()), Integer.valueOf(((yc.i) t11).priority()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(((yc.g) t12).priority()), Integer.valueOf(((yc.g) t11).priority()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope c(yc.t tVar) {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new a(CoroutineExceptionHandler.INSTANCE, tVar)));
    }

    public static final h.a e(h.a aVar) {
        return aVar.k(new lc.f(), o0.b(String.class)).k(new lc.d(), o0.b(okio.i0.class)).j(new kc.b(), o0.b(g0.class)).j(new kc.d(), o0.b(g0.class)).h(new ic.k.a(), o0.b(g0.class)).h(new ic.c.a(), o0.b(byte[].class)).h(new ic.g.b(), o0.b(g0.class));
    }

    public static final h.a f(h.a aVar, v.Options options) {
        if (s.a(options)) {
            aVar.o(new wn0.a() { // from class: ec.w
                @Override // wn0.a
                public final Object invoke() {
                    return y.g();
                }
            });
            aVar.n(new wn0.a() { // from class: ec.x
                @Override // wn0.a
                public final Object invoke() {
                    return y.h();
                }
            });
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g() {
        co0.d dVarType;
        List listA1 = p013kotlin.collections.v.a1(yc.a0.f125335a.f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listA1.size();
        for (int i11 = 0; i11 < size; i11++) {
            yc.i iVar = (yc.i) listA1.get(i11);
            p013kotlin.jvm.internal.s.i(iVar, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            ic.j.a aVarA = iVar.a();
            Pair pairA = null;
            if (aVarA != null && (dVarType = iVar.type()) != null) {
                pairA = jn0.x.a(aVarA, dVarType);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h() {
        List listA1 = p013kotlin.collections.v.a1(yc.a0.f125335a.e(), new c());
        ArrayList arrayList = new ArrayList();
        int size = listA1.size();
        for (int i11 = 0; i11 < size; i11++) {
            gc.k.a aVarA = ((yc.g) listA1.get(i11)).a();
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "Ljn0/h0;", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Companion companion, yc.t tVar) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
        }
    }
}
