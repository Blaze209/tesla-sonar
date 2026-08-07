package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ_\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lec0/g0;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Base", "Founder", "Signature", "Performance", "LaunchSeries", "SignatureSeries", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/g0;", "Lec0/h0;", "b", "()Lec0/h0;", "c", "f", DateTokenConverter.CONVERTER_KEY, "e", "g", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<g0> f62614h = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(g0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 Base;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 Founder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 Signature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 Performance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final h0 LaunchSeries;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
    private final h0 SignatureSeries;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/g0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/g0;", "value", "", "c", "(Lec0/g0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/g0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/g0;", DateTokenConverter.CONVERTER_KEY, "(Lec0/g0;)Lec0/g0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<g0> {
        a(com.squareup.wire.b bVar, co0.d<g0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleBadging", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            h0 h0VarDecode3 = null;
            h0 h0VarDecode4 = null;
            h0 h0VarDecode5 = null;
            h0 h0VarDecode6 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new g0(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        h0VarDecode = h0.f62622b.decode(reader);
                        break;
                    case 2:
                        h0VarDecode2 = h0.f62622b.decode(reader);
                        break;
                    case 3:
                        h0VarDecode3 = h0.f62622b.decode(reader);
                        break;
                    case 4:
                        h0VarDecode4 = h0.f62622b.decode(reader);
                        break;
                    case 5:
                        h0VarDecode5 = h0.f62622b.decode(reader);
                        break;
                    case 6:
                        h0VarDecode6 = h0.f62622b.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, g0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getBase());
            protoAdapter.encodeWithTag(writer, 2, value.getFounder());
            protoAdapter.encodeWithTag(writer, 3, value.getSignature());
            protoAdapter.encodeWithTag(writer, 4, value.getPerformance());
            protoAdapter.encodeWithTag(writer, 5, value.getLaunchSeries());
            protoAdapter.encodeWithTag(writer, 6, value.getSignatureSeries());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(g0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getBase()) + protoAdapter.encodedSizeWithTag(2, value.getFounder()) + protoAdapter.encodedSizeWithTag(3, value.getSignature()) + protoAdapter.encodedSizeWithTag(4, value.getPerformance()) + protoAdapter.encodedSizeWithTag(5, value.getLaunchSeries()) + protoAdapter.encodedSizeWithTag(6, value.getSignatureSeries());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g0 redact(g0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 base = value.getBase();
            h0 h0VarRedact = base != null ? h0.f62622b.redact(base) : null;
            h0 founder = value.getFounder();
            h0 h0VarRedact2 = founder != null ? h0.f62622b.redact(founder) : null;
            h0 signature = value.getSignature();
            h0 h0VarRedact3 = signature != null ? h0.f62622b.redact(signature) : null;
            h0 performance = value.getPerformance();
            h0 h0VarRedact4 = performance != null ? h0.f62622b.redact(performance) : null;
            h0 launchSeries = value.getLaunchSeries();
            h0 h0VarRedact5 = launchSeries != null ? h0.f62622b.redact(launchSeries) : null;
            h0 signatureSeries = value.getSignatureSeries();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, signatureSeries != null ? h0.f62622b.redact(signatureSeries) : null, okio.k.f97943e);
        }
    }

    public g0() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final g0 a(h0 Base, h0 Founder, h0 Signature, h0 Performance, h0 LaunchSeries, h0 SignatureSeries, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new g0(Base, Founder, Signature, Performance, LaunchSeries, SignatureSeries, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getBase() {
        return this.Base;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getFounder() {
        return this.Founder;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getLaunchSeries() {
        return this.LaunchSeries;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getPerformance() {
        return this.Performance;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), g0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Base, g0Var.Base) && p013kotlin.jvm.internal.s.f(this.Founder, g0Var.Founder) && p013kotlin.jvm.internal.s.f(this.Signature, g0Var.Signature) && p013kotlin.jvm.internal.s.f(this.Performance, g0Var.Performance) && p013kotlin.jvm.internal.s.f(this.LaunchSeries, g0Var.LaunchSeries) && p013kotlin.jvm.internal.s.f(this.SignatureSeries, g0Var.SignatureSeries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getSignature() {
        return this.Signature;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getSignatureSeries() {
        return this.SignatureSeries;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.Base;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.Founder;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.Signature;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.Performance;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.LaunchSeries;
        int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        h0 h0Var6 = this.SignatureSeries;
        int iHashCode7 = iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m145newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.Base;
        if (h0Var != null) {
            arrayList.add("Base=" + h0Var);
        }
        h0 h0Var2 = this.Founder;
        if (h0Var2 != null) {
            arrayList.add("Founder=" + h0Var2);
        }
        h0 h0Var3 = this.Signature;
        if (h0Var3 != null) {
            arrayList.add("Signature=" + h0Var3);
        }
        h0 h0Var4 = this.Performance;
        if (h0Var4 != null) {
            arrayList.add("Performance=" + h0Var4);
        }
        h0 h0Var5 = this.LaunchSeries;
        if (h0Var5 != null) {
            arrayList.add("LaunchSeries=" + h0Var5);
        }
        h0 h0Var6 = this.SignatureSeries;
        if (h0Var6 != null) {
            arrayList.add("SignatureSeries=" + h0Var6);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleBadging{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ g0(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m145newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, okio.k unknownFields) {
        super(f62614h, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Base = h0Var;
        this.Founder = h0Var2;
        this.Signature = h0Var3;
        this.Performance = h0Var4;
        this.LaunchSeries = h0Var5;
        this.SignatureSeries = h0Var6;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6) > 1) {
            throw new IllegalArgumentException("At most one of Base, Founder, Signature, Performance, LaunchSeries, SignatureSeries may be non-null");
        }
    }
}
