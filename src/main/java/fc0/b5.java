package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ]\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b(\u0010\u001b¨\u0006)"}, d2 = {"Lfc0/b5;", "Lcom/squareup/wire/f;", "", "", "client_id", "scope", "access_token", "refresh_token", "", "expiry_timestamp", AnalyticsAttribute.Error, "scoped_token", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lokio/k;)Lfc0/b5;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "h", "c", "g", "e", "J", "f", "()J", IntegerTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b5 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<b5> f64900i = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(b5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientId", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String client_id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accessToken", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final String access_token;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refreshToken", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final String refresh_token;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "expiryTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final long expiry_timestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final String error;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "scopedToken", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final String scoped_token;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/b5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/b5;", "value", "", "c", "(Lfc0/b5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/b5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/b5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/b5;)Lfc0/b5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b5> {
        a(com.squareup.wire.b bVar, co0.d<b5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.TeslaAuthResponseAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b5 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            String strDecode2 = "";
            String strDecode3 = strDecode2;
            String strDecode4 = strDecode3;
            long jLongValue = 0;
            String strDecode5 = strDecode4;
            String strDecode6 = strDecode5;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b5(strDecode, strDecode5, strDecode6, strDecode2, jLongValue, strDecode3, strDecode4, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 6:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getClient_id(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getClient_id());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getScope(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getScope());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAccess_token(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getAccess_token());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getRefresh_token(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getRefresh_token());
            }
            if (value.getExpiry_timestamp() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 5, Long.valueOf(value.getExpiry_timestamp()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getError(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getError());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getScoped_token(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getScoped_token());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getClient_id(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getClient_id());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getScope(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getScope());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAccess_token(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccess_token());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getRefresh_token(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRefresh_token());
            }
            if (value.getExpiry_timestamp() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(5, Long.valueOf(value.getExpiry_timestamp()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getError(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getError());
            }
            return !p013kotlin.jvm.internal.s.f(value.getScoped_token(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getScoped_token()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b5 redact(b5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return b5.b(value, null, null, null, null, 0L, null, null, okio.k.f97943e, 127, null);
        }
    }

    public b5() {
        this(null, null, null, null, 0L, null, null, null, 255, null);
    }

    public static /* synthetic */ b5 b(b5 b5Var, String str, String str2, String str3, String str4, long j11, String str5, String str6, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = b5Var.client_id;
        }
        if ((i11 & 2) != 0) {
            str2 = b5Var.scope;
        }
        if ((i11 & 4) != 0) {
            str3 = b5Var.access_token;
        }
        if ((i11 & 8) != 0) {
            str4 = b5Var.refresh_token;
        }
        if ((i11 & 16) != 0) {
            j11 = b5Var.expiry_timestamp;
        }
        if ((i11 & 32) != 0) {
            str5 = b5Var.error;
        }
        if ((i11 & 64) != 0) {
            str6 = b5Var.scoped_token;
        }
        if ((i11 & 128) != 0) {
            kVar = b5Var.unknownFields();
        }
        okio.k kVar2 = kVar;
        String str7 = str5;
        long j12 = j11;
        String str8 = str3;
        String str9 = str4;
        return b5Var.a(str, str2, str8, str9, j12, str7, str6, kVar2);
    }

    public final b5 a(String client_id, String scope, String access_token, String refresh_token, long expiry_timestamp, String error, String scoped_token, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(client_id, "client_id");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(access_token, "access_token");
        p013kotlin.jvm.internal.s.k(refresh_token, "refresh_token");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(scoped_token, "scoped_token");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new b5(client_id, scope, access_token, refresh_token, expiry_timestamp, error, scoped_token, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAccess_token() {
        return this.access_token;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getClient_id() {
        return this.client_id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), b5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.client_id, b5Var.client_id) && p013kotlin.jvm.internal.s.f(this.scope, b5Var.scope) && p013kotlin.jvm.internal.s.f(this.access_token, b5Var.access_token) && p013kotlin.jvm.internal.s.f(this.refresh_token, b5Var.refresh_token) && this.expiry_timestamp == b5Var.expiry_timestamp && p013kotlin.jvm.internal.s.f(this.error, b5Var.error) && p013kotlin.jvm.internal.s.f(this.scoped_token, b5Var.scoped_token);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getExpiry_timestamp() {
        return this.expiry_timestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.client_id.hashCode()) * 37) + this.scope.hashCode()) * 37) + this.access_token.hashCode()) * 37) + this.refresh_token.hashCode()) * 37) + Long.hashCode(this.expiry_timestamp)) * 37) + this.error.hashCode()) * 37) + this.scoped_token.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getScoped_token() {
        return this.scoped_token;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m208newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("client_id=" + x20.d.i(this.client_id));
        arrayList.add("scope=" + x20.d.i(this.scope));
        arrayList.add("access_token=" + x20.d.i(this.access_token));
        arrayList.add("refresh_token=" + x20.d.i(this.refresh_token));
        arrayList.add("expiry_timestamp=" + this.expiry_timestamp);
        arrayList.add("error=" + x20.d.i(this.error));
        arrayList.add("scoped_token=" + x20.d.i(this.scoped_token));
        return p013kotlin.collections.v.y0(arrayList, ", ", "TeslaAuthResponseAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b5(String str, String str2, String str3, String str4, long j11, String str5, String str6, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? 0L : j11, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? "" : str6, (i11 & 128) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m208newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(String client_id, String scope, String access_token, String refresh_token, long j11, String error, String scoped_token, okio.k unknownFields) {
        super(f64900i, unknownFields);
        p013kotlin.jvm.internal.s.k(client_id, "client_id");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(access_token, "access_token");
        p013kotlin.jvm.internal.s.k(refresh_token, "refresh_token");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(scoped_token, "scoped_token");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.client_id = client_id;
        this.scope = scope;
        this.access_token = access_token;
        this.refresh_token = refresh_token;
        this.expiry_timestamp = j11;
        this.error = error;
        this.scoped_token = scoped_token;
    }
}
