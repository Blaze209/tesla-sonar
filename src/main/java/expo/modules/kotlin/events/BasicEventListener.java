package expo.modules.kotlin.events;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/events/BasicEventListener;", "Lexpo/modules/kotlin/events/EventListener;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "Lkotlin/Function0;", "Ljn0/h0;", "body", "<init>", "(Lexpo/modules/kotlin/events/EventName;Lwn0/a;)V", "call", "()V", "Lwn0/a;", "getBody", "()Lwn0/a;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BasicEventListener extends EventListener {
    private final a<h0> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicEventListener(EventName eventName, a<h0> body) {
        super(eventName, null);
        s.k(eventName, "eventName");
        s.k(body, "body");
        this.body = body;
    }

    public final void call() {
        this.body.invoke();
    }

    public final a<h0> getBody() {
        return this.body;
    }
}
