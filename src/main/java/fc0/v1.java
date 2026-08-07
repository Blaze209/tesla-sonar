package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lfc0/v1;", "Lcom/squareup/wire/f;", "", "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "manual_override", "", "Lfc0/v1$c;", "manual_override_mode", "Lokio/k;", "unknownFields", "<init>", "(ZZLjava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZZLjava/util/List;Lokio/k;)Lfc0/v1;", "Z", "e", "()Z", "b", "c", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<v1> f65509e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(v1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean on;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "manualOverride", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final boolean manual_override;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSetPreconditioningMaxAction$ManualOverrideMode_E#ADAPTER", jsonName = "manualOverrideMode", label = com.squareup.wire.q.a.REPEATED, tag = 3)
    private final List<c> manual_override_mode;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/v1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/v1;", "value", "", "c", "(Lfc0/v1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/v1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/v1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/v1;)Lfc0/v1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v1> {
        a(com.squareup.wire.b bVar, co0.d<v1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacSetPreconditioningMaxAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new v1(zBooleanValue, zBooleanValue2, arrayList, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 2) {
                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        arrayList.add(c.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        jn0.h0 h0Var = jn0.h0.f84049a;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getOn()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getOn()));
            }
            if (value.getManual_override()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getManual_override()));
            }
            c.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getOn()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getOn()));
            }
            if (value.getManual_override()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getManual_override()));
            }
            return iD + c.ADAPTER.asRepeated().encodedSizeWithTag(3, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v1 redact(v1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return v1.b(value, false, false, null, okio.k.f97943e, 7, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.v1$c, still in use, count: 1, list:
      (r0v0 fc0.v1$c) from 0x003c: CONSTRUCTOR 
      (wrap co0.d:0x0034: INVOKE (wrap java.lang.Class:0x0032: CONST_CLASS  A[WRAPPED] (LINE:51) fc0.v1$c.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:53))
      (wrap com.squareup.wire.o:0x0038: SGET  A[WRAPPED] (LINE:57) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.v1$c)
     A[MD:(co0.d<fc0.v1$c>, com.squareup.wire.o, fc0.v1$c):void (m), WRAPPED] (LINE:61) call: fc0.v1.c.a.<init>(co0.d, com.squareup.wire.o, fc0.v1$c):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lfc0/v1$c;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "DogMode", "Soc", "Doors", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements com.squareup.wire.p {
        DogMode(0),
        Soc(1),
        Doors(2);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<c> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3, new c(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/v1$c$a", "Lcom/squareup/wire/a;", "Lfc0/v1$c;", "", "value", "f", "(I)Lfc0/v1$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        /* JADX INFO: renamed from: fc0.v1$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/v1$c$b;", "", "<init>", "()V", "", "value", "Lfc0/v1$c;", "a", "(I)Lfc0/v1$c;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int value) {
                if (value == 0) {
                    return c.DogMode;
                }
                if (value == 1) {
                    return c.Soc;
                }
                if (value != 2) {
                    return null;
                }
                return c.Doors;
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

    public v1() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v1 b(v1 v1Var, boolean z11, boolean z12, List list, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = v1Var.on;
        }
        if ((i11 & 2) != 0) {
            z12 = v1Var.manual_override;
        }
        if ((i11 & 4) != 0) {
            list = v1Var.manual_override_mode;
        }
        if ((i11 & 8) != 0) {
            kVar = v1Var.unknownFields();
        }
        return v1Var.a(z11, z12, list, kVar);
    }

    public final v1 a(boolean on2, boolean manual_override, List<? extends c> manual_override_mode, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(manual_override_mode, "manual_override_mode");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v1(on2, manual_override, manual_override_mode, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getManual_override() {
        return this.manual_override;
    }

    public final List<c> d() {
        return this.manual_override_mode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getOn() {
        return this.on;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), v1Var.unknownFields()) && this.on == v1Var.on && this.manual_override == v1Var.manual_override && p013kotlin.jvm.internal.s.f(this.manual_override_mode, v1Var.manual_override_mode);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.on)) * 37) + Boolean.hashCode(this.manual_override)) * 37) + this.manual_override_mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m351newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("on=" + this.on);
        arrayList.add("manual_override=" + this.manual_override);
        if (!this.manual_override_mode.isEmpty()) {
            arrayList.add("manual_override_mode=" + this.manual_override_mode);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "HvacSetPreconditioningMaxAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v1(boolean z11, boolean z12, List list, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m351newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(boolean z11, boolean z12, List<? extends c> manual_override_mode, okio.k unknownFields) {
        super(f65509e, unknownFields);
        p013kotlin.jvm.internal.s.k(manual_override_mode, "manual_override_mode");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.on = z11;
        this.manual_override = z12;
        this.manual_override_mode = x20.d.g("manual_override_mode", manual_override_mode);
    }
}
