package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u0019B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lfc0/c4;", "Lcom/squareup/wire/f;", "", "Lfc0/c4$c;", "outlet_request", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/c4$c;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/c4$c;Lokio/k;)Lfc0/c4;", "Lfc0/c4$c;", "c", "()Lfc0/c4$c;", "b", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c4 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoAdapter<c4> f64926c = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c4.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.SetOutletsOnOffAction$OutletRequest#ADAPTER", jsonName = "outletRequest", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final c outlet_request;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/c4$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/c4;", "value", "", "c", "(Lfc0/c4;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/c4;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/c4;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/c4;)Lfc0/c4;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c4> {
        a(com.squareup.wire.b bVar, co0.d<c4> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SetOutletsOnOffAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            c cVarDecode = c.OFF;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c4(cVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        cVarDecode = c.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else {
                    reader.m(iG);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c4 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getOutlet_request() != c.OFF) {
                c.ADAPTER.encodeWithTag(writer, 1, value.getOutlet_request());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            return value.getOutlet_request() != c.OFF ? iD + c.ADAPTER.encodedSizeWithTag(1, value.getOutlet_request()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c4 redact(c4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return c4.b(value, null, okio.k.f97943e, 1, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.c4$c, still in use, count: 1, list:
      (r0v0 fc0.c4$c) from 0x003c: CONSTRUCTOR 
      (wrap co0.d:0x0034: INVOKE (wrap java.lang.Class:0x0032: CONST_CLASS  A[WRAPPED] (LINE:51) fc0.c4$c.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:53))
      (wrap com.squareup.wire.o:0x0038: SGET  A[WRAPPED] (LINE:57) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.c4$c)
     A[MD:(co0.d<fc0.c4$c>, com.squareup.wire.o, fc0.c4$c):void (m), WRAPPED] (LINE:61) call: fc0.c4.c.a.<init>(co0.d, com.squareup.wire.o, fc0.c4$c):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lfc0/c4$c;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "OFF", "CABIN_AND_BED", "CABIN", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements com.squareup.wire.p {
        OFF(0),
        CABIN_AND_BED(1),
        CABIN(2);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<c> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3, new c(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/c4$c$a", "Lcom/squareup/wire/a;", "Lfc0/c4$c;", "", "value", "f", "(I)Lfc0/c4$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<c> {
            a(co0.d<c> dVar, com.squareup.wire.o oVar, c cVar) {
                super(dVar, oVar, cVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public c d(int value) {
                return c.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: fc0.c4$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/c4$c$b;", "", "<init>", "()V", "", "value", "Lfc0/c4$c;", "a", "(I)Lfc0/c4$c;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int value) {
                if (value == 0) {
                    return c.OFF;
                }
                if (value == 1) {
                    return c.CABIN_AND_BED;
                }
                if (value != 2) {
                    return null;
                }
                return c.CABIN;
            }

            private Companion() {
            }
        }

        static {
        }

        private c(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final c fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c4() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ c4 b(c4 c4Var, c cVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = c4Var.outlet_request;
        }
        if ((i11 & 2) != 0) {
            kVar = c4Var.unknownFields();
        }
        return c4Var.a(cVar, kVar);
    }

    public final c4 a(c outlet_request, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(outlet_request, "outlet_request");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new c4(outlet_request, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getOutlet_request() {
        return this.outlet_request;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), c4Var.unknownFields()) && this.outlet_request == c4Var.outlet_request;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.outlet_request.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m215newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("outlet_request=" + this.outlet_request);
        return p013kotlin.collections.v.y0(arrayList, ", ", "SetOutletsOnOffAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c4(c cVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c.OFF : cVar, (i11 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m215newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(c outlet_request, okio.k unknownFields) {
        super(f64926c, unknownFields);
        p013kotlin.jvm.internal.s.k(outlet_request, "outlet_request");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.outlet_request = outlet_request;
    }
}
