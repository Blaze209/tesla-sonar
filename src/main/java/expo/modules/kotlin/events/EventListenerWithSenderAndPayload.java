package expo.modules.kotlin.events;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;", "Sender", "Payload", "Lexpo/modules/kotlin/events/EventListener;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "Lkotlin/Function2;", "Ljn0/h0;", "body", "<init>", "(Lexpo/modules/kotlin/events/EventName;Lwn0/p;)V", "sender", StatusResponse.PAYLOAD, "call", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lwn0/p;", "getBody", "()Lwn0/p;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventListenerWithSenderAndPayload<Sender, Payload> extends EventListener {
    private final p<Sender, Payload, h0> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventListenerWithSenderAndPayload(EventName eventName, p<? super Sender, ? super Payload, h0> body) {
        super(eventName, null);
        s.k(eventName, "eventName");
        s.k(body, "body");
        this.body = body;
    }

    public final void call(Sender sender, Payload payload) {
        this.body.invoke(sender, payload);
    }

    public final p<Sender, Payload, h0> getBody() {
        return this.body;
    }
}
