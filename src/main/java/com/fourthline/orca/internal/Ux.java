package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0013\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/fourthline/orca/internal/Ux;", "", "", "enabled", "Lcom/fourthline/orca/internal/Vx;", "randomness", "<init>", "(ZLcom/fourthline/orca/internal/Vx;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLcom/fourthline/orca/internal/Vx;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Ux;Luo0/d;Lto0/f;)V", "Z", "()Z", "b", "Lcom/fourthline/orca/internal/Vx;", "()Lcom/fourthline/orca/internal/Vx;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final class Ux {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Vx randomness;

    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28938b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f28937a = aVar;
            f28938b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.selfie.SelfieLivenessConfig", aVar, 2);
            m1Var.o("enabled", false);
            m1Var.o("randomness", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ux deserialize(uo0.e decoder) {
            boolean zW;
            Vx vx2;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                zW = cVarB.w(fVar, 0);
                vx2 = (Vx) cVarB.n(fVar, 1, Vx.a.f29375a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                zW = false;
                int i12 = 0;
                Vx vx3 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(fVar, 0);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        vx3 = (Vx) cVarB.n(fVar, 1, Vx.a.f29375a, vx3);
                        i12 |= 2;
                    }
                }
                vx2 = vx3;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new Ux(i11, zW, vx2, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.h.f119620a, Vx.a.f29375a};
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
        public final void serialize(uo0.f encoder, Ux value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            Ux.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ux$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<Ux> serializer() {
            return a.f28937a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Ux(int i11, boolean z11, Vx vx2, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f28937a.getDescriptor());
        }
        this.enabled = z11;
        this.randomness = vx2;
    }

    public static final /* synthetic */ void a(Ux self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.enabled);
        output.D(serialDesc, 1, Vx.a.f29375a, self.randomness);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Vx getRandomness() {
        return this.randomness;
    }

    public Ux(boolean z11, Vx randomness) {
        p013kotlin.jvm.internal.s.k(randomness, "randomness");
        this.enabled = z11;
        this.randomness = randomness;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }
}
