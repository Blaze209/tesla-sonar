package com.plaid.internal;

import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class W0 implements C4539t3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4435h6.b f46782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4435h6.c f46783b;

    public W0(C4435h6.b eventHandler, C4435h6.c unexpectedActionHandler) {
        p013kotlin.jvm.internal.s.k(eventHandler, "eventHandler");
        p013kotlin.jvm.internal.s.k(unexpectedActionHandler, "unexpectedActionHandler");
        this.f46782a = eventHandler;
        this.f46783b = unexpectedActionHandler;
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkEvent linkEvent, I2 queueOptions) {
        p013kotlin.jvm.internal.s.k(linkEvent, "linkEvent");
        p013kotlin.jvm.internal.s.k(queueOptions, "queueOptions");
        this.f46782a.invoke(linkEvent, queueOptions);
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void b(String linkSessionId) {
        p013kotlin.jvm.internal.s.k(linkSessionId, "linkSessionId");
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void c(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        this.f46783b.invoke();
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkedHashMap linkData) {
        p013kotlin.jvm.internal.s.k(linkData, "linkData");
        this.f46783b.invoke();
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkSuccess linkSuccess) {
        p013kotlin.jvm.internal.s.k(linkSuccess, "linkSuccess");
        this.f46783b.invoke();
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(C4342a1 exception) {
        p013kotlin.jvm.internal.s.k(exception, "exception");
        this.f46783b.invoke();
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkExit linkExit) {
        p013kotlin.jvm.internal.s.k(linkExit, "linkExit");
        this.f46783b.invoke();
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(String action, LinkEventMetadata linkEventMetadata) {
        p013kotlin.jvm.internal.s.k(action, "action");
        p013kotlin.jvm.internal.s.k(linkEventMetadata, "linkEventMetadata");
        this.f46783b.invoke();
    }
}
