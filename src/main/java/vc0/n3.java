package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B«\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J±\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b8\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b4\u00107R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b9\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b.\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b2\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b:\u0010<R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b@\u00101¨\u0006A"}, d2 = {"Lvc0/n3;", "Lcom/squareup/wire/f;", "", "Lvc0/l1;", "metadataForKey", "Lokio/k;", "sessionID", "Lvc0/m2;", "addPublicKeyToWhitelist", "removePublicKeyFromWhitelist", "Lvc0/e2;", "addPermissionsToPublicKey", "removePermissionsFromPublicKey", "addKeyToWhitelistAndAddPermissions", "updateKeyAndPermissions", "addImpermanentKey", "addImpermanentKeyAndRemoveExisting", "", "removeAllImpermanentKeys", "Lvc0/q2;", "replaceKey", "setInfotainmentKey", "unknownFields", "<init>", "(Lvc0/l1;Lokio/k;Lvc0/m2;Lvc0/m2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Ljava/lang/Boolean;Lvc0/q2;Lvc0/m2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/l1;Lokio/k;Lvc0/m2;Lvc0/m2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Lvc0/e2;Ljava/lang/Boolean;Lvc0/q2;Lvc0/m2;Lokio/k;)Lvc0/n3;", "Lvc0/l1;", "h", "()Lvc0/l1;", "b", "Lokio/k;", "m", "()Lokio/k;", "c", "Lvc0/m2;", "g", "()Lvc0/m2;", DateTokenConverter.CONVERTER_KEY, "k", "e", "Lvc0/e2;", "f", "()Lvc0/e2;", "j", "o", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "l", "Lvc0/q2;", "()Lvc0/q2;", "n", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ProtoAdapter<n3> f118852o = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(n3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyMetadata#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final l1 metadataForKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final okio.k sessionID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", tag = 1)
    private final m2 addPublicKeyToWhitelist;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", tag = 2)
    private final m2 removePublicKeyFromWhitelist;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 3)
    private final e2 addPermissionsToPublicKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 4)
    private final e2 removePermissionsFromPublicKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 5)
    private final e2 addKeyToWhitelistAndAddPermissions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 7)
    private final e2 updateKeyAndPermissions;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 8)
    private final e2 addImpermanentKey;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 9)
    private final e2 addImpermanentKeyAndRemoveExisting;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 16)
    private final Boolean removeAllImpermanentKeys;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ReplaceKey#ADAPTER", tag = 17)
    private final q2 replaceKey;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", tag = 18)
    private final m2 setInfotainmentKey;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/n3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/n3;", "value", "", "c", "(Lvc0/n3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/n3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/n3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/n3;)Lvc0/n3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<n3> {
        a(com.squareup.wire.b bVar, co0.d<n3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistOperation", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVar = okio.k.f97943e;
            long jD = reader.d();
            l1 l1VarDecode = null;
            okio.k kVarDecode = kVar;
            m2 m2VarDecode = null;
            m2 m2VarDecode2 = null;
            e2 e2VarDecode = null;
            e2 e2VarDecode2 = null;
            e2 e2VarDecode3 = null;
            e2 e2VarDecode4 = null;
            e2 e2VarDecode5 = null;
            e2 e2VarDecode6 = null;
            Boolean boolDecode = null;
            q2 q2VarDecode = null;
            m2 m2VarDecode3 = null;
            while (true) {
                int iG = reader.g();
                l1 l1Var = l1VarDecode;
                if (iG == -1) {
                    return new n3(l1Var, kVarDecode, m2VarDecode, m2VarDecode2, e2VarDecode, e2VarDecode2, e2VarDecode3, e2VarDecode4, e2VarDecode5, e2VarDecode6, boolDecode, q2VarDecode, m2VarDecode3, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        m2VarDecode = m2.f118835c.decode(reader);
                        break;
                    case 2:
                        m2VarDecode2 = m2.f118835c.decode(reader);
                        break;
                    case 3:
                        e2VarDecode = e2.f118647f.decode(reader);
                        break;
                    case 4:
                        e2VarDecode2 = e2.f118647f.decode(reader);
                        break;
                    case 5:
                        e2VarDecode3 = e2.f118647f.decode(reader);
                        break;
                    case 6:
                        l1VarDecode = l1.f118815c.decode(reader);
                        continue;
                    case 7:
                        e2VarDecode4 = e2.f118647f.decode(reader);
                        break;
                    case 8:
                        e2VarDecode5 = e2.f118647f.decode(reader);
                        break;
                    case 9:
                        e2VarDecode6 = e2.f118647f.decode(reader);
                        break;
                    case 10:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        break;
                    default:
                        switch (iG) {
                            case 16:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 17:
                                q2VarDecode = q2.f118886g.decode(reader);
                                break;
                            case 18:
                                m2VarDecode3 = m2.f118835c.decode(reader);
                                break;
                            default:
                                reader.m(iG);
                                break;
                        }
                        break;
                }
                l1VarDecode = l1Var;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, n3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getMetadataForKey() != null) {
                l1.f118815c.encodeWithTag(writer, 6, value.getMetadataForKey());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getSessionID(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 10, value.getSessionID());
            }
            ProtoAdapter<m2> protoAdapter = m2.f118835c;
            protoAdapter.encodeWithTag(writer, 1, value.getAddPublicKeyToWhitelist());
            protoAdapter.encodeWithTag(writer, 2, value.getRemovePublicKeyFromWhitelist());
            ProtoAdapter<e2> protoAdapter2 = e2.f118647f;
            protoAdapter2.encodeWithTag(writer, 3, value.getAddPermissionsToPublicKey());
            protoAdapter2.encodeWithTag(writer, 4, value.getRemovePermissionsFromPublicKey());
            protoAdapter2.encodeWithTag(writer, 5, value.getAddKeyToWhitelistAndAddPermissions());
            protoAdapter2.encodeWithTag(writer, 7, value.getUpdateKeyAndPermissions());
            protoAdapter2.encodeWithTag(writer, 8, value.getAddImpermanentKey());
            protoAdapter2.encodeWithTag(writer, 9, value.getAddImpermanentKeyAndRemoveExisting());
            ProtoAdapter.BOOL.encodeWithTag(writer, 16, value.getRemoveAllImpermanentKeys());
            q2.f118886g.encodeWithTag(writer, 17, value.getReplaceKey());
            protoAdapter.encodeWithTag(writer, 18, value.getSetInfotainmentKey());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(n3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getMetadataForKey() != null) {
                iD += l1.f118815c.encodedSizeWithTag(6, value.getMetadataForKey());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getSessionID(), okio.k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(10, value.getSessionID());
            }
            ProtoAdapter<m2> protoAdapter = m2.f118835c;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(1, value.getAddPublicKeyToWhitelist()) + protoAdapter.encodedSizeWithTag(2, value.getRemovePublicKeyFromWhitelist());
            ProtoAdapter<e2> protoAdapter2 = e2.f118647f;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, value.getAddPermissionsToPublicKey()) + protoAdapter2.encodedSizeWithTag(4, value.getRemovePermissionsFromPublicKey()) + protoAdapter2.encodedSizeWithTag(5, value.getAddKeyToWhitelistAndAddPermissions()) + protoAdapter2.encodedSizeWithTag(7, value.getUpdateKeyAndPermissions()) + protoAdapter2.encodedSizeWithTag(8, value.getAddImpermanentKey()) + protoAdapter2.encodedSizeWithTag(9, value.getAddImpermanentKeyAndRemoveExisting()) + ProtoAdapter.BOOL.encodedSizeWithTag(16, value.getRemoveAllImpermanentKeys()) + q2.f118886g.encodedSizeWithTag(17, value.getReplaceKey()) + protoAdapter.encodedSizeWithTag(18, value.getSetInfotainmentKey());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n3 redact(n3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            l1 metadataForKey = value.getMetadataForKey();
            l1 l1VarRedact = metadataForKey != null ? l1.f118815c.redact(metadataForKey) : null;
            m2 addPublicKeyToWhitelist = value.getAddPublicKeyToWhitelist();
            m2 m2VarRedact = addPublicKeyToWhitelist != null ? m2.f118835c.redact(addPublicKeyToWhitelist) : null;
            m2 removePublicKeyFromWhitelist = value.getRemovePublicKeyFromWhitelist();
            m2 m2VarRedact2 = removePublicKeyFromWhitelist != null ? m2.f118835c.redact(removePublicKeyFromWhitelist) : null;
            e2 addPermissionsToPublicKey = value.getAddPermissionsToPublicKey();
            e2 e2VarRedact = addPermissionsToPublicKey != null ? e2.f118647f.redact(addPermissionsToPublicKey) : null;
            e2 removePermissionsFromPublicKey = value.getRemovePermissionsFromPublicKey();
            e2 e2VarRedact2 = removePermissionsFromPublicKey != null ? e2.f118647f.redact(removePermissionsFromPublicKey) : null;
            e2 addKeyToWhitelistAndAddPermissions = value.getAddKeyToWhitelistAndAddPermissions();
            e2 e2VarRedact3 = addKeyToWhitelistAndAddPermissions != null ? e2.f118647f.redact(addKeyToWhitelistAndAddPermissions) : null;
            e2 updateKeyAndPermissions = value.getUpdateKeyAndPermissions();
            e2 e2VarRedact4 = updateKeyAndPermissions != null ? e2.f118647f.redact(updateKeyAndPermissions) : null;
            e2 addImpermanentKey = value.getAddImpermanentKey();
            e2 e2VarRedact5 = addImpermanentKey != null ? e2.f118647f.redact(addImpermanentKey) : null;
            e2 addImpermanentKeyAndRemoveExisting = value.getAddImpermanentKeyAndRemoveExisting();
            e2 e2VarRedact6 = addImpermanentKeyAndRemoveExisting != null ? e2.f118647f.redact(addImpermanentKeyAndRemoveExisting) : null;
            q2 replaceKey = value.getReplaceKey();
            q2 q2VarRedact = replaceKey != null ? q2.f118886g.redact(replaceKey) : null;
            m2 setInfotainmentKey = value.getSetInfotainmentKey();
            return n3.b(value, l1VarRedact, null, m2VarRedact, m2VarRedact2, e2VarRedact, e2VarRedact2, e2VarRedact3, e2VarRedact4, e2VarRedact5, e2VarRedact6, null, q2VarRedact, setInfotainmentKey != null ? m2.f118835c.redact(setInfotainmentKey) : null, okio.k.f97943e, 1026, null);
        }
    }

    public n3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ n3 b(n3 n3Var, l1 l1Var, okio.k kVar, m2 m2Var, m2 m2Var2, e2 e2Var, e2 e2Var2, e2 e2Var3, e2 e2Var4, e2 e2Var5, e2 e2Var6, Boolean bool, q2 q2Var, m2 m2Var3, okio.k kVar2, int i11, Object obj) {
        return n3Var.a((i11 & 1) != 0 ? n3Var.metadataForKey : l1Var, (i11 & 2) != 0 ? n3Var.sessionID : kVar, (i11 & 4) != 0 ? n3Var.addPublicKeyToWhitelist : m2Var, (i11 & 8) != 0 ? n3Var.removePublicKeyFromWhitelist : m2Var2, (i11 & 16) != 0 ? n3Var.addPermissionsToPublicKey : e2Var, (i11 & 32) != 0 ? n3Var.removePermissionsFromPublicKey : e2Var2, (i11 & 64) != 0 ? n3Var.addKeyToWhitelistAndAddPermissions : e2Var3, (i11 & 128) != 0 ? n3Var.updateKeyAndPermissions : e2Var4, (i11 & 256) != 0 ? n3Var.addImpermanentKey : e2Var5, (i11 & 512) != 0 ? n3Var.addImpermanentKeyAndRemoveExisting : e2Var6, (i11 & 1024) != 0 ? n3Var.removeAllImpermanentKeys : bool, (i11 & 2048) != 0 ? n3Var.replaceKey : q2Var, (i11 & 4096) != 0 ? n3Var.setInfotainmentKey : m2Var3, (i11 & PKIFailureInfo.certRevoked) != 0 ? n3Var.unknownFields() : kVar2);
    }

    public final n3 a(l1 metadataForKey, okio.k sessionID, m2 addPublicKeyToWhitelist, m2 removePublicKeyFromWhitelist, e2 addPermissionsToPublicKey, e2 removePermissionsFromPublicKey, e2 addKeyToWhitelistAndAddPermissions, e2 updateKeyAndPermissions, e2 addImpermanentKey, e2 addImpermanentKeyAndRemoveExisting, Boolean removeAllImpermanentKeys, q2 replaceKey, m2 setInfotainmentKey, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(sessionID, "sessionID");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new n3(metadataForKey, sessionID, addPublicKeyToWhitelist, removePublicKeyFromWhitelist, addPermissionsToPublicKey, removePermissionsFromPublicKey, addKeyToWhitelistAndAddPermissions, updateKeyAndPermissions, addImpermanentKey, addImpermanentKeyAndRemoveExisting, removeAllImpermanentKeys, replaceKey, setInfotainmentKey, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e2 getAddImpermanentKey() {
        return this.addImpermanentKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e2 getAddImpermanentKeyAndRemoveExisting() {
        return this.addImpermanentKeyAndRemoveExisting;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e2 getAddKeyToWhitelistAndAddPermissions() {
        return this.addKeyToWhitelistAndAddPermissions;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), n3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.metadataForKey, n3Var.metadataForKey) && p013kotlin.jvm.internal.s.f(this.sessionID, n3Var.sessionID) && p013kotlin.jvm.internal.s.f(this.addPublicKeyToWhitelist, n3Var.addPublicKeyToWhitelist) && p013kotlin.jvm.internal.s.f(this.removePublicKeyFromWhitelist, n3Var.removePublicKeyFromWhitelist) && p013kotlin.jvm.internal.s.f(this.addPermissionsToPublicKey, n3Var.addPermissionsToPublicKey) && p013kotlin.jvm.internal.s.f(this.removePermissionsFromPublicKey, n3Var.removePermissionsFromPublicKey) && p013kotlin.jvm.internal.s.f(this.addKeyToWhitelistAndAddPermissions, n3Var.addKeyToWhitelistAndAddPermissions) && p013kotlin.jvm.internal.s.f(this.updateKeyAndPermissions, n3Var.updateKeyAndPermissions) && p013kotlin.jvm.internal.s.f(this.addImpermanentKey, n3Var.addImpermanentKey) && p013kotlin.jvm.internal.s.f(this.addImpermanentKeyAndRemoveExisting, n3Var.addImpermanentKeyAndRemoveExisting) && p013kotlin.jvm.internal.s.f(this.removeAllImpermanentKeys, n3Var.removeAllImpermanentKeys) && p013kotlin.jvm.internal.s.f(this.replaceKey, n3Var.replaceKey) && p013kotlin.jvm.internal.s.f(this.setInfotainmentKey, n3Var.setInfotainmentKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e2 getAddPermissionsToPublicKey() {
        return this.addPermissionsToPublicKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m2 getAddPublicKeyToWhitelist() {
        return this.addPublicKeyToWhitelist;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l1 getMetadataForKey() {
        return this.metadataForKey;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        l1 l1Var = this.metadataForKey;
        int iHashCode2 = (((iHashCode + (l1Var != null ? l1Var.hashCode() : 0)) * 37) + this.sessionID.hashCode()) * 37;
        m2 m2Var = this.addPublicKeyToWhitelist;
        int iHashCode3 = (iHashCode2 + (m2Var != null ? m2Var.hashCode() : 0)) * 37;
        m2 m2Var2 = this.removePublicKeyFromWhitelist;
        int iHashCode4 = (iHashCode3 + (m2Var2 != null ? m2Var2.hashCode() : 0)) * 37;
        e2 e2Var = this.addPermissionsToPublicKey;
        int iHashCode5 = (iHashCode4 + (e2Var != null ? e2Var.hashCode() : 0)) * 37;
        e2 e2Var2 = this.removePermissionsFromPublicKey;
        int iHashCode6 = (iHashCode5 + (e2Var2 != null ? e2Var2.hashCode() : 0)) * 37;
        e2 e2Var3 = this.addKeyToWhitelistAndAddPermissions;
        int iHashCode7 = (iHashCode6 + (e2Var3 != null ? e2Var3.hashCode() : 0)) * 37;
        e2 e2Var4 = this.updateKeyAndPermissions;
        int iHashCode8 = (iHashCode7 + (e2Var4 != null ? e2Var4.hashCode() : 0)) * 37;
        e2 e2Var5 = this.addImpermanentKey;
        int iHashCode9 = (iHashCode8 + (e2Var5 != null ? e2Var5.hashCode() : 0)) * 37;
        e2 e2Var6 = this.addImpermanentKeyAndRemoveExisting;
        int iHashCode10 = (iHashCode9 + (e2Var6 != null ? e2Var6.hashCode() : 0)) * 37;
        Boolean bool = this.removeAllImpermanentKeys;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 37;
        q2 q2Var = this.replaceKey;
        int iHashCode12 = (iHashCode11 + (q2Var != null ? q2Var.hashCode() : 0)) * 37;
        m2 m2Var3 = this.setInfotainmentKey;
        int iHashCode13 = iHashCode12 + (m2Var3 != null ? m2Var3.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getRemoveAllImpermanentKeys() {
        return this.removeAllImpermanentKeys;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e2 getRemovePermissionsFromPublicKey() {
        return this.removePermissionsFromPublicKey;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final m2 getRemovePublicKeyFromWhitelist() {
        return this.removePublicKeyFromWhitelist;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final q2 getReplaceKey() {
        return this.replaceKey;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final okio.k getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final m2 getSetInfotainmentKey() {
        return this.setInfotainmentKey;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m825newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final e2 getUpdateKeyAndPermissions() {
        return this.updateKeyAndPermissions;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        l1 l1Var = this.metadataForKey;
        if (l1Var != null) {
            arrayList.add("metadataForKey=" + l1Var);
        }
        arrayList.add("sessionID=" + this.sessionID);
        m2 m2Var = this.addPublicKeyToWhitelist;
        if (m2Var != null) {
            arrayList.add("addPublicKeyToWhitelist=" + m2Var);
        }
        m2 m2Var2 = this.removePublicKeyFromWhitelist;
        if (m2Var2 != null) {
            arrayList.add("removePublicKeyFromWhitelist=" + m2Var2);
        }
        e2 e2Var = this.addPermissionsToPublicKey;
        if (e2Var != null) {
            arrayList.add("addPermissionsToPublicKey=" + e2Var);
        }
        e2 e2Var2 = this.removePermissionsFromPublicKey;
        if (e2Var2 != null) {
            arrayList.add("removePermissionsFromPublicKey=" + e2Var2);
        }
        e2 e2Var3 = this.addKeyToWhitelistAndAddPermissions;
        if (e2Var3 != null) {
            arrayList.add("addKeyToWhitelistAndAddPermissions=" + e2Var3);
        }
        e2 e2Var4 = this.updateKeyAndPermissions;
        if (e2Var4 != null) {
            arrayList.add("updateKeyAndPermissions=" + e2Var4);
        }
        e2 e2Var5 = this.addImpermanentKey;
        if (e2Var5 != null) {
            arrayList.add("addImpermanentKey=" + e2Var5);
        }
        e2 e2Var6 = this.addImpermanentKeyAndRemoveExisting;
        if (e2Var6 != null) {
            arrayList.add("addImpermanentKeyAndRemoveExisting=" + e2Var6);
        }
        Boolean bool = this.removeAllImpermanentKeys;
        if (bool != null) {
            arrayList.add("removeAllImpermanentKeys=" + bool);
        }
        q2 q2Var = this.replaceKey;
        if (q2Var != null) {
            arrayList.add("replaceKey=" + q2Var);
        }
        m2 m2Var3 = this.setInfotainmentKey;
        if (m2Var3 != null) {
            arrayList.add("setInfotainmentKey=" + m2Var3);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "WhitelistOperation{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ n3(l1 l1Var, okio.k kVar, m2 m2Var, m2 m2Var2, e2 e2Var, e2 e2Var2, e2 e2Var3, e2 e2Var4, e2 e2Var5, e2 e2Var6, Boolean bool, q2 q2Var, m2 m2Var3, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l1Var, (i11 & 2) != 0 ? okio.k.f97943e : kVar, (i11 & 4) != 0 ? null : m2Var, (i11 & 8) != 0 ? null : m2Var2, (i11 & 16) != 0 ? null : e2Var, (i11 & 32) != 0 ? null : e2Var2, (i11 & 64) != 0 ? null : e2Var3, (i11 & 128) != 0 ? null : e2Var4, (i11 & 256) != 0 ? null : e2Var5, (i11 & 512) != 0 ? null : e2Var6, (i11 & 1024) != 0 ? null : bool, (i11 & 2048) != 0 ? null : q2Var, (i11 & 4096) == 0 ? m2Var3 : null, (i11 & PKIFailureInfo.certRevoked) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m825newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(l1 l1Var, okio.k sessionID, m2 m2Var, m2 m2Var2, e2 e2Var, e2 e2Var2, e2 e2Var3, e2 e2Var4, e2 e2Var5, e2 e2Var6, Boolean bool, q2 q2Var, m2 m2Var3, okio.k unknownFields) {
        super(f118852o, unknownFields);
        p013kotlin.jvm.internal.s.k(sessionID, "sessionID");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.metadataForKey = l1Var;
        this.sessionID = sessionID;
        this.addPublicKeyToWhitelist = m2Var;
        this.removePublicKeyFromWhitelist = m2Var2;
        this.addPermissionsToPublicKey = e2Var;
        this.removePermissionsFromPublicKey = e2Var2;
        this.addKeyToWhitelistAndAddPermissions = e2Var3;
        this.updateKeyAndPermissions = e2Var4;
        this.addImpermanentKey = e2Var5;
        this.addImpermanentKeyAndRemoveExisting = e2Var6;
        this.removeAllImpermanentKeys = bool;
        this.replaceKey = q2Var;
        this.setInfotainmentKey = m2Var3;
        if (x20.d.e(m2Var, m2Var2, e2Var, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6, bool, q2Var, m2Var3) > 1) {
            throw new IllegalArgumentException("At most one of addPublicKeyToWhitelist, removePublicKeyFromWhitelist, addPermissionsToPublicKey, removePermissionsFromPublicKey, addKeyToWhitelistAndAddPermissions, updateKeyAndPermissions, addImpermanentKey, addImpermanentKeyAndRemoveExisting, removeAllImpermanentKeys, replaceKey, setInfotainmentKey may be non-null");
        }
    }
}
