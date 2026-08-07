package kc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u009b\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J¡\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b.\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b*\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u001a\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\"\u0010\u000f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b/\u0010-R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b5\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b3\u00108R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b1\u0010'¨\u00069"}, d2 = {"Lkc0/c;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "txid", "topic", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "sender_id", "", "command_type", "request_txid", "status_code", "response_topic", "expiry", StatusResponse.PAYLOAD, "Lkc0/b;", "options", "message_id", "unknownFields", "<init>", "(Lokio/k;Lokio/k;Lj$/time/Instant;Lokio/k;ILokio/k;ILokio/k;Lj$/time/Instant;Lokio/k;Lkc0/b;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;Lj$/time/Instant;Lokio/k;ILokio/k;ILokio/k;Lj$/time/Instant;Lokio/k;Lkc0/b;Lokio/k;Lokio/k;)Lkc0/c;", "Lokio/k;", "n", "()Lokio/k;", "b", "m", "c", "Lj$/time/Instant;", DateTokenConverter.CONVERTER_KEY, "()Lj$/time/Instant;", "k", "e", "I", "f", IntegerTokenConverter.CONVERTER_KEY, "g", "l", "h", "j", "Lkc0/b;", "()Lkc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.squareup.wire.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ProtoAdapter<c> f85890n = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(c.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)
    private final k txid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final k topic;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = q.a.OMIT_IDENTITY, tag = 3)
    private final Instant created_at;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "senderId", label = q.a.OMIT_IDENTITY, tag = 4)
    private final k sender_id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "commandType", label = q.a.OMIT_IDENTITY, tag = 5)
    private final int command_type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "requestTxid", label = q.a.OMIT_IDENTITY, tag = 6)
    private final k request_txid;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "statusCode", label = q.a.OMIT_IDENTITY, tag = 7)
    private final int status_code;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "responseTopic", label = q.a.OMIT_IDENTITY, tag = 8)
    private final k response_topic;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 9)
    private final Instant expiry;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 10)
    private final k payload;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.hermes.messages.FlatbuffersMessageOptions#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 11)
    private final b options;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "messageId", label = q.a.OMIT_IDENTITY, tag = 12)
    private final k message_id;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"kc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lkc0/c;", "value", "", "c", "(Lkc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lkc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lkc0/c;", DateTokenConverter.CONVERTER_KEY, "(Lkc0/c;)Lkc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProtoCommandMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            k kVarDecode2 = kVarDecode;
            k kVarDecode3 = kVarDecode2;
            k kVarDecode4 = kVarDecode3;
            k kVarDecode5 = kVarDecode4;
            Instant instantDecode = null;
            Instant instantDecode2 = null;
            b bVarDecode = null;
            int iIntValue = 0;
            int iIntValue2 = 0;
            k kVarDecode6 = kVarDecode5;
            k kVarDecode7 = kVarDecode6;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(kVarDecode, kVarDecode6, instantDecode, kVarDecode7, iIntValue, kVarDecode2, iIntValue2, kVarDecode3, instantDecode2, kVarDecode4, bVarDecode, kVarDecode5, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 2:
                        kVarDecode6 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 4:
                        kVarDecode7 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 5:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 7:
                        iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 8:
                        kVarDecode3 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 9:
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 10:
                        kVarDecode4 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 11:
                        bVarDecode = b.f85884f.decode(reader);
                        break;
                    case 12:
                        kVarDecode5 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, c value) {
            s.k(writer, "writer");
            s.k(value, "value");
            k txid = value.getTxid();
            k kVar = k.f97943e;
            if (!s.f(txid, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getTxid());
            }
            if (!s.f(value.getTopic(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getTopic());
            }
            if (value.getCreated_at() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.getCreated_at());
            }
            if (!s.f(value.getSender_id(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getSender_id());
            }
            if (value.getCommand_type() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getCommand_type()));
            }
            if (!s.f(value.getRequest_txid(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 6, value.getRequest_txid());
            }
            if (value.getStatus_code() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getStatus_code()));
            }
            if (!s.f(value.getResponse_topic(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 8, value.getResponse_topic());
            }
            if (value.getExpiry() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 9, value.getExpiry());
            }
            if (!s.f(value.getPayload(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 10, value.getPayload());
            }
            if (value.getOptions() != null) {
                b.f85884f.encodeWithTag(writer, 11, value.getOptions());
            }
            if (!s.f(value.getMessage_id(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 12, value.getMessage_id());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            k txid = value.getTxid();
            k kVar = k.f97943e;
            if (!s.f(txid, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getTxid());
            }
            if (!s.f(value.getTopic(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getTopic());
            }
            if (value.getCreated_at() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getCreated_at());
            }
            if (!s.f(value.getSender_id(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getSender_id());
            }
            if (value.getCommand_type() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getCommand_type()));
            }
            if (!s.f(value.getRequest_txid(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(6, value.getRequest_txid());
            }
            if (value.getStatus_code() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(7, Integer.valueOf(value.getStatus_code()));
            }
            if (!s.f(value.getResponse_topic(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(8, value.getResponse_topic());
            }
            if (value.getExpiry() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getExpiry());
            }
            if (!s.f(value.getPayload(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(10, value.getPayload());
            }
            if (value.getOptions() != null) {
                iD += b.f85884f.encodedSizeWithTag(11, value.getOptions());
            }
            return !s.f(value.getMessage_id(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(12, value.getMessage_id()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            s.k(value, "value");
            Instant created_at = value.getCreated_at();
            Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
            Instant expiry = value.getExpiry();
            Instant instantRedact2 = expiry != null ? ProtoAdapter.INSTANT.redact(expiry) : null;
            b options = value.getOptions();
            return c.b(value, null, null, instantRedact, null, 0, null, 0, null, instantRedact2, null, options != null ? b.f85884f.redact(options) : null, null, k.f97943e, 2811, null);
        }
    }

    public c() {
        this(null, null, null, null, 0, null, 0, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ c b(c cVar, k kVar, k kVar2, Instant instant, k kVar3, int i11, k kVar4, int i12, k kVar5, Instant instant2, k kVar6, b bVar, k kVar7, k kVar8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            kVar = cVar.txid;
        }
        return cVar.a(kVar, (i13 & 2) != 0 ? cVar.topic : kVar2, (i13 & 4) != 0 ? cVar.created_at : instant, (i13 & 8) != 0 ? cVar.sender_id : kVar3, (i13 & 16) != 0 ? cVar.command_type : i11, (i13 & 32) != 0 ? cVar.request_txid : kVar4, (i13 & 64) != 0 ? cVar.status_code : i12, (i13 & 128) != 0 ? cVar.response_topic : kVar5, (i13 & 256) != 0 ? cVar.expiry : instant2, (i13 & 512) != 0 ? cVar.payload : kVar6, (i13 & 1024) != 0 ? cVar.options : bVar, (i13 & 2048) != 0 ? cVar.message_id : kVar7, (i13 & 4096) != 0 ? cVar.unknownFields() : kVar8);
    }

    public final c a(k txid, k topic, Instant created_at, k sender_id, int command_type, k request_txid, int status_code, k response_topic, Instant expiry, k payload, b options, k message_id, k unknownFields) {
        s.k(txid, "txid");
        s.k(topic, "topic");
        s.k(sender_id, "sender_id");
        s.k(request_txid, "request_txid");
        s.k(response_topic, "response_topic");
        s.k(payload, "payload");
        s.k(message_id, "message_id");
        s.k(unknownFields, "unknownFields");
        return new c(txid, topic, created_at, sender_id, command_type, request_txid, status_code, response_topic, expiry, payload, options, message_id, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCommand_type() {
        return this.command_type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getExpiry() {
        return this.expiry;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return s.f(unknownFields(), cVar.unknownFields()) && s.f(this.txid, cVar.txid) && s.f(this.topic, cVar.topic) && s.f(this.created_at, cVar.created_at) && s.f(this.sender_id, cVar.sender_id) && this.command_type == cVar.command_type && s.f(this.request_txid, cVar.request_txid) && this.status_code == cVar.status_code && s.f(this.response_topic, cVar.response_topic) && s.f(this.expiry, cVar.expiry) && s.f(this.payload, cVar.payload) && s.f(this.options, cVar.options) && s.f(this.message_id, cVar.message_id);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.txid.hashCode()) * 37) + this.topic.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.sender_id.hashCode()) * 37) + Integer.hashCode(this.command_type)) * 37) + this.request_txid.hashCode()) * 37) + Integer.hashCode(this.status_code)) * 37) + this.response_topic.hashCode()) * 37;
        Instant instant2 = this.expiry;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.payload.hashCode()) * 37;
        b bVar = this.options;
        int iHashCode4 = ((iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.message_id.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k getRequest_txid() {
        return this.request_txid;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k getResponse_topic() {
        return this.response_topic;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final k getSender_id() {
        return this.sender_id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final k getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final k getTxid() {
        return this.txid;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m489newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("txid=" + this.txid);
        arrayList.add("topic=" + this.topic);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        arrayList.add("sender_id=" + this.sender_id);
        arrayList.add("command_type=" + this.command_type);
        arrayList.add("request_txid=" + this.request_txid);
        arrayList.add("status_code=" + this.status_code);
        arrayList.add("response_topic=" + this.response_topic);
        Instant instant2 = this.expiry;
        if (instant2 != null) {
            arrayList.add("expiry=" + instant2);
        }
        arrayList.add("payload=" + this.payload);
        b bVar = this.options;
        if (bVar != null) {
            arrayList.add("options=" + bVar);
        }
        arrayList.add("message_id=" + this.message_id);
        return v.y0(arrayList, ", ", "ProtoCommandMessage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(k kVar, k kVar2, Instant instant, k kVar3, int i11, k kVar4, int i12, k kVar5, Instant instant2, k kVar6, b bVar, k kVar7, k kVar8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? k.f97943e : kVar, (i13 & 2) != 0 ? k.f97943e : kVar2, (i13 & 4) != 0 ? null : instant, (i13 & 8) != 0 ? k.f97943e : kVar3, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? k.f97943e : kVar4, (i13 & 64) == 0 ? i12 : 0, (i13 & 128) != 0 ? k.f97943e : kVar5, (i13 & 256) != 0 ? null : instant2, (i13 & 512) != 0 ? k.f97943e : kVar6, (i13 & 1024) == 0 ? bVar : null, (i13 & 2048) != 0 ? k.f97943e : kVar7, (i13 & 4096) != 0 ? k.f97943e : kVar8);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m489newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k txid, k topic, Instant instant, k sender_id, int i11, k request_txid, int i12, k response_topic, Instant instant2, k payload, b bVar, k message_id, k unknownFields) {
        super(f85890n, unknownFields);
        s.k(txid, "txid");
        s.k(topic, "topic");
        s.k(sender_id, "sender_id");
        s.k(request_txid, "request_txid");
        s.k(response_topic, "response_topic");
        s.k(payload, "payload");
        s.k(message_id, "message_id");
        s.k(unknownFields, "unknownFields");
        this.txid = txid;
        this.topic = topic;
        this.created_at = instant;
        this.sender_id = sender_id;
        this.command_type = i11;
        this.request_txid = request_txid;
        this.status_code = i12;
        this.response_topic = response_topic;
        this.expiry = instant2;
        this.payload = payload;
        this.options = bVar;
        this.message_id = message_id;
    }
}
