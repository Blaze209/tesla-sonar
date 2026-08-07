package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import vc0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lic0/b;", "Lcom/squareup/wire/f;", "", "Lvc0/r;", "authenticationResponse", "Lvc0/q;", "authenticationRequestToken", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/r;Lvc0/q;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/r;Lvc0/q;Lokio/k;)Lic0/b;", "Lvc0/r;", "c", "()Lvc0/r;", "b", "Lvc0/q;", "()Lvc0/q;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<b> f77461d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationResponse#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final r authenticationResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationRequestToken#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final vc0.q authenticationRequestToken;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/b;", "value", "", "c", "(Lic0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/b;", DateTokenConverter.CONVERTER_KEY, "(Lic0/b;)Lic0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.AuthenticationResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            r rVarDecode = null;
            vc0.q qVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(rVarDecode, qVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    rVarDecode = r.f118893e.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    qVarDecode = vc0.q.f118877c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getAuthenticationResponse() != null) {
                r.f118893e.encodeWithTag(writer, 1, value.getAuthenticationResponse());
            }
            if (value.getAuthenticationRequestToken() != null) {
                vc0.q.f118877c.encodeWithTag(writer, 2, value.getAuthenticationRequestToken());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getAuthenticationResponse() != null) {
                iD += r.f118893e.encodedSizeWithTag(1, value.getAuthenticationResponse());
            }
            return value.getAuthenticationRequestToken() != null ? iD + vc0.q.f118877c.encodedSizeWithTag(2, value.getAuthenticationRequestToken()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            r authenticationResponse = value.getAuthenticationResponse();
            r rVarRedact = authenticationResponse != null ? r.f118893e.redact(authenticationResponse) : null;
            vc0.q authenticationRequestToken = value.getAuthenticationRequestToken();
            return value.a(rVarRedact, authenticationRequestToken != null ? vc0.q.f118877c.redact(authenticationRequestToken) : null, okio.k.f97943e);
        }
    }

    public b() {
        this(null, null, null, 7, null);
    }

    public final b a(r authenticationResponse, vc0.q authenticationRequestToken, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new b(authenticationResponse, authenticationRequestToken, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vc0.q getAuthenticationRequestToken() {
        return this.authenticationRequestToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getAuthenticationResponse() {
        return this.authenticationResponse;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && s.f(this.authenticationResponse, bVar.authenticationResponse) && s.f(this.authenticationRequestToken, bVar.authenticationRequestToken);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        r rVar = this.authenticationResponse;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 37;
        vc0.q qVar = this.authenticationRequestToken;
        int iHashCode3 = iHashCode2 + (qVar != null ? qVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m465newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.authenticationResponse;
        if (rVar != null) {
            arrayList.add("authenticationResponse=" + rVar);
        }
        vc0.q qVar = this.authenticationRequestToken;
        if (qVar != null) {
            arrayList.add("authenticationRequestToken=" + qVar);
        }
        return v.y0(arrayList, ", ", "AuthenticationResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(r rVar, vc0.q qVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : rVar, (i11 & 2) != 0 ? null : qVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m465newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, vc0.q qVar, okio.k unknownFields) {
        super(f77461d, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.authenticationResponse = rVar;
        this.authenticationRequestToken = qVar;
    }
}
