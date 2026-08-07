package kotlinx.coroutines.reactive;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class PublisherCoroutine$onSend$2 extends p implements q<PublisherCoroutine<?>, Object, Object, Object> {
    public static final PublisherCoroutine$onSend$2 INSTANCE = new PublisherCoroutine$onSend$2();

    PublisherCoroutine$onSend$2() {
        super(3, PublisherCoroutine.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // wn0.q
    public final Object invoke(PublisherCoroutine<?> publisherCoroutine, Object obj, Object obj2) {
        return publisherCoroutine.processResultSelectSend(obj, obj2);
    }
}
