package com.plaid.internal;

import com.plaid.link.event.LinkEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.DelayQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DelayQueue<DelayedC4581y0> f46200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<LinkEvent> f46201b;

    public A2() {
        this(null);
    }

    public final void a(LinkEvent event, int i11) {
        p013kotlin.jvm.internal.s.k(event, "event");
        X5.a.a(X5.f46812a, "putting: " + event.getEventName() + " for " + i11);
        this.f46200a.put(new DelayedC4581y0(event, i11));
    }

    public final void b(wn0.l<? super LinkEvent, jn0.h0> lVar) {
        synchronized (this.f46201b) {
            try {
                List<LinkEvent> list = this.f46201b;
                X5.a.a(X5.f46812a, "flushing " + list.size() + " events");
                for (LinkEvent linkEvent : list) {
                    if (lVar != null) {
                        lVar.invoke(linkEvent);
                    } else {
                        a(linkEvent, -1);
                    }
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public A2(Object obj) {
        DelayQueue<DelayedC4581y0> delayable = new DelayQueue<>();
        List<LinkEvent> enqueable = Collections.synchronizedList(new ArrayList());
        p013kotlin.jvm.internal.s.j(enqueable, "synchronizedList(...)");
        p013kotlin.jvm.internal.s.k(delayable, "delayable");
        p013kotlin.jvm.internal.s.k(enqueable, "enqueable");
        this.f46200a = delayable;
        this.f46201b = enqueable;
    }

    public final void a(wn0.l<? super LinkEvent, jn0.h0> deliver) {
        p013kotlin.jvm.internal.s.k(deliver, "deliver");
        b(deliver);
        Object[] array = this.f46200a.toArray();
        this.f46200a.clear();
        p013kotlin.jvm.internal.s.h(array);
        p013kotlin.collections.n.Q(array);
        X5.a.a(X5.f46812a, "draining: " + array.length + " events");
        for (Object obj : array) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type com.plaid.internal.event.DelayedLinkEvent");
            deliver.invoke(((DelayedC4581y0) obj).a());
        }
    }

    public final void a(LinkEvent event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        synchronized (this.f46201b) {
            X5.a.a(X5.f46812a, "enqueueing: " + event.getEventName(), new Object[]{""});
            this.f46201b.add(event);
        }
    }
}
