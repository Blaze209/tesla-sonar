package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB+\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvc0/k0;", "Lcom/squareup/wire/f;", "", "", "Lvc0/m0;", "states", "Lvc0/l0;", "confidence", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Lvc0/l0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Lvc0/l0;Lokio/k;)Lvc0/k0;", "Lvc0/l0;", "c", "()Lvc0/l0;", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<k0> f118791d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(k0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Device_Motion_Confidence#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final l0 confidence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Device_Motion_State#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<m0> states;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/k0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/k0;", "value", "", "c", "(Lvc0/k0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/k0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/k0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/k0;)Lvc0/k0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k0> {
        a(com.squareup.wire.b bVar, co0.d<k0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.DeviceMotion", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            l0 l0VarDecode = l0.DEVICE_MOTION_CONFIDENCE_UNKNOWN;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k0(arrayList, l0VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        arrayList.add(m0.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        jn0.h0 h0Var = jn0.h0.f84049a;
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    try {
                        l0VarDecode = l0.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            m0.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.d());
            if (value.getConfidence() != l0.DEVICE_MOTION_CONFIDENCE_UNKNOWN) {
                l0.ADAPTER.encodeWithTag(writer, 2, value.getConfidence());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D() + m0.ADAPTER.asRepeated().encodedSizeWithTag(1, value.d());
            return value.getConfidence() != l0.DEVICE_MOTION_CONFIDENCE_UNKNOWN ? iD + l0.ADAPTER.encodedSizeWithTag(2, value.getConfidence()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k0 redact(k0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return k0.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public k0() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k0 b(k0 k0Var, List list, l0 l0Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = k0Var.states;
        }
        if ((i11 & 2) != 0) {
            l0Var = k0Var.confidence;
        }
        if ((i11 & 4) != 0) {
            kVar = k0Var.unknownFields();
        }
        return k0Var.a(list, l0Var, kVar);
    }

    public final k0 a(List<? extends m0> states, l0 confidence, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(states, "states");
        p013kotlin.jvm.internal.s.k(confidence, "confidence");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k0(states, confidence, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l0 getConfidence() {
        return this.confidence;
    }

    public final List<m0> d() {
        return this.states;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), k0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.states, k0Var.states) && this.confidence == k0Var.confidence;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.states.hashCode()) * 37) + this.confidence.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m814newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.states.isEmpty()) {
            arrayList.add("states=" + this.states);
        }
        arrayList.add("confidence=" + this.confidence);
        return p013kotlin.collections.v.y0(arrayList, ", ", "DeviceMotion{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k0(List list, l0 l0Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? l0.DEVICE_MOTION_CONFIDENCE_UNKNOWN : l0Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m814newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(List<? extends m0> states, l0 confidence, okio.k unknownFields) {
        super(f118791d, unknownFields);
        p013kotlin.jvm.internal.s.k(states, "states");
        p013kotlin.jvm.internal.s.k(confidence, "confidence");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.confidence = confidence;
        this.states = x20.d.g("states", states);
    }
}
