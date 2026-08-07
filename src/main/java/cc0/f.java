package cc0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcc0/f;", "Lcom/squareup/wire/f;", "", "Lcc0/g;", Action.KEY_ATTRIBUTE, "Lcc0/a;", InquiryField.BooleanField.TYPE, "Lcc0/e;", InquiryField.IntegerField.TYPE, "Lcc0/b;", "double", "Lcc0/h;", InquiryField.StringField.TYPE, "Lokio/k;", "unknownFields", "<init>", "(Lcc0/g;Lcc0/a;Lcc0/e;Lcc0/b;Lcc0/h;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lcc0/g;Lcc0/a;Lcc0/e;Lcc0/b;Lcc0/h;Lokio/k;)Lcc0/f;", "Lcc0/g;", "f", "()Lcc0/g;", "b", "Lcc0/a;", "c", "()Lcc0/a;", "Lcc0/e;", "e", "()Lcc0/e;", DateTokenConverter.CONVERTER_KEY, "Lcc0/b;", "()Lcc0/b;", "Lcc0/h;", "g", "()Lcc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<f> f19053g = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(f.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.tesla.generated.analytics.AnalyticsParameterKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)
    private final g key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.analytics.AnalyticsBooleanParameterValue#ADAPTER", tag = 2)
    private final cc0.a boolean;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.analytics.AnalyticsIntegerParameterValue#ADAPTER", tag = 3)
    private final e integer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.analytics.AnalyticsDoubleParameterValue#ADAPTER", tag = 4)
    private final b double;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.analytics.AnalyticsStringParameterValue#ADAPTER", tag = 5)
    private final h string;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"cc0/f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lcc0/f;", "value", "", "c", "(Lcc0/f;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lcc0/f;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lcc0/f;", DateTokenConverter.CONVERTER_KEY, "(Lcc0/f;)Lcc0/f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, co0.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AnalyticsParameter", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f decode(k reader) {
            s.k(reader, "reader");
            g gVarDecode = g.SUCCESS;
            long jD = reader.d();
            cc0.a aVarDecode = null;
            e eVarDecode = null;
            b bVarDecode = null;
            h hVarDecode = null;
            while (true) {
                g gVar = gVarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new f(gVar, aVarDecode, eVarDecode, bVarDecode, hVarDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        try {
                            gVarDecode = g.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    } else if (iG == 2) {
                        aVarDecode = cc0.a.f19040c.decode(reader);
                    } else if (iG == 3) {
                        eVarDecode = e.f19050c.decode(reader);
                    } else if (iG == 4) {
                        bVarDecode = b.f19043c.decode(reader);
                    } else if (iG != 5) {
                        reader.m(iG);
                    } else {
                        hVarDecode = h.f19060c.decode(reader);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, f value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getKey() != g.SUCCESS) {
                g.ADAPTER.encodeWithTag(writer, 1, value.getKey());
            }
            cc0.a.f19040c.encodeWithTag(writer, 2, value.getBoolean());
            e.f19050c.encodeWithTag(writer, 3, value.getInteger());
            b.f19043c.encodeWithTag(writer, 4, value.getDouble());
            h.f19060c.encodeWithTag(writer, 5, value.getString());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(f value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getKey() != g.SUCCESS) {
                iD += g.ADAPTER.encodedSizeWithTag(1, value.getKey());
            }
            return iD + cc0.a.f19040c.encodedSizeWithTag(2, value.getBoolean()) + e.f19050c.encodedSizeWithTag(3, value.getInteger()) + b.f19043c.encodedSizeWithTag(4, value.getDouble()) + h.f19060c.encodedSizeWithTag(5, value.getString());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f redact(f value) {
            s.k(value, "value");
            cc0.a aVar = value.getBoolean();
            cc0.a aVarRedact = aVar != null ? cc0.a.f19040c.redact(aVar) : null;
            e integer = value.getInteger();
            e eVarRedact = integer != null ? e.f19050c.redact(integer) : null;
            b bVar = value.getDouble();
            b bVarRedact = bVar != null ? b.f19043c.redact(bVar) : null;
            h string = value.getString();
            return f.b(value, null, aVarRedact, eVarRedact, bVarRedact, string != null ? h.f19060c.redact(string) : null, okio.k.f97943e, 1, null);
        }
    }

    public f() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ f b(f fVar, g gVar, cc0.a aVar, e eVar, b bVar, h hVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = fVar.key;
        }
        if ((i11 & 2) != 0) {
            aVar = fVar.boolean;
        }
        if ((i11 & 4) != 0) {
            eVar = fVar.integer;
        }
        if ((i11 & 8) != 0) {
            bVar = fVar.double;
        }
        if ((i11 & 16) != 0) {
            hVar = fVar.string;
        }
        if ((i11 & 32) != 0) {
            kVar = fVar.unknownFields();
        }
        h hVar2 = hVar;
        okio.k kVar2 = kVar;
        return fVar.a(gVar, aVar, eVar, bVar, hVar2, kVar2);
    }

    public final f a(g key, cc0.a aVar, e integer, b bVar, h string, okio.k unknownFields) {
        s.k(key, "key");
        s.k(unknownFields, "unknownFields");
        return new f(key, aVar, integer, bVar, string, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final cc0.a getBoolean() {
        return this.boolean;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getDouble() {
        return this.double;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getInteger() {
        return this.integer;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return s.f(unknownFields(), fVar.unknownFields()) && this.key == fVar.key && s.f(this.boolean, fVar.boolean) && s.f(this.integer, fVar.integer) && s.f(this.double, fVar.double) && s.f(this.string, fVar.string);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getString() {
        return this.string;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37;
        cc0.a aVar = this.boolean;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
        e eVar = this.integer;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 37;
        b bVar = this.double;
        int iHashCode4 = (iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37;
        h hVar = this.string;
        int iHashCode5 = iHashCode4 + (hVar != null ? hVar.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m12newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key=" + this.key);
        cc0.a aVar = this.boolean;
        if (aVar != null) {
            arrayList.add("boolean=" + aVar);
        }
        e eVar = this.integer;
        if (eVar != null) {
            arrayList.add("integer=" + eVar);
        }
        b bVar = this.double;
        if (bVar != null) {
            arrayList.add("double=" + bVar);
        }
        h hVar = this.string;
        if (hVar != null) {
            arrayList.add("string=" + hVar);
        }
        return v.y0(arrayList, ", ", "AnalyticsParameter{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ f(g gVar, cc0.a aVar, e eVar, b bVar, h hVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? g.SUCCESS : gVar, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : eVar, (i11 & 8) != 0 ? null : bVar, (i11 & 16) != 0 ? null : hVar, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m12newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g key, cc0.a aVar, e eVar, b bVar, h hVar, okio.k unknownFields) {
        super(f19053g, unknownFields);
        s.k(key, "key");
        s.k(unknownFields, "unknownFields");
        this.key = key;
        this.boolean = aVar;
        this.integer = eVar;
        this.double = bVar;
        this.string = hVar;
        if (x20.d.e(aVar, eVar, bVar, hVar, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of boolean, integer, double, string may be non-null");
        }
    }
}
