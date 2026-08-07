package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gj, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\u0012\u001eB-\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lcom/fourthline/orca/internal/gj;", "", "", "seen0", "", "enabled", "Lcom/fourthline/orca/internal/Dw;", "randomness", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(IZLcom/fourthline/orca/internal/Dw;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/gj;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "b", "Lcom/fourthline/orca/internal/Dw;", "()Lcom/fourthline/orca/internal/Dw;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class LivenessSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RandomnessSettings randomness;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gj$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32032b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f32031a = aVar;
            f32032b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.LivenessSettings", aVar, 2);
            m1Var.o("enabled", false);
            m1Var.o("randomness", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LivenessSettings deserialize(uo0.e decoder) {
            boolean zW;
            RandomnessSettings randomnessSettings;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                zW = cVarB.w(fVar, 0);
                randomnessSettings = (RandomnessSettings) cVarB.v(fVar, 1, RandomnessSettings.a.f25516a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                zW = false;
                int i12 = 0;
                RandomnessSettings randomnessSettings2 = null;
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
                        randomnessSettings2 = (RandomnessSettings) cVarB.v(fVar, 1, RandomnessSettings.a.f25516a, randomnessSettings2);
                        i12 |= 2;
                    }
                }
                randomnessSettings = randomnessSettings2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new LivenessSettings(i11, zW, randomnessSettings, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.h.f119620a, so0.a.p(RandomnessSettings.a.f25516a)};
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
        public final void serialize(uo0.f encoder, LivenessSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            LivenessSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gj$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<LivenessSettings> serializer() {
            return a.f32031a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LivenessSettings(int i11, boolean z11, RandomnessSettings randomnessSettings, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f32031a.getDescriptor());
        }
        this.enabled = z11;
        if ((i11 & 2) == 0) {
            this.randomness = null;
        } else {
            this.randomness = randomnessSettings;
        }
    }

    public static final /* synthetic */ void a(LivenessSettings self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.enabled);
        if (!output.G(serialDesc, 1) && self.randomness == null) {
            return;
        }
        output.y(serialDesc, 1, RandomnessSettings.a.f25516a, self.randomness);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RandomnessSettings getRandomness() {
        return this.randomness;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessSettings)) {
            return false;
        }
        LivenessSettings livenessSettings = (LivenessSettings) other;
        return this.enabled == livenessSettings.enabled && p013kotlin.jvm.internal.s.f(this.randomness, livenessSettings.randomness);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        RandomnessSettings randomnessSettings = this.randomness;
        return iHashCode + (randomnessSettings == null ? 0 : randomnessSettings.hashCode());
    }

    public String toString() {
        return "LivenessSettings(enabled=" + this.enabled + ", randomness=" + this.randomness + ")";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }
}
