package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lfc0/r5;", "Lcom/squareup/wire/f;", "", "", "absolute_level", "delta_level", "Lec0/h0;", "vent", "close", "open_", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lfc0/r5;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "e", "Lec0/h0;", "g", "()Lec0/h0;", DateTokenConverter.CONVERTER_KEY, "f", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r5 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<r5> f65377g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "absoluteLevel", tag = 1)
    private final Integer absolute_level;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "deltaLevel", tag = 2)
    private final Integer delta_level;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final ec0.h0 vent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final ec0.h0 close;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", declaredName = "open", tag = 5)
    private final ec0.h0 open_;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/r5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/r5;", "value", "", "c", "(Lfc0/r5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/r5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/r5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/r5;)Lfc0/r5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r5> {
        a(com.squareup.wire.b bVar, co0.d<r5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlSunroofOpenCloseAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r5 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Integer numDecode = null;
            Integer numDecode2 = null;
            ec0.h0 h0VarDecode = null;
            ec0.h0 h0VarDecode2 = null;
            ec0.h0 h0VarDecode3 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r5(numDecode, numDecode2, h0VarDecode, h0VarDecode2, h0VarDecode3, reader.e(jD));
                }
                if (iG == 1) {
                    numDecode = ProtoAdapter.INT32.decode(reader);
                } else if (iG == 2) {
                    numDecode2 = ProtoAdapter.SINT32.decode(reader);
                } else if (iG == 3) {
                    h0VarDecode = ec0.h0.f62622b.decode(reader);
                } else if (iG == 4) {
                    h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter.INT32.encodeWithTag(writer, 1, value.getAbsolute_level());
            ProtoAdapter.SINT32.encodeWithTag(writer, 2, value.getDelta_level());
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            protoAdapter.encodeWithTag(writer, 3, value.getVent());
            protoAdapter.encodeWithTag(writer, 4, value.getClose());
            protoAdapter.encodeWithTag(writer, 5, value.getOpen_());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D() + ProtoAdapter.INT32.encodedSizeWithTag(1, value.getAbsolute_level()) + ProtoAdapter.SINT32.encodedSizeWithTag(2, value.getDelta_level());
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(3, value.getVent()) + protoAdapter.encodedSizeWithTag(4, value.getClose()) + protoAdapter.encodedSizeWithTag(5, value.getOpen_());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r5 redact(r5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.h0 vent = value.getVent();
            ec0.h0 h0VarRedact = vent != null ? ec0.h0.f62622b.redact(vent) : null;
            ec0.h0 close = value.getClose();
            ec0.h0 h0VarRedact2 = close != null ? ec0.h0.f62622b.redact(close) : null;
            ec0.h0 open_ = value.getOpen_();
            return r5.b(value, null, null, h0VarRedact, h0VarRedact2, open_ != null ? ec0.h0.f62622b.redact(open_) : null, okio.k.f97943e, 3, null);
        }
    }

    public r5() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ r5 b(r5 r5Var, Integer num, Integer num2, ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = r5Var.absolute_level;
        }
        if ((i11 & 2) != 0) {
            num2 = r5Var.delta_level;
        }
        if ((i11 & 4) != 0) {
            h0Var = r5Var.vent;
        }
        if ((i11 & 8) != 0) {
            h0Var2 = r5Var.close;
        }
        if ((i11 & 16) != 0) {
            h0Var3 = r5Var.open_;
        }
        if ((i11 & 32) != 0) {
            kVar = r5Var.unknownFields();
        }
        ec0.h0 h0Var4 = h0Var3;
        okio.k kVar2 = kVar;
        return r5Var.a(num, num2, h0Var, h0Var2, h0Var4, kVar2);
    }

    public final r5 a(Integer absolute_level, Integer delta_level, ec0.h0 vent, ec0.h0 close, ec0.h0 open_, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r5(absolute_level, delta_level, vent, close, open_, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getAbsolute_level() {
        return this.absolute_level;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ec0.h0 getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getDelta_level() {
        return this.delta_level;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), r5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.absolute_level, r5Var.absolute_level) && p013kotlin.jvm.internal.s.f(this.delta_level, r5Var.delta_level) && p013kotlin.jvm.internal.s.f(this.vent, r5Var.vent) && p013kotlin.jvm.internal.s.f(this.close, r5Var.close) && p013kotlin.jvm.internal.s.f(this.open_, r5Var.open_);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ec0.h0 getOpen_() {
        return this.open_;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ec0.h0 getVent() {
        return this.vent;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.absolute_level;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.delta_level;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        ec0.h0 h0Var = this.vent;
        int iHashCode4 = (iHashCode3 + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        ec0.h0 h0Var2 = this.close;
        int iHashCode5 = (iHashCode4 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        ec0.h0 h0Var3 = this.open_;
        int iHashCode6 = iHashCode5 + (h0Var3 != null ? h0Var3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m326newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.absolute_level;
        if (num != null) {
            arrayList.add("absolute_level=" + num);
        }
        Integer num2 = this.delta_level;
        if (num2 != null) {
            arrayList.add("delta_level=" + num2);
        }
        ec0.h0 h0Var = this.vent;
        if (h0Var != null) {
            arrayList.add("vent=" + h0Var);
        }
        ec0.h0 h0Var2 = this.close;
        if (h0Var2 != null) {
            arrayList.add("close=" + h0Var2);
        }
        ec0.h0 h0Var3 = this.open_;
        if (h0Var3 != null) {
            arrayList.add("open_=" + h0Var3);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleControlSunroofOpenCloseAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r5(Integer num, Integer num2, ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : h0Var, (i11 & 8) != 0 ? null : h0Var2, (i11 & 16) != 0 ? null : h0Var3, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m326newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(Integer num, Integer num2, ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k unknownFields) {
        super(f65377g, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.absolute_level = num;
        this.delta_level = num2;
        this.vent = h0Var;
        this.close = h0Var2;
        this.open_ = h0Var3;
        if (x20.d.c(num, num2) <= 1) {
            if (x20.d.d(h0Var, h0Var2, h0Var3) > 1) {
                throw new IllegalArgumentException("At most one of vent, close, open_ may be non-null");
            }
            return;
        }
        throw new IllegalArgumentException("At most one of absolute_level, delta_level may be non-null");
    }
}
