package com.plaid.internal;

import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventName;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.plaid.internal.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4435h6 implements M5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N5 f47714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4364c5 f47715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f47716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4539t3 f47717d;

    /* JADX INFO: renamed from: com.plaid.internal.h6$a */
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<List<? extends LinkEventName>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47718a = new a();

        public a() {
            super(0);
        }

        @Override // wn0.a
        public final List<? extends LinkEventName> invoke() {
            return p013kotlin.collections.v.p(LinkEventName.PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE, LinkEventName.LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE, LinkEventName.LAYER_READY.INSTANCE, LinkEventName.LAYER_NOT_AVAILABLE.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.h6$b */
    public /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.p<LinkEvent, I2, jn0.h0> {
        public b(C4435h6 c4435h6) {
            super(2, c4435h6, C4435h6.class, "onEvent", "onEvent(Lcom/plaid/link/event/LinkEvent;Lcom/plaid/internal/event/LinkQueueOptions;)V", 0);
        }

        @Override // wn0.p
        public final jn0.h0 invoke(LinkEvent linkEvent, I2 i11) {
            LinkEvent p11 = linkEvent;
            I2 p12 = i11;
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            ((C4435h6) this.receiver).a(p11, p12);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.h6$c */
    public /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.a<jn0.h0> {
        public c(C4435h6 c4435h6) {
            super(0, c4435h6, C4435h6.class, "preLoadFailed", "preLoadFailed()V", 0);
        }

        @Override // wn0.a
        public final jn0.h0 invoke() {
            C4435h6 c4435h6 = (C4435h6) this.receiver;
            C4364c5 c4364c5 = c4435h6.f47715b;
            c4364c5.getClass();
            p013kotlin.jvm.internal.s.k("Preload received unexpected action", "message");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4346a5(c4364c5, "Preload received unexpected action", null), 3, null);
            c4435h6.f47714a.a();
            return jn0.h0.f84049a;
        }
    }

    public C4435h6(N5 webViewRegistry, C4364c5 crashReporter, wo0.b json) {
        p013kotlin.jvm.internal.s.k(webViewRegistry, "webViewRegistry");
        p013kotlin.jvm.internal.s.k(crashReporter, "crashReporter");
        p013kotlin.jvm.internal.s.k(json, "json");
        this.f47714a = webViewRegistry;
        this.f47715b = crashReporter;
        this.f47716c = jn0.m.b(a.f47718a);
        this.f47717d = new C4539t3(new W0(new b(this), new c(this)), json);
    }

    @Override // com.plaid.internal.M5
    public final void a(AbstractC4531s4 openInterstitialMessage) {
        p013kotlin.jvm.internal.s.k(openInterstitialMessage, "openInterstitialMessage");
    }

    public final void a(LinkEvent linkEvent, I2 i11) {
        if (((List) this.f47716c.getValue()).contains(linkEvent.getEventName())) {
            X5.a.a(X5.f46812a, "Preload delivered event: " + linkEvent.getEventName());
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(linkEvent);
            return;
        }
        X5.a.a(X5.f46812a, "Preload enqueued event: " + linkEvent.getEventName());
        wn0.p<LinkEvent, I2, jn0.h0> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, i11);
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    @Override // com.plaid.internal.M5
    public final boolean a(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        this.f47717d.a(url);
        return true;
    }
}
