package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iC, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0013\u001fB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/iC;", "", "", "enabled", "", "taxationCountry", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/iC;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "getTaxationCountry", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class TinSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String taxationCountry;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iC$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32461b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f32460a = aVar;
            f32461b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.TinSettings", aVar, 2);
            m1Var.o("enabled", true);
            m1Var.o("taxationCountry", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TinSettings deserialize(uo0.e decoder) {
            Boolean bool;
            String strT;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                bool = (Boolean) cVarB.v(fVar, 0, vo0.h.f119620a, null);
                strT = cVarB.t(fVar, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                bool = null;
                String strT2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        bool = (Boolean) cVarB.v(fVar, 0, vo0.h.f119620a, bool);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        strT2 = cVarB.t(fVar, 1);
                        i12 |= 2;
                    }
                }
                strT = strT2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new TinSettings(i11, bool, strT, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{so0.a.p(vo0.h.f119620a), vo0.z1.f119730a};
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
        public final void serialize(uo0.f encoder, TinSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            TinSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iC$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<TinSettings> serializer() {
            return a.f32460a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TinSettings(int i11, Boolean bool, String str, vo0.v1 v1Var) {
        if (2 != (i11 & 2)) {
            vo0.h1.b(i11, 2, a.f32460a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.enabled = null;
        } else {
            this.enabled = bool;
        }
        this.taxationCountry = str;
    }

    public static final /* synthetic */ void a(TinSettings self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.enabled != null) {
            output.y(serialDesc, 0, vo0.h.f119620a, self.enabled);
        }
        output.e(serialDesc, 1, self.taxationCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TinSettings)) {
            return false;
        }
        TinSettings tinSettings = (TinSettings) other;
        return p013kotlin.jvm.internal.s.f(this.enabled, tinSettings.enabled) && p013kotlin.jvm.internal.s.f(this.taxationCountry, tinSettings.taxationCountry);
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.taxationCountry.hashCode();
    }

    public String toString() {
        return "TinSettings(enabled=" + this.enabled + ", taxationCountry=" + this.taxationCountry + ")";
    }

    public TinSettings(Boolean bool, String taxationCountry) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        this.enabled = bool;
        this.taxationCountry = taxationCountry;
    }

    public /* synthetic */ TinSettings(Boolean bool, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, str);
    }
}
