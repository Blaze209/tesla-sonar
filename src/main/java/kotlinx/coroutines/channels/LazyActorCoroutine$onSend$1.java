package kotlinx.coroutines.channels;

import jn0.h0;
import kotlinx.coroutines.selects.SelectInstance;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class LazyActorCoroutine$onSend$1 extends p implements q<LazyActorCoroutine<?>, SelectInstance<?>, Object, h0> {
    public static final LazyActorCoroutine$onSend$1 INSTANCE = new LazyActorCoroutine$onSend$1();

    LazyActorCoroutine$onSend$1() {
        super(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ h0 invoke(LazyActorCoroutine<?> lazyActorCoroutine, SelectInstance<?> selectInstance, Object obj) throws Throwable {
        invoke2(lazyActorCoroutine, selectInstance, obj);
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LazyActorCoroutine<?> lazyActorCoroutine, SelectInstance<?> selectInstance, Object obj) throws Throwable {
        lazyActorCoroutine.onSendRegFunction(selectInstance, obj);
    }
}
