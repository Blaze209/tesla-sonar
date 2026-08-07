package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m2, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\u0014!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b!\u0010\u001a¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/m2;", "", "Lcom/fourthline/orca/internal/H2;", "name", "", "fast", "", "amount", "<init>", "(Lcom/fourthline/orca/internal/H2;ZI)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/H2;ZILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/m2;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/H2;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/H2;", "b", "Z", "c", "()Z", "I", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class BavPaymentMethod {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d[] f33491d = {H2.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final H2 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean fast;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int amount;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.m2$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33496b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33495a = aVar;
            f33496b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.model.BavPaymentMethod", aVar, 3);
            m1Var.o("name", false);
            m1Var.o("fast", false);
            m1Var.o("amount", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BavPaymentMethod deserialize(uo0.e decoder) {
            boolean zW;
            int iE;
            int i11;
            H2 h11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = BavPaymentMethod.f33491d;
            if (cVarB.i()) {
                H2 h12 = (H2) cVarB.n(fVar, 0, dVarArr[0], null);
                zW = cVarB.w(fVar, 1);
                h11 = h12;
                iE = cVarB.e(fVar, 2);
                i11 = 7;
            } else {
                boolean z11 = true;
                zW = false;
                int i12 = 0;
                H2 h13 = null;
                int iE2 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        h13 = (H2) cVarB.n(fVar, 0, dVarArr[0], h13);
                        i12 |= 1;
                    } else if (iA == 1) {
                        zW = cVarB.w(fVar, 1);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        iE2 = cVarB.e(fVar, 2);
                        i12 |= 4;
                    }
                }
                iE = iE2;
                i11 = i12;
                h11 = h13;
            }
            boolean z12 = zW;
            cVarB.c(fVar);
            return new BavPaymentMethod(i11, h11, z12, iE, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{BavPaymentMethod.f33491d[0], vo0.h.f119620a, vo0.j0.f119632a};
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
        public final void serialize(uo0.f encoder, BavPaymentMethod value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            BavPaymentMethod.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.m2$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<BavPaymentMethod> serializer() {
            return a.f33495a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BavPaymentMethod(int i11, H2 h11, boolean z11, int i12, vo0.v1 v1Var) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f33495a.getDescriptor());
        }
        this.name = h11;
        this.fast = z11;
        this.amount = i12;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFast() {
        return this.fast;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final H2 getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BavPaymentMethod)) {
            return false;
        }
        BavPaymentMethod bavPaymentMethod = (BavPaymentMethod) other;
        return this.name == bavPaymentMethod.name && this.fast == bavPaymentMethod.fast && this.amount == bavPaymentMethod.amount;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Boolean.hashCode(this.fast)) * 31) + Integer.hashCode(this.amount);
    }

    public String toString() {
        return "BavPaymentMethod(name=" + this.name + ", fast=" + this.fast + ", amount=" + this.amount + ")";
    }

    public BavPaymentMethod(H2 name, boolean z11, int i11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.name = name;
        this.fast = z11;
        this.amount = i11;
    }

    public static final /* synthetic */ void a(BavPaymentMethod self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, f33491d[0], self.name);
        output.A(serialDesc, 1, self.fast);
        output.x(serialDesc, 2, self.amount);
    }
}
