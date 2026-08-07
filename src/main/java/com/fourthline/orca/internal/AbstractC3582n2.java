package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/internal/n2;", "", "<init>", "()V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/n2;Luo0/d;Lto0/f;)V", "Companion", "b", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/fourthline/orca/internal/n2$b;", "Lcom/fourthline/orca/internal/n2$c;", "Lcom/fourthline/orca/internal/n2$d;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public abstract class AbstractC3582n2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f33786a = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: com.fourthline.orca.internal.x71
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3582n2.a();
        }
    });

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ ro0.d a() {
            return (ro0.d) AbstractC3582n2.f33786a.getValue();
        }

        public final ro0.d<AbstractC3582n2> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002\u0015 BK\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0018¨\u0006."}, d2 = {"Lcom/fourthline/orca/internal/n2$b;", "Lcom/fourthline/orca/internal/n2;", "", "seen0", "", "amount", "", "recipientName", "recipientIban", "reference", "bic", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/n2$b;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getAmount", "()D", "c", "Ljava/lang/String;", "getRecipientName", DateTokenConverter.CONVERTER_KEY, "getRecipientIban", "e", "getReference", "f", "getBic", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Manual extends AbstractC3582n2 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String recipientName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String recipientIban;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reference;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bic;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$b$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33792a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33793b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33792a = aVar;
                f33793b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.model.BavProviderConfig.Manual", aVar, 5);
                m1Var.o("amount", false);
                m1Var.o("recipientName", false);
                m1Var.o("recipientIban", false);
                m1Var.o("reference", false);
                m1Var.o("bic", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Manual deserialize(uo0.e decoder) {
                String strT;
                String strT2;
                String strT3;
                String str;
                int i11;
                double d11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                if (cVarB.i()) {
                    double dS = cVarB.s(fVar, 0);
                    strT = cVarB.t(fVar, 1);
                    String strT4 = cVarB.t(fVar, 2);
                    strT2 = cVarB.t(fVar, 3);
                    strT3 = cVarB.t(fVar, 4);
                    str = strT4;
                    i11 = 31;
                    d11 = dS;
                } else {
                    strT = null;
                    String strT5 = null;
                    boolean z11 = true;
                    int i12 = 0;
                    double dS2 = 0.0d;
                    String strT6 = null;
                    String strT7 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            dS2 = cVarB.s(fVar, 0);
                            i12 |= 1;
                        } else if (iA == 1) {
                            strT = cVarB.t(fVar, 1);
                            i12 |= 2;
                        } else if (iA == 2) {
                            strT5 = cVarB.t(fVar, 2);
                            i12 |= 4;
                        } else if (iA == 3) {
                            strT6 = cVarB.t(fVar, 3);
                            i12 |= 8;
                        } else {
                            if (iA != 4) {
                                throw new UnknownFieldException(iA);
                            }
                            strT7 = cVarB.t(fVar, 4);
                            i12 |= 16;
                        }
                    }
                    strT2 = strT6;
                    strT3 = strT7;
                    str = strT5;
                    i11 = i12;
                    d11 = dS2;
                }
                String str2 = strT;
                cVarB.c(fVar);
                return new Manual(i11, d11, str2, str, strT2, strT3, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{vo0.t.f119690a, z1Var, z1Var, z1Var, z1Var};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Manual value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Manual.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Manual> serializer() {
                return a.f33792a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Manual(int i11, double d11, String str, String str2, String str3, String str4, vo0.v1 v1Var) {
            super(i11, v1Var);
            if (31 != (i11 & 31)) {
                vo0.h1.b(i11, 31, a.f33792a.getDescriptor());
            }
            this.amount = d11;
            this.recipientName = str;
            this.recipientIban = str2;
            this.reference = str3;
            this.bic = str4;
        }

        public static final /* synthetic */ void a(Manual self, uo0.d output, to0.f serialDesc) {
            AbstractC3582n2.a(self, output, serialDesc);
            output.k(serialDesc, 0, self.amount);
            output.e(serialDesc, 1, self.recipientName);
            output.e(serialDesc, 2, self.recipientIban);
            output.e(serialDesc, 3, self.reference);
            output.e(serialDesc, 4, self.bic);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Manual)) {
                return false;
            }
            Manual manual = (Manual) other;
            return Double.compare(this.amount, manual.amount) == 0 && p013kotlin.jvm.internal.s.f(this.recipientName, manual.recipientName) && p013kotlin.jvm.internal.s.f(this.recipientIban, manual.recipientIban) && p013kotlin.jvm.internal.s.f(this.reference, manual.reference) && p013kotlin.jvm.internal.s.f(this.bic, manual.bic);
        }

        public int hashCode() {
            return (((((((Double.hashCode(this.amount) * 31) + this.recipientName.hashCode()) * 31) + this.recipientIban.hashCode()) * 31) + this.reference.hashCode()) * 31) + this.bic.hashCode();
        }

        public String toString() {
            return "Manual(amount=" + this.amount + ", recipientName=" + this.recipientName + ", recipientIban=" + this.recipientIban + ", reference=" + this.reference + ", bic=" + this.bic + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$c, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002\u0017\"B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b)\u0010,¨\u0006."}, d2 = {"Lcom/fourthline/orca/internal/n2$c;", "Lcom/fourthline/orca/internal/n2;", "", "amount", "", "preferredMarket", "iban", "", "Lcom/fourthline/orca/internal/Z1;", "ibanConfiguration", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IDLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/n2$c;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getAmount", "()D", "c", "Ljava/lang/String;", "e", DateTokenConverter.CONVERTER_KEY, "getIban", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Sepa extends AbstractC3582n2 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f33794f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final ro0.d[] f33795g = {null, null, null, new vo0.e(BavIbanCountryConfig.a.f29963a)};

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String preferredMarket;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String iban;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List ibanConfiguration;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33801b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33800a = aVar;
                f33801b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.model.BavProviderConfig.Sepa", aVar, 4);
                m1Var.o("amount", false);
                m1Var.o("preferredMarket", false);
                m1Var.o("iban", true);
                m1Var.o("ibanConfiguration", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Sepa deserialize(uo0.e decoder) {
                int i11;
                String str;
                String str2;
                List list;
                double d11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = Sepa.f33795g;
                String strT = null;
                if (cVarB.i()) {
                    double dS = cVarB.s(fVar, 0);
                    String strT2 = cVarB.t(fVar, 1);
                    String str3 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, null);
                    list = (List) cVarB.n(fVar, 3, dVarArr[3], null);
                    str = strT2;
                    str2 = str3;
                    i11 = 15;
                    d11 = dS;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    double dS2 = 0.0d;
                    String str4 = null;
                    List list2 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            dS2 = cVarB.s(fVar, 0);
                            i12 |= 1;
                        } else if (iA == 1) {
                            strT = cVarB.t(fVar, 1);
                            i12 |= 2;
                        } else if (iA == 2) {
                            str4 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, str4);
                            i12 |= 4;
                        } else {
                            if (iA != 3) {
                                throw new UnknownFieldException(iA);
                            }
                            list2 = (List) cVarB.n(fVar, 3, dVarArr[3], list2);
                            i12 |= 8;
                        }
                    }
                    i11 = i12;
                    str = strT;
                    str2 = str4;
                    list = list2;
                    d11 = dS2;
                }
                cVarB.c(fVar);
                return new Sepa(i11, d11, str, str2, list, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = Sepa.f33795g;
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{vo0.t.f119690a, z1Var, so0.a.p(z1Var), dVarArr[3]};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Sepa value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Sepa.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Sepa> serializer() {
                return a.f33800a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Sepa(int i11, double d11, String str, String str2, List list, vo0.v1 v1Var) {
            super(i11, v1Var);
            if (11 != (i11 & 11)) {
                vo0.h1.b(i11, 11, a.f33800a.getDescriptor());
            }
            this.amount = d11;
            this.preferredMarket = str;
            if ((i11 & 4) == 0) {
                this.iban = null;
            } else {
                this.iban = str2;
            }
            this.ibanConfiguration = list;
        }

        public static final /* synthetic */ void a(Sepa self, uo0.d output, to0.f serialDesc) {
            AbstractC3582n2.a(self, output, serialDesc);
            ro0.d[] dVarArr = f33795g;
            output.k(serialDesc, 0, self.amount);
            output.e(serialDesc, 1, self.preferredMarket);
            if (output.G(serialDesc, 2) || self.iban != null) {
                output.y(serialDesc, 2, vo0.z1.f119730a, self.iban);
            }
            output.D(serialDesc, 3, dVarArr[3], self.ibanConfiguration);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getIbanConfiguration() {
            return this.ibanConfiguration;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPreferredMarket() {
            return this.preferredMarket;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sepa)) {
                return false;
            }
            Sepa sepa = (Sepa) other;
            return Double.compare(this.amount, sepa.amount) == 0 && p013kotlin.jvm.internal.s.f(this.preferredMarket, sepa.preferredMarket) && p013kotlin.jvm.internal.s.f(this.iban, sepa.iban) && p013kotlin.jvm.internal.s.f(this.ibanConfiguration, sepa.ibanConfiguration);
        }

        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.amount) * 31) + this.preferredMarket.hashCode()) * 31;
            String str = this.iban;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.ibanConfiguration.hashCode();
        }

        public String toString() {
            return "Sepa(amount=" + this.amount + ", preferredMarket=" + this.preferredMarket + ", iban=" + this.iban + ", ibanConfiguration=" + this.ibanConfiguration + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sepa(double d11, String preferredMarket, String str, List ibanConfiguration) {
            super(null);
            p013kotlin.jvm.internal.s.k(preferredMarket, "preferredMarket");
            p013kotlin.jvm.internal.s.k(ibanConfiguration, "ibanConfiguration");
            this.amount = d11;
            this.preferredMarket = preferredMarket;
            this.iban = str;
            this.ibanConfiguration = ibanConfiguration;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$d, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/n2$d;", "Lcom/fourthline/orca/internal/n2;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/n2$d;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Tink extends AbstractC3582n2 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String redirectUrl;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$d$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33804b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33803a = aVar;
                f33804b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.model.BavProviderConfig.Tink", aVar, 1);
                m1Var.o("redirectUrl", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Tink deserialize(uo0.e decoder) {
                String strT;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                vo0.v1 v1Var = null;
                if (cVarB.i()) {
                    strT = cVarB.t(fVar, 0);
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    strT = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            strT = cVarB.t(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Tink(i11, strT, v1Var);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.z1.f119730a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Tink value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Tink.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.n2$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Tink> serializer() {
                return a.f33803a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Tink(int i11, String str, vo0.v1 v1Var) {
            super(i11, v1Var);
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f33803a.getDescriptor());
            }
            this.redirectUrl = str;
        }

        public static final /* synthetic */ void a(Tink self, uo0.d output, to0.f serialDesc) {
            AbstractC3582n2.a(self, output, serialDesc);
            output.e(serialDesc, 0, self.redirectUrl);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tink) && p013kotlin.jvm.internal.s.f(this.redirectUrl, ((Tink) other).redirectUrl);
        }

        public int hashCode() {
            return this.redirectUrl.hashCode();
        }

        public String toString() {
            return "Tink(redirectUrl=" + this.redirectUrl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tink(String redirectUrl) {
            super(null);
            p013kotlin.jvm.internal.s.k(redirectUrl, "redirectUrl");
            this.redirectUrl = redirectUrl;
        }
    }

    public /* synthetic */ AbstractC3582n2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void a(AbstractC3582n2 self, uo0.d output, to0.f serialDesc) {
    }

    private AbstractC3582n2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ ro0.d a() {
        return new ro0.m("com.fourthline.orca.bav.internal.model.BavProviderConfig", p013kotlin.jvm.internal.o0.b(AbstractC3582n2.class), new co0.d[]{p013kotlin.jvm.internal.o0.b(Manual.class), p013kotlin.jvm.internal.o0.b(Sepa.class), p013kotlin.jvm.internal.o0.b(Tink.class)}, new ro0.d[]{Manual.a.f33792a, Sepa.a.f33800a, Tink.a.f33803a}, new Annotation[0]);
    }

    public /* synthetic */ AbstractC3582n2(int i11, vo0.v1 v1Var) {
    }
}
