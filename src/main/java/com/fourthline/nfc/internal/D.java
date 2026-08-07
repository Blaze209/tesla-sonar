package com.fourthline.nfc.internal;

import com.plaid.internal.EnumC4419g;
import java.io.InputStream;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements InterfaceC2829t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yq0.j f24519a;

    public D(dr0.w apduSender, dr0.y secureMessagingWrapper) {
        p013kotlin.jvm.internal.s.k(apduSender, "apduSender");
        p013kotlin.jvm.internal.s.k(secureMessagingWrapper, "secureMessagingWrapper");
        yq0.j jVar = new yq0.j(apduSender, false);
        jVar.j(secureMessagingWrapper);
        this.f24519a = jVar;
    }

    private final InputStream b(InterfaceC2828s interfaceC2828s) {
        try {
            this.f24519a.b(interfaceC2828s.a());
            return new ap0.b(new zo0.d(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, this.f24519a));
        } catch (CardServiceException unused) {
            return null;
        }
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2829t
    public InputStream a(InterfaceC2828s file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return b(file);
    }
}
