package com.plaid.link;

import com.plaid.link.event.LinkEvent;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "it", "Ljn0/h0;", "invoke", "(Lcom/plaid/link/event/LinkEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Plaid$linkEventListener$1 extends u implements l<LinkEvent, h0> {
    public static final Plaid$linkEventListener$1 INSTANCE = new Plaid$linkEventListener$1();

    public Plaid$linkEventListener$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinkEvent it) {
        s.k(it, "it");
    }

    @Override // wn0.l
    public /* bridge */ /* synthetic */ h0 invoke(LinkEvent linkEvent) {
        invoke2(linkEvent);
        return h0.f84049a;
    }
}
