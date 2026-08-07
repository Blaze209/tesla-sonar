package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.a, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0012\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/a;", "", "", "accessTokenType", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/a;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class AccessToken {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accessTokenType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0539a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0539a f30253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30254b;
        private static final to0.f descriptor;

        static {
            C0539a c0539a = new C0539a();
            f30253a = c0539a;
            f30254b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.AccessToken", c0539a, 2);
            m1Var.o("accessTokenType", false);
            m1Var.o("value", false);
            descriptor = m1Var;
        }

        private C0539a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccessToken deserialize(uo0.e decoder) {
            String strT;
            String strT2;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                strT = cVarB.t(fVar, 0);
                strT2 = cVarB.t(fVar, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                strT = null;
                String strT3 = null;
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
                        strT3 = cVarB.t(fVar, 1);
                        i12 |= 2;
                    }
                }
                strT2 = strT3;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new AccessToken(i11, strT, strT2, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, z1Var};
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
        public final void serialize(uo0.f encoder, AccessToken value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            AccessToken.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<AccessToken> serializer() {
            return C0539a.f30253a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AccessToken(int i11, String str, String str2, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, C0539a.f30253a.getDescriptor());
        }
        this.accessTokenType = str;
        this.value = str2;
    }

    public static final /* synthetic */ void a(AccessToken self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.accessTokenType);
        output.e(serialDesc, 1, self.value);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        return p013kotlin.jvm.internal.s.f(this.accessTokenType, accessToken.accessTokenType) && p013kotlin.jvm.internal.s.f(this.value, accessToken.value);
    }

    public int hashCode() {
        return (this.accessTokenType.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "AccessToken(accessTokenType=" + this.accessTokenType + ", value=" + this.value + ")";
    }

    public AccessToken(String accessTokenType, String value) {
        p013kotlin.jvm.internal.s.k(accessTokenType, "accessTokenType");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.accessTokenType = accessTokenType;
        this.value = value;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessTokenType() {
        return this.accessTokenType;
    }
}
