package expo.modules.webbrowser;

import expo.modules.core.interfaces.Consumer;
import java.util.LinkedList;
import java.util.Queue;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0004R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/webbrowser/DeferredClientActionsQueue;", "T", "", "<init>", "()V", "Ljn0/h0;", "executeQueuedActions", "Lexpo/modules/core/interfaces/Consumer;", "consumer", "addActionToQueue", "(Lexpo/modules/core/interfaces/Consumer;)V", "client", "setClient", "(Ljava/lang/Object;)V", "", "hasClient", "()Z", "action", "executeOrQueueAction", "clear", "Ljava/util/Queue;", "actions", "Ljava/util/Queue;", "Ljava/lang/Object;", "expo-web-browser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeferredClientActionsQueue<T> {
    private final Queue<Consumer<T>> actions = new LinkedList();
    private T client;

    private final void addActionToQueue(Consumer<T> consumer) {
        this.actions.add(consumer);
    }

    private final void executeQueuedActions() {
        if (this.client == null) {
            return;
        }
        Consumer<T> consumerPoll = this.actions.poll();
        while (consumerPoll != null) {
            consumerPoll.apply(this.client);
            consumerPoll = this.actions.poll();
        }
    }

    public final void clear() {
        this.client = null;
        this.actions.clear();
    }

    public final void executeOrQueueAction(Consumer<T> action) {
        s.k(action, "action");
        T t11 = this.client;
        if (t11 != null) {
            action.apply(t11);
        } else {
            addActionToQueue(action);
        }
    }

    public final boolean hasClient() {
        return this.client != null;
    }

    public final void setClient(T client) {
        this.client = client;
        executeQueuedActions();
    }
}
