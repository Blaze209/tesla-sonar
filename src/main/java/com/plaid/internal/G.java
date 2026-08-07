package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkResult;

/* JADX INFO: loaded from: classes6.dex */
public abstract class G {
    public void a() {
    }

    public void a(LinkEvent event, I2.d options) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(options, "options");
    }

    public void a(LinkResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
    }

    public void a(Channel$Message.SDKResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
    }

    public void a(AbstractC4366c7 requestInfo) {
        p013kotlin.jvm.internal.s.k(requestInfo, "requestInfo");
    }
}
