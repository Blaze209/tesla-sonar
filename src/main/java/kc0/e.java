package kc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#Bc\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJi\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b*\u0010\"R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b+\u0010\"R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b%\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"Lkc0/e;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "txid", "message_id", "topic", "Lkc0/h;", "kind", "namespace_prefix", "name", AnalyticsAttribute.Error, "Lkc0/b;", "options", "unknownFields", "<init>", "(Lokio/k;Lokio/k;Lokio/k;Lkc0/h;Lokio/k;Lokio/k;Lokio/k;Lkc0/b;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;Lokio/k;Lkc0/h;Lokio/k;Lokio/k;Lokio/k;Lkc0/b;Lokio/k;)Lkc0/e;", "Lokio/k;", "j", "()Lokio/k;", "b", "e", "c", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "Lkc0/h;", "()Lkc0/h;", "g", "f", "h", "Lkc0/b;", "()Lkc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<e> f85909j = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(e.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)
    private final k txid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "messageId", label = q.a.OMIT_IDENTITY, tag = 2)
    private final k message_id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)
    private final k topic;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.hermes.messages.SubscriptionType#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)
    private final h kind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "namespacePrefix", label = q.a.OMIT_IDENTITY, tag = 5)
    private final k namespace_prefix;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 6)
    private final k name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 7)
    private final k error;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.hermes.messages.FlatbuffersMessageOptions#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)
    private final b options;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"kc0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lkc0/e;", "value", "", "c", "(Lkc0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lkc0/e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lkc0/e;", DateTokenConverter.CONVERTER_KEY, "(Lkc0/e;)Lkc0/e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, co0.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProtoSubscribeMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVar = k.f97943e;
            h hVar = h.TopicTypeNormal;
            long jD = reader.d();
            k kVarDecode = kVar;
            k kVarDecode2 = kVarDecode;
            k kVarDecode3 = kVarDecode2;
            k kVarDecode4 = kVarDecode3;
            h hVarDecode = hVar;
            b bVarDecode = null;
            k kVarDecode5 = kVarDecode4;
            k kVarDecode6 = kVarDecode5;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e(kVarDecode5, kVarDecode6, kVarDecode, hVarDecode, kVarDecode2, kVarDecode3, kVarDecode4, bVarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        kVarDecode5 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 2:
                        kVarDecode6 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 4:
                        try {
                            hVarDecode = h.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                        break;
                    case 5:
                        kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 6:
                        kVarDecode3 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 7:
                        kVarDecode4 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 8:
                        bVarDecode = b.f85884f.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, e value) {
            s.k(writer, "writer");
            s.k(value, "value");
            k txid = value.getTxid();
            k kVar = k.f97943e;
            if (!s.f(txid, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getTxid());
            }
            if (!s.f(value.getMessage_id(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getMessage_id());
            }
            if (!s.f(value.getTopic(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getTopic());
            }
            if (value.getKind() != h.TopicTypeNormal) {
                h.ADAPTER.encodeWithTag(writer, 4, value.getKind());
            }
            if (!s.f(value.getNamespace_prefix(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getNamespace_prefix());
            }
            if (!s.f(value.getName(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 6, value.getName());
            }
            if (!s.f(value.getError(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 7, value.getError());
            }
            if (value.getOptions() != null) {
                b.f85884f.encodeWithTag(writer, 8, value.getOptions());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            k txid = value.getTxid();
            k kVar = k.f97943e;
            if (!s.f(txid, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getTxid());
            }
            if (!s.f(value.getMessage_id(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getMessage_id());
            }
            if (!s.f(value.getTopic(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getTopic());
            }
            if (value.getKind() != h.TopicTypeNormal) {
                iD += h.ADAPTER.encodedSizeWithTag(4, value.getKind());
            }
            if (!s.f(value.getNamespace_prefix(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getNamespace_prefix());
            }
            if (!s.f(value.getName(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(6, value.getName());
            }
            if (!s.f(value.getError(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(7, value.getError());
            }
            return value.getOptions() != null ? iD + b.f85884f.encodedSizeWithTag(8, value.getOptions()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            s.k(value, "value");
            b options = value.getOptions();
            return e.b(value, null, null, null, null, null, null, null, options != null ? b.f85884f.redact(options) : null, k.f97943e, 127, null);
        }
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ e b(e eVar, k kVar, k kVar2, k kVar3, h hVar, k kVar4, k kVar5, k kVar6, b bVar, k kVar7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = eVar.txid;
        }
        if ((i11 & 2) != 0) {
            kVar2 = eVar.message_id;
        }
        if ((i11 & 4) != 0) {
            kVar3 = eVar.topic;
        }
        if ((i11 & 8) != 0) {
            hVar = eVar.kind;
        }
        if ((i11 & 16) != 0) {
            kVar4 = eVar.namespace_prefix;
        }
        if ((i11 & 32) != 0) {
            kVar5 = eVar.name;
        }
        if ((i11 & 64) != 0) {
            kVar6 = eVar.error;
        }
        if ((i11 & 128) != 0) {
            bVar = eVar.options;
        }
        if ((i11 & 256) != 0) {
            kVar7 = eVar.unknownFields();
        }
        b bVar2 = bVar;
        k kVar8 = kVar7;
        k kVar9 = kVar5;
        k kVar10 = kVar6;
        k kVar11 = kVar4;
        k kVar12 = kVar3;
        return eVar.a(kVar, kVar2, kVar12, hVar, kVar11, kVar9, kVar10, bVar2, kVar8);
    }

    public final e a(k txid, k message_id, k topic, h kind, k namespace_prefix, k name, k error, b options, k unknownFields) {
        s.k(txid, "txid");
        s.k(message_id, "message_id");
        s.k(topic, "topic");
        s.k(kind, "kind");
        s.k(namespace_prefix, "namespace_prefix");
        s.k(name, "name");
        s.k(error, "error");
        s.k(unknownFields, "unknownFields");
        return new e(txid, message_id, topic, kind, namespace_prefix, name, error, options, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k getMessage_id() {
        return this.message_id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return s.f(unknownFields(), eVar.unknownFields()) && s.f(this.txid, eVar.txid) && s.f(this.message_id, eVar.message_id) && s.f(this.topic, eVar.topic) && this.kind == eVar.kind && s.f(this.namespace_prefix, eVar.namespace_prefix) && s.f(this.name, eVar.name) && s.f(this.error, eVar.error) && s.f(this.options, eVar.options);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getNamespace_prefix() {
        return this.namespace_prefix;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getOptions() {
        return this.options;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.txid.hashCode()) * 37) + this.message_id.hashCode()) * 37) + this.topic.hashCode()) * 37) + this.kind.hashCode()) * 37) + this.namespace_prefix.hashCode()) * 37) + this.name.hashCode()) * 37) + this.error.hashCode()) * 37;
        b bVar = this.options;
        int iHashCode2 = iHashCode + (bVar != null ? bVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k getTxid() {
        return this.txid;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m491newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("txid=" + this.txid);
        arrayList.add("message_id=" + this.message_id);
        arrayList.add("topic=" + this.topic);
        arrayList.add("kind=" + this.kind);
        arrayList.add("namespace_prefix=" + this.namespace_prefix);
        arrayList.add("name=" + this.name);
        arrayList.add("error=" + this.error);
        b bVar = this.options;
        if (bVar != null) {
            arrayList.add("options=" + bVar);
        }
        return v.y0(arrayList, ", ", "ProtoSubscribeMessage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e(k kVar, k kVar2, k kVar3, h hVar, k kVar4, k kVar5, k kVar6, b bVar, k kVar7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? k.f97943e : kVar, (i11 & 2) != 0 ? k.f97943e : kVar2, (i11 & 4) != 0 ? k.f97943e : kVar3, (i11 & 8) != 0 ? h.TopicTypeNormal : hVar, (i11 & 16) != 0 ? k.f97943e : kVar4, (i11 & 32) != 0 ? k.f97943e : kVar5, (i11 & 64) != 0 ? k.f97943e : kVar6, (i11 & 128) != 0 ? null : bVar, (i11 & 256) != 0 ? k.f97943e : kVar7);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m491newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k txid, k message_id, k topic, h kind, k namespace_prefix, k name, k error, b bVar, k unknownFields) {
        super(f85909j, unknownFields);
        s.k(txid, "txid");
        s.k(message_id, "message_id");
        s.k(topic, "topic");
        s.k(kind, "kind");
        s.k(namespace_prefix, "namespace_prefix");
        s.k(name, "name");
        s.k(error, "error");
        s.k(unknownFields, "unknownFields");
        this.txid = txid;
        this.message_id = message_id;
        this.topic = topic;
        this.kind = kind;
        this.namespace_prefix = namespace_prefix;
        this.name = name;
        this.error = error;
        this.options = bVar;
    }
}
