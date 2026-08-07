package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Zn, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0010\u001dB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/fourthline/orca/internal/Zn;", "", "", "seen0", "", "mrzString", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Zn;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMrzString", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class OcrMrzData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mrzString;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zn$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30094b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f30093a = aVar;
            f30094b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.capabilities.documentrecognition.network.analysis.OcrMrzData", aVar, 1);
            m1Var.o("mrzString", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OcrMrzData deserialize(uo0.e decoder) {
            String str;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            int i11 = 1;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                str = (String) cVarB.v(fVar, 0, vo0.z1.f119730a, null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        str = (String) cVarB.v(fVar, 0, vo0.z1.f119730a, str);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarB.c(fVar);
            return new OcrMrzData(i11, str, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{so0.a.p(vo0.z1.f119730a)};
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
        public final void serialize(uo0.f encoder, OcrMrzData value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            OcrMrzData.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zn$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<OcrMrzData> serializer() {
            return a.f30093a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OcrMrzData(int i11, String str, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.mrzString = null;
        } else {
            this.mrzString = str;
        }
    }

    public static final /* synthetic */ void a(OcrMrzData self, uo0.d output, to0.f serialDesc) {
        if (!output.G(serialDesc, 0) && self.mrzString == null) {
            return;
        }
        output.y(serialDesc, 0, vo0.z1.f119730a, self.mrzString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OcrMrzData) && p013kotlin.jvm.internal.s.f(this.mrzString, ((OcrMrzData) other).mrzString);
    }

    public int hashCode() {
        String str = this.mrzString;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "OcrMrzData(mrzString=" + this.mrzString + ")";
    }
}
