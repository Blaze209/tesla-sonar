package com.stripe.android.financialconnections.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.d0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002\u001f!BE\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/stripe/android/financialconnections/model/d0;", "", "", "seen1", "", "Lcom/stripe/android/financialconnections/model/c0;", "data", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPane", "", "skipAccountSelection", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Boolean;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lcom/stripe/android/financialconnections/model/d0;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getData$annotations", "()V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "c", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Boolean;", "getSkipAccountSelection$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class PartnerAccountsList {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50434d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d<Object>[] f50435e = {new vo0.e(PartnerAccount.a.f50429a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PartnerAccount> data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane nextPane;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean skipAccountSelection;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.d0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/PartnerAccountsList.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/d0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/d0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/d0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<PartnerAccountsList> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50439a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50439a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.PartnerAccountsList", aVar, 3);
            m1Var.o("data", false);
            m1Var.o("next_pane", false);
            m1Var.o("skip_account_selection", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PartnerAccountsList deserialize(uo0.e decoder) {
            int i11;
            List list;
            FinancialConnectionsSessionManifest.Pane pane;
            Boolean bool;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = PartnerAccountsList.f50435e;
            List list2 = null;
            if (cVarB.i()) {
                list = (List) cVarB.n(descriptor2, 0, dVarArr[0], null);
                pane = (FinancialConnectionsSessionManifest.Pane) cVarB.n(descriptor2, 1, FinancialConnectionsSessionManifest.Pane.c.f50360e, null);
                bool = (Boolean) cVarB.v(descriptor2, 2, vo0.h.f119620a, null);
                i11 = 7;
            } else {
                boolean z11 = true;
                int i12 = 0;
                FinancialConnectionsSessionManifest.Pane pane2 = null;
                Boolean bool2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        list2 = (List) cVarB.n(descriptor2, 0, dVarArr[0], list2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        pane2 = (FinancialConnectionsSessionManifest.Pane) cVarB.n(descriptor2, 1, FinancialConnectionsSessionManifest.Pane.c.f50360e, pane2);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        bool2 = (Boolean) cVarB.v(descriptor2, 2, vo0.h.f119620a, bool2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                list = list2;
                pane = pane2;
                bool = bool2;
            }
            cVarB.c(descriptor2);
            return new PartnerAccountsList(i11, list, pane, bool, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, PartnerAccountsList value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            PartnerAccountsList.e(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{PartnerAccountsList.f50435e[0], FinancialConnectionsSessionManifest.Pane.c.f50360e, so0.a.p(vo0.h.f119620a)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.d0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/d0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/d0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<PartnerAccountsList> serializer() {
            return a.f50439a;
        }

        private Companion() {
        }
    }

    @jn0.e
    public /* synthetic */ PartnerAccountsList(int i11, @ro0.o("data") List list, @ro0.o("next_pane") FinancialConnectionsSessionManifest.Pane pane, @ro0.o("skip_account_selection") Boolean bool, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, a.f50439a.getDescriptor());
        }
        this.data = list;
        this.nextPane = pane;
        if ((i11 & 4) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool;
        }
    }

    public static final /* synthetic */ void e(PartnerAccountsList self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, f50435e[0], self.data);
        output.D(serialDesc, 1, FinancialConnectionsSessionManifest.Pane.c.f50360e, self.nextPane);
        if (!output.G(serialDesc, 2) && self.skipAccountSelection == null) {
            return;
        }
        output.y(serialDesc, 2, vo0.h.f119620a, self.skipAccountSelection);
    }

    public final List<PartnerAccount> b() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerAccountsList)) {
            return false;
        }
        PartnerAccountsList partnerAccountsList = (PartnerAccountsList) other;
        return p013kotlin.jvm.internal.s.f(this.data, partnerAccountsList.data) && this.nextPane == partnerAccountsList.nextPane && p013kotlin.jvm.internal.s.f(this.skipAccountSelection, partnerAccountsList.skipAccountSelection);
    }

    public int hashCode() {
        int iHashCode = ((this.data.hashCode() * 31) + this.nextPane.hashCode()) * 31;
        Boolean bool = this.skipAccountSelection;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "PartnerAccountsList(data=" + this.data + ", nextPane=" + this.nextPane + ", skipAccountSelection=" + this.skipAccountSelection + ")";
    }
}
