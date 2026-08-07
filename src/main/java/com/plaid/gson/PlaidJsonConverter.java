package com.plaid.gson;

import com.google.gson.f;
import com.google.gson.g;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.internal.classic.networking.adapter.AccountSubtypeAdapter;
import com.plaid.internal.classic.networking.adapter.AccountTypeAdapter;
import com.plaid.internal.classic.networking.adapter.LinkAccountVerificationStatusAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventViewNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkExitMetadataStatusAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorCodeAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorTypeAdapter;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/plaid/gson/PlaidJsonConverter;", "", "<init>", "()V", "Lcom/plaid/link/result/LinkSuccess;", "linkSuccess", "", "convert", "(Lcom/plaid/link/result/LinkSuccess;)Ljava/lang/String;", "Lcom/plaid/link/result/LinkExit;", "linkExit", "(Lcom/plaid/link/result/LinkExit;)Ljava/lang/String;", "Lcom/plaid/link/event/LinkEvent;", "linkEvent", "(Lcom/plaid/link/event/LinkEvent;)Ljava/lang/String;", "Lcom/google/gson/f;", "gson$delegate", "Lkotlin/Lazy;", "getGson", "()Lcom/google/gson/f;", "gson", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlaidJsonConverter {

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    private final Lazy gson = m.b(new a() { // from class: f00.a
        @Override // wn0.a
        public final Object invoke() {
            return PlaidJsonConverter.gson_delegate$lambda$1();
        }
    });

    private final f getGson() {
        Object value = this.gson.getValue();
        s.j(value, "getValue(...)");
        return (f) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f gson_delegate$lambda$1() {
        g gVar = new g();
        gVar.d(LinkAccount.class, new RNAccountAdapter());
        gVar.d(LinkInstitution.class, new RNLinkInstitutionAdapter());
        gVar.d(LinkAccountType.class, new AccountTypeAdapter());
        gVar.d(LinkAccountSubtype.class, new AccountSubtypeAdapter());
        gVar.d(LinkAccountVerificationStatus.class, new LinkAccountVerificationStatusAdapter());
        gVar.d(LinkEventViewName.class, new LinkEventViewNameAdapter());
        gVar.d(LinkEventName.class, new LinkEventNameAdapter());
        gVar.d(LinkEventMetadata.class, new RNEventMetadataAdapter());
        gVar.d(LinkErrorCode.class, new PlaidErrorCodeAdapter());
        gVar.d(LinkErrorType.class, new PlaidErrorTypeAdapter());
        gVar.d(LinkExitMetadataStatus.class, new LinkExitMetadataStatusAdapter());
        return gVar.b();
    }

    public final String convert(LinkSuccess linkSuccess) {
        s.k(linkSuccess, "linkSuccess");
        String strS = getGson().s(linkSuccess);
        s.j(strS, "toJson(...)");
        return strS;
    }

    public final String convert(LinkExit linkExit) {
        s.k(linkExit, "linkExit");
        String strS = getGson().s(linkExit);
        s.j(strS, "toJson(...)");
        return strS;
    }

    public final String convert(LinkEvent linkEvent) {
        s.k(linkEvent, "linkEvent");
        String strS = getGson().s(linkEvent);
        s.j(strS, "toJson(...)");
        return t.V(strS, "event_name", "event", false, 4, null);
    }
}
