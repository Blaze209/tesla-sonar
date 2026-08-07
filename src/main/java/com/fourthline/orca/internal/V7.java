package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.sdk.R;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class V7 implements Q0, Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R0 f29041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f29042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L0 f29043c;

    public V7(R0 delegate, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29041a = delegate;
        this.f29042b = imageServiceLocator;
        QA.a aVar = QA.f27433a;
        this.f29043c = new L0(AnalyticsAttribute.DocumentCountry, new InterfaceC3777rk.b(false), new InterfaceC3777rk.a.C0608a(null, 1, null), QA.a.a(aVar, R.string.step_document_country_header, 0, 2, null), new K0(null, AnalyticsAttribute.DocumentCountry, false, QA.a.a(aVar, R.string.step_document_country_label_country, 0, 2, null), QA.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), null, Gh.UNFOCUSED, null, null, null, null, imageServiceLocator.a(EnumC3689ph.M0), 1957, null));
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        return this.f29041a.a(input);
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l b(InterfaceC3447jx item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        return this.f29041a.b(item);
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l d(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        return this.f29041a.d(input);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public L0 getInitialState() {
        return this.f29043c;
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(List suggestions) {
        p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
        return this.f29041a.a(suggestions);
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(Fh fh2) {
        return this.f29041a.a(fh2);
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(InterfaceC3447jx interfaceC3447jx, boolean z11) {
        return this.f29041a.a(interfaceC3447jx, z11);
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(InterfaceC3447jx item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        return this.f29041a.a(item);
    }
}
