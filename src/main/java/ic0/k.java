package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lic0/k;", "Lcom/squareup/wire/f;", "", "Lic0/l;", "action", "", "keyVersion", "apiVersion", "Lokio/k;", "unknownFields", "<init>", "(Lic0/l;IILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lic0/l;IILokio/k;)Lic0/k;", "Lic0/l;", "c", "()Lic0/l;", "b", "I", "e", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<k> f77538e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(k.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.ProxyCommandAction#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final l action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int keyVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int apiVersion;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/k$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/k;", "value", "", "c", "(Lic0/k;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/k;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/k;", DateTokenConverter.CONVERTER_KEY, "(Lic0/k;)Lic0/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k> {
        a(com.squareup.wire.b bVar, co0.d<k> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProxyCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            l lVarDecode = null;
            int iIntValue = 0;
            int iIntValue2 = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k(lVarDecode, iIntValue, iIntValue2, reader.e(jD));
                }
                if (iG == 1) {
                    lVarDecode = l.f77543k.decode(reader);
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getAction() != null) {
                l.f77543k.encodeWithTag(writer, 1, value.getAction());
            }
            if (value.getKeyVersion() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getKeyVersion()));
            }
            if (value.getApiVersion() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getApiVersion()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getAction() != null) {
                iD += l.f77543k.encodedSizeWithTag(1, value.getAction());
            }
            if (value.getKeyVersion() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getKeyVersion()));
            }
            return value.getApiVersion() != 0 ? iD + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getApiVersion())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k redact(k value) {
            s.k(value, "value");
            l action = value.getAction();
            return k.b(value, action != null ? l.f77543k.redact(action) : null, 0, 0, okio.k.f97943e, 6, null);
        }
    }

    public k() {
        this(null, 0, 0, null, 15, null);
    }

    public static /* synthetic */ k b(k kVar, l lVar, int i11, int i12, okio.k kVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            lVar = kVar.action;
        }
        if ((i13 & 2) != 0) {
            i11 = kVar.keyVersion;
        }
        if ((i13 & 4) != 0) {
            i12 = kVar.apiVersion;
        }
        if ((i13 & 8) != 0) {
            kVar2 = kVar.unknownFields();
        }
        return kVar.a(lVar, i11, i12, kVar2);
    }

    public final k a(l action, int keyVersion, int apiVersion, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new k(action, keyVersion, apiVersion, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getApiVersion() {
        return this.apiVersion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getKeyVersion() {
        return this.keyVersion;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return s.f(unknownFields(), kVar.unknownFields()) && s.f(this.action, kVar.action) && this.keyVersion == kVar.keyVersion && this.apiVersion == kVar.apiVersion;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        l lVar = this.action;
        int iHashCode2 = ((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 37) + Integer.hashCode(this.keyVersion)) * 37) + Integer.hashCode(this.apiVersion);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m469newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        l lVar = this.action;
        if (lVar != null) {
            arrayList.add("action=" + lVar);
        }
        arrayList.add("keyVersion=" + this.keyVersion);
        arrayList.add("apiVersion=" + this.apiVersion);
        return v.y0(arrayList, ", ", "ProxyCommand{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k(l lVar, int i11, int i12, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : lVar, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m469newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i11, int i12, okio.k unknownFields) {
        super(f77538e, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.action = lVar;
        this.keyVersion = i11;
        this.apiVersion = i12;
    }
}
