package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Z1, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0012\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/Z1;", "", "", "countryCode", "", "length", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Z1;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "I", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class BavIbanCountryConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int length;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Z1$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29964b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f29963a = aVar;
            f29964b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.model.BavIbanCountryConfig", aVar, 2);
            m1Var.o("countryCode", false);
            m1Var.o("length", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BavIbanCountryConfig deserialize(uo0.e decoder) {
            String strT;
            int iE;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                strT = cVarB.t(fVar, 0);
                iE = cVarB.e(fVar, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int iE2 = 0;
                int i12 = 0;
                strT = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        iE2 = cVarB.e(fVar, 1);
                        i12 |= 2;
                    }
                }
                iE = iE2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new BavIbanCountryConfig(i11, strT, iE, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a, vo0.j0.f119632a};
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
        public final void serialize(uo0.f encoder, BavIbanCountryConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            BavIbanCountryConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Z1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<BavIbanCountryConfig> serializer() {
            return a.f29963a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BavIbanCountryConfig(int i11, String str, int i12, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f29963a.getDescriptor());
        }
        this.countryCode = str;
        this.length = i12;
    }

    public static final /* synthetic */ void a(BavIbanCountryConfig self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.countryCode);
        output.x(serialDesc, 1, self.length);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BavIbanCountryConfig)) {
            return false;
        }
        BavIbanCountryConfig bavIbanCountryConfig = (BavIbanCountryConfig) other;
        return p013kotlin.jvm.internal.s.f(this.countryCode, bavIbanCountryConfig.countryCode) && this.length == bavIbanCountryConfig.length;
    }

    public int hashCode() {
        return (this.countryCode.hashCode() * 31) + Integer.hashCode(this.length);
    }

    public String toString() {
        return "BavIbanCountryConfig(countryCode=" + this.countryCode + ", length=" + this.length + ")";
    }

    public BavIbanCountryConfig(String countryCode, int i11) {
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        this.countryCode = countryCode;
        this.length = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }
}
