package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lvc0/p;", "Lcom/squareup/wire/f;", "", "Lvc0/q;", "sessionInfo", "Lvc0/m;", "requestedLevel", "", "Lvc0/n;", "reasonsForAuth", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/q;Lvc0/m;Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/q;Lvc0/m;Ljava/util/List;Lokio/k;)Lvc0/p;", "Lvc0/q;", "e", "()Lvc0/q;", "b", "Lvc0/m;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/m;", "c", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<p> f118867e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(p.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationRequestToken#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final q sessionInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationLevel_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final m requestedLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationReason_E#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 4)
    private final List<n> reasonsForAuth;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/p$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/p;", "value", "", "c", "(Lvc0/p;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/p;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/p;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/p;)Lvc0/p;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<p> {
        a(com.squareup.wire.b bVar, co0.d<p> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AuthenticationRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            m mVarDecode = m.AUTHENTICATION_LEVEL_NONE;
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            q qVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new p(qVarDecode, mVarDecode, arrayList, reader.e(jD));
                }
                if (iG == 2) {
                    qVarDecode = q.f118877c.decode(reader);
                } else if (iG == 3) {
                    try {
                        mVarDecode = m.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    try {
                        arrayList.add(n.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        jn0.h0 h0Var = jn0.h0.f84049a;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, p value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSessionInfo() != null) {
                q.f118877c.encodeWithTag(writer, 2, value.getSessionInfo());
            }
            if (value.getRequestedLevel() != m.AUTHENTICATION_LEVEL_NONE) {
                m.ADAPTER.encodeWithTag(writer, 3, value.getRequestedLevel());
            }
            n.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(p value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSessionInfo() != null) {
                iD += q.f118877c.encodedSizeWithTag(2, value.getSessionInfo());
            }
            if (value.getRequestedLevel() != m.AUTHENTICATION_LEVEL_NONE) {
                iD += m.ADAPTER.encodedSizeWithTag(3, value.getRequestedLevel());
            }
            return iD + n.ADAPTER.asRepeated().encodedSizeWithTag(4, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p redact(p value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            q sessionInfo = value.getSessionInfo();
            return p.b(value, sessionInfo != null ? q.f118877c.redact(sessionInfo) : null, null, null, okio.k.f97943e, 6, null);
        }
    }

    public p() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p b(p pVar, q qVar, m mVar, List list, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = pVar.sessionInfo;
        }
        if ((i11 & 2) != 0) {
            mVar = pVar.requestedLevel;
        }
        if ((i11 & 4) != 0) {
            list = pVar.reasonsForAuth;
        }
        if ((i11 & 8) != 0) {
            kVar = pVar.unknownFields();
        }
        return pVar.a(qVar, mVar, list, kVar);
    }

    public final p a(q sessionInfo, m requestedLevel, List<? extends n> reasonsForAuth, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(requestedLevel, "requestedLevel");
        p013kotlin.jvm.internal.s.k(reasonsForAuth, "reasonsForAuth");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new p(sessionInfo, requestedLevel, reasonsForAuth, unknownFields);
    }

    public final List<n> c() {
        return this.reasonsForAuth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m getRequestedLevel() {
        return this.requestedLevel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q getSessionInfo() {
        return this.sessionInfo;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), pVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.sessionInfo, pVar.sessionInfo) && this.requestedLevel == pVar.requestedLevel && p013kotlin.jvm.internal.s.f(this.reasonsForAuth, pVar.reasonsForAuth);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        q qVar = this.sessionInfo;
        int iHashCode2 = ((((iHashCode + (qVar != null ? qVar.hashCode() : 0)) * 37) + this.requestedLevel.hashCode()) * 37) + this.reasonsForAuth.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m826newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.sessionInfo;
        if (qVar != null) {
            arrayList.add("sessionInfo=" + qVar);
        }
        arrayList.add("requestedLevel=" + this.requestedLevel);
        if (!this.reasonsForAuth.isEmpty()) {
            arrayList.add("reasonsForAuth=" + this.reasonsForAuth);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "AuthenticationRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ p(q qVar, m mVar, List list, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : qVar, (i11 & 2) != 0 ? m.AUTHENTICATION_LEVEL_NONE : mVar, (i11 & 4) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m826newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, m requestedLevel, List<? extends n> reasonsForAuth, okio.k unknownFields) {
        super(f118867e, unknownFields);
        p013kotlin.jvm.internal.s.k(requestedLevel, "requestedLevel");
        p013kotlin.jvm.internal.s.k(reasonsForAuth, "reasonsForAuth");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.sessionInfo = qVar;
        this.requestedLevel = requestedLevel;
        this.reasonsForAuth = x20.d.g("reasonsForAuth", reasonsForAuth);
    }
}
