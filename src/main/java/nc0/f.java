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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lnc0/f;", "Lcom/squareup/wire/f;", "", "", ImagesContract.URL, "", "code", "", "responsePayloadSize", "responseContentType", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;IJLjava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;IJLjava/lang/String;Lokio/k;)Lnc0/f;", "Ljava/lang/String;", "f", "b", "I", "c", "J", "e", "()J", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<f> f93796f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(f.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 3)
    private final long responsePayloadSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 4)
    private final String responseContentType;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"nc0/f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lnc0/f;", "value", "", "c", "(Lnc0/f;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lnc0/f;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lnc0/f;", DateTokenConverter.CONVERTER_KEY, "(Lnc0/f;)Lnc0/f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, co0.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.HTTPTraceEnd", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            int iIntValue = 0;
            long jLongValue = 0;
            String strDecode2 = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new f(strDecode, iIntValue, jLongValue, strDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG == 3) {
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, f value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getUrl(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getUrl());
            }
            if (value.getCode() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getCode()));
            }
            if (value.getResponsePayloadSize() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(value.getResponsePayloadSize()));
            }
            if (!s.f(value.getResponseContentType(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getResponseContentType());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(f value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getUrl(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
            }
            if (value.getCode() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getCode()));
            }
            if (value.getResponsePayloadSize() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getResponsePayloadSize()));
            }
            return !s.f(value.getResponseContentType(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getResponseContentType()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f redact(f value) {
            s.k(value, "value");
            return f.b(value, null, 0, 0L, null, okio.k.f97943e, 15, null);
        }
    }

    public f() {
        this(null, 0, 0L, null, null, 31, null);
    }

    public static /* synthetic */ f b(f fVar, String str, int i11, long j11, String str2, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fVar.url;
        }
        if ((i12 & 2) != 0) {
            i11 = fVar.code;
        }
        if ((i12 & 4) != 0) {
            j11 = fVar.responsePayloadSize;
        }
        if ((i12 & 8) != 0) {
            str2 = fVar.responseContentType;
        }
        if ((i12 & 16) != 0) {
            kVar = fVar.unknownFields();
        }
        long j12 = j11;
        return fVar.a(str, i11, j12, str2, kVar);
    }

    public final f a(String url, int code, long responsePayloadSize, String responseContentType, okio.k unknownFields) {
        s.k(url, "url");
        s.k(responseContentType, "responseContentType");
        s.k(unknownFields, "unknownFields");
        return new f(url, code, responsePayloadSize, responseContentType, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResponseContentType() {
        return this.responseContentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getResponsePayloadSize() {
        return this.responsePayloadSize;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return s.f(unknownFields(), fVar.unknownFields()) && s.f(this.url, fVar.url) && this.code == fVar.code && this.responsePayloadSize == fVar.responsePayloadSize && s.f(this.responseContentType, fVar.responseContentType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + Integer.hashCode(this.code)) * 37) + Long.hashCode(this.responsePayloadSize)) * 37) + this.responseContentType.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m604newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url=" + x20.d.i(this.url));
        arrayList.add("code=" + this.code);
        arrayList.add("responsePayloadSize=" + this.responsePayloadSize);
        arrayList.add("responseContentType=" + x20.d.i(this.responseContentType));
        return v.y0(arrayList, ", ", "HTTPTraceEnd{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ f(String str, int i11, long j11, String str2, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? 0L : j11, (i12 & 8) != 0 ? "" : str2, (i12 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m604newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String url, int i11, long j11, String responseContentType, okio.k unknownFields) {
        super(f93796f, unknownFields);
        s.k(url, "url");
        s.k(responseContentType, "responseContentType");
        s.k(unknownFields, "unknownFields");
        this.url = url;
        this.code = i11;
        this.responsePayloadSize = j11;
        this.responseContentType = responseContentType;
    }
}
