package kc0;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lkc0/d;", "Lcom/squareup/wire/f;", "", "Lkc0/c;", "command_message", "Lkc0/e;", "subscribe_message", "Lkc0/f;", "unsubscribe_message", "Lokio/k;", "unknownFields", "<init>", "(Lkc0/c;Lkc0/e;Lkc0/f;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lkc0/c;Lkc0/e;Lkc0/f;Lokio/k;)Lkc0/d;", "Lkc0/c;", "b", "()Lkc0/c;", "Lkc0/e;", "c", "()Lkc0/e;", "Lkc0/f;", DateTokenConverter.CONVERTER_KEY, "()Lkc0/f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<d> f85904e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(d.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.hermes.messages.ProtoCommandMessage#ADAPTER", jsonName = "commandMessage", tag = 1)
    private final c command_message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.hermes.messages.ProtoSubscribeMessage#ADAPTER", jsonName = "subscribeMessage", tag = 2)
    private final e subscribe_message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.hermes.messages.ProtoUnsubscribeMessage#ADAPTER", jsonName = "unsubscribeMessage", tag = 3)
    private final f unsubscribe_message;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"kc0/d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lkc0/d;", "value", "", "c", "(Lkc0/d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lkc0/d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lkc0/d;", DateTokenConverter.CONVERTER_KEY, "(Lkc0/d;)Lkc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, co0.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProtoMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            c cVarDecode = null;
            e eVarDecode = null;
            f fVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new d(cVarDecode, eVarDecode, fVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    cVarDecode = c.f85890n.decode(reader);
                } else if (iG == 2) {
                    eVarDecode = e.f85909j.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    fVarDecode = f.f85919j.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, d value) {
            s.k(writer, "writer");
            s.k(value, "value");
            c.f85890n.encodeWithTag(writer, 1, value.getCommand_message());
            e.f85909j.encodeWithTag(writer, 2, value.getSubscribe_message());
            f.f85919j.encodeWithTag(writer, 3, value.getUnsubscribe_message());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d value) {
            s.k(value, "value");
            return value.unknownFields().D() + c.f85890n.encodedSizeWithTag(1, value.getCommand_message()) + e.f85909j.encodedSizeWithTag(2, value.getSubscribe_message()) + f.f85919j.encodedSizeWithTag(3, value.getUnsubscribe_message());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d redact(d value) {
            s.k(value, "value");
            c command_message = value.getCommand_message();
            c cVarRedact = command_message != null ? c.f85890n.redact(command_message) : null;
            e subscribe_message = value.getSubscribe_message();
            e eVarRedact = subscribe_message != null ? e.f85909j.redact(subscribe_message) : null;
            f unsubscribe_message = value.getUnsubscribe_message();
            return value.a(cVarRedact, eVarRedact, unsubscribe_message != null ? f.f85919j.redact(unsubscribe_message) : null, okio.k.f97943e);
        }
    }

    public d() {
        this(null, null, null, null, 15, null);
    }

    public final d a(c command_message, e subscribe_message, f unsubscribe_message, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new d(command_message, subscribe_message, unsubscribe_message, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getCommand_message() {
        return this.command_message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getSubscribe_message() {
        return this.subscribe_message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getUnsubscribe_message() {
        return this.unsubscribe_message;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return s.f(unknownFields(), dVar.unknownFields()) && s.f(this.command_message, dVar.command_message) && s.f(this.subscribe_message, dVar.subscribe_message) && s.f(this.unsubscribe_message, dVar.unsubscribe_message);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        c cVar = this.command_message;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
        e eVar = this.subscribe_message;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 37;
        f fVar = this.unsubscribe_message;
        int iHashCode4 = iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m490newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.command_message;
        if (cVar != null) {
            arrayList.add("command_message=" + cVar);
        }
        e eVar = this.subscribe_message;
        if (eVar != null) {
            arrayList.add("subscribe_message=" + eVar);
        }
        f fVar = this.unsubscribe_message;
        if (fVar != null) {
            arrayList.add("unsubscribe_message=" + fVar);
        }
        return v.y0(arrayList, ", ", "ProtoMessage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ d(c cVar, e eVar, f fVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? null : eVar, (i11 & 4) != 0 ? null : fVar, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m490newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, e eVar, f fVar, okio.k unknownFields) {
        super(f85904e, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.command_message = cVar;
        this.subscribe_message = eVar;
        this.unsubscribe_message = fVar;
        if (x20.d.d(cVar, eVar, fVar) > 1) {
            throw new IllegalArgumentException("At most one of command_message, subscribe_message, unsubscribe_message may be non-null");
        }
    }
}
