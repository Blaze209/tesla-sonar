package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.e
@ro0.p
public abstract class N2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy<ro0.d<Object>> f46471a = jn0.m.a(jn0.p.PUBLICATION, c.f46483a);

    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46483a = new c();

        public c() {
            super(0);
        }

        @Override // wn0.a
        public final ro0.d<Object> invoke() {
            return new ro0.m("com.plaid.internal.workflow.model.LinkState", p013kotlin.jvm.internal.o0.b(N2.class), new co0.d[]{p013kotlin.jvm.internal.o0.b(a.class), p013kotlin.jvm.internal.o0.b(b.class), p013kotlin.jvm.internal.o0.b(d.class), p013kotlin.jvm.internal.o0.b(e.class), p013kotlin.jvm.internal.o0.b(i.class), p013kotlin.jvm.internal.o0.b(j.class), p013kotlin.jvm.internal.o0.b(k.class), p013kotlin.jvm.internal.o0.b(l.class)}, new ro0.d[]{a.C0716a.f46475a, b.a.f46481a, d.a.f46488a, e.a.f46493a, i.a.f46506a, new vo0.e1("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.f46508b, new Annotation[0]), k.a.f46523a, l.a.f46534a}, new Annotation[0]);
        }
    }

    public interface f {
        String b();

        List<m8> d();

        m8 e();
    }

    public interface g {
        String a();
    }

    public interface h {
        String c();
    }

    @ro0.p
    public static final class j extends N2 {
        public static final Parcelable.Creator<j> CREATOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f46508b = new j();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f46509c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f46510d = "";

        public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46511a = new a();

            public a() {
                super(0);
            }

            @Override // wn0.a
            public final ro0.d<Object> invoke() {
                return new vo0.e1("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.f46508b, new Annotation[0]);
            }
        }

        public static final class b implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                parcel.readInt();
                return j.f46508b;
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i11) {
                return new j[i11];
            }
        }

        static {
            jn0.m.a(jn0.p.PUBLICATION, a.f46511a);
            CREATOR = new b();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return f46509c;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return f46510d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeInt(1);
        }
    }

    public N2() {
    }

    public final m8 f() {
        if (this instanceof a) {
            m8.CREATOR.getClass();
            return m8.f47883e;
        }
        if (this instanceof b) {
            m8.CREATOR.getClass();
            return m8.f47883e;
        }
        if (this instanceof l) {
            return ((l) this).f46530f;
        }
        if (this instanceof i) {
            return ((i) this).f46497c;
        }
        if (p013kotlin.jvm.internal.s.f(this, j.f46508b)) {
            m8.CREATOR.getClass();
            return m8.f47883e;
        }
        if (this instanceof e) {
            m8.CREATOR.getClass();
            return m8.f47883e;
        }
        if (this instanceof k) {
            m8.CREATOR.getClass();
            return m8.f47883e;
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        m8.CREATOR.getClass();
        return m8.f47883e;
    }

    public abstract String g();

    public abstract String h();

    @jn0.e
    public /* synthetic */ N2(int i11) {
    }

    @ro0.p
    public static final class e extends N2 {
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkExit f46491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46492d;

        @jn0.e
        public static final class a implements vo0.e0<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ vo0.m1 f46494b;

            static {
                a aVar = new a();
                f46493a = aVar;
                vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.LinkState.Exit", aVar, 2);
                m1Var.o("workflowId", false);
                m1Var.o("linkOpenId", true);
                f46494b = m1Var;
            }

            @Override // vo0.e0
            public final ro0.d<?>[] childSerializers() {
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{z1Var, z1Var};
            }

            @Override // ro0.c
            public final Object deserialize(uo0.e decoder) {
                String strT;
                String strT2;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                vo0.m1 m1Var = f46494b;
                uo0.c cVarB = decoder.b(m1Var);
                if (cVarB.i()) {
                    strT = cVarB.t(m1Var, 0);
                    strT2 = cVarB.t(m1Var, 1);
                    i11 = 3;
                } else {
                    strT = null;
                    String strT3 = null;
                    boolean z11 = true;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(m1Var);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            strT = cVarB.t(m1Var, 0);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            strT3 = cVarB.t(m1Var, 1);
                            i12 |= 2;
                        }
                    }
                    strT2 = strT3;
                    i11 = i12;
                }
                cVarB.c(m1Var);
                return new e(i11, strT, strT2);
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return f46494b;
            }

            @Override // ro0.q
            public final void serialize(uo0.f encoder, Object obj) {
                e value = (e) obj;
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                vo0.m1 m1Var = f46494b;
                uo0.d dVarB = encoder.b(m1Var);
                dVarB.e(m1Var, 0, value.f46490b);
                if (dVarB.G(m1Var, 1) || !p013kotlin.jvm.internal.s.f(value.f46492d, "")) {
                    dVarB.e(m1Var, 1, value.f46492d);
                }
                dVarB.c(m1Var);
            }

            @Override // vo0.e0
            public final ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new e(parcel.readString(), LinkExit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        public e(String workflowId, LinkExit linkExit) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(linkExit, "linkExit");
            this.f46490b = workflowId;
            this.f46491c = linkExit;
            this.f46492d = "";
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p013kotlin.jvm.internal.s.f(this.f46490b, eVar.f46490b) && p013kotlin.jvm.internal.s.f(this.f46491c, eVar.f46491c);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.f46492d;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.f46490b;
        }

        public final int hashCode() {
            return this.f46491c.hashCode() + (this.f46490b.hashCode() * 31);
        }

        public final LinkExit i() {
            return this.f46491c;
        }

        public final String toString() {
            return "Exit(workflowId=" + this.f46490b + ", linkExit=" + this.f46491c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeString(this.f46490b);
            this.f46491c.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public e(int i11, String str, String str2) {
            super(0);
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f46494b);
            }
            this.f46490b = str;
            LinkExitMetadata metadata = L2.a(31, (String) null);
            p013kotlin.jvm.internal.s.k(metadata, "metadata");
            this.f46491c = new LinkExit(null, metadata);
            if ((i11 & 2) == 0) {
                this.f46492d = "";
            } else {
                this.f46492d = str2;
            }
        }
    }

    @ro0.p
    public static final class a extends N2 {
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final M0 f46472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46474d;

        /* JADX INFO: renamed from: com.plaid.internal.N2$a$a, reason: collision with other inner class name */
        @jn0.e
        public static final class C0716a implements vo0.e0<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0716a f46475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ vo0.m1 f46476b;

            static {
                C0716a c0716a = new C0716a();
                f46475a = c0716a;
                vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.LinkState.BeforeEmbeddedTransition", c0716a, 3);
                m1Var.o("embeddedSessionInfo", false);
                m1Var.o("workflowId", true);
                m1Var.o("linkOpenId", true);
                f46476b = m1Var;
            }

            @Override // vo0.e0
            public final ro0.d<?>[] childSerializers() {
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{M0.a.f46450a, z1Var, z1Var};
            }

            @Override // ro0.c
            public final Object deserialize(uo0.e decoder) {
                int i11;
                M0 m11;
                String strT;
                String strT2;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                vo0.m1 m1Var = f46476b;
                uo0.c cVarB = decoder.b(m1Var);
                M0 m12 = null;
                if (cVarB.i()) {
                    m11 = (M0) cVarB.n(m1Var, 0, M0.a.f46450a, null);
                    strT = cVarB.t(m1Var, 1);
                    strT2 = cVarB.t(m1Var, 2);
                    i11 = 7;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    String strT3 = null;
                    String strT4 = null;
                    while (z11) {
                        int iA = cVarB.A(m1Var);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            m12 = (M0) cVarB.n(m1Var, 0, M0.a.f46450a, m12);
                            i12 |= 1;
                        } else if (iA == 1) {
                            strT3 = cVarB.t(m1Var, 1);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            strT4 = cVarB.t(m1Var, 2);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    m11 = m12;
                    strT = strT3;
                    strT2 = strT4;
                }
                cVarB.c(m1Var);
                return new a(i11, m11, strT, strT2);
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return f46476b;
            }

            @Override // ro0.q
            public final void serialize(uo0.f encoder, Object obj) {
                a value = (a) obj;
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                vo0.m1 m1Var = f46476b;
                uo0.d dVarB = encoder.b(m1Var);
                Parcelable.Creator<a> creator = a.CREATOR;
                dVarB.D(m1Var, 0, M0.a.f46450a, value.f46472b);
                if (dVarB.G(m1Var, 1) || !p013kotlin.jvm.internal.s.f(value.f46473c, "")) {
                    dVarB.e(m1Var, 1, value.f46473c);
                }
                if (dVarB.G(m1Var, 2) || !p013kotlin.jvm.internal.s.f(value.f46474d, value.f46472b.f46442b)) {
                    dVarB.e(m1Var, 2, value.f46474d);
                }
                dVarB.c(m1Var);
            }

            @Override // vo0.e0
            public final ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new a(M0.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(M0 embeddedSessionInfo) {
            p013kotlin.jvm.internal.s.k(embeddedSessionInfo, "embeddedSessionInfo");
            this.f46472b = embeddedSessionInfo;
            this.f46473c = "";
            this.f46474d = embeddedSessionInfo.f46442b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f46472b, ((a) obj).f46472b);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.f46474d;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.f46473c;
        }

        public final int hashCode() {
            return this.f46472b.hashCode();
        }

        public final M0 i() {
            return this.f46472b;
        }

        public final String toString() {
            return "BeforeEmbeddedTransition(embeddedSessionInfo=" + this.f46472b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            this.f46472b.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public a(int i11, M0 m11, String str, String str2) {
            super(0);
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, C0716a.f46476b);
            }
            this.f46472b = m11;
            this.f46473c = (i11 & 2) == 0 ? "" : str;
            if ((i11 & 4) == 0) {
                this.f46474d = m11.f46442b;
            } else {
                this.f46474d = str2;
            }
        }
    }

    @ro0.p
    public static final class b extends N2 implements g {
        public static final Parcelable.Creator<b> CREATOR = new C0717b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkTokenConfiguration f46478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f46480e;

        @jn0.e
        public static final class a implements vo0.e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ vo0.m1 f46482b;

            static {
                a aVar = new a();
                f46481a = aVar;
                vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.LinkState.BeforeLinkOpen", aVar, 3);
                m1Var.o("linkOpenId", false);
                m1Var.o("workflowId", true);
                m1Var.o("oauthNonce", true);
                f46482b = m1Var;
            }

            @Override // vo0.e0
            public final ro0.d<?>[] childSerializers() {
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{z1Var, z1Var, z1Var};
            }

            @Override // ro0.c
            public final Object deserialize(uo0.e decoder) {
                String strT;
                String strT2;
                String strT3;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                vo0.m1 m1Var = f46482b;
                uo0.c cVarB = decoder.b(m1Var);
                if (cVarB.i()) {
                    strT = cVarB.t(m1Var, 0);
                    strT3 = cVarB.t(m1Var, 1);
                    strT2 = cVarB.t(m1Var, 2);
                    i11 = 7;
                } else {
                    strT = null;
                    String strT4 = null;
                    String strT5 = null;
                    boolean z11 = true;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(m1Var);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            strT = cVarB.t(m1Var, 0);
                            i12 |= 1;
                        } else if (iA == 1) {
                            strT5 = cVarB.t(m1Var, 1);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            strT4 = cVarB.t(m1Var, 2);
                            i12 |= 4;
                        }
                    }
                    strT2 = strT4;
                    strT3 = strT5;
                    i11 = i12;
                }
                cVarB.c(m1Var);
                return new b(i11, strT, strT3, strT2);
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return f46482b;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004c  */
            @Override // ro0.q
            public final void serialize(uo0.f encoder, Object obj) {
                b value = (b) obj;
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                vo0.m1 m1Var = f46482b;
                uo0.d dVarB = encoder.b(m1Var);
                dVarB.e(m1Var, 0, value.f46477b);
                if (dVarB.G(m1Var, 1) || !p013kotlin.jvm.internal.s.f(value.f46479d, "")) {
                    dVarB.e(m1Var, 1, value.f46479d);
                }
                if (dVarB.G(m1Var, 2)) {
                    dVarB.e(m1Var, 2, value.f46480e);
                } else {
                    String str = value.f46480e;
                    String string = UUID.randomUUID().toString();
                    p013kotlin.jvm.internal.s.j(string, "toString(...)");
                    if (!p013kotlin.jvm.internal.s.f(str, string)) {
                        dVarB.e(m1Var, 2, value.f46480e);
                    }
                }
                dVarB.c(m1Var);
            }

            @Override // vo0.e0
            public final ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.plaid.internal.N2$b$b, reason: collision with other inner class name */
        public static final class C0717b implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new b(parcel.readString(), LinkTokenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(String linkOpenId, LinkTokenConfiguration configuration) {
            p013kotlin.jvm.internal.s.k(linkOpenId, "linkOpenId");
            p013kotlin.jvm.internal.s.k(configuration, "configuration");
            this.f46477b = linkOpenId;
            this.f46478c = configuration;
            this.f46479d = "";
            String string = UUID.randomUUID().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            this.f46480e = string;
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.f46480e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f46477b, bVar.f46477b) && p013kotlin.jvm.internal.s.f(this.f46478c, bVar.f46478c);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.f46477b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.f46479d;
        }

        public final int hashCode() {
            return this.f46478c.hashCode() + (this.f46477b.hashCode() * 31);
        }

        public final LinkTokenConfiguration i() {
            return this.f46478c;
        }

        public final String toString() {
            return "BeforeLinkOpen(linkOpenId=" + this.f46477b + ", configuration=" + this.f46478c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeString(this.f46477b);
            this.f46478c.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public b(int i11, String str, String str2, String str3) {
            super(0);
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f46482b);
            }
            this.f46477b = str;
            this.f46478c = new LinkTokenConfiguration.Builder().build();
            if ((i11 & 2) == 0) {
                this.f46479d = "";
            } else {
                this.f46479d = str2;
            }
            if ((i11 & 4) != 0) {
                this.f46480e = str3;
                return;
            }
            String string = UUID.randomUUID().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            this.f46480e = string;
        }
    }

    @ro0.p
    public static final class d extends N2 implements h {
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f46487e;

        @jn0.e
        public static final class a implements vo0.e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46488a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ vo0.m1 f46489b;

            static {
                a aVar = new a();
                f46488a = aVar;
                vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.LinkState.CompleteOutOfProcess", aVar, 4);
                m1Var.o("linkOpenId", false);
                m1Var.o("workflowId", false);
                m1Var.o("requestId", false);
                m1Var.o("userClosedOutOfProcess", false);
                f46489b = m1Var;
            }

            @Override // vo0.e0
            public final ro0.d<?>[] childSerializers() {
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{z1Var, z1Var, z1Var, vo0.h.f119620a};
            }

            @Override // ro0.c
            public final Object deserialize(uo0.e decoder) {
                String strT;
                boolean zW;
                String str;
                String str2;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                vo0.m1 m1Var = f46489b;
                uo0.c cVarB = decoder.b(m1Var);
                if (cVarB.i()) {
                    strT = cVarB.t(m1Var, 0);
                    String strT2 = cVarB.t(m1Var, 1);
                    String strT3 = cVarB.t(m1Var, 2);
                    zW = cVarB.w(m1Var, 3);
                    str = strT3;
                    str2 = strT2;
                    i11 = 15;
                } else {
                    strT = null;
                    String strT4 = null;
                    String strT5 = null;
                    boolean z11 = true;
                    boolean zW2 = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(m1Var);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            strT = cVarB.t(m1Var, 0);
                            i12 |= 1;
                        } else if (iA == 1) {
                            strT5 = cVarB.t(m1Var, 1);
                            i12 |= 2;
                        } else if (iA == 2) {
                            strT4 = cVarB.t(m1Var, 2);
                            i12 |= 4;
                        } else {
                            if (iA != 3) {
                                throw new UnknownFieldException(iA);
                            }
                            zW2 = cVarB.w(m1Var, 3);
                            i12 |= 8;
                        }
                    }
                    zW = zW2;
                    str = strT4;
                    str2 = strT5;
                    i11 = i12;
                }
                String str3 = strT;
                cVarB.c(m1Var);
                return new d(i11, str3, str2, str, zW);
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return f46489b;
            }

            @Override // ro0.q
            public final void serialize(uo0.f encoder, Object obj) {
                d value = (d) obj;
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                vo0.m1 m1Var = f46489b;
                uo0.d dVarB = encoder.b(m1Var);
                dVarB.e(m1Var, 0, value.f46484b);
                dVarB.e(m1Var, 1, value.f46485c);
                dVarB.e(m1Var, 2, value.f46486d);
                dVarB.A(m1Var, 3, value.f46487e);
                dVarB.c(m1Var);
            }

            @Override // vo0.e0
            public final ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d(String linkOpenId, String workflowId, String requestId, boolean z11) {
            p013kotlin.jvm.internal.s.k(linkOpenId, "linkOpenId");
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(requestId, "requestId");
            this.f46484b = linkOpenId;
            this.f46485c = workflowId;
            this.f46486d = requestId;
            this.f46487e = z11;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.f46486d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.f46484b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.f46485c;
        }

        public final boolean i() {
            return this.f46487e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeString(this.f46484b);
            out.writeString(this.f46485c);
            out.writeString(this.f46486d);
            out.writeInt(this.f46487e ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public d(int i11, String str, String str2, String str3, boolean z11) {
            super(0);
            if (15 != (i11 & 15)) {
                vo0.h1.b(i11, 15, a.f46489b);
            }
            this.f46484b = str;
            this.f46485c = str2;
            this.f46486d = str3;
            this.f46487e = z11;
        }
    }

    @ro0.p
    public static final class l extends N2 implements f, h, g {
        public static final Parcelable.Creator<l> CREATOR = new b();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final ro0.d<Object>[] f46525j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f46529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final m8 f46530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<m8> f46531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<m8> f46532h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f46533i;

        @jn0.e
        public static final class a implements vo0.e0<l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ vo0.m1 f46535b;

            static {
                a aVar = new a();
                f46534a = aVar;
                vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.LinkState.Workflow", aVar, 8);
                m1Var.o("linkOpenId", false);
                m1Var.o("workflowId", false);
                m1Var.o("continuationToken", false);
                m1Var.o("oauthNonce", false);
                m1Var.o("currentPane", false);
                m1Var.o("additionalPanes", false);
                m1Var.o("backstack", false);
                m1Var.o("requestId", false);
                f46535b = m1Var;
            }

            @Override // vo0.e0
            public final ro0.d<?>[] childSerializers() {
                ro0.d<?>[] dVarArr = l.f46525j;
                ro0.d<?> dVar = dVarArr[5];
                ro0.d<?> dVar2 = dVarArr[6];
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{z1Var, z1Var, z1Var, z1Var, m8.a.f47888a, dVar, dVar2, z1Var};
            }

            @Override // ro0.c
            public final Object deserialize(uo0.e decoder) {
                int i11;
                List list;
                List list2;
                m8 m8Var;
                String str;
                String str2;
                String str3;
                String str4;
                String strT;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                vo0.m1 m1Var = f46535b;
                uo0.c cVarB = decoder.b(m1Var);
                ro0.d<Object>[] dVarArr = l.f46525j;
                String strT2 = null;
                if (cVarB.i()) {
                    String strT3 = cVarB.t(m1Var, 0);
                    String strT4 = cVarB.t(m1Var, 1);
                    String strT5 = cVarB.t(m1Var, 2);
                    String strT6 = cVarB.t(m1Var, 3);
                    m8 m8Var2 = (m8) cVarB.n(m1Var, 4, m8.a.f47888a, null);
                    List list3 = (List) cVarB.n(m1Var, 5, dVarArr[5], null);
                    list = (List) cVarB.n(m1Var, 6, dVarArr[6], null);
                    str = strT3;
                    strT = cVarB.t(m1Var, 7);
                    str4 = strT6;
                    m8Var = m8Var2;
                    str3 = strT5;
                    i11 = 255;
                    list2 = list3;
                    str2 = strT4;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    List list4 = null;
                    List list5 = null;
                    m8 m8Var3 = null;
                    String strT7 = null;
                    String strT8 = null;
                    String strT9 = null;
                    String strT10 = null;
                    while (z11) {
                        int iA = cVarB.A(m1Var);
                        switch (iA) {
                            case -1:
                                z11 = false;
                                break;
                            case 0:
                                i12 |= 1;
                                strT2 = cVarB.t(m1Var, 0);
                                continue;
                            case 1:
                                i12 |= 2;
                                strT7 = cVarB.t(m1Var, 1);
                                continue;
                            case 2:
                                i12 |= 4;
                                strT8 = cVarB.t(m1Var, 2);
                                continue;
                            case 3:
                                strT9 = cVarB.t(m1Var, 3);
                                i12 |= 8;
                                continue;
                            case 4:
                                m8Var3 = (m8) cVarB.n(m1Var, 4, m8.a.f47888a, m8Var3);
                                i12 |= 16;
                                break;
                            case 5:
                                list5 = (List) cVarB.n(m1Var, 5, dVarArr[5], list5);
                                i12 |= 32;
                                break;
                            case 6:
                                list4 = (List) cVarB.n(m1Var, 6, dVarArr[6], list4);
                                i12 |= 64;
                                break;
                            case 7:
                                strT10 = cVarB.t(m1Var, 7);
                                i12 |= 128;
                                break;
                            default:
                                throw new UnknownFieldException(iA);
                        }
                    }
                    i11 = i12;
                    list = list4;
                    list2 = list5;
                    m8Var = m8Var3;
                    str = strT2;
                    str2 = strT7;
                    str3 = strT8;
                    str4 = strT9;
                    strT = strT10;
                }
                cVarB.c(m1Var);
                return new l(i11, str, str2, str3, str4, m8Var, list2, list, strT);
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return f46535b;
            }

            @Override // ro0.q
            public final void serialize(uo0.f encoder, Object obj) {
                l value = (l) obj;
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                vo0.m1 m1Var = f46535b;
                uo0.d dVarB = encoder.b(m1Var);
                ro0.d<Object>[] dVarArr = l.f46525j;
                dVarB.e(m1Var, 0, value.f46526b);
                dVarB.e(m1Var, 1, value.f46527c);
                dVarB.e(m1Var, 2, value.f46528d);
                dVarB.e(m1Var, 3, value.f46529e);
                dVarB.D(m1Var, 4, m8.a.f47888a, value.f46530f);
                dVarB.D(m1Var, 5, dVarArr[5], value.f46531g);
                dVarB.D(m1Var, 6, dVarArr[6], value.f46532h);
                dVarB.e(m1Var, 7, value.f46533i);
                dVarB.c(m1Var);
            }

            @Override // vo0.e0
            public final ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                m8 m8Var = (m8) parcel.readParcelable(l.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(l.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(l.class.getClassLoader()));
                }
                return new l(string, string2, string3, string4, m8Var, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i11) {
                return new l[i11];
            }
        }

        static {
            m8.a aVar = m8.a.f47888a;
            f46525j = new ro0.d[]{null, null, null, null, null, new vo0.e(aVar), new vo0.e(aVar), null};
        }

        public l(String linkOpenId, String workflowId, String continuationToken, String oauthNonce, m8 currentPane, List<m8> additionalPanes, List<m8> backstack, String requestId) {
            p013kotlin.jvm.internal.s.k(linkOpenId, "linkOpenId");
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(continuationToken, "continuationToken");
            p013kotlin.jvm.internal.s.k(oauthNonce, "oauthNonce");
            p013kotlin.jvm.internal.s.k(currentPane, "currentPane");
            p013kotlin.jvm.internal.s.k(additionalPanes, "additionalPanes");
            p013kotlin.jvm.internal.s.k(backstack, "backstack");
            p013kotlin.jvm.internal.s.k(requestId, "requestId");
            this.f46526b = linkOpenId;
            this.f46527c = workflowId;
            this.f46528d = continuationToken;
            this.f46529e = oauthNonce;
            this.f46530f = currentPane;
            this.f46531g = additionalPanes;
            this.f46532h = backstack;
            this.f46533i = requestId;
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.f46529e;
        }

        @Override // com.plaid.internal.N2.f
        public final String b() {
            return this.f46528d;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.f46533i;
        }

        @Override // com.plaid.internal.N2.f
        public final List<m8> d() {
            return this.f46532h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        public final m8 e() {
            return this.f46530f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p013kotlin.jvm.internal.s.f(this.f46526b, lVar.f46526b) && p013kotlin.jvm.internal.s.f(this.f46527c, lVar.f46527c) && p013kotlin.jvm.internal.s.f(this.f46528d, lVar.f46528d) && p013kotlin.jvm.internal.s.f(this.f46529e, lVar.f46529e) && p013kotlin.jvm.internal.s.f(this.f46530f, lVar.f46530f) && p013kotlin.jvm.internal.s.f(this.f46531g, lVar.f46531g) && p013kotlin.jvm.internal.s.f(this.f46532h, lVar.f46532h) && p013kotlin.jvm.internal.s.f(this.f46533i, lVar.f46533i);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.f46526b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.f46527c;
        }

        public final int hashCode() {
            return this.f46533i.hashCode() + ((this.f46532h.hashCode() + ((this.f46531g.hashCode() + ((this.f46530f.hashCode() + C4571x.a(this.f46529e, C4571x.a(this.f46528d, C4571x.a(this.f46527c, this.f46526b.hashCode() * 31, 31), 31), 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Workflow(linkOpenId=" + this.f46526b + ", workflowId=" + this.f46527c + ", continuationToken=" + this.f46528d + ", oauthNonce=" + this.f46529e + ", currentPane=" + this.f46530f + ", additionalPanes=" + this.f46531g + ", backstack=" + this.f46532h + ", requestId=" + this.f46533i + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeString(this.f46526b);
            out.writeString(this.f46527c);
            out.writeString(this.f46528d);
            out.writeString(this.f46529e);
            out.writeParcelable(this.f46530f, i11);
            List<m8> list = this.f46531g;
            out.writeInt(list.size());
            Iterator<m8> it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable(it.next(), i11);
            }
            List<m8> list2 = this.f46532h;
            out.writeInt(list2.size());
            Iterator<m8> it2 = list2.iterator();
            while (it2.hasNext()) {
                out.writeParcelable(it2.next(), i11);
            }
            out.writeString(this.f46533i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public l(int i11, String str, String str2, String str3, String str4, m8 m8Var, List list, List list2, String str5) {
            super(0);
            if (255 != (i11 & 255)) {
                vo0.h1.b(i11, 255, a.f46535b);
            }
            this.f46526b = str;
            this.f46527c = str2;
            this.f46528d = str3;
            this.f46529e = str4;
            this.f46530f = m8Var;
            this.f46531g = list;
            this.f46532h = list2;
            this.f46533i = str5;
        }
    }

    @ro0.p
    public static final class i extends N2 implements f, g, h {
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final ro0.d<Object>[] f46495l = {null, null, null, null, null, new vo0.e(m8.a.f47888a), null, new vo0.z("com.plaid.internal.workflow.error.LocalErrorType", H3.values()), null, null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m8 f46497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f46499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f46500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<m8> f46501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f46502h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final H3 f46503i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f46504j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f46505k;

        @jn0.e
        public static final class a implements vo0.e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ vo0.m1 f46507b;

            static {
                a aVar = new a();
                f46506a = aVar;
                vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.LinkState.LocalError", aVar, 10);
                m1Var.o("workflowId", false);
                m1Var.o("currentPane", false);
                m1Var.o("continuationToken", false);
                m1Var.o("errorMessage", false);
                m1Var.o("errorCode", false);
                m1Var.o("backstack", false);
                m1Var.o("requestId", false);
                m1Var.o("errorType", true);
                m1Var.o("linkOpenId", true);
                m1Var.o("oauthNonce", true);
                f46507b = m1Var;
            }

            @Override // vo0.e0
            public final ro0.d<?>[] childSerializers() {
                ro0.d<?>[] dVarArr = i.f46495l;
                ro0.d<?> dVar = dVarArr[5];
                ro0.d<?> dVar2 = dVarArr[7];
                vo0.z1 z1Var = vo0.z1.f119730a;
                return new ro0.d[]{z1Var, m8.a.f47888a, z1Var, z1Var, z1Var, dVar, z1Var, dVar2, z1Var, z1Var};
            }

            @Override // ro0.c
            public final Object deserialize(uo0.e decoder) {
                int i11;
                H3 h11;
                List list;
                String str;
                m8 m8Var;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String strT;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                vo0.m1 m1Var = f46507b;
                uo0.c cVarB = decoder.b(m1Var);
                ro0.d<Object>[] dVarArr = i.f46495l;
                int i12 = 9;
                int i13 = 6;
                String strT2 = null;
                if (cVarB.i()) {
                    String strT3 = cVarB.t(m1Var, 0);
                    m8 m8Var2 = (m8) cVarB.n(m1Var, 1, m8.a.f47888a, null);
                    String strT4 = cVarB.t(m1Var, 2);
                    String strT5 = cVarB.t(m1Var, 3);
                    String strT6 = cVarB.t(m1Var, 4);
                    List list2 = (List) cVarB.n(m1Var, 5, dVarArr[5], null);
                    String strT7 = cVarB.t(m1Var, 6);
                    H3 h12 = (H3) cVarB.n(m1Var, 7, dVarArr[7], null);
                    String strT8 = cVarB.t(m1Var, 8);
                    h11 = h12;
                    str = strT3;
                    strT = cVarB.t(m1Var, 9);
                    str5 = strT7;
                    str3 = strT5;
                    str6 = strT8;
                    str4 = strT6;
                    str2 = strT4;
                    i11 = 1023;
                    list = list2;
                    m8Var = m8Var2;
                } else {
                    boolean z11 = true;
                    int i14 = 0;
                    H3 h13 = null;
                    List list3 = null;
                    m8 m8Var3 = null;
                    String strT9 = null;
                    String strT10 = null;
                    String strT11 = null;
                    String strT12 = null;
                    String strT13 = null;
                    String strT14 = null;
                    while (z11) {
                        int iA = cVarB.A(m1Var);
                        switch (iA) {
                            case -1:
                                z11 = false;
                                i12 = 9;
                                break;
                            case 0:
                                strT2 = cVarB.t(m1Var, 0);
                                i14 |= 1;
                                i12 = 9;
                                i13 = 6;
                                break;
                            case 1:
                                m8Var3 = (m8) cVarB.n(m1Var, 1, m8.a.f47888a, m8Var3);
                                i14 |= 2;
                                i12 = 9;
                                i13 = 6;
                                break;
                            case 2:
                                strT9 = cVarB.t(m1Var, 2);
                                i14 |= 4;
                                break;
                            case 3:
                                strT10 = cVarB.t(m1Var, 3);
                                i14 |= 8;
                                break;
                            case 4:
                                strT11 = cVarB.t(m1Var, 4);
                                i14 |= 16;
                                break;
                            case 5:
                                list3 = (List) cVarB.n(m1Var, 5, dVarArr[5], list3);
                                i14 |= 32;
                                break;
                            case 6:
                                strT12 = cVarB.t(m1Var, i13);
                                i14 |= 64;
                                break;
                            case 7:
                                h13 = (H3) cVarB.n(m1Var, 7, dVarArr[7], h13);
                                i14 |= 128;
                                break;
                            case 8:
                                strT13 = cVarB.t(m1Var, 8);
                                i14 |= 256;
                                break;
                            case 9:
                                strT14 = cVarB.t(m1Var, i12);
                                i14 |= 512;
                                break;
                            default:
                                throw new UnknownFieldException(iA);
                        }
                    }
                    i11 = i14;
                    h11 = h13;
                    list = list3;
                    str = strT2;
                    m8Var = m8Var3;
                    str2 = strT9;
                    str3 = strT10;
                    str4 = strT11;
                    str5 = strT12;
                    str6 = strT13;
                    strT = strT14;
                }
                cVarB.c(m1Var);
                return new i(i11, str, m8Var, str2, str3, str4, list, str5, h11, str6, strT);
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return f46507b;
            }

            @Override // ro0.q
            public final void serialize(uo0.f encoder, Object obj) {
                i value = (i) obj;
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                vo0.m1 m1Var = f46507b;
                uo0.d dVarB = encoder.b(m1Var);
                ro0.d<Object>[] dVarArr = i.f46495l;
                dVarB.e(m1Var, 0, value.f46496b);
                dVarB.D(m1Var, 1, m8.a.f47888a, value.f46497c);
                dVarB.e(m1Var, 2, value.f46498d);
                dVarB.e(m1Var, 3, value.f46499e);
                dVarB.e(m1Var, 4, value.f46500f);
                dVarB.D(m1Var, 5, dVarArr[5], value.f46501g);
                dVarB.e(m1Var, 6, value.f46502h);
                if (dVarB.G(m1Var, 7) || value.f46503i != H3.UNKNOWN_ERROR) {
                    dVarB.D(m1Var, 7, dVarArr[7], value.f46503i);
                }
                if (dVarB.G(m1Var, 8) || !p013kotlin.jvm.internal.s.f(value.f46504j, "")) {
                    dVarB.e(m1Var, 8, value.f46504j);
                }
                if (dVarB.G(m1Var, 9) || !p013kotlin.jvm.internal.s.f(value.f46505k, "")) {
                    dVarB.e(m1Var, 9, value.f46505k);
                }
                dVarB.c(m1Var);
            }

            @Override // vo0.e0
            public final ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                m8 m8Var = (m8) parcel.readParcelable(i.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(i.class.getClassLoader()));
                }
                return new i(string, m8Var, string2, string3, string4, arrayList, parcel.readString(), H3.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i11) {
                return new i[i11];
            }
        }

        public i(String workflowId, m8 currentPane, String continuationToken, String errorMessage, String errorCode, List<m8> backstack, String requestId, H3 errorType) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(currentPane, "currentPane");
            p013kotlin.jvm.internal.s.k(continuationToken, "continuationToken");
            p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
            p013kotlin.jvm.internal.s.k(errorCode, "errorCode");
            p013kotlin.jvm.internal.s.k(backstack, "backstack");
            p013kotlin.jvm.internal.s.k(requestId, "requestId");
            p013kotlin.jvm.internal.s.k(errorType, "errorType");
            this.f46496b = workflowId;
            this.f46497c = currentPane;
            this.f46498d = continuationToken;
            this.f46499e = errorMessage;
            this.f46500f = errorCode;
            this.f46501g = backstack;
            this.f46502h = requestId;
            this.f46503i = errorType;
            this.f46504j = "";
            this.f46505k = "";
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.f46505k;
        }

        @Override // com.plaid.internal.N2.f
        public final String b() {
            return this.f46498d;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.f46502h;
        }

        @Override // com.plaid.internal.N2.f
        public final List<m8> d() {
            return this.f46501g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        public final m8 e() {
            return this.f46497c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p013kotlin.jvm.internal.s.f(this.f46496b, iVar.f46496b) && p013kotlin.jvm.internal.s.f(this.f46497c, iVar.f46497c) && p013kotlin.jvm.internal.s.f(this.f46498d, iVar.f46498d) && p013kotlin.jvm.internal.s.f(this.f46499e, iVar.f46499e) && p013kotlin.jvm.internal.s.f(this.f46500f, iVar.f46500f) && p013kotlin.jvm.internal.s.f(this.f46501g, iVar.f46501g) && p013kotlin.jvm.internal.s.f(this.f46502h, iVar.f46502h) && this.f46503i == iVar.f46503i;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.f46504j;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.f46496b;
        }

        public final int hashCode() {
            return this.f46503i.hashCode() + C4571x.a(this.f46502h, (this.f46501g.hashCode() + C4571x.a(this.f46500f, C4571x.a(this.f46499e, C4571x.a(this.f46498d, (this.f46497c.hashCode() + (this.f46496b.hashCode() * 31)) * 31, 31), 31), 31)) * 31, 31);
        }

        public final String toString() {
            return "LocalError(workflowId=" + this.f46496b + ", currentPane=" + this.f46497c + ", continuationToken=" + this.f46498d + ", errorMessage=" + this.f46499e + ", errorCode=" + this.f46500f + ", backstack=" + this.f46501g + ", requestId=" + this.f46502h + ", errorType=" + this.f46503i + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeString(this.f46496b);
            out.writeParcelable(this.f46497c, i11);
            out.writeString(this.f46498d);
            out.writeString(this.f46499e);
            out.writeString(this.f46500f);
            List<m8> list = this.f46501g;
            out.writeInt(list.size());
            Iterator<m8> it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable(it.next(), i11);
            }
            out.writeString(this.f46502h);
            this.f46503i.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public i(int i11, String str, m8 m8Var, String str2, String str3, String str4, List list, String str5, H3 h11, String str6, String str7) {
            super(0);
            if (127 != (i11 & 127)) {
                vo0.h1.b(i11, 127, a.f46507b);
            }
            this.f46496b = str;
            this.f46497c = m8Var;
            this.f46498d = str2;
            this.f46499e = str3;
            this.f46500f = str4;
            this.f46501g = list;
            this.f46502h = str5;
            if ((i11 & 128) == 0) {
                this.f46503i = H3.UNKNOWN_ERROR;
            } else {
                this.f46503i = h11;
            }
            if ((i11 & 256) == 0) {
                this.f46504j = "";
            } else {
                this.f46504j = str6;
            }
            if ((i11 & 512) == 0) {
                this.f46505k = "";
            } else {
                this.f46505k = str7;
            }
        }
    }

    @ro0.p
    public static final class k extends N2 implements h, g {
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f46515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f46516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f46517g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final A f46518h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f46519i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f46520j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f46521k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Y6 f46522l;

        @jn0.e
        public static final class a implements vo0.e0<k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ vo0.m1 f46524b;

            static {
                a aVar = new a();
                f46523a = aVar;
                vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.LinkState.WebviewFallback", aVar, 11);
                m1Var.o("linkOpenId", false);
                m1Var.o("workflowId", false);
                m1Var.o("requestId", false);
                m1Var.o("oauthNonce", false);
                m1Var.o(ImagesContract.URL, false);
                m1Var.o("webviewFallbackId", false);
                m1Var.o("channelInfo", true);
                m1Var.o("hasTransparentBackground", true);
                m1Var.o("isOutOfProcess", true);
                m1Var.o("shouldPreloadLink", false);
                m1Var.o("smsAutofillType", true);
                f46524b = m1Var;
            }

            @Override // vo0.e0
            public final ro0.d<?>[] childSerializers() {
                ro0.d<?> dVarP = so0.a.p(A.a.f46192a);
                vo0.z1 z1Var = vo0.z1.f119730a;
                vo0.h hVar = vo0.h.f119620a;
                return new ro0.d[]{z1Var, z1Var, z1Var, z1Var, z1Var, z1Var, dVarP, hVar, hVar, hVar, Y6.a.f46837a};
            }

            @Override // ro0.c
            public final Object deserialize(uo0.e decoder) {
                boolean z11;
                Y6 y11;
                A a11;
                boolean z12;
                boolean z13;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                vo0.m1 m1Var = f46524b;
                uo0.c cVarB = decoder.b(m1Var);
                int i11 = 10;
                int i12 = 0;
                if (cVarB.i()) {
                    String strT = cVarB.t(m1Var, 0);
                    String strT2 = cVarB.t(m1Var, 1);
                    String strT3 = cVarB.t(m1Var, 2);
                    String strT4 = cVarB.t(m1Var, 3);
                    String strT5 = cVarB.t(m1Var, 4);
                    String strT6 = cVarB.t(m1Var, 5);
                    A a12 = (A) cVarB.v(m1Var, 6, A.a.f46192a, null);
                    boolean zW = cVarB.w(m1Var, 7);
                    boolean zW2 = cVarB.w(m1Var, 8);
                    boolean zW3 = cVarB.w(m1Var, 9);
                    i12 = 2047;
                    str = strT;
                    y11 = (Y6) cVarB.n(m1Var, 10, Y6.a.f46837a, null);
                    z11 = zW3;
                    z12 = zW;
                    a11 = a12;
                    str6 = strT6;
                    str4 = strT4;
                    z13 = zW2;
                    str5 = strT5;
                    str3 = strT3;
                    str2 = strT2;
                } else {
                    boolean z14 = true;
                    boolean zW4 = false;
                    boolean zW5 = false;
                    Y6 y12 = null;
                    A a13 = null;
                    String strT7 = null;
                    String strT8 = null;
                    String strT9 = null;
                    String strT10 = null;
                    String strT11 = null;
                    String strT12 = null;
                    boolean zW6 = false;
                    while (z14) {
                        int iA = cVarB.A(m1Var);
                        switch (iA) {
                            case -1:
                                z14 = false;
                                i11 = 10;
                                break;
                            case 0:
                                strT7 = cVarB.t(m1Var, 0);
                                i12 |= 1;
                                i11 = 10;
                                break;
                            case 1:
                                strT8 = cVarB.t(m1Var, 1);
                                i12 |= 2;
                                i11 = 10;
                                break;
                            case 2:
                                strT9 = cVarB.t(m1Var, 2);
                                i12 |= 4;
                                i11 = 10;
                                break;
                            case 3:
                                strT10 = cVarB.t(m1Var, 3);
                                i12 |= 8;
                                break;
                            case 4:
                                strT11 = cVarB.t(m1Var, 4);
                                i12 |= 16;
                                break;
                            case 5:
                                strT12 = cVarB.t(m1Var, 5);
                                i12 |= 32;
                                break;
                            case 6:
                                a13 = (A) cVarB.v(m1Var, 6, A.a.f46192a, a13);
                                i12 |= 64;
                                break;
                            case 7:
                                zW6 = cVarB.w(m1Var, 7);
                                i12 |= 128;
                                break;
                            case 8:
                                zW5 = cVarB.w(m1Var, 8);
                                i12 |= 256;
                                break;
                            case 9:
                                zW4 = cVarB.w(m1Var, 9);
                                i12 |= 512;
                                break;
                            case 10:
                                y12 = (Y6) cVarB.n(m1Var, i11, Y6.a.f46837a, y12);
                                i12 |= 1024;
                                break;
                            default:
                                throw new UnknownFieldException(iA);
                        }
                    }
                    z11 = zW4;
                    y11 = y12;
                    a11 = a13;
                    z12 = zW6;
                    z13 = zW5;
                    str = strT7;
                    str2 = strT8;
                    str3 = strT9;
                    str4 = strT10;
                    str5 = strT11;
                    str6 = strT12;
                }
                int i13 = i12;
                cVarB.c(m1Var);
                return new k(i13, str, str2, str3, str4, str5, str6, a11, z12, z13, z11, y11);
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return f46524b;
            }

            @Override // ro0.q
            public final void serialize(uo0.f encoder, Object obj) {
                k value = (k) obj;
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                vo0.m1 m1Var = f46524b;
                uo0.d dVarB = encoder.b(m1Var);
                dVarB.e(m1Var, 0, value.f46512b);
                dVarB.e(m1Var, 1, value.f46513c);
                dVarB.e(m1Var, 2, value.f46514d);
                dVarB.e(m1Var, 3, value.f46515e);
                dVarB.e(m1Var, 4, value.f46516f);
                dVarB.e(m1Var, 5, value.f46517g);
                if (dVarB.G(m1Var, 6) || value.f46518h != null) {
                    dVarB.y(m1Var, 6, A.a.f46192a, value.f46518h);
                }
                if (dVarB.G(m1Var, 7) || value.f46519i) {
                    dVarB.A(m1Var, 7, value.f46519i);
                }
                if (dVarB.G(m1Var, 8) || value.f46520j) {
                    dVarB.A(m1Var, 8, value.f46520j);
                }
                dVarB.A(m1Var, 9, value.f46521k);
                if (dVarB.G(m1Var, 10) || value.f46522l != Y6.NO_SMS_AUTOFILL) {
                    dVarB.D(m1Var, 10, Y6.a.f46837a, value.f46522l);
                }
                dVarB.c(m1Var);
            }

            @Override // vo0.e0
            public final ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                A aCreateFromParcel = parcel.readInt() == 0 ? null : A.CREATOR.createFromParcel(parcel);
                boolean z11 = false;
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (parcel.readInt() == 0) {
                    z12 = z11;
                }
                return new k(string, string2, string3, string4, string5, string6, aCreateFromParcel, z11, z12, parcel.readInt() != 0, Y6.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i11) {
                return new k[i11];
            }
        }

        public k(String linkOpenId, String workflowId, String requestId, String oauthNonce, String url, String webviewFallbackId, A a11, boolean z11, boolean z12, boolean z13, Y6 smsAutofillType) {
            p013kotlin.jvm.internal.s.k(linkOpenId, "linkOpenId");
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(requestId, "requestId");
            p013kotlin.jvm.internal.s.k(oauthNonce, "oauthNonce");
            p013kotlin.jvm.internal.s.k(url, "url");
            p013kotlin.jvm.internal.s.k(webviewFallbackId, "webviewFallbackId");
            p013kotlin.jvm.internal.s.k(smsAutofillType, "smsAutofillType");
            this.f46512b = linkOpenId;
            this.f46513c = workflowId;
            this.f46514d = requestId;
            this.f46515e = oauthNonce;
            this.f46516f = url;
            this.f46517g = webviewFallbackId;
            this.f46518h = a11;
            this.f46519i = z11;
            this.f46520j = z12;
            this.f46521k = z13;
            this.f46522l = smsAutofillType;
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.f46515e;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.f46514d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.f46512b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.f46513c;
        }

        public final A i() {
            return this.f46518h;
        }

        public final Y6 j() {
            return this.f46522l;
        }

        public final String k() {
            return this.f46516f;
        }

        public final String l() {
            return this.f46517g;
        }

        public final boolean m() {
            return this.f46520j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeString(this.f46512b);
            out.writeString(this.f46513c);
            out.writeString(this.f46514d);
            out.writeString(this.f46515e);
            out.writeString(this.f46516f);
            out.writeString(this.f46517g);
            A a11 = this.f46518h;
            if (a11 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                p013kotlin.jvm.internal.s.k(out, "out");
                out.writeString(a11.f46189a);
                out.writeString(a11.f46190b);
                out.writeLong(a11.f46191c);
            }
            out.writeInt(this.f46519i ? 1 : 0);
            out.writeInt(this.f46520j ? 1 : 0);
            out.writeInt(this.f46521k ? 1 : 0);
            this.f46522l.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public k(int i11, String str, String str2, String str3, String str4, String str5, String str6, A a11, boolean z11, boolean z12, boolean z13, Y6 y11) {
            super(0);
            if (575 != (i11 & 575)) {
                vo0.h1.b(i11, 575, a.f46524b);
            }
            this.f46512b = str;
            this.f46513c = str2;
            this.f46514d = str3;
            this.f46515e = str4;
            this.f46516f = str5;
            this.f46517g = str6;
            if ((i11 & 64) == 0) {
                this.f46518h = null;
            } else {
                this.f46518h = a11;
            }
            if ((i11 & 128) == 0) {
                this.f46519i = false;
            } else {
                this.f46519i = z11;
            }
            if ((i11 & 256) == 0) {
                this.f46520j = false;
            } else {
                this.f46520j = z12;
            }
            this.f46521k = z13;
            if ((i11 & 1024) == 0) {
                this.f46522l = Y6.NO_SMS_AUTOFILL;
            } else {
                this.f46522l = y11;
            }
        }

        public /* synthetic */ k(String str, String str2, String str3, String str4, String str5, String str6, A a11, boolean z11, Y6 y11, int i11) {
            this(str, str2, str3, str4, str5, str6, a11, false, true, z11, (i11 & 1024) != 0 ? Y6.NO_SMS_AUTOFILL : y11);
        }
    }
}
