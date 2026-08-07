package com.stripe.android.financialconnections.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0081\b\u0018\u0000 42\u00020\u0001:\u0003 %5BW\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010$\u001a\u0004\b'\u0010(R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010&\u0012\u0004\b/\u0010$\u001a\u0004\b%\u0010(R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u0010$\u001a\u0004\b*\u00102¨\u00066"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "", "", "seen1", "", "id", "", "eligibleForNetworking", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "microdepositVerificationMethod", "networkingSuccessful", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPane", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "Ljava/lang/Boolean;", "getEligibleForNetworking", "()Ljava/lang/Boolean;", "getEligibleForNetworking$annotations", "c", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "getMicrodepositVerificationMethod", "()Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "getMicrodepositVerificationMethod$annotations", "getNetworkingSuccessful$annotations", "e", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "Companion", "MicrodepositVerificationMethod", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class LinkAccountSessionPaymentAccount {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d<Object>[] f50366f = {null, null, MicrodepositVerificationMethod.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean eligibleForNetworking;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MicrodepositVerificationMethod microdepositVerificationMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean networkingSuccessful;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane nextPane;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "AMOUNTS", "DESCRIPTOR_CODE", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p
    public enum MicrodepositVerificationMethod {
        AMOUNTS("amounts"),
        DESCRIPTOR_CODE("descriptor_code"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50372c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50372c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return vo0.a0.a("com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod", MicrodepositVerificationMethod.values(), new String[]{"amounts", "descriptor_code", "unknown"}, new Annotation[][]{null, null, null}, null);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) MicrodepositVerificationMethod.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<MicrodepositVerificationMethod> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        MicrodepositVerificationMethod(String str) {
            this.value = str;
        }

        public static EnumEntries<MicrodepositVerificationMethod> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<LinkAccountSessionPaymentAccount> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50373a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50373a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount", aVar, 5);
            m1Var.o("id", false);
            m1Var.o("eligible_for_networking", true);
            m1Var.o("microdeposit_verification_method", true);
            m1Var.o("networking_successful", true);
            m1Var.o("next_pane", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkAccountSessionPaymentAccount deserialize(uo0.e decoder) {
            int i11;
            String str;
            Boolean bool;
            MicrodepositVerificationMethod microdepositVerificationMethod;
            Boolean bool2;
            FinancialConnectionsSessionManifest.Pane pane;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = LinkAccountSessionPaymentAccount.f50366f;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                vo0.h hVar = vo0.h.f119620a;
                Boolean bool3 = (Boolean) cVarB.v(descriptor2, 1, hVar, null);
                microdepositVerificationMethod = (MicrodepositVerificationMethod) cVarB.n(descriptor2, 2, dVarArr[2], null);
                str = strT2;
                bool2 = (Boolean) cVarB.v(descriptor2, 3, hVar, null);
                pane = (FinancialConnectionsSessionManifest.Pane) cVarB.v(descriptor2, 4, FinancialConnectionsSessionManifest.Pane.c.f50360e, null);
                i11 = 31;
                bool = bool3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Boolean bool4 = null;
                MicrodepositVerificationMethod microdepositVerificationMethod2 = null;
                Boolean bool5 = null;
                FinancialConnectionsSessionManifest.Pane pane2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        bool4 = (Boolean) cVarB.v(descriptor2, 1, vo0.h.f119620a, bool4);
                        i12 |= 2;
                    } else if (iA == 2) {
                        microdepositVerificationMethod2 = (MicrodepositVerificationMethod) cVarB.n(descriptor2, 2, dVarArr[2], microdepositVerificationMethod2);
                        i12 |= 4;
                    } else if (iA == 3) {
                        bool5 = (Boolean) cVarB.v(descriptor2, 3, vo0.h.f119620a, bool5);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        pane2 = (FinancialConnectionsSessionManifest.Pane) cVarB.v(descriptor2, 4, FinancialConnectionsSessionManifest.Pane.c.f50360e, pane2);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                str = strT;
                bool = bool4;
                microdepositVerificationMethod = microdepositVerificationMethod2;
                bool2 = bool5;
                pane = pane2;
            }
            cVarB.c(descriptor2);
            return new LinkAccountSessionPaymentAccount(i11, str, bool, microdepositVerificationMethod, bool2, pane, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, LinkAccountSessionPaymentAccount value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            LinkAccountSessionPaymentAccount.d(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = LinkAccountSessionPaymentAccount.f50366f;
            vo0.h hVar = vo0.h.f119620a;
            return new ro0.d[]{z1.f119730a, so0.a.p(hVar), dVarArr[2], so0.a.p(hVar), so0.a.p(FinancialConnectionsSessionManifest.Pane.c.f50360e)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<LinkAccountSessionPaymentAccount> serializer() {
            return a.f50373a;
        }

        private Companion() {
        }
    }

    @jn0.e
    public /* synthetic */ LinkAccountSessionPaymentAccount(int i11, @ro0.o("id") String str, @ro0.o("eligible_for_networking") Boolean bool, @ro0.o("microdeposit_verification_method") MicrodepositVerificationMethod microdepositVerificationMethod, @ro0.o("networking_successful") Boolean bool2, @ro0.o("next_pane") FinancialConnectionsSessionManifest.Pane pane, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f50373a.getDescriptor());
        }
        this.id = str;
        if ((i11 & 2) == 0) {
            this.eligibleForNetworking = null;
        } else {
            this.eligibleForNetworking = bool;
        }
        if ((i11 & 4) == 0) {
            this.microdepositVerificationMethod = MicrodepositVerificationMethod.UNKNOWN;
        } else {
            this.microdepositVerificationMethod = microdepositVerificationMethod;
        }
        if ((i11 & 8) == 0) {
            this.networkingSuccessful = null;
        } else {
            this.networkingSuccessful = bool2;
        }
        if ((i11 & 16) == 0) {
            this.nextPane = null;
        } else {
            this.nextPane = pane;
        }
    }

    public static final /* synthetic */ void d(LinkAccountSessionPaymentAccount self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50366f;
        output.e(serialDesc, 0, self.id);
        if (output.G(serialDesc, 1) || self.eligibleForNetworking != null) {
            output.y(serialDesc, 1, vo0.h.f119620a, self.eligibleForNetworking);
        }
        if (output.G(serialDesc, 2) || self.microdepositVerificationMethod != MicrodepositVerificationMethod.UNKNOWN) {
            output.D(serialDesc, 2, dVarArr[2], self.microdepositVerificationMethod);
        }
        if (output.G(serialDesc, 3) || self.networkingSuccessful != null) {
            output.y(serialDesc, 3, vo0.h.f119620a, self.networkingSuccessful);
        }
        if (!output.G(serialDesc, 4) && self.nextPane == null) {
            return;
        }
        output.y(serialDesc, 4, FinancialConnectionsSessionManifest.Pane.c.f50360e, self.nextPane);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getNetworkingSuccessful() {
        return this.networkingSuccessful;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccountSessionPaymentAccount)) {
            return false;
        }
        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) other;
        return p013kotlin.jvm.internal.s.f(this.id, linkAccountSessionPaymentAccount.id) && p013kotlin.jvm.internal.s.f(this.eligibleForNetworking, linkAccountSessionPaymentAccount.eligibleForNetworking) && this.microdepositVerificationMethod == linkAccountSessionPaymentAccount.microdepositVerificationMethod && p013kotlin.jvm.internal.s.f(this.networkingSuccessful, linkAccountSessionPaymentAccount.networkingSuccessful) && this.nextPane == linkAccountSessionPaymentAccount.nextPane;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Boolean bool = this.eligibleForNetworking;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.microdepositVerificationMethod.hashCode()) * 31;
        Boolean bool2 = this.networkingSuccessful;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        return iHashCode3 + (pane != null ? pane.hashCode() : 0);
    }

    public String toString() {
        return "LinkAccountSessionPaymentAccount(id=" + this.id + ", eligibleForNetworking=" + this.eligibleForNetworking + ", microdepositVerificationMethod=" + this.microdepositVerificationMethod + ", networkingSuccessful=" + this.networkingSuccessful + ", nextPane=" + this.nextPane + ")";
    }
}
