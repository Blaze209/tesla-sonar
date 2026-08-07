package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface N2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/internal/N2$a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public enum a {
        NoMatch,
        InvalidFormat,
        UnsupportedCountry,
        UnsupportedSepa;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f27003g = on0.a.a(a());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Lazy f26997a = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: com.fourthline.orca.internal.lj0
            @Override // wn0.a
            public final Object invoke() {
                return N2.a.b();
            }
        });

        /* JADX INFO: renamed from: com.fourthline.orca.internal.N2$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) a.f26997a.getValue();
            }

            public final ro0.d<a> serializer() {
                return a();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ ro0.d b() {
            return vo0.a0.a("com.fourthline.orca.bav.internal.worker.BavValidateIbanWorker.BavValidateIbanError", values(), new String[]{"no-match", "invalid-format", "unsupported-country", "unsupported-sepa"}, new Annotation[][]{null, null, null, null}, null);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.N2$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0015!B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010%¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/N2$b;", "", "", "match", "", "iban", "Lcom/fourthline/orca/internal/N2$a;", AnalyticsAttribute.Error, "<init>", "(ZLjava/lang/String;Lcom/fourthline/orca/internal/N2$a;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLjava/lang/String;Lcom/fourthline/orca/internal/N2$a;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/N2$b;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "Ljava/lang/String;", "getIban", "Lcom/fourthline/orca/internal/N2$a;", "()Lcom/fourthline/orca/internal/N2$a;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class BavValidateIbanResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ro0.d[] f27004d = {null, null, a.INSTANCE.serializer()};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean match;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String iban;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a error;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.N2$b$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27009b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f27008a = aVar;
                f27009b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.worker.BavValidateIbanWorker.BavValidateIbanResult", aVar, 3);
                m1Var.o("match", false);
                m1Var.o("iban", false);
                m1Var.o(AnalyticsAttribute.Error, false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BavValidateIbanResult deserialize(uo0.e decoder) {
                boolean zW;
                int i11;
                String str;
                a aVar;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = BavValidateIbanResult.f27004d;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                    String strT = cVarB.t(fVar, 1);
                    aVar = (a) cVarB.v(fVar, 2, dVarArr[2], null);
                    i11 = 7;
                    str = strT;
                } else {
                    boolean z11 = true;
                    zW = false;
                    String strT2 = null;
                    a aVar2 = null;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            zW = cVarB.w(fVar, 0);
                            i12 |= 1;
                        } else if (iA == 1) {
                            strT2 = cVarB.t(fVar, 1);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            aVar2 = (a) cVarB.v(fVar, 2, dVarArr[2], aVar2);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    str = strT2;
                    aVar = aVar2;
                }
                boolean z12 = zW;
                cVarB.c(fVar);
                return new BavValidateIbanResult(i11, z12, str, aVar, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a, vo0.z1.f119730a, so0.a.p(BavValidateIbanResult.f27004d[2])};
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
            public final void serialize(uo0.f encoder, BavValidateIbanResult value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                BavValidateIbanResult.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.N2$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<BavValidateIbanResult> serializer() {
                return a.f27008a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BavValidateIbanResult(int i11, boolean z11, String str, a aVar, vo0.v1 v1Var) {
            if (7 != (i11 & 7)) {
                vo0.h1.b(i11, 7, a.f27008a.getDescriptor());
            }
            this.match = z11;
            this.iban = str;
            this.error = aVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getMatch() {
            return this.match;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BavValidateIbanResult)) {
                return false;
            }
            BavValidateIbanResult bavValidateIbanResult = (BavValidateIbanResult) other;
            return this.match == bavValidateIbanResult.match && p013kotlin.jvm.internal.s.f(this.iban, bavValidateIbanResult.iban) && this.error == bavValidateIbanResult.error;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.match) * 31) + this.iban.hashCode()) * 31;
            a aVar = this.error;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "BavValidateIbanResult(match=" + this.match + ", iban=" + this.iban + ", error=" + this.error + ")";
        }

        public BavValidateIbanResult(boolean z11, String iban, a aVar) {
            p013kotlin.jvm.internal.s.k(iban, "iban");
            this.match = z11;
            this.iban = iban;
            this.error = aVar;
        }

        public static final /* synthetic */ void a(BavValidateIbanResult self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f27004d;
            output.A(serialDesc, 0, self.match);
            output.e(serialDesc, 1, self.iban);
            output.y(serialDesc, 2, dVarArr[2], self.error);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27011b;

        public c(String workflowId, String iban) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(iban, "iban");
            this.f27010a = workflowId;
            this.f27011b = iban;
        }

        public final String a() {
            return this.f27011b;
        }

        public final String b() {
            return this.f27010a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p013kotlin.jvm.internal.s.f(this.f27010a, cVar.f27010a) && p013kotlin.jvm.internal.s.f(this.f27011b, cVar.f27011b);
        }

        public int hashCode() {
            return (this.f27010a.hashCode() * 31) + this.f27011b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f27010a + ", iban=" + this.f27011b + ")";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BavValidateIbanResult f27012a;

        public d(BavValidateIbanResult result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f27012a = result;
        }

        public final BavValidateIbanResult a() {
            return this.f27012a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f27012a, ((d) obj).f27012a);
        }

        public int hashCode() {
            return this.f27012a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f27012a + ")";
        }
    }

    Object a(c cVar, Continuation continuation);
}
