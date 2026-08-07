package ic0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ic0.f, still in use, count: 1, list:
  (r0v0 ic0.f) from 0x006e: CONSTRUCTOR 
  (wrap co0.d:0x0066: INVOKE (wrap java.lang.Class:0x0064: CONST_CLASS  A[WRAPPED] (LINE:101) ic0.f.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:103))
  (wrap com.squareup.wire.o:0x006a: SGET  A[WRAPPED] (LINE:107) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 ic0.f)
 A[MD:(co0.d<ic0.f>, com.squareup.wire.o, ic0.f):void (m), WRAPPED] (LINE:111) call: ic0.f.a.<init>(co0.d, com.squareup.wire.o, ic0.f):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lic0/f;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "SOURCE_NONE", "SOURCE_APP_JS", "SOURCE_APP_NATIVE", "SOURCE_NOTIFICATION", "SOURCE_WIDGET", "SOURCE_SIRI", "SOURCE_APP_SHORTCUT", "SOURCE_CONTROL_WIDGET", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements com.squareup.wire.p {
    SOURCE_NONE(0),
    SOURCE_APP_JS(1),
    SOURCE_APP_NATIVE(2),
    SOURCE_NOTIFICATION(3),
    SOURCE_WIDGET(4),
    SOURCE_SIRI(5),
    SOURCE_APP_SHORTCUT(6),
    SOURCE_CONTROL_WIDGET(7);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<f> ADAPTER = new com.squareup.wire.a<f>(o0.b(f.class), com.squareup.wire.o.PROTO_3, new f(0)) { // from class: ic0.f.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public f d(int value) {
            return f.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: ic0.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lic0/f$b;", "", "<init>", "()V", "", "value", "Lic0/f;", "a", "(I)Lic0/f;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(int value) {
            switch (value) {
                case 0:
                    return f.SOURCE_NONE;
                case 1:
                    return f.SOURCE_APP_JS;
                case 2:
                    return f.SOURCE_APP_NATIVE;
                case 3:
                    return f.SOURCE_NOTIFICATION;
                case 4:
                    return f.SOURCE_WIDGET;
                case 5:
                    return f.SOURCE_SIRI;
                case 6:
                    return f.SOURCE_APP_SHORTCUT;
                case 7:
                    return f.SOURCE_CONTROL_WIDGET;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private f(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final f fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<f> getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
