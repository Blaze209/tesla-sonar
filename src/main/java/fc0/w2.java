package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001eB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfc0/w2;", "Lcom/squareup/wire/f;", "", "Lfc0/w2$c;", "setting", "", "enable", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/w2$c;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/w2$c;ZLokio/k;)Lfc0/w2;", "Lfc0/w2$c;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/w2$c;", "b", "Z", "c", "()Z", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<w2> f65549d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(w2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ParentalControlsEnableSettingsAction$ParentalControlsSetting_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final c setting;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final boolean enable;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/w2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/w2;", "value", "", "c", "(Lfc0/w2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/w2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/w2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/w2;)Lfc0/w2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<w2> {
        a(com.squareup.wire.b bVar, co0.d<w2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ParentalControlsEnableSettingsAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            c cVarDecode = c.SpeedLimit;
            long jD = reader.d();
            boolean zBooleanValue = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new w2(cVarDecode, zBooleanValue, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        cVarDecode = c.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, w2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSetting() != c.SpeedLimit) {
                c.ADAPTER.encodeWithTag(writer, 1, value.getSetting());
            }
            if (value.getEnable()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getEnable()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(w2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSetting() != c.SpeedLimit) {
                iD += c.ADAPTER.encodedSizeWithTag(1, value.getSetting());
            }
            return value.getEnable() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getEnable())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public w2 redact(w2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return w2.b(value, null, false, okio.k.f97943e, 3, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.w2$c, still in use, count: 1, list:
      (r0v0 fc0.w2$c) from 0x0064: CONSTRUCTOR 
      (wrap co0.d:0x005c: INVOKE (wrap java.lang.Class:0x005a: CONST_CLASS  A[WRAPPED] (LINE:91) fc0.w2$c.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:93))
      (wrap com.squareup.wire.o:0x0060: SGET  A[WRAPPED] (LINE:97) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.w2$c)
     A[MD:(co0.d<fc0.w2$c>, com.squareup.wire.o, fc0.w2$c):void (m), WRAPPED] (LINE:101) call: fc0.w2.c.a.<init>(co0.d, com.squareup.wire.o, fc0.w2$c):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lfc0/w2$c;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "SpeedLimit", "Acceleration", "SafetyFeatures", "Curfew", "BrowserBlocked", "TheaterBlocked", "ArcadeBlocked", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements com.squareup.wire.p {
        SpeedLimit(0),
        Acceleration(1),
        SafetyFeatures(2),
        Curfew(3),
        BrowserBlocked(4),
        TheaterBlocked(5),
        ArcadeBlocked(6);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<c> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3, new c(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/w2$c$a", "Lcom/squareup/wire/a;", "Lfc0/w2$c;", "", "value", "f", "(I)Lfc0/w2$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        /* JADX INFO: renamed from: fc0.w2$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/w2$c$b;", "", "<init>", "()V", "", "value", "Lfc0/w2$c;", "a", "(I)Lfc0/w2$c;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int value) {
                switch (value) {
                    case 0:
                        return c.SpeedLimit;
                    case 1:
                        return c.Acceleration;
                    case 2:
                        return c.SafetyFeatures;
                    case 3:
                        return c.Curfew;
                    case 4:
                        return c.BrowserBlocked;
                    case 5:
                        return c.TheaterBlocked;
                    case 6:
                        return c.ArcadeBlocked;
                    default:
                        return null;
                }
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

    public w2() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ w2 b(w2 w2Var, c cVar, boolean z11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = w2Var.setting;
        }
        if ((i11 & 2) != 0) {
            z11 = w2Var.enable;
        }
        if ((i11 & 4) != 0) {
            kVar = w2Var.unknownFields();
        }
        return w2Var.a(cVar, z11, kVar);
    }

    public final w2 a(c setting, boolean enable, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(setting, "setting");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new w2(setting, enable, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getSetting() {
        return this.setting;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), w2Var.unknownFields()) && this.setting == w2Var.setting && this.enable == w2Var.enable;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.setting.hashCode()) * 37) + Boolean.hashCode(this.enable);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m359newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("setting=" + this.setting);
        arrayList.add("enable=" + this.enable);
        return p013kotlin.collections.v.y0(arrayList, ", ", "ParentalControlsEnableSettingsAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ w2(c cVar, boolean z11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c.SpeedLimit : cVar, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m359newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(c setting, boolean z11, okio.k unknownFields) {
        super(f65549d, unknownFields);
        p013kotlin.jvm.internal.s.k(setting, "setting");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.setting = setting;
        this.enable = z11;
    }
}
