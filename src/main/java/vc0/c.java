package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lvc0/c;", "Lcom/squareup/wire/f;", "", "Lvc0/e;", "alertHandlePulledWithoutAuth", "Lvc0/d;", "alertConfirmation", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/e;Lvc0/d;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/e;Lvc0/d;Lokio/k;)Lvc0/c;", "Lvc0/e;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/e;", "b", "Lvc0/d;", "c", "()Lvc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<c> f118583d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AlertHandlePulledWithoutAuth#ADAPTER", tag = 1)
    private final e alertHandlePulledWithoutAuth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AlertConfirmation#ADAPTER", tag = 2)
    private final d alertConfirmation;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/c;", "value", "", "c", "(Lvc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/c;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/c;)Lvc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.Alert", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            e eVarDecode = null;
            d dVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(eVarDecode, dVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    eVarDecode = e.f118629h.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    try {
                        dVarDecode = d.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            e.f118629h.encodeWithTag(writer, 1, value.getAlertHandlePulledWithoutAuth());
            d.ADAPTER.encodeWithTag(writer, 2, value.getAlertConfirmation());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + e.f118629h.encodedSizeWithTag(1, value.getAlertHandlePulledWithoutAuth()) + d.ADAPTER.encodedSizeWithTag(2, value.getAlertConfirmation());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            e alertHandlePulledWithoutAuth = value.getAlertHandlePulledWithoutAuth();
            return c.b(value, alertHandlePulledWithoutAuth != null ? e.f118629h.redact(alertHandlePulledWithoutAuth) : null, null, okio.k.f97943e, 2, null);
        }
    }

    public c() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ c b(c cVar, e eVar, d dVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = cVar.alertHandlePulledWithoutAuth;
        }
        if ((i11 & 2) != 0) {
            dVar = cVar.alertConfirmation;
        }
        if ((i11 & 4) != 0) {
            kVar = cVar.unknownFields();
        }
        return cVar.a(eVar, dVar, kVar);
    }

    public final c a(e alertHandlePulledWithoutAuth, d alertConfirmation, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new c(alertHandlePulledWithoutAuth, alertConfirmation, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getAlertConfirmation() {
        return this.alertConfirmation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getAlertHandlePulledWithoutAuth() {
        return this.alertHandlePulledWithoutAuth;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.alertHandlePulledWithoutAuth, cVar.alertHandlePulledWithoutAuth) && this.alertConfirmation == cVar.alertConfirmation;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        e eVar = this.alertHandlePulledWithoutAuth;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 37;
        d dVar = this.alertConfirmation;
        int iHashCode3 = iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m788newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        e eVar = this.alertHandlePulledWithoutAuth;
        if (eVar != null) {
            arrayList.add("alertHandlePulledWithoutAuth=" + eVar);
        }
        d dVar = this.alertConfirmation;
        if (dVar != null) {
            arrayList.add("alertConfirmation=" + dVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "Alert{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(e eVar, d dVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : eVar, (i11 & 2) != 0 ? null : dVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m788newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, d dVar, okio.k unknownFields) {
        super(f118583d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.alertHandlePulledWithoutAuth = eVar;
        this.alertConfirmation = dVar;
        if (x20.d.c(eVar, dVar) > 1) {
            throw new IllegalArgumentException("At most one of alertHandlePulledWithoutAuth, alertConfirmation may be non-null");
        }
    }
}
