package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Aq, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0010\u001dB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/fourthline/orca/internal/Aq;", "", "", "minimumAge", "<init>", "(I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Aq;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class PersonSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minimumAge;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Aq$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25023b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f25022a = aVar;
            f25023b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.PersonSettings", aVar, 1);
            m1Var.o("minimumAge", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PersonSettings deserialize(uo0.e decoder) {
            int iE;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            int i11 = 1;
            if (cVarB.i()) {
                iE = cVarB.e(fVar, 0);
            } else {
                boolean z11 = true;
                iE = 0;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        iE = cVarB.e(fVar, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarB.c(fVar);
            return new PersonSettings(i11, iE, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.j0.f119632a};
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
        public final void serialize(uo0.f encoder, PersonSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            PersonSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Aq$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<PersonSettings> serializer() {
            return a.f25022a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PersonSettings(int i11, int i12, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.minimumAge = 18;
        } else {
            this.minimumAge = i12;
        }
    }

    public static final /* synthetic */ void a(PersonSettings self, uo0.d output, to0.f serialDesc) {
        if (!output.G(serialDesc, 0) && self.minimumAge == 18) {
            return;
        }
        output.x(serialDesc, 0, self.minimumAge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PersonSettings) && this.minimumAge == ((PersonSettings) other).minimumAge;
    }

    public int hashCode() {
        return Integer.hashCode(this.minimumAge);
    }

    public String toString() {
        return "PersonSettings(minimumAge=" + this.minimumAge + ")";
    }

    public PersonSettings(int i11) {
        this.minimumAge = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMinimumAge() {
        return this.minimumAge;
    }

    public /* synthetic */ PersonSettings(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 18 : i11);
    }
}
