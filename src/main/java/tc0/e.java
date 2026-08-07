package tc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Ltc0/e;", "Lcom/squareup/wire/f;", "", "Lpc0/a;", "opt_in", "Ltc0/c;", "open_vault", "Lokio/k;", "unknownFields", "<init>", "(Lpc0/a;Ltc0/c;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lpc0/a;Ltc0/c;Lokio/k;)Ltc0/e;", "Lpc0/a;", "c", "()Lpc0/a;", "b", "Ltc0/c;", "()Ltc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<e> f113151d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(e.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.optin.OptIn#ADAPTER", jsonName = "optIn", tag = 1)
    private final pc0.a opt_in;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.OpenVault#ADAPTER", jsonName = "openVault", tag = 2)
    private final c open_vault;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"tc0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Ltc0/e;", "value", "", "c", "(Ltc0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ltc0/e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ltc0/e;", DateTokenConverter.CONVERTER_KEY, "(Ltc0/e;)Ltc0/e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, co0.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.RemoteCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            pc0.a aVarDecode = null;
            c cVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e(aVarDecode, cVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    aVarDecode = pc0.a.f102100e.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    cVarDecode = c.f113145c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, e value) {
            s.k(writer, "writer");
            s.k(value, "value");
            pc0.a.f102100e.encodeWithTag(writer, 1, value.getOpt_in());
            c.f113145c.encodeWithTag(writer, 2, value.getOpen_vault());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            s.k(value, "value");
            return value.unknownFields().D() + pc0.a.f102100e.encodedSizeWithTag(1, value.getOpt_in()) + c.f113145c.encodedSizeWithTag(2, value.getOpen_vault());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            s.k(value, "value");
            pc0.a opt_in = value.getOpt_in();
            pc0.a aVarRedact = opt_in != null ? pc0.a.f102100e.redact(opt_in) : null;
            c open_vault = value.getOpen_vault();
            return value.a(aVarRedact, open_vault != null ? c.f113145c.redact(open_vault) : null, okio.k.f97943e);
        }
    }

    public e() {
        this(null, null, null, 7, null);
    }

    public final e a(pc0.a opt_in, c open_vault, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new e(opt_in, open_vault, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getOpen_vault() {
        return this.open_vault;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final pc0.a getOpt_in() {
        return this.opt_in;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return s.f(unknownFields(), eVar.unknownFields()) && s.f(this.opt_in, eVar.opt_in) && s.f(this.open_vault, eVar.open_vault);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        pc0.a aVar = this.opt_in;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
        c cVar = this.open_vault;
        int iHashCode3 = iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m776newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        pc0.a aVar = this.opt_in;
        if (aVar != null) {
            arrayList.add("opt_in=" + aVar);
        }
        c cVar = this.open_vault;
        if (cVar != null) {
            arrayList.add("open_vault=" + cVar);
        }
        return v.y0(arrayList, ", ", "RemoteCommand{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e(pc0.a aVar, c cVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : cVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m776newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pc0.a aVar, c cVar, okio.k unknownFields) {
        super(f113151d, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.opt_in = aVar;
        this.open_vault = cVar;
        if (x20.d.c(aVar, cVar) > 1) {
            throw new IllegalArgumentException("At most one of opt_in, open_vault may be non-null");
        }
    }
}
