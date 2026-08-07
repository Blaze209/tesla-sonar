package sc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lsc0/f;", "Lcom/squareup/wire/f;", "", "Lsc0/g;", "operation_status", "Lsc0/d;", "signed_message_fault", "Lokio/k;", "unknownFields", "<init>", "(Lsc0/g;Lsc0/d;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lsc0/g;Lsc0/d;Lokio/k;)Lsc0/f;", "Lsc0/g;", "c", "()Lsc0/g;", "b", "Lsc0/d;", DateTokenConverter.CONVERTER_KEY, "()Lsc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<f> f111085d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(f.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.tesla.generated.universalmessage.OperationStatus_E#ADAPTER", jsonName = "operationStatus", label = q.a.OMIT_IDENTITY, tag = 1)
    private final g operation_status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.universalmessage.MessageFault_E#ADAPTER", jsonName = "signedMessageFault", label = q.a.OMIT_IDENTITY, tag = 2)
    private final d signed_message_fault;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"sc0/f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lsc0/f;", "value", "", "c", "(Lsc0/f;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lsc0/f;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lsc0/f;", DateTokenConverter.CONVERTER_KEY, "(Lsc0/f;)Lsc0/f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, co0.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.MessageStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f decode(k reader) {
            s.k(reader, "reader");
            g gVarDecode = g.OPERATIONSTATUS_OK;
            d dVarDecode = d.MESSAGEFAULT_ERROR_NONE;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new f(gVarDecode, dVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        gVarDecode = g.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    try {
                        dVarDecode = d.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, f value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getOperation_status() != g.OPERATIONSTATUS_OK) {
                g.ADAPTER.encodeWithTag(writer, 1, value.getOperation_status());
            }
            if (value.getSigned_message_fault() != d.MESSAGEFAULT_ERROR_NONE) {
                d.ADAPTER.encodeWithTag(writer, 2, value.getSigned_message_fault());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(f value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getOperation_status() != g.OPERATIONSTATUS_OK) {
                iD += g.ADAPTER.encodedSizeWithTag(1, value.getOperation_status());
            }
            return value.getSigned_message_fault() != d.MESSAGEFAULT_ERROR_NONE ? iD + d.ADAPTER.encodedSizeWithTag(2, value.getSigned_message_fault()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f redact(f value) {
            s.k(value, "value");
            return f.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public f() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ f b(f fVar, g gVar, d dVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = fVar.operation_status;
        }
        if ((i11 & 2) != 0) {
            dVar = fVar.signed_message_fault;
        }
        if ((i11 & 4) != 0) {
            kVar = fVar.unknownFields();
        }
        return fVar.a(gVar, dVar, kVar);
    }

    public final f a(g operation_status, d signed_message_fault, okio.k unknownFields) {
        s.k(operation_status, "operation_status");
        s.k(signed_message_fault, "signed_message_fault");
        s.k(unknownFields, "unknownFields");
        return new f(operation_status, signed_message_fault, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getOperation_status() {
        return this.operation_status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getSigned_message_fault() {
        return this.signed_message_fault;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return s.f(unknownFields(), fVar.unknownFields()) && this.operation_status == fVar.operation_status && this.signed_message_fault == fVar.signed_message_fault;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.operation_status.hashCode()) * 37) + this.signed_message_fault.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m769newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("operation_status=" + this.operation_status);
        arrayList.add("signed_message_fault=" + this.signed_message_fault);
        return v.y0(arrayList, ", ", "MessageStatus{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ f(g gVar, d dVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? g.OPERATIONSTATUS_OK : gVar, (i11 & 2) != 0 ? d.MESSAGEFAULT_ERROR_NONE : dVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m769newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g operation_status, d signed_message_fault, okio.k unknownFields) {
        super(f111085d, unknownFields);
        s.k(operation_status, "operation_status");
        s.k(signed_message_fault, "signed_message_fault");
        s.k(unknownFields, "unknownFields");
        this.operation_status = operation_status;
        this.signed_message_fault = signed_message_fault;
    }
}
