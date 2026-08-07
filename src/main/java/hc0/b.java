package hc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lhc0/b;", "Lcom/squareup/wire/f;", "", "Lhc0/a;", "remote_service_access_command", "Lhc0/d;", "privacy_lock_command", "Lokio/k;", "unknownFields", "<init>", "(Lhc0/a;Lhc0/d;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lhc0/a;Lhc0/d;Lokio/k;)Lhc0/b;", "Lhc0/a;", "c", "()Lhc0/a;", "b", "Lhc0/d;", "()Lhc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<b> f72537d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.centerdisplay.server.RemoteServiceAccessCommand#ADAPTER", jsonName = "remoteServiceAccessCommand", tag = 1)
    private final hc0.a remote_service_access_command;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.centerdisplay.server.SetPrivacyLock#ADAPTER", jsonName = "privacyLockCommand", tag = 2)
    private final d privacy_lock_command;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"hc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lhc0/b;", "value", "", "c", "(Lhc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lhc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lhc0/b;", DateTokenConverter.CONVERTER_KEY, "(Lhc0/b;)Lhc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/center_display.Request", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            hc0.a aVarDecode = null;
            d dVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(aVarDecode, dVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    aVarDecode = hc0.a.f72534c.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    dVarDecode = d.f72544c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            hc0.a.f72534c.encodeWithTag(writer, 1, value.getRemote_service_access_command());
            d.f72544c.encodeWithTag(writer, 2, value.getPrivacy_lock_command());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            return value.unknownFields().D() + hc0.a.f72534c.encodedSizeWithTag(1, value.getRemote_service_access_command()) + d.f72544c.encodedSizeWithTag(2, value.getPrivacy_lock_command());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            hc0.a remote_service_access_command = value.getRemote_service_access_command();
            hc0.a aVarRedact = remote_service_access_command != null ? hc0.a.f72534c.redact(remote_service_access_command) : null;
            d privacy_lock_command = value.getPrivacy_lock_command();
            return value.a(aVarRedact, privacy_lock_command != null ? d.f72544c.redact(privacy_lock_command) : null, okio.k.f97943e);
        }
    }

    public b() {
        this(null, null, null, 7, null);
    }

    public final b a(hc0.a remote_service_access_command, d privacy_lock_command, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new b(remote_service_access_command, privacy_lock_command, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getPrivacy_lock_command() {
        return this.privacy_lock_command;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hc0.a getRemote_service_access_command() {
        return this.remote_service_access_command;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && s.f(this.remote_service_access_command, bVar.remote_service_access_command) && s.f(this.privacy_lock_command, bVar.privacy_lock_command);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        hc0.a aVar = this.remote_service_access_command;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
        d dVar = this.privacy_lock_command;
        int iHashCode3 = iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m461newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        hc0.a aVar = this.remote_service_access_command;
        if (aVar != null) {
            arrayList.add("remote_service_access_command=" + aVar);
        }
        d dVar = this.privacy_lock_command;
        if (dVar != null) {
            arrayList.add("privacy_lock_command=" + dVar);
        }
        return v.y0(arrayList, ", ", "Request{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(hc0.a aVar, d dVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : dVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m461newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hc0.a aVar, d dVar, okio.k unknownFields) {
        super(f72537d, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.remote_service_access_command = aVar;
        this.privacy_lock_command = dVar;
        if (x20.d.c(aVar, dVar) > 1) {
            throw new IllegalArgumentException("At most one of remote_service_access_command, privacy_lock_command may be non-null");
        }
    }
}
