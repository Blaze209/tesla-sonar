package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Lfc0/e6;", "Lcom/squareup/wire/f;", "", "", "session_id", "", AnalyticsAttribute.Error, "Lokio/k;", "unknownFields", "<init>", "(ILjava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(ILjava/lang/String;Lokio/k;)Lfc0/e6;", "I", DateTokenConverter.CONVERTER_KEY, "b", "Ljava/lang/String;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e6 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<e6> f64981d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e6.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "sessionId", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int session_id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String error;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/e6$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/e6;", "value", "", "c", "(Lfc0/e6;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/e6;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/e6;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/e6;)Lfc0/e6;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e6> {
        a(com.squareup.wire.b bVar, co0.d<e6> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VitalsSubscriptionResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e6 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            int iIntValue = 0;
            String strDecode = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e6(iIntValue, strDecode, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e6 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSession_id() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getSession_id()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getError(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getError());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e6 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSession_id() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getSession_id()));
            }
            return !p013kotlin.jvm.internal.s.f(value.getError(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getError()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e6 redact(e6 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return e6.b(value, 0, null, okio.k.f97943e, 3, null);
        }
    }

    public e6() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ e6 b(e6 e6Var, int i11, String str, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = e6Var.session_id;
        }
        if ((i12 & 2) != 0) {
            str = e6Var.error;
        }
        if ((i12 & 4) != 0) {
            kVar = e6Var.unknownFields();
        }
        return e6Var.a(i11, str, kVar);
    }

    public final e6 a(int session_id, String error, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e6(session_id, error, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSession_id() {
        return this.session_id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), e6Var.unknownFields()) && this.session_id == e6Var.session_id && p013kotlin.jvm.internal.s.f(this.error, e6Var.error);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.session_id)) * 37) + this.error.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m234newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("session_id=" + this.session_id);
        arrayList.add("error=" + x20.d.i(this.error));
        return p013kotlin.collections.v.y0(arrayList, ", ", "VitalsSubscriptionResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e6(int i11, String str, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m234newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(int i11, String error, okio.k unknownFields) {
        super(f64981d, unknownFields);
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.session_id = i11;
        this.error = error;
    }
}
