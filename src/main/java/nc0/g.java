package nc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lnc0/g;", "Lcom/squareup/wire/f;", "", "", ImagesContract.URL, "Lnc0/e;", "method", "", "requestPayloadSize", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Lnc0/e;JLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lnc0/e;JLokio/k;)Lnc0/g;", "Ljava/lang/String;", "e", "b", "Lnc0/e;", "c", "()Lnc0/e;", "J", DateTokenConverter.CONVERTER_KEY, "()J", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<g> f93802e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(g.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.monitoring.HTTPMethod#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)
    private final e method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 3)
    private final long requestPayloadSize;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"nc0/g$a", "Lcom/squareup/wire/ProtoAdapter;", "Lnc0/g;", "value", "", "c", "(Lnc0/g;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lnc0/g;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lnc0/g;", DateTokenConverter.CONVERTER_KEY, "(Lnc0/g;)Lnc0/g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, co0.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.HTTPTraceStart", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            e eVarDecode = e.GET;
            long jD = reader.d();
            long jLongValue = 0;
            String strDecode = "";
            while (true) {
                e eVar = eVarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new g(strDecode, eVar, jLongValue, reader.e(jD));
                    }
                    if (iG == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iG == 2) {
                        try {
                            eVarDecode = e.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    } else if (iG != 3) {
                        reader.m(iG);
                    } else {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, g value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getUrl(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getUrl());
            }
            if (value.getMethod() != e.GET) {
                e.ADAPTER.encodeWithTag(writer, 2, value.getMethod());
            }
            if (value.getRequestPayloadSize() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(value.getRequestPayloadSize()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(g value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getUrl(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
            }
            if (value.getMethod() != e.GET) {
                iD += e.ADAPTER.encodedSizeWithTag(2, value.getMethod());
            }
            return value.getRequestPayloadSize() != 0 ? iD + ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getRequestPayloadSize())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g redact(g value) {
            s.k(value, "value");
            return g.b(value, null, null, 0L, okio.k.f97943e, 7, null);
        }
    }

    public g() {
        this(null, null, 0L, null, 15, null);
    }

    public static /* synthetic */ g b(g gVar, String str, e eVar, long j11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gVar.url;
        }
        if ((i11 & 2) != 0) {
            eVar = gVar.method;
        }
        if ((i11 & 4) != 0) {
            j11 = gVar.requestPayloadSize;
        }
        if ((i11 & 8) != 0) {
            kVar = gVar.unknownFields();
        }
        okio.k kVar2 = kVar;
        return gVar.a(str, eVar, j11, kVar2);
    }

    public final g a(String url, e method, long requestPayloadSize, okio.k unknownFields) {
        s.k(url, "url");
        s.k(method, "method");
        s.k(unknownFields, "unknownFields");
        return new g(url, method, requestPayloadSize, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getRequestPayloadSize() {
        return this.requestPayloadSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return s.f(unknownFields(), gVar.unknownFields()) && s.f(this.url, gVar.url) && this.method == gVar.method && this.requestPayloadSize == gVar.requestPayloadSize;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + this.method.hashCode()) * 37) + Long.hashCode(this.requestPayloadSize);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m605newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url=" + x20.d.i(this.url));
        arrayList.add("method=" + this.method);
        arrayList.add("requestPayloadSize=" + this.requestPayloadSize);
        return v.y0(arrayList, ", ", "HTTPTraceStart{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ g(String str, e eVar, long j11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? e.GET : eVar, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m605newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String url, e method, long j11, okio.k unknownFields) {
        super(f93802e, unknownFields);
        s.k(url, "url");
        s.k(method, "method");
        s.k(unknownFields, "unknownFields");
        this.url = url;
        this.method = method;
        this.requestPayloadSize = j11;
    }
}
