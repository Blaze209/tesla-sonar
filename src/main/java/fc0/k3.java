package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfc0/k3;", "Lcom/squareup/wire/f;", "", "", "client_id", "scope", "", "return_scoped_token", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLokio/k;)Lfc0/k3;", "Ljava/lang/String;", "c", "b", "e", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<k3> f65158e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(k3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientId", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String client_id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "returnScopedToken", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final boolean return_scoped_token;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/k3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/k3;", "value", "", "c", "(Lfc0/k3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/k3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/k3;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/k3;)Lfc0/k3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k3> {
        a(com.squareup.wire.b bVar, co0.d<k3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RequestTeslaAuthCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            boolean zBooleanValue = false;
            String strDecode2 = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k3(strDecode, strDecode2, zBooleanValue, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 2) {
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getClient_id(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getClient_id());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getScope(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getScope());
            }
            if (value.getReturn_scoped_token()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getReturn_scoped_token()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getClient_id(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getClient_id());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getScope(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getScope());
            }
            return value.getReturn_scoped_token() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getReturn_scoped_token())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k3 redact(k3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return k3.b(value, null, null, false, okio.k.f97943e, 7, null);
        }
    }

    public k3() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ k3 b(k3 k3Var, String str, String str2, boolean z11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = k3Var.client_id;
        }
        if ((i11 & 2) != 0) {
            str2 = k3Var.scope;
        }
        if ((i11 & 4) != 0) {
            z11 = k3Var.return_scoped_token;
        }
        if ((i11 & 8) != 0) {
            kVar = k3Var.unknownFields();
        }
        return k3Var.a(str, str2, z11, kVar);
    }

    public final k3 a(String client_id, String scope, boolean return_scoped_token, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(client_id, "client_id");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k3(client_id, scope, return_scoped_token, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getClient_id() {
        return this.client_id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getReturn_scoped_token() {
        return this.return_scoped_token;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), k3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.client_id, k3Var.client_id) && p013kotlin.jvm.internal.s.f(this.scope, k3Var.scope) && this.return_scoped_token == k3Var.return_scoped_token;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.client_id.hashCode()) * 37) + this.scope.hashCode()) * 37) + Boolean.hashCode(this.return_scoped_token);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m273newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("client_id=" + x20.d.i(this.client_id));
        arrayList.add("scope=" + x20.d.i(this.scope));
        arrayList.add("return_scoped_token=" + this.return_scoped_token);
        return p013kotlin.collections.v.y0(arrayList, ", ", "RequestTeslaAuthCommand{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k3(String str, String str2, boolean z11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m273newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(String client_id, String scope, boolean z11, okio.k unknownFields) {
        super(f65158e, unknownFields);
        p013kotlin.jvm.internal.s.k(client_id, "client_id");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.client_id = client_id;
        this.scope = scope;
        this.return_scoped_token = z11;
    }
}
