package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import ec0.h0;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B}\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0083\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b3\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%¨\u00064"}, d2 = {"Lic0/l;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "lock", "unlock", "remoteStart", "Lic0/a;", "addKey", "Lic0/m;", "remoteServiceAccessRequest", "Lic0/n;", "serviceDiagnosticRequest", "getReaderKey", "unlockAndRemoteStart", "forceOpenGlovebox", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lic0/a;Lic0/m;Lic0/n;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lic0/a;Lic0/m;Lic0/n;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lic0/l;", "Lec0/h0;", "e", "()Lec0/h0;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "g", DateTokenConverter.CONVERTER_KEY, "Lic0/a;", "()Lic0/a;", "Lic0/m;", "f", "()Lic0/m;", "Lic0/n;", "h", "()Lic0/n;", "j", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends com.squareup.wire.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProtoAdapter<l> f77543k = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(l.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 lock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 unlock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 remoteStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.AddKeyPayload#ADAPTER", tag = 4)
    private final ic0.a addKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.RemoteServiceAccessRequestPayload#ADAPTER", tag = 5)
    private final m remoteServiceAccessRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.ServiceDiagnosticRequestPayload#ADAPTER", tag = 6)
    private final n serviceDiagnosticRequest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
    private final h0 getReaderKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
    private final h0 unlockAndRemoteStart;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
    private final h0 forceOpenGlovebox;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/l$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/l;", "value", "", "c", "(Lic0/l;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/l;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/l;", DateTokenConverter.CONVERTER_KEY, "(Lic0/l;)Lic0/l;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<l> {
        a(com.squareup.wire.b bVar, co0.d<l> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProxyCommandAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            h0 h0VarDecode3 = null;
            ic0.a aVarDecode = null;
            m mVarDecode = null;
            n nVarDecode = null;
            h0 h0VarDecode4 = null;
            h0 h0VarDecode5 = null;
            h0 h0VarDecode6 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new l(h0VarDecode, h0VarDecode2, h0VarDecode3, aVarDecode, mVarDecode, nVarDecode, h0VarDecode4, h0VarDecode5, h0VarDecode6, reader.e(jD));
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
                        aVarDecode = ic0.a.f77456e.decode(reader);
                        break;
                    case 5:
                        mVarDecode = m.f77554c.decode(reader);
                        break;
                    case 6:
                        nVarDecode = n.f77557c.decode(reader);
                        break;
                    case 7:
                        h0VarDecode4 = h0.f62622b.decode(reader);
                        break;
                    case 8:
                        h0VarDecode5 = h0.f62622b.decode(reader);
                        break;
                    case 9:
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
        public void encode(com.squareup.wire.l writer, l value) {
            s.k(writer, "writer");
            s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getLock());
            protoAdapter.encodeWithTag(writer, 2, value.getUnlock());
            protoAdapter.encodeWithTag(writer, 3, value.getRemoteStart());
            ic0.a.f77456e.encodeWithTag(writer, 4, value.getAddKey());
            m.f77554c.encodeWithTag(writer, 5, value.getRemoteServiceAccessRequest());
            n.f77557c.encodeWithTag(writer, 6, value.getServiceDiagnosticRequest());
            protoAdapter.encodeWithTag(writer, 7, value.getGetReaderKey());
            protoAdapter.encodeWithTag(writer, 8, value.getUnlockAndRemoteStart());
            protoAdapter.encodeWithTag(writer, 9, value.getForceOpenGlovebox());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(l value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getLock()) + protoAdapter.encodedSizeWithTag(2, value.getUnlock()) + protoAdapter.encodedSizeWithTag(3, value.getRemoteStart()) + ic0.a.f77456e.encodedSizeWithTag(4, value.getAddKey()) + m.f77554c.encodedSizeWithTag(5, value.getRemoteServiceAccessRequest()) + n.f77557c.encodedSizeWithTag(6, value.getServiceDiagnosticRequest()) + protoAdapter.encodedSizeWithTag(7, value.getGetReaderKey()) + protoAdapter.encodedSizeWithTag(8, value.getUnlockAndRemoteStart()) + protoAdapter.encodedSizeWithTag(9, value.getForceOpenGlovebox());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l redact(l value) {
            s.k(value, "value");
            h0 lock = value.getLock();
            h0 h0VarRedact = lock != null ? h0.f62622b.redact(lock) : null;
            h0 unlock = value.getUnlock();
            h0 h0VarRedact2 = unlock != null ? h0.f62622b.redact(unlock) : null;
            h0 remoteStart = value.getRemoteStart();
            h0 h0VarRedact3 = remoteStart != null ? h0.f62622b.redact(remoteStart) : null;
            ic0.a addKey = value.getAddKey();
            ic0.a aVarRedact = addKey != null ? ic0.a.f77456e.redact(addKey) : null;
            m remoteServiceAccessRequest = value.getRemoteServiceAccessRequest();
            m mVarRedact = remoteServiceAccessRequest != null ? m.f77554c.redact(remoteServiceAccessRequest) : null;
            n serviceDiagnosticRequest = value.getServiceDiagnosticRequest();
            n nVarRedact = serviceDiagnosticRequest != null ? n.f77557c.redact(serviceDiagnosticRequest) : null;
            h0 getReaderKey = value.getGetReaderKey();
            h0 h0VarRedact4 = getReaderKey != null ? h0.f62622b.redact(getReaderKey) : null;
            h0 unlockAndRemoteStart = value.getUnlockAndRemoteStart();
            h0 h0VarRedact5 = unlockAndRemoteStart != null ? h0.f62622b.redact(unlockAndRemoteStart) : null;
            h0 forceOpenGlovebox = value.getForceOpenGlovebox();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, aVarRedact, mVarRedact, nVarRedact, h0VarRedact4, h0VarRedact5, forceOpenGlovebox != null ? h0.f62622b.redact(forceOpenGlovebox) : null, okio.k.f97943e);
        }
    }

    public l() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final l a(h0 lock, h0 unlock, h0 remoteStart, ic0.a addKey, m remoteServiceAccessRequest, n serviceDiagnosticRequest, h0 getReaderKey, h0 unlockAndRemoteStart, h0 forceOpenGlovebox, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new l(lock, unlock, remoteStart, addKey, remoteServiceAccessRequest, serviceDiagnosticRequest, getReaderKey, unlockAndRemoteStart, forceOpenGlovebox, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ic0.a getAddKey() {
        return this.addKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getForceOpenGlovebox() {
        return this.forceOpenGlovebox;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getGetReaderKey() {
        return this.getReaderKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getLock() {
        return this.lock;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return s.f(unknownFields(), lVar.unknownFields()) && s.f(this.lock, lVar.lock) && s.f(this.unlock, lVar.unlock) && s.f(this.remoteStart, lVar.remoteStart) && s.f(this.addKey, lVar.addKey) && s.f(this.remoteServiceAccessRequest, lVar.remoteServiceAccessRequest) && s.f(this.serviceDiagnosticRequest, lVar.serviceDiagnosticRequest) && s.f(this.getReaderKey, lVar.getReaderKey) && s.f(this.unlockAndRemoteStart, lVar.unlockAndRemoteStart) && s.f(this.forceOpenGlovebox, lVar.forceOpenGlovebox);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m getRemoteServiceAccessRequest() {
        return this.remoteServiceAccessRequest;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getRemoteStart() {
        return this.remoteStart;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final n getServiceDiagnosticRequest() {
        return this.serviceDiagnosticRequest;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.lock;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.unlock;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.remoteStart;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        ic0.a aVar = this.addKey;
        int iHashCode5 = (iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 37;
        m mVar = this.remoteServiceAccessRequest;
        int iHashCode6 = (iHashCode5 + (mVar != null ? mVar.hashCode() : 0)) * 37;
        n nVar = this.serviceDiagnosticRequest;
        int iHashCode7 = (iHashCode6 + (nVar != null ? nVar.hashCode() : 0)) * 37;
        h0 h0Var4 = this.getReaderKey;
        int iHashCode8 = (iHashCode7 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.unlockAndRemoteStart;
        int iHashCode9 = (iHashCode8 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        h0 h0Var6 = this.forceOpenGlovebox;
        int iHashCode10 = iHashCode9 + (h0Var6 != null ? h0Var6.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h0 getUnlock() {
        return this.unlock;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h0 getUnlockAndRemoteStart() {
        return this.unlockAndRemoteStart;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m470newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.lock;
        if (h0Var != null) {
            arrayList.add("lock=" + h0Var);
        }
        h0 h0Var2 = this.unlock;
        if (h0Var2 != null) {
            arrayList.add("unlock=" + h0Var2);
        }
        h0 h0Var3 = this.remoteStart;
        if (h0Var3 != null) {
            arrayList.add("remoteStart=" + h0Var3);
        }
        ic0.a aVar = this.addKey;
        if (aVar != null) {
            arrayList.add("addKey=" + aVar);
        }
        m mVar = this.remoteServiceAccessRequest;
        if (mVar != null) {
            arrayList.add("remoteServiceAccessRequest=" + mVar);
        }
        n nVar = this.serviceDiagnosticRequest;
        if (nVar != null) {
            arrayList.add("serviceDiagnosticRequest=" + nVar);
        }
        h0 h0Var4 = this.getReaderKey;
        if (h0Var4 != null) {
            arrayList.add("getReaderKey=" + h0Var4);
        }
        h0 h0Var5 = this.unlockAndRemoteStart;
        if (h0Var5 != null) {
            arrayList.add("unlockAndRemoteStart=" + h0Var5);
        }
        h0 h0Var6 = this.forceOpenGlovebox;
        if (h0Var6 != null) {
            arrayList.add("forceOpenGlovebox=" + h0Var6);
        }
        return v.y0(arrayList, ", ", "ProxyCommandAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ l(h0 h0Var, h0 h0Var2, h0 h0Var3, ic0.a aVar, m mVar, n nVar, h0 h0Var4, h0 h0Var5, h0 h0Var6, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : aVar, (i11 & 16) != 0 ? null : mVar, (i11 & 32) != 0 ? null : nVar, (i11 & 64) != 0 ? null : h0Var4, (i11 & 128) != 0 ? null : h0Var5, (i11 & 256) != 0 ? null : h0Var6, (i11 & 512) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m470newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h0 h0Var, h0 h0Var2, h0 h0Var3, ic0.a aVar, m mVar, n nVar, h0 h0Var4, h0 h0Var5, h0 h0Var6, okio.k unknownFields) {
        super(f77543k, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.lock = h0Var;
        this.unlock = h0Var2;
        this.remoteStart = h0Var3;
        this.addKey = aVar;
        this.remoteServiceAccessRequest = mVar;
        this.serviceDiagnosticRequest = nVar;
        this.getReaderKey = h0Var4;
        this.unlockAndRemoteStart = h0Var5;
        this.forceOpenGlovebox = h0Var6;
        if (x20.d.e(h0Var, h0Var2, h0Var3, aVar, mVar, nVar, h0Var4, h0Var5, h0Var6) > 1) {
            throw new IllegalArgumentException("At most one of lock, unlock, remoteStart, addKey, remoteServiceAccessRequest, serviceDiagnosticRequest, getReaderKey, unlockAndRemoteStart, forceOpenGlovebox may be non-null");
        }
    }
}
