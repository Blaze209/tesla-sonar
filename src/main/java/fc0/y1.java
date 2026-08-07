package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b$\u0010/¨\u00060"}, d2 = {"Lfc0/y1;", "Lcom/squareup/wire/f;", "", "", "name", "model", "Lokio/k;", "public_key", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_seen", "Llc0/a;", "role", "Lvc0/h1;", "form_factor", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/k;Lj$/time/Instant;Llc0/a;Lvc0/h1;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;Lokio/k;Lj$/time/Instant;Llc0/a;Lvc0/h1;Lokio/k;)Lfc0/y1;", "Ljava/lang/String;", "getName", "b", "e", "c", "Lokio/k;", "f", "()Lokio/k;", DateTokenConverter.CONVERTER_KEY, "Lj$/time/Instant;", "()Lj$/time/Instant;", "Llc0/a;", "g", "()Llc0/a;", "Lvc0/h1;", "()Lvc0/h1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<y1> f65616h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(y1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "publicKey", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final okio.k public_key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastSeen", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final Instant last_seen;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final lc0.a role;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyFormFactor#ADAPTER", jsonName = "formFactor", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final vc0.h1 form_factor;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/y1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/y1;", "value", "", "c", "(Lfc0/y1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/y1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/y1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/y1;)Lfc0/y1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<y1> {
        a(com.squareup.wire.b bVar, co0.d<y1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.KeyInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            lc0.a aVar = lc0.a.ROLE_NONE;
            vc0.h1 h1Var = vc0.h1.KEY_FORM_FACTOR_UNKNOWN;
            long jD = reader.d();
            String strDecode = "";
            Instant instantDecode = null;
            vc0.h1 h1VarDecode = h1Var;
            String strDecode2 = strDecode;
            lc0.a aVarDecode = aVar;
            while (true) {
                okio.k kVar = kVarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new y1(strDecode2, strDecode, kVar, instantDecode, aVarDecode, h1VarDecode, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            break;
                        case 4:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 5:
                            try {
                                aVarDecode = lc0.a.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 6:
                            try {
                                h1VarDecode = vc0.h1.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            }
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
                kVarDecode = ProtoAdapter.BYTES.decode(reader);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, y1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getModel(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getModel());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getPublic_key(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getPublic_key());
            }
            if (value.getLast_seen() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getLast_seen());
            }
            if (value.getRole() != lc0.a.ROLE_NONE) {
                lc0.a.ADAPTER.encodeWithTag(writer, 5, value.getRole());
            }
            if (value.getForm_factor() != vc0.h1.KEY_FORM_FACTOR_UNKNOWN) {
                vc0.h1.ADAPTER.encodeWithTag(writer, 6, value.getForm_factor());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(y1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getModel(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getModel());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getPublic_key(), okio.k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getPublic_key());
            }
            if (value.getLast_seen() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getLast_seen());
            }
            if (value.getRole() != lc0.a.ROLE_NONE) {
                iD += lc0.a.ADAPTER.encodedSizeWithTag(5, value.getRole());
            }
            return value.getForm_factor() != vc0.h1.KEY_FORM_FACTOR_UNKNOWN ? iD + vc0.h1.ADAPTER.encodedSizeWithTag(6, value.getForm_factor()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public y1 redact(y1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant last_seen = value.getLast_seen();
            return y1.b(value, null, null, null, last_seen != null ? ProtoAdapter.INSTANT.redact(last_seen) : null, null, null, okio.k.f97943e, 55, null);
        }
    }

    public y1() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ y1 b(y1 y1Var, String str, String str2, okio.k kVar, Instant instant, lc0.a aVar, vc0.h1 h1Var, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = y1Var.name;
        }
        if ((i11 & 2) != 0) {
            str2 = y1Var.model;
        }
        if ((i11 & 4) != 0) {
            kVar = y1Var.public_key;
        }
        if ((i11 & 8) != 0) {
            instant = y1Var.last_seen;
        }
        if ((i11 & 16) != 0) {
            aVar = y1Var.role;
        }
        if ((i11 & 32) != 0) {
            h1Var = y1Var.form_factor;
        }
        if ((i11 & 64) != 0) {
            kVar2 = y1Var.unknownFields();
        }
        vc0.h1 h1Var2 = h1Var;
        okio.k kVar3 = kVar2;
        lc0.a aVar2 = aVar;
        okio.k kVar4 = kVar;
        return y1Var.a(str, str2, kVar4, instant, aVar2, h1Var2, kVar3);
    }

    public final y1 a(String name, String model, okio.k public_key, Instant last_seen, lc0.a role, vc0.h1 form_factor, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(model, "model");
        p013kotlin.jvm.internal.s.k(public_key, "public_key");
        p013kotlin.jvm.internal.s.k(role, "role");
        p013kotlin.jvm.internal.s.k(form_factor, "form_factor");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new y1(name, model, public_key, last_seen, role, form_factor, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final vc0.h1 getForm_factor() {
        return this.form_factor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getLast_seen() {
        return this.last_seen;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), y1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.name, y1Var.name) && p013kotlin.jvm.internal.s.f(this.model, y1Var.model) && p013kotlin.jvm.internal.s.f(this.public_key, y1Var.public_key) && p013kotlin.jvm.internal.s.f(this.last_seen, y1Var.last_seen) && this.role == y1Var.role && this.form_factor == y1Var.form_factor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final okio.k getPublic_key() {
        return this.public_key;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final lc0.a getRole() {
        return this.role;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.model.hashCode()) * 37) + this.public_key.hashCode()) * 37;
        Instant instant = this.last_seen;
        int iHashCode2 = ((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.role.hashCode()) * 37) + this.form_factor.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m373newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + x20.d.i(this.name));
        arrayList.add("model=" + x20.d.i(this.model));
        arrayList.add("public_key=" + this.public_key);
        Instant instant = this.last_seen;
        if (instant != null) {
            arrayList.add("last_seen=" + instant);
        }
        arrayList.add("role=" + this.role);
        arrayList.add("form_factor=" + this.form_factor);
        return p013kotlin.collections.v.y0(arrayList, ", ", "KeyInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ y1(String str, String str2, okio.k kVar, Instant instant, lc0.a aVar, vc0.h1 h1Var, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? okio.k.f97943e : kVar, (i11 & 8) != 0 ? null : instant, (i11 & 16) != 0 ? lc0.a.ROLE_NONE : aVar, (i11 & 32) != 0 ? vc0.h1.KEY_FORM_FACTOR_UNKNOWN : h1Var, (i11 & 64) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m373newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(String name, String model, okio.k public_key, Instant instant, lc0.a role, vc0.h1 form_factor, okio.k unknownFields) {
        super(f65616h, unknownFields);
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(model, "model");
        p013kotlin.jvm.internal.s.k(public_key, "public_key");
        p013kotlin.jvm.internal.s.k(role, "role");
        p013kotlin.jvm.internal.s.k(form_factor, "form_factor");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.name = name;
        this.model = model;
        this.public_key = public_key;
        this.last_seen = instant;
        this.role = role;
        this.form_factor = form_factor;
    }
}
