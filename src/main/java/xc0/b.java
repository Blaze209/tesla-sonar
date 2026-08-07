package xc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import gc0.r;
import java.util.ArrayList;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lxc0/b;", "Lcom/squareup/wire/f;", "", "", "phone_key_paired", "charge_port_open", "phone_key_connected", "Lgc0/r;", "closure_state", "Lokio/k;", "unknownFields", "<init>", "(ZZZLgc0/r;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZZZLgc0/r;Lokio/k;)Lxc0/b;", "Z", "f", "()Z", "b", "c", "e", DateTokenConverter.CONVERTER_KEY, "Lgc0/r;", "()Lgc0/r;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<b> f123237f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "phoneKeyPaired", label = q.a.OMIT_IDENTITY, tag = 1)
    private final boolean phone_key_paired;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargePortOpen", label = q.a.OMIT_IDENTITY, tag = 2)
    private final boolean charge_port_open;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "phoneKeyConnected", label = q.a.OMIT_IDENTITY, tag = 3)
    private final boolean phone_key_connected;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState#ADAPTER", jsonName = "closureState", label = q.a.OMIT_IDENTITY, tag = 4)
    private final r closure_state;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"xc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lxc0/b;", "value", "", "c", "(Lxc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lxc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lxc0/b;", DateTokenConverter.CONVERTER_KEY, "(Lxc0/b;)Lxc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.BleStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            r rVarDecode = null;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            boolean zBooleanValue3 = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(zBooleanValue, zBooleanValue2, zBooleanValue3, rVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 2) {
                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 3) {
                    zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    rVarDecode = r.V.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getPhone_key_paired()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getPhone_key_paired()));
            }
            if (value.getCharge_port_open()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getCharge_port_open()));
            }
            if (value.getPhone_key_connected()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getPhone_key_connected()));
            }
            if (value.getClosure_state() != null) {
                r.V.encodeWithTag(writer, 4, value.getClosure_state());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getPhone_key_paired()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getPhone_key_paired()));
            }
            if (value.getCharge_port_open()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getCharge_port_open()));
            }
            if (value.getPhone_key_connected()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getPhone_key_connected()));
            }
            return value.getClosure_state() != null ? iD + r.V.encodedSizeWithTag(4, value.getClosure_state()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            r closure_state = value.getClosure_state();
            return b.b(value, false, false, false, closure_state != null ? r.V.redact(closure_state) : null, okio.k.f97943e, 7, null);
        }
    }

    public b() {
        this(false, false, false, null, null, 31, null);
    }

    public static /* synthetic */ b b(b bVar, boolean z11, boolean z12, boolean z13, r rVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = bVar.phone_key_paired;
        }
        if ((i11 & 2) != 0) {
            z12 = bVar.charge_port_open;
        }
        if ((i11 & 4) != 0) {
            z13 = bVar.phone_key_connected;
        }
        if ((i11 & 8) != 0) {
            rVar = bVar.closure_state;
        }
        if ((i11 & 16) != 0) {
            kVar = bVar.unknownFields();
        }
        okio.k kVar2 = kVar;
        boolean z14 = z13;
        return bVar.a(z11, z12, z14, rVar, kVar2);
    }

    public final b a(boolean phone_key_paired, boolean charge_port_open, boolean phone_key_connected, r closure_state, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new b(phone_key_paired, charge_port_open, phone_key_connected, closure_state, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCharge_port_open() {
        return this.charge_port_open;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final r getClosure_state() {
        return this.closure_state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPhone_key_connected() {
        return this.phone_key_connected;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && this.phone_key_paired == bVar.phone_key_paired && this.charge_port_open == bVar.charge_port_open && this.phone_key_connected == bVar.phone_key_connected && s.f(this.closure_state, bVar.closure_state);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPhone_key_paired() {
        return this.phone_key_paired;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.phone_key_paired)) * 37) + Boolean.hashCode(this.charge_port_open)) * 37) + Boolean.hashCode(this.phone_key_connected)) * 37;
        r rVar = this.closure_state;
        int iHashCode2 = iHashCode + (rVar != null ? rVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m857newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("phone_key_paired=" + this.phone_key_paired);
        arrayList.add("charge_port_open=" + this.charge_port_open);
        arrayList.add("phone_key_connected=" + this.phone_key_connected);
        r rVar = this.closure_state;
        if (rVar != null) {
            arrayList.add("closure_state=" + rVar);
        }
        return v.y0(arrayList, ", ", "BleStatus{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(boolean z11, boolean z12, boolean z13, r rVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? null : rVar, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m857newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z11, boolean z12, boolean z13, r rVar, okio.k unknownFields) {
        super(f123237f, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.phone_key_paired = z11;
        this.charge_port_open = z12;
        this.phone_key_connected = z13;
        this.closure_state = rVar;
    }
}
