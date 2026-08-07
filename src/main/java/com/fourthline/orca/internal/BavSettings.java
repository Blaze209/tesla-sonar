package com.fourthline.orca.internal;

import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r2, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0010\u001fB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/r2;", "", "", "seen0", "Lcom/fourthline/orca/internal/Fw;", "referencePayment", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILcom/fourthline/orca/internal/Fw;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/r2;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/Fw;", "getReferencePayment", "()Lcom/fourthline/orca/internal/Fw;", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class BavSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ro0.d[] f34961b = {new vo0.e1("com.fourthline.orca.core.internal.backend.model.ReferencePaymentSettings", Fw.INSTANCE, new Annotation[0])};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Fw referencePayment;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.r2$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34964b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f34963a = aVar;
            f34964b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.BavSettings", aVar, 1);
            m1Var.o("referencePayment", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BavSettings deserialize(uo0.e decoder) {
            Fw fw2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = BavSettings.f34961b;
            int i11 = 1;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                fw2 = (Fw) cVarB.n(fVar, 0, dVarArr[0], null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                Fw fw3 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        fw3 = (Fw) cVarB.n(fVar, 0, dVarArr[0], fw3);
                        i12 = 1;
                    }
                }
                fw2 = fw3;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new BavSettings(i11, fw2, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{BavSettings.f34961b[0]};
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
        public final void serialize(uo0.f encoder, BavSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            BavSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.r2$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<BavSettings> serializer() {
            return a.f34963a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BavSettings(int i11, Fw fw2, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f34963a.getDescriptor());
        }
        this.referencePayment = fw2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BavSettings) && p013kotlin.jvm.internal.s.f(this.referencePayment, ((BavSettings) other).referencePayment);
    }

    public int hashCode() {
        return this.referencePayment.hashCode();
    }

    public String toString() {
        return "BavSettings(referencePayment=" + this.referencePayment + ")";
    }

    public static final /* synthetic */ void a(BavSettings self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, f34961b[0], self.referencePayment);
    }
}
