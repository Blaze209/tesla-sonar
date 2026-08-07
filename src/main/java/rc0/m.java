package rc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bq\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#Jw\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b4\u00109R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b0\u0010;R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b)\u0010=¨\u0006>"}, d2 = {"Lrc0/m;", "Lcom/squareup/wire/f;", "", "Lrc0/h;", "signer_identity", "Lrc0/i;", "Present_Key_data", "Lrc0/b;", "AES_GCM_Personalized_data", "Lrc0/f;", "session_info_tag", "Lrc0/j;", "RSA_data", "Lrc0/e;", "HMAC_Personalized_data", "Lrc0/c;", "AES_GCM_Response_data", "Lrc0/a;", "AES_GCM_Detached_data", "Lokio/k;", "unknownFields", "<init>", "(Lrc0/h;Lrc0/i;Lrc0/b;Lrc0/f;Lrc0/j;Lrc0/e;Lrc0/c;Lrc0/a;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lrc0/h;Lrc0/i;Lrc0/b;Lrc0/f;Lrc0/j;Lrc0/e;Lrc0/c;Lrc0/a;Lokio/k;)Lrc0/m;", "Lrc0/h;", IntegerTokenConverter.CONVERTER_KEY, "()Lrc0/h;", "b", "Lrc0/i;", "f", "()Lrc0/i;", "c", "Lrc0/b;", "()Lrc0/b;", DateTokenConverter.CONVERTER_KEY, "Lrc0/f;", "h", "()Lrc0/f;", "e", "Lrc0/j;", "g", "()Lrc0/j;", "Lrc0/e;", "()Lrc0/e;", "Lrc0/c;", "()Lrc0/c;", "Lrc0/a;", "()Lrc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<m> f107695j = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(m.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.KeyIdentity#ADAPTER", jsonName = "signerIdentity", label = q.a.OMIT_IDENTITY, tag = 1)
    private final h signer_identity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.Present_Key_Signature_Data#ADAPTER", jsonName = "PresentKeyData", tag = 2)
    private final i Present_Key_data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.AES_GCM_Personalized_Signature_Data#ADAPTER", jsonName = "AESGCMPersonalizedData", tag = 5)
    private final b AES_GCM_Personalized_data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.HMAC_Signature_Data#ADAPTER", jsonName = "sessionInfoTag", tag = 6)
    private final f session_info_tag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.RSA_Signature_Data#ADAPTER", jsonName = "RSAData", tag = 7)
    private final j RSA_data;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.HMAC_Personalized_Signature_Data#ADAPTER", jsonName = "HMACPersonalizedData", tag = 8)
    private final e HMAC_Personalized_data;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.AES_GCM_Response_Signature_Data#ADAPTER", jsonName = "AESGCMResponseData", tag = 9)
    private final c AES_GCM_Response_data;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.AES_GCM_Detached_Signature_Data#ADAPTER", jsonName = "AESGCMDetachedData", tag = 10)
    private final rc0.a AES_GCM_Detached_data;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/m$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/m;", "value", "", "c", "(Lrc0/m;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/m;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/m;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/m;)Lrc0/m;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<m> {
        a(com.squareup.wire.b bVar, co0.d<m> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.SignatureData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            h hVarDecode = null;
            i iVarDecode = null;
            b bVarDecode = null;
            f fVarDecode = null;
            j jVarDecode = null;
            e eVarDecode = null;
            c cVarDecode = null;
            rc0.a aVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new m(hVarDecode, iVarDecode, bVarDecode, fVarDecode, jVarDecode, eVarDecode, cVarDecode, aVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    hVarDecode = h.f107673f.decode(reader);
                } else if (iG != 2) {
                    switch (iG) {
                        case 5:
                            bVarDecode = b.f107649g.decode(reader);
                            break;
                        case 6:
                            fVarDecode = f.f107670c.decode(reader);
                            break;
                        case 7:
                            jVarDecode = j.f107682d.decode(reader);
                            break;
                        case 8:
                            eVarDecode = e.f107664f.decode(reader);
                            break;
                        case 9:
                            cVarDecode = c.f107656e.decode(reader);
                            break;
                        case 10:
                            aVarDecode = rc0.a.f107642g.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                } else {
                    iVarDecode = i.f107679c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, m value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getSigner_identity() != null) {
                h.f107673f.encodeWithTag(writer, 1, value.getSigner_identity());
            }
            i.f107679c.encodeWithTag(writer, 2, value.getPresent_Key_data());
            b.f107649g.encodeWithTag(writer, 5, value.getAES_GCM_Personalized_data());
            f.f107670c.encodeWithTag(writer, 6, value.getSession_info_tag());
            j.f107682d.encodeWithTag(writer, 7, value.getRSA_data());
            e.f107664f.encodeWithTag(writer, 8, value.getHMAC_Personalized_data());
            c.f107656e.encodeWithTag(writer, 9, value.getAES_GCM_Response_data());
            rc0.a.f107642g.encodeWithTag(writer, 10, value.getAES_GCM_Detached_data());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(m value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSigner_identity() != null) {
                iD += h.f107673f.encodedSizeWithTag(1, value.getSigner_identity());
            }
            return iD + i.f107679c.encodedSizeWithTag(2, value.getPresent_Key_data()) + b.f107649g.encodedSizeWithTag(5, value.getAES_GCM_Personalized_data()) + f.f107670c.encodedSizeWithTag(6, value.getSession_info_tag()) + j.f107682d.encodedSizeWithTag(7, value.getRSA_data()) + e.f107664f.encodedSizeWithTag(8, value.getHMAC_Personalized_data()) + c.f107656e.encodedSizeWithTag(9, value.getAES_GCM_Response_data()) + rc0.a.f107642g.encodedSizeWithTag(10, value.getAES_GCM_Detached_data());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public m redact(m value) {
            s.k(value, "value");
            h signer_identity = value.getSigner_identity();
            h hVarRedact = signer_identity != null ? h.f107673f.redact(signer_identity) : null;
            i present_Key_data = value.getPresent_Key_data();
            i iVarRedact = present_Key_data != null ? i.f107679c.redact(present_Key_data) : null;
            b aES_GCM_Personalized_data = value.getAES_GCM_Personalized_data();
            b bVarRedact = aES_GCM_Personalized_data != null ? b.f107649g.redact(aES_GCM_Personalized_data) : null;
            f session_info_tag = value.getSession_info_tag();
            f fVarRedact = session_info_tag != null ? f.f107670c.redact(session_info_tag) : null;
            j rSA_data = value.getRSA_data();
            j jVarRedact = rSA_data != null ? j.f107682d.redact(rSA_data) : null;
            e hMAC_Personalized_data = value.getHMAC_Personalized_data();
            e eVarRedact = hMAC_Personalized_data != null ? e.f107664f.redact(hMAC_Personalized_data) : null;
            c aES_GCM_Response_data = value.getAES_GCM_Response_data();
            c cVarRedact = aES_GCM_Response_data != null ? c.f107656e.redact(aES_GCM_Response_data) : null;
            rc0.a aES_GCM_Detached_data = value.getAES_GCM_Detached_data();
            return value.a(hVarRedact, iVarRedact, bVarRedact, fVarRedact, jVarRedact, eVarRedact, cVarRedact, aES_GCM_Detached_data != null ? rc0.a.f107642g.redact(aES_GCM_Detached_data) : null, okio.k.f97943e);
        }
    }

    public m() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final m a(h signer_identity, i Present_Key_data, b AES_GCM_Personalized_data, f session_info_tag, j RSA_data, e HMAC_Personalized_data, c AES_GCM_Response_data, rc0.a AES_GCM_Detached_data, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new m(signer_identity, Present_Key_data, AES_GCM_Personalized_data, session_info_tag, RSA_data, HMAC_Personalized_data, AES_GCM_Response_data, AES_GCM_Detached_data, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rc0.a getAES_GCM_Detached_data() {
        return this.AES_GCM_Detached_data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getAES_GCM_Personalized_data() {
        return this.AES_GCM_Personalized_data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getAES_GCM_Response_data() {
        return this.AES_GCM_Response_data;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getHMAC_Personalized_data() {
        return this.HMAC_Personalized_data;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return s.f(unknownFields(), mVar.unknownFields()) && s.f(this.signer_identity, mVar.signer_identity) && s.f(this.Present_Key_data, mVar.Present_Key_data) && s.f(this.AES_GCM_Personalized_data, mVar.AES_GCM_Personalized_data) && s.f(this.session_info_tag, mVar.session_info_tag) && s.f(this.RSA_data, mVar.RSA_data) && s.f(this.HMAC_Personalized_data, mVar.HMAC_Personalized_data) && s.f(this.AES_GCM_Response_data, mVar.AES_GCM_Response_data) && s.f(this.AES_GCM_Detached_data, mVar.AES_GCM_Detached_data);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i getPresent_Key_data() {
        return this.Present_Key_data;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j getRSA_data() {
        return this.RSA_data;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getSession_info_tag() {
        return this.session_info_tag;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h hVar = this.signer_identity;
        int iHashCode2 = (iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 37;
        i iVar = this.Present_Key_data;
        int iHashCode3 = (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        b bVar = this.AES_GCM_Personalized_data;
        int iHashCode4 = (iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37;
        f fVar = this.session_info_tag;
        int iHashCode5 = (iHashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 37;
        j jVar = this.RSA_data;
        int iHashCode6 = (iHashCode5 + (jVar != null ? jVar.hashCode() : 0)) * 37;
        e eVar = this.HMAC_Personalized_data;
        int iHashCode7 = (iHashCode6 + (eVar != null ? eVar.hashCode() : 0)) * 37;
        c cVar = this.AES_GCM_Response_data;
        int iHashCode8 = (iHashCode7 + (cVar != null ? cVar.hashCode() : 0)) * 37;
        rc0.a aVar = this.AES_GCM_Detached_data;
        int iHashCode9 = iHashCode8 + (aVar != null ? aVar.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h getSigner_identity() {
        return this.signer_identity;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m763newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h hVar = this.signer_identity;
        if (hVar != null) {
            arrayList.add("signer_identity=" + hVar);
        }
        i iVar = this.Present_Key_data;
        if (iVar != null) {
            arrayList.add("Present_Key_data=" + iVar);
        }
        b bVar = this.AES_GCM_Personalized_data;
        if (bVar != null) {
            arrayList.add("AES_GCM_Personalized_data=" + bVar);
        }
        f fVar = this.session_info_tag;
        if (fVar != null) {
            arrayList.add("session_info_tag=" + fVar);
        }
        j jVar = this.RSA_data;
        if (jVar != null) {
            arrayList.add("RSA_data=" + jVar);
        }
        e eVar = this.HMAC_Personalized_data;
        if (eVar != null) {
            arrayList.add("HMAC_Personalized_data=" + eVar);
        }
        c cVar = this.AES_GCM_Response_data;
        if (cVar != null) {
            arrayList.add("AES_GCM_Response_data=" + cVar);
        }
        rc0.a aVar = this.AES_GCM_Detached_data;
        if (aVar != null) {
            arrayList.add("AES_GCM_Detached_data=" + aVar);
        }
        return v.y0(arrayList, ", ", "SignatureData{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ m(h hVar, i iVar, b bVar, f fVar, j jVar, e eVar, c cVar, rc0.a aVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : hVar, (i11 & 2) != 0 ? null : iVar, (i11 & 4) != 0 ? null : bVar, (i11 & 8) != 0 ? null : fVar, (i11 & 16) != 0 ? null : jVar, (i11 & 32) != 0 ? null : eVar, (i11 & 64) != 0 ? null : cVar, (i11 & 128) != 0 ? null : aVar, (i11 & 256) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m763newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, i iVar, b bVar, f fVar, j jVar, e eVar, c cVar, rc0.a aVar, okio.k unknownFields) {
        super(f107695j, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.signer_identity = hVar;
        this.Present_Key_data = iVar;
        this.AES_GCM_Personalized_data = bVar;
        this.session_info_tag = fVar;
        this.RSA_data = jVar;
        this.HMAC_Personalized_data = eVar;
        this.AES_GCM_Response_data = cVar;
        this.AES_GCM_Detached_data = aVar;
        if (x20.d.e(iVar, bVar, fVar, jVar, eVar, cVar, aVar) > 1) {
            throw new IllegalArgumentException("At most one of Present_Key_data, AES_GCM_Personalized_data, session_info_tag, RSA_data, HMAC_Personalized_data, AES_GCM_Response_data, AES_GCM_Detached_data may be non-null");
        }
    }
}
