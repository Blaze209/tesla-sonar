package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001cB1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lfc0/d4;", "Lcom/squareup/wire/f;", "", "Lfc0/d4$c;", "font_size", "", "language", "Lfc0/y2;", "unit_preferences", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/d4$c;Ljava/lang/String;Lfc0/y2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lfc0/d4$c;Ljava/lang/String;Lfc0/y2;Lokio/k;)Lfc0/d4;", "Lfc0/d4$c;", "c", "()Lfc0/d4$c;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lfc0/y2;", "e", "()Lfc0/y2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d4 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<d4> f64947e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d4.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.SetPhoneSettingPreferencesAction$FontSize#ADAPTER", jsonName = OrcaFlavourKeys.FONT_SIZE, label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final c font_size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String language;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PhoneUnitPreferences#ADAPTER", jsonName = "unitPreferences", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final y2 unit_preferences;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/d4$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/d4;", "value", "", "c", "(Lfc0/d4;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/d4;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/d4;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/d4;)Lfc0/d4;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d4> {
        a(com.squareup.wire.b bVar, co0.d<d4> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SetPhoneSettingPreferencesAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d4 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            c cVarDecode = c.FONT_SIZE_STANDARD;
            long jD = reader.d();
            String strDecode = "";
            y2 y2VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new d4(cVarDecode, strDecode, y2VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        cVarDecode = c.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    y2VarDecode = y2.f65624d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, d4 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getFont_size() != c.FONT_SIZE_STANDARD) {
                c.ADAPTER.encodeWithTag(writer, 1, value.getFont_size());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getLanguage(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getLanguage());
            }
            if (value.getUnit_preferences() != null) {
                y2.f65624d.encodeWithTag(writer, 3, value.getUnit_preferences());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getFont_size() != c.FONT_SIZE_STANDARD) {
                iD += c.ADAPTER.encodedSizeWithTag(1, value.getFont_size());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getLanguage(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLanguage());
            }
            return value.getUnit_preferences() != null ? iD + y2.f65624d.encodedSizeWithTag(3, value.getUnit_preferences()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d4 redact(d4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            y2 unit_preferences = value.getUnit_preferences();
            return d4.b(value, null, null, unit_preferences != null ? y2.f65624d.redact(unit_preferences) : null, okio.k.f97943e, 3, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.d4$c, still in use, count: 1, list:
      (r0v0 fc0.d4$c) from 0x0032: CONSTRUCTOR 
      (wrap co0.d:0x002a: INVOKE (wrap java.lang.Class:0x0028: CONST_CLASS  A[WRAPPED] (LINE:41) fc0.d4$c.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:43))
      (wrap com.squareup.wire.o:0x002e: SGET  A[WRAPPED] (LINE:47) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.d4$c)
     A[MD:(co0.d<fc0.d4$c>, com.squareup.wire.o, fc0.d4$c):void (m), WRAPPED] (LINE:51) call: fc0.d4.c.a.<init>(co0.d, com.squareup.wire.o, fc0.d4$c):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lfc0/d4$c;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "FONT_SIZE_STANDARD", "FONT_SIZE_LARGE", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements com.squareup.wire.p {
        FONT_SIZE_STANDARD(0),
        FONT_SIZE_LARGE(1);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<c> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3, new c(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/d4$c$a", "Lcom/squareup/wire/a;", "Lfc0/d4$c;", "", "value", "f", "(I)Lfc0/d4$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        /* JADX INFO: renamed from: fc0.d4$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/d4$c$b;", "", "<init>", "()V", "", "value", "Lfc0/d4$c;", "a", "(I)Lfc0/d4$c;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int value) {
                if (value == 0) {
                    return c.FONT_SIZE_STANDARD;
                }
                if (value != 1) {
                    return null;
                }
                return c.FONT_SIZE_LARGE;
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

    public d4() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ d4 b(d4 d4Var, c cVar, String str, y2 y2Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = d4Var.font_size;
        }
        if ((i11 & 2) != 0) {
            str = d4Var.language;
        }
        if ((i11 & 4) != 0) {
            y2Var = d4Var.unit_preferences;
        }
        if ((i11 & 8) != 0) {
            kVar = d4Var.unknownFields();
        }
        return d4Var.a(cVar, str, y2Var, kVar);
    }

    public final d4 a(c font_size, String language, y2 unit_preferences, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(font_size, "font_size");
        p013kotlin.jvm.internal.s.k(language, "language");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new d4(font_size, language, unit_preferences, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getFont_size() {
        return this.font_size;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final y2 getUnit_preferences() {
        return this.unit_preferences;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), d4Var.unknownFields()) && this.font_size == d4Var.font_size && p013kotlin.jvm.internal.s.f(this.language, d4Var.language) && p013kotlin.jvm.internal.s.f(this.unit_preferences, d4Var.unit_preferences);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.font_size.hashCode()) * 37) + this.language.hashCode()) * 37;
        y2 y2Var = this.unit_preferences;
        int iHashCode2 = iHashCode + (y2Var != null ? y2Var.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m223newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("font_size=" + this.font_size);
        arrayList.add("language=" + x20.d.i(this.language));
        y2 y2Var = this.unit_preferences;
        if (y2Var != null) {
            arrayList.add("unit_preferences=" + y2Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "SetPhoneSettingPreferencesAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ d4(c cVar, String str, y2 y2Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c.FONT_SIZE_STANDARD : cVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : y2Var, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m223newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(c font_size, String language, y2 y2Var, okio.k unknownFields) {
        super(f64947e, unknownFields);
        p013kotlin.jvm.internal.s.k(font_size, "font_size");
        p013kotlin.jvm.internal.s.k(language, "language");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.font_size = font_size;
        this.language = language;
        this.unit_preferences = y2Var;
    }
}
