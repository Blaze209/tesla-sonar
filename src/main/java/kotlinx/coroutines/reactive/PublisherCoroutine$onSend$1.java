package kotlinx.coroutines.reactive;

import jn0.h0;
import kotlinx.coroutines.selects.SelectInstance;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class PublisherCoroutine$onSend$1 extends p implements q<PublisherCoroutine<?>, SelectInstance<?>, Object, h0> {
    public static final PublisherCoroutine$onSend$1 INSTANCE = new PublisherCoroutine$onSend$1();

    PublisherCoroutine$onSend$1() {
        super(3, PublisherCoroutine.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ h0 invoke(PublisherCoroutine<?> publisherCoroutine, SelectInstance<?> selectInstance, Object obj) {
        invoke2(publisherCoroutine, selectInstance, obj);
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PublisherCoroutine<?> publisherCoroutine, SelectInstance<?> selectInstance, Object obj) {
        publisherCoroutine.registerSelectForSend(selectInstance, obj);
    }
}
