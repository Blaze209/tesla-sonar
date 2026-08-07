package com.stripe.android.financialconnections.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.y, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0081\b\u0018\u0000 92\u00020\u0001:\u0002#)Bi\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010(\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010.\u0012\u0004\b1\u0010(\u001a\u0004\b/\u00100R.\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u00102\u0012\u0004\b5\u0010(\u001a\u0004\b3\u00104R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00106\u0012\u0004\b8\u0010(\u001a\u0004\b)\u00107¨\u0006:"}, d2 = {"Lcom/stripe/android/financialconnections/model/y;", "", "", "seen1", "", "Lcom/stripe/android/financialconnections/model/c0;", "data", "Lcom/stripe/android/financialconnections/model/n;", "display", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPaneOnAddAccount", "", "", "partnerToCoreAuths", "", "acquireConsentOnPrimaryCtaClick", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lcom/stripe/android/financialconnections/model/n;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;Ljava/lang/Boolean;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/stripe/android/financialconnections/model/y;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "getData$annotations", "()V", "b", "Lcom/stripe/android/financialconnections/model/n;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/n;", "getDisplay$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "e", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPaneOnAddAccount$annotations", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "getPartnerToCoreAuths$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getAcquireConsentOnPrimaryCtaClick$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class NetworkedAccountsList {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50588f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ro0.d<Object>[] f50589g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PartnerAccount> data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Display display;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane nextPaneOnAddAccount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> partnerToCoreAuths;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean acquireConsentOnPrimaryCtaClick;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.y$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/NetworkedAccountsList.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/y;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/y;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/y;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<NetworkedAccountsList> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50595a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50595a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.NetworkedAccountsList", aVar, 5);
            m1Var.o("data", false);
            m1Var.o("display", true);
            m1Var.o("next_pane_on_add_account", true);
            m1Var.o("partner_to_core_auths", true);
            m1Var.o("acquire_consent_on_primary_cta_click", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkedAccountsList deserialize(uo0.e decoder) {
            int i11;
            List list;
            Display nVar;
            FinancialConnectionsSessionManifest.Pane pane;
            Map map;
            Boolean bool;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = NetworkedAccountsList.f50589g;
            int i12 = 0;
            List list2 = null;
            if (cVarB.i()) {
                List list3 = (List) cVarB.n(descriptor2, 0, dVarArr[0], null);
                Display nVar2 = (Display) cVarB.v(descriptor2, 1, Display.a.f50529a, null);
                FinancialConnectionsSessionManifest.Pane pane2 = (FinancialConnectionsSessionManifest.Pane) cVarB.v(descriptor2, 2, FinancialConnectionsSessionManifest.Pane.c.f50360e, null);
                map = (Map) cVarB.v(descriptor2, 3, dVarArr[3], null);
                list = list3;
                bool = (Boolean) cVarB.v(descriptor2, 4, vo0.h.f119620a, null);
                pane = pane2;
                i11 = 31;
                nVar = nVar2;
            } else {
                int i13 = 1;
                int i14 = 0;
                Display nVar3 = null;
                FinancialConnectionsSessionManifest.Pane pane3 = null;
                Map map2 = null;
                Boolean bool2 = null;
                while (i13 != 0) {
                    int iA = cVarB.A(descriptor2);
                    int i15 = i12;
                    if (iA == -1) {
                        i12 = i15;
                        i13 = i12;
                    } else if (iA != 0) {
                        if (iA == 1) {
                            nVar3 = (Display) cVarB.v(descriptor2, 1, Display.a.f50529a, nVar3);
                            i14 |= 2;
                        } else if (iA == 2) {
                            pane3 = (FinancialConnectionsSessionManifest.Pane) cVarB.v(descriptor2, 2, FinancialConnectionsSessionManifest.Pane.c.f50360e, pane3);
                            i14 |= 4;
                        } else if (iA == 3) {
                            map2 = (Map) cVarB.v(descriptor2, 3, dVarArr[3], map2);
                            i14 |= 8;
                        } else {
                            if (iA != 4) {
                                throw new UnknownFieldException(iA);
                            }
                            bool2 = (Boolean) cVarB.v(descriptor2, 4, vo0.h.f119620a, bool2);
                            i14 |= 16;
                        }
                        i12 = i15;
                    } else {
                        list2 = (List) cVarB.n(descriptor2, i15, dVarArr[i15], list2);
                        i14 |= 1;
                        i12 = i15;
                    }
                }
                i11 = i14;
                list = list2;
                nVar = nVar3;
                pane = pane3;
                map = map2;
                bool = bool2;
            }
            cVarB.c(descriptor2);
            return new NetworkedAccountsList(i11, list, nVar, pane, map, bool, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, NetworkedAccountsList value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            NetworkedAccountsList.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = NetworkedAccountsList.f50589g;
            return new ro0.d[]{dVarArr[0], so0.a.p(Display.a.f50529a), so0.a.p(FinancialConnectionsSessionManifest.Pane.c.f50360e), so0.a.p(dVarArr[3]), so0.a.p(vo0.h.f119620a)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.y$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/y$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/y;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<NetworkedAccountsList> serializer() {
            return a.f50595a;
        }

        private Companion() {
        }
    }

    static {
        vo0.e eVar = new vo0.e(PartnerAccount.a.f50429a);
        z1 z1Var = z1.f119730a;
        f50589g = new ro0.d[]{eVar, null, null, new vo0.m0(z1Var, z1Var), null};
    }

    @jn0.e
    public /* synthetic */ NetworkedAccountsList(int i11, @ro0.o("data") List list, @ro0.o("display") Display nVar, @ro0.o("next_pane_on_add_account") FinancialConnectionsSessionManifest.Pane pane, @ro0.o("partner_to_core_auths") Map map, @ro0.o("acquire_consent_on_primary_cta_click") Boolean bool, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f50595a.getDescriptor());
        }
        this.data = list;
        if ((i11 & 2) == 0) {
            this.display = null;
        } else {
            this.display = nVar;
        }
        if ((i11 & 4) == 0) {
            this.nextPaneOnAddAccount = null;
        } else {
            this.nextPaneOnAddAccount = pane;
        }
        if ((i11 & 8) == 0) {
            this.partnerToCoreAuths = null;
        } else {
            this.partnerToCoreAuths = map;
        }
        if ((i11 & 16) == 0) {
            this.acquireConsentOnPrimaryCtaClick = Boolean.FALSE;
        } else {
            this.acquireConsentOnPrimaryCtaClick = bool;
        }
    }

    public static final /* synthetic */ void g(NetworkedAccountsList self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50589g;
        output.D(serialDesc, 0, dVarArr[0], self.data);
        if (output.G(serialDesc, 1) || self.display != null) {
            output.y(serialDesc, 1, Display.a.f50529a, self.display);
        }
        if (output.G(serialDesc, 2) || self.nextPaneOnAddAccount != null) {
            output.y(serialDesc, 2, FinancialConnectionsSessionManifest.Pane.c.f50360e, self.nextPaneOnAddAccount);
        }
        if (output.G(serialDesc, 3) || self.partnerToCoreAuths != null) {
            output.y(serialDesc, 3, dVarArr[3], self.partnerToCoreAuths);
        }
        if (!output.G(serialDesc, 4) && p013kotlin.jvm.internal.s.f(self.acquireConsentOnPrimaryCtaClick, Boolean.FALSE)) {
            return;
        }
        output.y(serialDesc, 4, vo0.h.f119620a, self.acquireConsentOnPrimaryCtaClick);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAcquireConsentOnPrimaryCtaClick() {
        return this.acquireConsentOnPrimaryCtaClick;
    }

    public final List<PartnerAccount> c() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPaneOnAddAccount() {
        return this.nextPaneOnAddAccount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkedAccountsList)) {
            return false;
        }
        NetworkedAccountsList networkedAccountsList = (NetworkedAccountsList) other;
        return p013kotlin.jvm.internal.s.f(this.data, networkedAccountsList.data) && p013kotlin.jvm.internal.s.f(this.display, networkedAccountsList.display) && this.nextPaneOnAddAccount == networkedAccountsList.nextPaneOnAddAccount && p013kotlin.jvm.internal.s.f(this.partnerToCoreAuths, networkedAccountsList.partnerToCoreAuths) && p013kotlin.jvm.internal.s.f(this.acquireConsentOnPrimaryCtaClick, networkedAccountsList.acquireConsentOnPrimaryCtaClick);
    }

    public final Map<String, String> f() {
        return this.partnerToCoreAuths;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        Display nVar = this.display;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnAddAccount;
        int iHashCode3 = (iHashCode2 + (pane == null ? 0 : pane.hashCode())) * 31;
        Map<String, String> map = this.partnerToCoreAuths;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.acquireConsentOnPrimaryCtaClick;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "NetworkedAccountsList(data=" + this.data + ", display=" + this.display + ", nextPaneOnAddAccount=" + this.nextPaneOnAddAccount + ", partnerToCoreAuths=" + this.partnerToCoreAuths + ", acquireConsentOnPrimaryCtaClick=" + this.acquireConsentOnPrimaryCtaClick + ")";
    }
}
