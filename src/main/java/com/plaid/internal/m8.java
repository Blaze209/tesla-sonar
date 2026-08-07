package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class m8 implements Parcelable {
    public static final c CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m8 f47883e = new m8("unknown", "unknown", "unknown");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f47887d;

    @jn0.e
    public static final class a implements vo0.e0<m8> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f47889b;

        static {
            a aVar = new a();
            f47888a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.WorkflowPaneId", aVar, 3);
            m1Var.o("workflowId", false);
            m1Var.o("paneRenderingId", false);
            m1Var.o("paneNodeId", false);
            f47889b = m1Var;
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
            vo0.m1 m1Var = f47889b;
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
            return new m8(i11, strT, strT3, strT2);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f47889b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            m8 value = (m8) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f47889b;
            uo0.d dVarB = encoder.b(m1Var);
            dVarB.e(m1Var, 0, value.f47884a);
            dVarB.e(m1Var, 1, value.f47885b);
            dVarB.e(m1Var, 2, value.f47886c);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        public b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return m8.this.b() + ":" + m8.this.a();
        }
    }

    public static final class c implements Parcelable.Creator<m8> {
        public static m8 a(Pane$PaneRendering pane$PaneRendering, String workflowId) {
            p013kotlin.jvm.internal.s.k(pane$PaneRendering, "<this>");
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            String id2 = pane$PaneRendering.getId();
            p013kotlin.jvm.internal.s.j(id2, "getId(...)");
            String paneNodeId = pane$PaneRendering.getPaneNodeId();
            p013kotlin.jvm.internal.s.j(paneNodeId, "getPaneNodeId(...)");
            return new m8(workflowId, id2, paneNodeId);
        }

        @Override // android.os.Parcelable.Creator
        public final m8 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            p013kotlin.jvm.internal.s.i(string, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.WorkflowId }");
            String string2 = parcel.readString();
            p013kotlin.jvm.internal.s.i(string2, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneRenderingId }");
            String string3 = parcel.readString();
            p013kotlin.jvm.internal.s.i(string3, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneNodeId }");
            return new m8(string, string2, string3);
        }

        @Override // android.os.Parcelable.Creator
        public final m8[] newArray(int i11) {
            return new m8[i11];
        }
    }

    @jn0.e
    public m8(int i11, String str, String str2, String str3) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f47889b);
        }
        this.f47884a = str;
        this.f47885b = str2;
        this.f47886c = str3;
        this.f47887d = jn0.m.b(new b());
    }

    public final String a() {
        return this.f47885b;
    }

    public final String b() {
        return this.f47884a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        return p013kotlin.jvm.internal.s.f(this.f47884a, m8Var.f47884a) && p013kotlin.jvm.internal.s.f(this.f47885b, m8Var.f47885b) && p013kotlin.jvm.internal.s.f(this.f47886c, m8Var.f47886c);
    }

    public final int hashCode() {
        return this.f47886c.hashCode() + C4571x.a(this.f47885b, this.f47884a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WorkflowPaneId(workflowId=" + this.f47884a + ", paneRenderingId=" + this.f47885b + ", paneNodeId=" + this.f47886c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        p013kotlin.jvm.internal.s.k(parcel, "parcel");
        parcel.writeString(this.f47884a);
        parcel.writeString(this.f47885b);
        parcel.writeString(this.f47886c);
    }

    public m8(String str, String str2, String str3) {
        this.f47884a = str;
        this.f47885b = str2;
        this.f47886c = str3;
        this.f47887d = jn0.m.b(new b());
    }
}
