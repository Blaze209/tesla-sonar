package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001a!B5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lfc0/r1;", "Lcom/squareup/wire/f;", "", "Lfc0/r1$a;", "ClimateKeeperAction", "", "manual_override", "", "Lfc0/r1$d;", "manual_override_mode", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/r1$a;ZLjava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/r1$a;ZLjava/util/List;Lokio/k;)Lfc0/r1;", "Lfc0/r1$a;", "c", "()Lfc0/r1$a;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<r1> f65360e = new b(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacClimateKeeperAction$ClimateKeeperAction_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final a ClimateKeeperAction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "manualOverride", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final boolean manual_override;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacClimateKeeperAction$ManualOverrideMode_E#ADAPTER", jsonName = "manualOverrideMode", label = com.squareup.wire.q.a.REPEATED, tag = 3)
    private final List<d> manual_override_mode;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.r1$a, still in use, count: 1, list:
      (r0v0 fc0.r1$a) from 0x0046: CONSTRUCTOR 
      (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) fc0.r1$a.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
      (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.r1$a)
     A[MD:(co0.d<fc0.r1$a>, com.squareup.wire.o, fc0.r1$a):void (m), WRAPPED] (LINE:71) call: fc0.r1.a.a.<init>(co0.d, com.squareup.wire.o, fc0.r1$a):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lfc0/r1$a;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "ClimateKeeperAction_Off", "ClimateKeeperAction_On", "ClimateKeeperAction_Dog", "ClimateKeeperAction_Camp", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements com.squareup.wire.p {
        ClimateKeeperAction_Off(0),
        ClimateKeeperAction_On(1),
        ClimateKeeperAction_Dog(2),
        ClimateKeeperAction_Camp(3);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<a> ADAPTER = new C1338a(p013kotlin.jvm.internal.o0.b(a.class), com.squareup.wire.o.PROTO_3, new a(0));

        /* JADX INFO: renamed from: fc0.r1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/r1$a$a", "Lcom/squareup/wire/a;", "Lfc0/r1$a;", "", "value", "f", "(I)Lfc0/r1$a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1338a extends com.squareup.wire.a<a> {
            C1338a(co0.d<a> dVar, com.squareup.wire.o oVar, a aVar) {
                super(dVar, oVar, aVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public a d(int value) {
                return a.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: fc0.r1$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/r1$a$b;", "", "<init>", "()V", "", "value", "Lfc0/r1$a;", "a", "(I)Lfc0/r1$a;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(int value) {
                if (value == 0) {
                    return a.ClimateKeeperAction_Off;
                }
                if (value == 1) {
                    return a.ClimateKeeperAction_On;
                }
                if (value == 2) {
                    return a.ClimateKeeperAction_Dog;
                }
                if (value != 3) {
                    return null;
                }
                return a.ClimateKeeperAction_Camp;
            }

            private Companion() {
            }
        }

        static {
        }

        private a(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final a fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/r1$b", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/r1;", "value", "", "c", "(Lfc0/r1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/r1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/r1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/r1;)Lfc0/r1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ProtoAdapter<r1> {
        b(com.squareup.wire.b bVar, co0.d<r1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacClimateKeeperAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            a aVarDecode = a.ClimateKeeperAction_Off;
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            boolean zBooleanValue = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r1(aVarDecode, zBooleanValue, arrayList, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        aVarDecode = a.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        arrayList.add(d.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        jn0.h0 h0Var = jn0.h0.f84049a;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getClimateKeeperAction() != a.ClimateKeeperAction_Off) {
                a.ADAPTER.encodeWithTag(writer, 1, value.getClimateKeeperAction());
            }
            if (value.getManual_override()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getManual_override()));
            }
            d.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getClimateKeeperAction() != a.ClimateKeeperAction_Off) {
                iD += a.ADAPTER.encodedSizeWithTag(1, value.getClimateKeeperAction());
            }
            if (value.getManual_override()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getManual_override()));
            }
            return iD + d.ADAPTER.asRepeated().encodedSizeWithTag(3, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r1 redact(r1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return r1.b(value, null, false, null, okio.k.f97943e, 7, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.r1$d, still in use, count: 1, list:
      (r0v0 fc0.r1$d) from 0x0032: CONSTRUCTOR 
      (wrap co0.d:0x002a: INVOKE (wrap java.lang.Class:0x0028: CONST_CLASS  A[WRAPPED] (LINE:41) fc0.r1$d.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:43))
      (wrap com.squareup.wire.o:0x002e: SGET  A[WRAPPED] (LINE:47) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.r1$d)
     A[MD:(co0.d<fc0.r1$d>, com.squareup.wire.o, fc0.r1$d):void (m), WRAPPED] (LINE:51) call: fc0.r1.d.a.<init>(co0.d, com.squareup.wire.o, fc0.r1$d):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lfc0/r1$d;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "Soc", "Cpd", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements com.squareup.wire.p {
        Soc(0),
        Cpd(1);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<d> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3, new d(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/r1$d$a", "Lcom/squareup/wire/a;", "Lfc0/r1$d;", "", "value", "f", "(I)Lfc0/r1$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<d> {
            a(co0.d<d> dVar, com.squareup.wire.o oVar, d dVar2) {
                super(dVar, oVar, dVar2);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public d d(int value) {
                return d.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: fc0.r1$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/r1$d$b;", "", "<init>", "()V", "", "value", "Lfc0/r1$d;", "a", "(I)Lfc0/r1$d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int value) {
                if (value == 0) {
                    return d.Soc;
                }
                if (value != 1) {
                    return null;
                }
                return d.Cpd;
            }

            private Companion() {
            }
        }

        static {
        }

        private d(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final d fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    public r1() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r1 b(r1 r1Var, a aVar, boolean z11, List list, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = r1Var.ClimateKeeperAction;
        }
        if ((i11 & 2) != 0) {
            z11 = r1Var.manual_override;
        }
        if ((i11 & 4) != 0) {
            list = r1Var.manual_override_mode;
        }
        if ((i11 & 8) != 0) {
            kVar = r1Var.unknownFields();
        }
        return r1Var.a(aVar, z11, list, kVar);
    }

    public final r1 a(a ClimateKeeperAction, boolean manual_override, List<? extends d> manual_override_mode, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(ClimateKeeperAction, "ClimateKeeperAction");
        p013kotlin.jvm.internal.s.k(manual_override_mode, "manual_override_mode");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r1(ClimateKeeperAction, manual_override, manual_override_mode, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getClimateKeeperAction() {
        return this.ClimateKeeperAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getManual_override() {
        return this.manual_override;
    }

    public final List<d> e() {
        return this.manual_override_mode;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), r1Var.unknownFields()) && this.ClimateKeeperAction == r1Var.ClimateKeeperAction && this.manual_override == r1Var.manual_override && p013kotlin.jvm.internal.s.f(this.manual_override_mode, r1Var.manual_override_mode);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.ClimateKeeperAction.hashCode()) * 37) + Boolean.hashCode(this.manual_override)) * 37) + this.manual_override_mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m322newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ClimateKeeperAction=" + this.ClimateKeeperAction);
        arrayList.add("manual_override=" + this.manual_override);
        if (!this.manual_override_mode.isEmpty()) {
            arrayList.add("manual_override_mode=" + this.manual_override_mode);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "HvacClimateKeeperAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r1(a aVar, boolean z11, List list, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? a.ClimateKeeperAction_Off : aVar, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m322newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(a ClimateKeeperAction, boolean z11, List<? extends d> manual_override_mode, okio.k unknownFields) {
        super(f65360e, unknownFields);
        p013kotlin.jvm.internal.s.k(ClimateKeeperAction, "ClimateKeeperAction");
        p013kotlin.jvm.internal.s.k(manual_override_mode, "manual_override_mode");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.ClimateKeeperAction = ClimateKeeperAction;
        this.manual_override = z11;
        this.manual_override_mode = x20.d.g("manual_override_mode", manual_override_mode);
    }
}
