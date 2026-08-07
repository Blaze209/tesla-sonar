package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class M0 implements Parcelable {
    public static final Parcelable.Creator<M0> CREATOR = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ro0.d<Object>[] f46440j = {null, null, null, null, null, null, null, null, new vo0.e(vo0.z1.f119730a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L0 f46448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f46449i;

    @jn0.e
    public static final class a implements vo0.e0<M0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46451b;

        static {
            a aVar = new a();
            f46450a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.models.EmbeddedSessionInfo", aVar, 9);
            m1Var.o("link_token", false);
            m1Var.o("link_open_id", false);
            m1Var.o("link_persistent_id", false);
            m1Var.o("institution_id", true);
            m1Var.o("webview_fallback_id", true);
            m1Var.o("enable_account_select", true);
            m1Var.o("embedded_workflow_session_id", true);
            m1Var.o("embedded_open_link_configuration", true);
            m1Var.o("web3_valid_chains", true);
            f46451b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = M0.f46440j;
            ro0.d<?> dVarP = so0.a.p(L0.a.f46418a);
            ro0.d<?> dVar = dVarArr[8];
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, z1Var, z1Var, z1Var, vo0.h.f119620a, z1Var, dVarP, dVar};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            boolean z11;
            List list;
            L0 l11;
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46451b;
            uo0.c cVarB = decoder.b(m1Var);
            ro0.d<Object>[] dVarArr = M0.f46440j;
            if (cVarB.i()) {
                String strT = cVarB.t(m1Var, 0);
                String strT2 = cVarB.t(m1Var, 1);
                String strT3 = cVarB.t(m1Var, 2);
                String strT4 = cVarB.t(m1Var, 3);
                String strT5 = cVarB.t(m1Var, 4);
                boolean zW = cVarB.w(m1Var, 5);
                String strT6 = cVarB.t(m1Var, 6);
                L0 l12 = (L0) cVarB.v(m1Var, 7, L0.a.f46418a, null);
                list = (List) cVarB.n(m1Var, 8, dVarArr[8], null);
                str = strT;
                l11 = l12;
                str6 = strT6;
                z11 = zW;
                str4 = strT4;
                str5 = strT5;
                str3 = strT3;
                i11 = 511;
                str2 = strT2;
            } else {
                boolean z12 = true;
                boolean zW2 = false;
                List list2 = null;
                String strT7 = null;
                String strT8 = null;
                String strT9 = null;
                String strT10 = null;
                String strT11 = null;
                String strT12 = null;
                int i12 = 0;
                L0 l13 = null;
                while (z12) {
                    int iA = cVarB.A(m1Var);
                    switch (iA) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            i12 |= 1;
                            strT7 = cVarB.t(m1Var, 0);
                            continue;
                        case 1:
                            i12 |= 2;
                            strT8 = cVarB.t(m1Var, 1);
                            continue;
                        case 2:
                            strT9 = cVarB.t(m1Var, 2);
                            i12 |= 4;
                            continue;
                        case 3:
                            strT10 = cVarB.t(m1Var, 3);
                            i12 |= 8;
                            break;
                        case 4:
                            strT11 = cVarB.t(m1Var, 4);
                            i12 |= 16;
                            break;
                        case 5:
                            zW2 = cVarB.w(m1Var, 5);
                            i12 |= 32;
                            break;
                        case 6:
                            strT12 = cVarB.t(m1Var, 6);
                            i12 |= 64;
                            break;
                        case 7:
                            l13 = (L0) cVarB.v(m1Var, 7, L0.a.f46418a, l13);
                            i12 |= 128;
                            break;
                        case 8:
                            list2 = (List) cVarB.n(m1Var, 8, dVarArr[8], list2);
                            i12 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                z11 = zW2;
                list = list2;
                l11 = l13;
                i11 = i12;
                str = strT7;
                str2 = strT8;
                str3 = strT9;
                str4 = strT10;
                str5 = strT11;
                str6 = strT12;
            }
            cVarB.c(m1Var);
            return new M0(i11, str, str2, str3, str4, str5, z11, str6, l11, list);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46451b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            M0 value = (M0) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46451b;
            uo0.d dVarB = encoder.b(m1Var);
            ro0.d<Object>[] dVarArr = M0.f46440j;
            dVarB.e(m1Var, 0, value.f46441a);
            dVarB.e(m1Var, 1, value.f46442b);
            dVarB.e(m1Var, 2, value.f46443c);
            if (dVarB.G(m1Var, 3) || !p013kotlin.jvm.internal.s.f(value.f46444d, "")) {
                dVarB.e(m1Var, 3, value.f46444d);
            }
            if (dVarB.G(m1Var, 4) || !p013kotlin.jvm.internal.s.f(value.f46445e, "")) {
                dVarB.e(m1Var, 4, value.f46445e);
            }
            if (dVarB.G(m1Var, 5) || value.f46446f) {
                dVarB.A(m1Var, 5, value.f46446f);
            }
            if (dVarB.G(m1Var, 6) || !p013kotlin.jvm.internal.s.f(value.f46447g, "")) {
                dVarB.e(m1Var, 6, value.f46447g);
            }
            if (dVarB.G(m1Var, 7) || value.f46448h != null) {
                dVarB.y(m1Var, 7, L0.a.f46418a, value.f46448h);
            }
            if (dVarB.G(m1Var, 8) || !p013kotlin.jvm.internal.s.f(value.f46449i, p013kotlin.collections.v.m())) {
                dVarB.D(m1Var, 8, dVarArr[8], value.f46449i);
            }
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<M0> {
        @Override // android.os.Parcelable.Creator
        public final M0 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new M0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : L0.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final M0[] newArray(int i11) {
            return new M0[i11];
        }
    }

    @jn0.e
    public M0(int i11, @ro0.o("link_token") String str, @ro0.o("link_open_id") String str2, @ro0.o("link_persistent_id") String str3, @ro0.o("institution_id") String str4, @ro0.o("webview_fallback_id") String str5, @ro0.o("enable_account_select") boolean z11, @ro0.o("embedded_workflow_session_id") String str6, @ro0.o("embedded_open_link_configuration") L0 l11, @ro0.o("web3_valid_chains") List list) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f46451b);
        }
        this.f46441a = str;
        this.f46442b = str2;
        this.f46443c = str3;
        if ((i11 & 8) == 0) {
            this.f46444d = "";
        } else {
            this.f46444d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f46445e = "";
        } else {
            this.f46445e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f46446f = false;
        } else {
            this.f46446f = z11;
        }
        if ((i11 & 64) == 0) {
            this.f46447g = "";
        } else {
            this.f46447g = str6;
        }
        if ((i11 & 128) == 0) {
            this.f46448h = null;
        } else {
            this.f46448h = l11;
        }
        if ((i11 & 256) == 0) {
            this.f46449i = p013kotlin.collections.v.m();
        } else {
            this.f46449i = list;
        }
    }

    public final String a() {
        return this.f46442b;
    }

    public final String b() {
        return this.f46441a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m11 = (M0) obj;
        return p013kotlin.jvm.internal.s.f(this.f46441a, m11.f46441a) && p013kotlin.jvm.internal.s.f(this.f46442b, m11.f46442b) && p013kotlin.jvm.internal.s.f(this.f46443c, m11.f46443c) && p013kotlin.jvm.internal.s.f(this.f46444d, m11.f46444d) && p013kotlin.jvm.internal.s.f(this.f46445e, m11.f46445e) && this.f46446f == m11.f46446f && p013kotlin.jvm.internal.s.f(this.f46447g, m11.f46447g) && p013kotlin.jvm.internal.s.f(this.f46448h, m11.f46448h) && p013kotlin.jvm.internal.s.f(this.f46449i, m11.f46449i);
    }

    public final int hashCode() {
        int iA = C4571x.a(this.f46447g, (Boolean.hashCode(this.f46446f) + C4571x.a(this.f46445e, C4571x.a(this.f46444d, C4571x.a(this.f46443c, C4571x.a(this.f46442b, this.f46441a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        L0 l11 = this.f46448h;
        return this.f46449i.hashCode() + ((iA + (l11 == null ? 0 : l11.hashCode())) * 31);
    }

    public final String toString() {
        return "EmbeddedSessionInfo(linkToken=" + this.f46441a + ", linkOpenId=" + this.f46442b + ", linkPersistentId=" + this.f46443c + ", institutionId=" + this.f46444d + ", webviewFallbackId=" + this.f46445e + ", enableAccountSelect=" + this.f46446f + ", embeddedWorkflowSessionId=" + this.f46447g + ", embeddedOpenLinkConfiguration=" + this.f46448h + ", web3ValidChains=" + this.f46449i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeString(this.f46441a);
        out.writeString(this.f46442b);
        out.writeString(this.f46443c);
        out.writeString(this.f46444d);
        out.writeString(this.f46445e);
        out.writeInt(this.f46446f ? 1 : 0);
        out.writeString(this.f46447g);
        L0 l11 = this.f46448h;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            l11.writeToParcel(out, i11);
        }
        out.writeStringList(this.f46449i);
    }

    public M0(String linkToken, String linkOpenId, String linkPersistentId, String institutionId, String webviewFallbackId, boolean z11, String embeddedWorkflowSessionId, L0 l11, ArrayList web3ValidChains) {
        p013kotlin.jvm.internal.s.k(linkToken, "linkToken");
        p013kotlin.jvm.internal.s.k(linkOpenId, "linkOpenId");
        p013kotlin.jvm.internal.s.k(linkPersistentId, "linkPersistentId");
        p013kotlin.jvm.internal.s.k(institutionId, "institutionId");
        p013kotlin.jvm.internal.s.k(webviewFallbackId, "webviewFallbackId");
        p013kotlin.jvm.internal.s.k(embeddedWorkflowSessionId, "embeddedWorkflowSessionId");
        p013kotlin.jvm.internal.s.k(web3ValidChains, "web3ValidChains");
        this.f46441a = linkToken;
        this.f46442b = linkOpenId;
        this.f46443c = linkPersistentId;
        this.f46444d = institutionId;
        this.f46445e = webviewFallbackId;
        this.f46446f = z11;
        this.f46447g = embeddedWorkflowSessionId;
        this.f46448h = l11;
        this.f46449i = web3ValidChains;
    }
}
