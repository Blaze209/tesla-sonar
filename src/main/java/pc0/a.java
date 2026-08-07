package pc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import jn0.e;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lpc0/a;", "Lcom/squareup/wire/f;", "", "Luc0/b;", "vault_info", "", "pin", "Lokio/k;", "pubkey", "unknownFields", "<init>", "(Luc0/b;Ljava/lang/String;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Luc0/b;Ljava/lang/String;Lokio/k;Lokio/k;)Lpc0/a;", "Luc0/b;", "e", "()Luc0/b;", "b", "Ljava/lang/String;", "c", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<a> f102100e = new C2162a(b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.info.VaultInfo#ADAPTER", jsonName = "vaultInfo", label = q.a.OMIT_IDENTITY, tag = 1)
    private final uc0.b vault_info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 4)
    private final String pin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 5)
    private final k pubkey;

    /* JADX INFO: renamed from: pc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"pc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Lpc0/a;", "value", "", "c", "(Lpc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lpc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lpc0/a;", DateTokenConverter.CONVERTER_KEY, "(Lpc0/a;)Lpc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2162a extends ProtoAdapter<a> {
        C2162a(b bVar, d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.OptIn", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            uc0.b bVarDecode = null;
            String strDecode = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(bVarDecode, strDecode, kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    bVarDecode = uc0.b.f116100f.decode(reader);
                } else if (iG == 4) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getVault_info() != null) {
                uc0.b.f116100f.encodeWithTag(writer, 1, value.getVault_info());
            }
            if (!s.f(value.getPin(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getPin());
            }
            if (!s.f(value.getPubkey(), k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getPubkey());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getVault_info() != null) {
                iD += uc0.b.f116100f.encodedSizeWithTag(1, value.getVault_info());
            }
            if (!s.f(value.getPin(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPin());
            }
            return !s.f(value.getPubkey(), k.f97943e) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getPubkey()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            uc0.b vault_info = value.getVault_info();
            return a.b(value, vault_info != null ? uc0.b.f116100f.redact(vault_info) : null, null, null, k.f97943e, 6, null);
        }
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ a b(a aVar, uc0.b bVar, String str, k kVar, k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = aVar.vault_info;
        }
        if ((i11 & 2) != 0) {
            str = aVar.pin;
        }
        if ((i11 & 4) != 0) {
            kVar = aVar.pubkey;
        }
        if ((i11 & 8) != 0) {
            kVar2 = aVar.unknownFields();
        }
        return aVar.a(bVar, str, kVar, kVar2);
    }

    public final a a(uc0.b vault_info, String pin, k pubkey, k unknownFields) {
        s.k(pin, "pin");
        s.k(pubkey, "pubkey");
        s.k(unknownFields, "unknownFields");
        return new a(vault_info, pin, pubkey, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getPubkey() {
        return this.pubkey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final uc0.b getVault_info() {
        return this.vault_info;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && s.f(this.vault_info, aVar.vault_info) && s.f(this.pin, aVar.pin) && s.f(this.pubkey, aVar.pubkey);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        uc0.b bVar = this.vault_info;
        int iHashCode2 = ((((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.pin.hashCode()) * 37) + this.pubkey.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m751newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        uc0.b bVar = this.vault_info;
        if (bVar != null) {
            arrayList.add("vault_info=" + bVar);
        }
        arrayList.add("pin=" + x20.d.i(this.pin));
        arrayList.add("pubkey=" + this.pubkey);
        return v.y0(arrayList, ", ", "OptIn{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(uc0.b bVar, String str, k kVar, k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? k.f97943e : kVar, (i11 & 8) != 0 ? k.f97943e : kVar2);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m751newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uc0.b bVar, String pin, k pubkey, k unknownFields) {
        super(f102100e, unknownFields);
        s.k(pin, "pin");
        s.k(pubkey, "pubkey");
        s.k(unknownFields, "unknownFields");
        this.vault_info = bVar;
        this.pin = pin;
        this.pubkey = pubkey;
    }
}
