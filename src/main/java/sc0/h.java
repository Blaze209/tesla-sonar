package sc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
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
import rc0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u008f\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0095\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b+\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b4\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b6\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b2\u0010<R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010=\u001a\u0004\b:\u0010>¨\u0006?"}, d2 = {"Lsc0/h;", "Lcom/squareup/wire/f;", "", "Lsc0/a;", "to_destination", "from_destination", "Lsc0/f;", "signedMessageStatus", "Lokio/k;", "request_uuid", "uuid", "", "flags", "protobuf_message_as_bytes", "Lsc0/i;", "session_info_request", "session_info", "Lsc0/e;", "message_frame", "Lrc0/m;", "signature_data", "unknownFields", "<init>", "(Lsc0/a;Lsc0/a;Lsc0/f;Lokio/k;Lokio/k;ILokio/k;Lsc0/i;Lokio/k;Lsc0/e;Lrc0/m;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lsc0/a;Lsc0/a;Lsc0/f;Lokio/k;Lokio/k;ILokio/k;Lsc0/i;Lokio/k;Lsc0/e;Lrc0/m;Lokio/k;)Lsc0/h;", "Lsc0/a;", "l", "()Lsc0/a;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Lsc0/f;", "k", "()Lsc0/f;", "Lokio/k;", "g", "()Lokio/k;", "e", "m", "f", "I", "h", "Lsc0/i;", IntegerTokenConverter.CONVERTER_KEY, "()Lsc0/i;", "j", "Lsc0/e;", "()Lsc0/e;", "Lrc0/m;", "()Lrc0/m;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends com.squareup.wire.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ProtoAdapter<h> f111089m = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(h.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.universalmessage.Destination#ADAPTER", jsonName = "toDestination", label = q.a.OMIT_IDENTITY, tag = 6)
    private final sc0.a to_destination;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.universalmessage.Destination#ADAPTER", jsonName = "fromDestination", label = q.a.OMIT_IDENTITY, tag = 7)
    private final sc0.a from_destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.universalmessage.MessageStatus#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 12)
    private final f signedMessageStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "requestUuid", label = q.a.OMIT_IDENTITY, tag = 50)
    private final k request_uuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 51)
    private final k uuid;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 52)
    private final int flags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "protobufMessageAsBytes", tag = 10)
    private final k protobuf_message_as_bytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.universalmessage.SessionInfoRequest#ADAPTER", jsonName = "sessionInfoRequest", tag = 14)
    private final i session_info_request;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "sessionInfo", tag = 15)
    private final k session_info;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.universalmessage.MessageFrame#ADAPTER", jsonName = "messageFrame", tag = 53)
    private final e message_frame;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.SignatureData#ADAPTER", jsonName = SignResponseData.JSON_RESPONSE_DATA_SIGNATURE_DATA, tag = 13)
    private final m signature_data;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"sc0/h$a", "Lcom/squareup/wire/ProtoAdapter;", "Lsc0/h;", "value", "", "c", "(Lsc0/h;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lsc0/h;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lsc0/h;", DateTokenConverter.CONVERTER_KEY, "(Lsc0/h;)Lsc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, co0.d<h> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.RoutableMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            sc0.a aVarDecode = null;
            f fVarDecode = null;
            k kVarDecode2 = null;
            i iVarDecode = null;
            k kVarDecode3 = null;
            e eVarDecode = null;
            m mVarDecode = null;
            int iIntValue = 0;
            k kVarDecode4 = kVarDecode;
            sc0.a aVarDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new h(aVarDecode2, aVarDecode, fVarDecode, kVarDecode, kVarDecode4, iIntValue, kVarDecode2, iVarDecode, kVarDecode3, eVarDecode, mVarDecode, reader.e(jD));
                }
                if (iG == 6) {
                    aVarDecode2 = sc0.a.f111076d.decode(reader);
                } else if (iG == 7) {
                    aVarDecode = sc0.a.f111076d.decode(reader);
                } else if (iG != 10) {
                    switch (iG) {
                        case 12:
                            fVarDecode = f.f111085d.decode(reader);
                            break;
                        case 13:
                            mVarDecode = m.f107695j.decode(reader);
                            break;
                        case 14:
                            iVarDecode = i.f111102f.decode(reader);
                            break;
                        case 15:
                            kVarDecode3 = ProtoAdapter.BYTES.decode(reader);
                            break;
                        default:
                            switch (iG) {
                                case 50:
                                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                                    break;
                                case 51:
                                    kVarDecode4 = ProtoAdapter.BYTES.decode(reader);
                                    break;
                                case 52:
                                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                                    break;
                                case 53:
                                    eVarDecode = e.f111080e.decode(reader);
                                    break;
                                default:
                                    reader.m(iG);
                                    break;
                            }
                            break;
                    }
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, h value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getTo_destination() != null) {
                sc0.a.f111076d.encodeWithTag(writer, 6, value.getTo_destination());
            }
            if (value.getFrom_destination() != null) {
                sc0.a.f111076d.encodeWithTag(writer, 7, value.getFrom_destination());
            }
            if (value.getSignedMessageStatus() != null) {
                f.f111085d.encodeWithTag(writer, 12, value.getSignedMessageStatus());
            }
            k request_uuid = value.getRequest_uuid();
            k kVar = k.f97943e;
            if (!s.f(request_uuid, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 50, value.getRequest_uuid());
            }
            if (!s.f(value.getUuid(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 51, value.getUuid());
            }
            if (value.getFlags() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 52, Integer.valueOf(value.getFlags()));
            }
            ProtoAdapter<k> protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(writer, 10, value.getProtobuf_message_as_bytes());
            i.f111102f.encodeWithTag(writer, 14, value.getSession_info_request());
            protoAdapter.encodeWithTag(writer, 15, value.getSession_info());
            e.f111080e.encodeWithTag(writer, 53, value.getMessage_frame());
            m.f107695j.encodeWithTag(writer, 13, value.getSignature_data());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(h value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTo_destination() != null) {
                iD += sc0.a.f111076d.encodedSizeWithTag(6, value.getTo_destination());
            }
            if (value.getFrom_destination() != null) {
                iD += sc0.a.f111076d.encodedSizeWithTag(7, value.getFrom_destination());
            }
            if (value.getSignedMessageStatus() != null) {
                iD += f.f111085d.encodedSizeWithTag(12, value.getSignedMessageStatus());
            }
            k request_uuid = value.getRequest_uuid();
            k kVar = k.f97943e;
            if (!s.f(request_uuid, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(50, value.getRequest_uuid());
            }
            if (!s.f(value.getUuid(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(51, value.getUuid());
            }
            if (value.getFlags() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(52, Integer.valueOf(value.getFlags()));
            }
            ProtoAdapter<k> protoAdapter = ProtoAdapter.BYTES;
            return iD + protoAdapter.encodedSizeWithTag(10, value.getProtobuf_message_as_bytes()) + i.f111102f.encodedSizeWithTag(14, value.getSession_info_request()) + protoAdapter.encodedSizeWithTag(15, value.getSession_info()) + e.f111080e.encodedSizeWithTag(53, value.getMessage_frame()) + m.f107695j.encodedSizeWithTag(13, value.getSignature_data());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h redact(h value) {
            s.k(value, "value");
            sc0.a to_destination = value.getTo_destination();
            sc0.a aVarRedact = to_destination != null ? sc0.a.f111076d.redact(to_destination) : null;
            sc0.a from_destination = value.getFrom_destination();
            sc0.a aVarRedact2 = from_destination != null ? sc0.a.f111076d.redact(from_destination) : null;
            f signedMessageStatus = value.getSignedMessageStatus();
            f fVarRedact = signedMessageStatus != null ? f.f111085d.redact(signedMessageStatus) : null;
            i session_info_request = value.getSession_info_request();
            i iVarRedact = session_info_request != null ? i.f111102f.redact(session_info_request) : null;
            e message_frame = value.getMessage_frame();
            e eVarRedact = message_frame != null ? e.f111080e.redact(message_frame) : null;
            m signature_data = value.getSignature_data();
            return h.b(value, aVarRedact, aVarRedact2, fVarRedact, null, null, 0, null, iVarRedact, null, eVarRedact, signature_data != null ? m.f107695j.redact(signature_data) : null, k.f97943e, 376, null);
        }
    }

    public h() {
        this(null, null, null, null, null, 0, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ h b(h hVar, sc0.a aVar, sc0.a aVar2, f fVar, k kVar, k kVar2, int i11, k kVar3, i iVar, k kVar4, e eVar, m mVar, k kVar5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            aVar = hVar.to_destination;
        }
        if ((i12 & 2) != 0) {
            aVar2 = hVar.from_destination;
        }
        if ((i12 & 4) != 0) {
            fVar = hVar.signedMessageStatus;
        }
        if ((i12 & 8) != 0) {
            kVar = hVar.request_uuid;
        }
        if ((i12 & 16) != 0) {
            kVar2 = hVar.uuid;
        }
        if ((i12 & 32) != 0) {
            i11 = hVar.flags;
        }
        if ((i12 & 64) != 0) {
            kVar3 = hVar.protobuf_message_as_bytes;
        }
        if ((i12 & 128) != 0) {
            iVar = hVar.session_info_request;
        }
        if ((i12 & 256) != 0) {
            kVar4 = hVar.session_info;
        }
        if ((i12 & 512) != 0) {
            eVar = hVar.message_frame;
        }
        if ((i12 & 1024) != 0) {
            mVar = hVar.signature_data;
        }
        if ((i12 & 2048) != 0) {
            kVar5 = hVar.unknownFields();
        }
        m mVar2 = mVar;
        k kVar6 = kVar5;
        k kVar7 = kVar4;
        e eVar2 = eVar;
        k kVar8 = kVar3;
        i iVar2 = iVar;
        k kVar9 = kVar2;
        int i13 = i11;
        return hVar.a(aVar, aVar2, fVar, kVar, kVar9, i13, kVar8, iVar2, kVar7, eVar2, mVar2, kVar6);
    }

    public final h a(sc0.a to_destination, sc0.a from_destination, f signedMessageStatus, k request_uuid, k uuid, int flags, k protobuf_message_as_bytes, i session_info_request, k session_info, e message_frame, m signature_data, k unknownFields) {
        s.k(request_uuid, "request_uuid");
        s.k(uuid, "uuid");
        s.k(unknownFields, "unknownFields");
        return new h(to_destination, from_destination, signedMessageStatus, request_uuid, uuid, flags, protobuf_message_as_bytes, session_info_request, session_info, message_frame, signature_data, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final sc0.a getFrom_destination() {
        return this.from_destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getMessage_frame() {
        return this.message_frame;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return s.f(unknownFields(), hVar.unknownFields()) && s.f(this.to_destination, hVar.to_destination) && s.f(this.from_destination, hVar.from_destination) && s.f(this.signedMessageStatus, hVar.signedMessageStatus) && s.f(this.request_uuid, hVar.request_uuid) && s.f(this.uuid, hVar.uuid) && this.flags == hVar.flags && s.f(this.protobuf_message_as_bytes, hVar.protobuf_message_as_bytes) && s.f(this.session_info_request, hVar.session_info_request) && s.f(this.session_info, hVar.session_info) && s.f(this.message_frame, hVar.message_frame) && s.f(this.signature_data, hVar.signature_data);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getProtobuf_message_as_bytes() {
        return this.protobuf_message_as_bytes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getRequest_uuid() {
        return this.request_uuid;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k getSession_info() {
        return this.session_info;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        sc0.a aVar = this.to_destination;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
        sc0.a aVar2 = this.from_destination;
        int iHashCode3 = (iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 37;
        f fVar = this.signedMessageStatus;
        int iHashCode4 = (((((((iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 37) + this.request_uuid.hashCode()) * 37) + this.uuid.hashCode()) * 37) + Integer.hashCode(this.flags)) * 37;
        k kVar = this.protobuf_message_as_bytes;
        int iHashCode5 = (iHashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 37;
        i iVar = this.session_info_request;
        int iHashCode6 = (iHashCode5 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        k kVar2 = this.session_info;
        int iHashCode7 = (iHashCode6 + (kVar2 != null ? kVar2.hashCode() : 0)) * 37;
        e eVar = this.message_frame;
        int iHashCode8 = (iHashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 37;
        m mVar = this.signature_data;
        int iHashCode9 = iHashCode8 + (mVar != null ? mVar.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final i getSession_info_request() {
        return this.session_info_request;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final m getSignature_data() {
        return this.signature_data;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f getSignedMessageStatus() {
        return this.signedMessageStatus;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final sc0.a getTo_destination() {
        return this.to_destination;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final k getUuid() {
        return this.uuid;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m770newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        sc0.a aVar = this.to_destination;
        if (aVar != null) {
            arrayList.add("to_destination=" + aVar);
        }
        sc0.a aVar2 = this.from_destination;
        if (aVar2 != null) {
            arrayList.add("from_destination=" + aVar2);
        }
        f fVar = this.signedMessageStatus;
        if (fVar != null) {
            arrayList.add("signedMessageStatus=" + fVar);
        }
        arrayList.add("request_uuid=" + this.request_uuid);
        arrayList.add("uuid=" + this.uuid);
        arrayList.add("flags=" + this.flags);
        k kVar = this.protobuf_message_as_bytes;
        if (kVar != null) {
            arrayList.add("protobuf_message_as_bytes=" + kVar);
        }
        i iVar = this.session_info_request;
        if (iVar != null) {
            arrayList.add("session_info_request=" + iVar);
        }
        k kVar2 = this.session_info;
        if (kVar2 != null) {
            arrayList.add("session_info=" + kVar2);
        }
        e eVar = this.message_frame;
        if (eVar != null) {
            arrayList.add("message_frame=" + eVar);
        }
        m mVar = this.signature_data;
        if (mVar != null) {
            arrayList.add("signature_data=" + mVar);
        }
        return v.y0(arrayList, ", ", "RoutableMessage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ h(sc0.a aVar, sc0.a aVar2, f fVar, k kVar, k kVar2, int i11, k kVar3, i iVar, k kVar4, e eVar, m mVar, k kVar5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? null : aVar2, (i12 & 4) != 0 ? null : fVar, (i12 & 8) != 0 ? k.f97943e : kVar, (i12 & 16) != 0 ? k.f97943e : kVar2, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? null : kVar3, (i12 & 128) != 0 ? null : iVar, (i12 & 256) != 0 ? null : kVar4, (i12 & 512) != 0 ? null : eVar, (i12 & 1024) != 0 ? null : mVar, (i12 & 2048) != 0 ? k.f97943e : kVar5);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m770newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sc0.a aVar, sc0.a aVar2, f fVar, k request_uuid, k uuid, int i11, k kVar, i iVar, k kVar2, e eVar, m mVar, k unknownFields) {
        super(f111089m, unknownFields);
        s.k(request_uuid, "request_uuid");
        s.k(uuid, "uuid");
        s.k(unknownFields, "unknownFields");
        this.to_destination = aVar;
        this.from_destination = aVar2;
        this.signedMessageStatus = fVar;
        this.request_uuid = request_uuid;
        this.uuid = uuid;
        this.flags = i11;
        this.protobuf_message_as_bytes = kVar;
        this.session_info_request = iVar;
        this.session_info = kVar2;
        this.message_frame = eVar;
        this.signature_data = mVar;
        if (x20.d.e(kVar, iVar, kVar2, eVar, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of protobuf_message_as_bytes, session_info_request, session_info, message_frame may be non-null");
        }
    }
}
