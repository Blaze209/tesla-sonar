package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lvc0/r;", "Lcom/squareup/wire/f;", "", "Lvc0/m;", "authenticationLevel", "", "estimatedDistance", "Lvc0/o;", "authenticationRejection", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/m;ILvc0/o;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/m;ILvc0/o;Lokio/k;)Lvc0/r;", "Lvc0/m;", "c", "()Lvc0/m;", "b", "I", "e", "Lvc0/o;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/o;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<r> f118893e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationLevel_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final m authenticationLevel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int estimatedDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationRejection_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final o authenticationRejection;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/r$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/r;", "value", "", "c", "(Lvc0/r;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/r;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/r;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/r;)Lvc0/r;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r> {
        a(com.squareup.wire.b bVar, co0.d<r> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AuthenticationResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            m mVarDecode = m.AUTHENTICATION_LEVEL_NONE;
            o oVarDecode = o.AUTHENTICATIONREJECTION_NONE;
            long jD = reader.d();
            int iIntValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r(mVarDecode, iIntValue, oVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        mVarDecode = m.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        oVarDecode = o.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getAuthenticationLevel() != m.AUTHENTICATION_LEVEL_NONE) {
                m.ADAPTER.encodeWithTag(writer, 1, value.getAuthenticationLevel());
            }
            if (value.getEstimatedDistance() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getEstimatedDistance()));
            }
            if (value.getAuthenticationRejection() != o.AUTHENTICATIONREJECTION_NONE) {
                o.ADAPTER.encodeWithTag(writer, 3, value.getAuthenticationRejection());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getAuthenticationLevel() != m.AUTHENTICATION_LEVEL_NONE) {
                iD += m.ADAPTER.encodedSizeWithTag(1, value.getAuthenticationLevel());
            }
            if (value.getEstimatedDistance() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getEstimatedDistance()));
            }
            return value.getAuthenticationRejection() != o.AUTHENTICATIONREJECTION_NONE ? iD + o.ADAPTER.encodedSizeWithTag(3, value.getAuthenticationRejection()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r redact(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return r.b(value, null, 0, null, okio.k.f97943e, 7, null);
        }
    }

    public r() {
        this(null, 0, null, null, 15, null);
    }

    public static /* synthetic */ r b(r rVar, m mVar, int i11, o oVar, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            mVar = rVar.authenticationLevel;
        }
        if ((i12 & 2) != 0) {
            i11 = rVar.estimatedDistance;
        }
        if ((i12 & 4) != 0) {
            oVar = rVar.authenticationRejection;
        }
        if ((i12 & 8) != 0) {
            kVar = rVar.unknownFields();
        }
        return rVar.a(mVar, i11, oVar, kVar);
    }

    public final r a(m authenticationLevel, int estimatedDistance, o authenticationRejection, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(authenticationLevel, "authenticationLevel");
        p013kotlin.jvm.internal.s.k(authenticationRejection, "authenticationRejection");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r(authenticationLevel, estimatedDistance, authenticationRejection, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getAuthenticationLevel() {
        return this.authenticationLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o getAuthenticationRejection() {
        return this.authenticationRejection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getEstimatedDistance() {
        return this.estimatedDistance;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), rVar.unknownFields()) && this.authenticationLevel == rVar.authenticationLevel && this.estimatedDistance == rVar.estimatedDistance && this.authenticationRejection == rVar.authenticationRejection;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.authenticationLevel.hashCode()) * 37) + Integer.hashCode(this.estimatedDistance)) * 37) + this.authenticationRejection.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m832newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("authenticationLevel=" + this.authenticationLevel);
        arrayList.add("estimatedDistance=" + this.estimatedDistance);
        arrayList.add("authenticationRejection=" + this.authenticationRejection);
        return p013kotlin.collections.v.y0(arrayList, ", ", "AuthenticationResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r(m mVar, int i11, o oVar, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? m.AUTHENTICATION_LEVEL_NONE : mVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? o.AUTHENTICATIONREJECTION_NONE : oVar, (i12 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m832newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m authenticationLevel, int i11, o authenticationRejection, okio.k unknownFields) {
        super(f118893e, unknownFields);
        p013kotlin.jvm.internal.s.k(authenticationLevel, "authenticationLevel");
        p013kotlin.jvm.internal.s.k(authenticationRejection, "authenticationRejection");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.authenticationLevel = authenticationLevel;
        this.estimatedDistance = i11;
        this.authenticationRejection = authenticationRejection;
    }
}
