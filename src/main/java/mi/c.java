package mi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.apollographql.apollo3.exception.JsonDataException;
import ezvcard.property.Gender;
import ii.a0;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0001<B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0001H\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0001H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010*\u001a\u00020\u00012\u0006\u0010&\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00012\u0006\u0010&\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00012\u0006\u0010&\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00012\u0006\u0010&\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u0010&\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b:\u0010%J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u0017R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010GR\u0014\u0010I\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010DR\u0018\u0010K\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\u0014\u0010N\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010M¨\u0006Q"}, d2 = {"Lmi/c;", "Lmi/g;", "Lokio/i;", "sink", "", "indent", "<init>", "(Lokio/i;Ljava/lang/String;)V", "", "empty", "openBracket", "H", "(ILjava/lang/String;)Lmi/g;", "nonempty", "closeBracket", "p", "(IILjava/lang/String;)Lmi/g;", "Ljn0/h0;", "c0", "()V", "C", "n", "o", "I", "()I", "newTop", "J", "(I)V", "topOfStack", "T", "f", "()Lmi/g;", "e", "h", "j", "name", Gender.NONE, "(Ljava/lang/String;)Lmi/g;", "value", "w", "R", "", "K", "(Z)Lmi/g;", "", "E", "(D)Lmi/g;", "S1", "(I)Lmi/g;", "", "D", "(J)Lmi/g;", "Lmi/e;", "U1", "(Lmi/e;)Lmi/g;", "Lii/a0;", "b0", "(Lii/a0;)Lmi/c;", "B", "close", "a", "Lokio/i;", "b", "Ljava/lang/String;", "c", "stackSize", "", DateTokenConverter.CONVERTER_KEY, "[I", "scopes", "", "[Ljava/lang/String;", "pathNames", "pathIndices", "g", "deferredName", "t", "()Ljava/lang/String;", "separator", "getPath", "path", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f92108i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okio.i sink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String indent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int stackSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int[] scopes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String[] pathNames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int[] pathIndices;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String deferredName;

    /* JADX INFO: renamed from: mi.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmi/c$a;", "", "<init>", "()V", "", "", "b", "(B)Ljava/lang/String;", "Lokio/i;", "sink", "value", "Ljn0/h0;", "c", "(Lokio/i;Ljava/lang/String;)V", "HEX_ARRAY", "Ljava/lang/String;", "", "REPLACEMENT_CHARS", "[Ljava/lang/String;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte b11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("0123456789abcdef".charAt(b11 >>> 4));
            sb2.append("0123456789abcdef".charAt(b11 & 15));
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        public final void c(okio.i sink, String value) {
            String str;
            s.k(sink, "sink");
            s.k(value, "value");
            String[] strArr = c.f92108i;
            sink.writeByte(34);
            int length = value.length();
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = value.charAt(i12);
                if (cCharAt < 128) {
                    str = strArr[cCharAt];
                    if (str != null) {
                        if (i11 < i12) {
                            sink.p0(value, i11, i12);
                        }
                        sink.l2(str);
                        i11 = i12 + 1;
                    }
                } else {
                    if (cCharAt == 8232) {
                        str = "\\u2028";
                    } else if (cCharAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i11 < i12) {
                        sink.p0(value, i11, i12);
                    }
                    sink.l2(str);
                    i11 = i12 + 1;
                }
            }
            if (i11 < length) {
                sink.p0(value, i11, length);
            }
            sink.writeByte(34);
        }

        private Companion() {
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i11 = 0; i11 < 32; i11++) {
            strArr[i11] = "\\u00" + INSTANCE.b((byte) i11);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f92108i = strArr;
    }

    public c(okio.i sink, String str) {
        s.k(sink, "sink");
        this.sink = sink;
        this.indent = str;
        this.scopes = new int[256];
        this.pathNames = new String[256];
        this.pathIndices = new int[256];
        J(6);
    }

    private final void C() {
        if (this.indent == null) {
            return;
        }
        this.sink.writeByte(10);
        int i11 = this.stackSize;
        for (int i12 = 1; i12 < i11; i12++) {
            this.sink.l2(this.indent);
        }
    }

    private final g H(int empty, String openBracket) {
        o();
        J(empty);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.l2(openBracket);
        return this;
    }

    private final int I() {
        int i11 = this.stackSize;
        if (i11 != 0) {
            return this.scopes[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void J(int newTop) {
        int i11 = this.stackSize;
        int[] iArr = this.scopes;
        if (i11 != iArr.length) {
            this.stackSize = i11 + 1;
            iArr[i11] = newTop;
        } else {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
    }

    private final void T(int topOfStack) {
        this.scopes[this.stackSize - 1] = topOfStack;
    }

    private final void c0() {
        if (this.deferredName != null) {
            n();
            Companion companion = INSTANCE;
            okio.i iVar = this.sink;
            String str = this.deferredName;
            s.h(str);
            companion.c(iVar, str);
            this.deferredName = null;
        }
    }

    private final void n() {
        int I = I();
        if (I == 5) {
            this.sink.writeByte(44);
        } else if (I != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        C();
        T(4);
    }

    private final void o() {
        int I = I();
        if (I == 1) {
            T(2);
            C();
            return;
        }
        if (I == 2) {
            this.sink.writeByte(44);
            C();
        } else if (I == 4) {
            this.sink.l2(t());
            T(5);
        } else if (I == 6) {
            T(7);
        } else {
            if (I == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    private final g p(int empty, int nonempty, String closeBracket) {
        int I = I();
        if (I != nonempty && I != empty) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException(("Dangling name: " + this.deferredName).toString());
        }
        int i11 = this.stackSize;
        int i12 = i11 - 1;
        this.stackSize = i12;
        this.pathNames[i12] = null;
        int[] iArr = this.pathIndices;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        if (I == nonempty) {
            C();
        }
        this.sink.l2(closeBracket);
        return this;
    }

    private final String t() {
        String str = this.indent;
        return (str == null || str.length() == 0) ? ":" : ": ";
    }

    public final g B(String value) {
        s.k(value, "value");
        c0();
        o();
        this.sink.l2(value);
        int[] iArr = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // mi.g
    public g D(long value) {
        return B(String.valueOf(value));
    }

    @Override // mi.g
    public g E(double value) {
        if (!Double.isNaN(value) && !Double.isInfinite(value)) {
            return B(String.valueOf(value));
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + value).toString());
    }

    @Override // mi.g
    public g K(boolean value) {
        return B(value ? "true" : "false");
    }

    @Override // mi.g
    public g N(String name) {
        s.k(name, "name");
        int i11 = this.stackSize;
        if (i11 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.deferredName = name;
        this.pathNames[i11 - 1] = name;
        return this;
    }

    @Override // mi.g
    public g R() {
        return B(Address.ADDRESS_NULL_PLACEHOLDER);
    }

    @Override // mi.g
    public g S1(int value) {
        return B(String.valueOf(value));
    }

    @Override // mi.g
    public g U1(e value) {
        s.k(value, "value");
        return B(value.getValue());
    }

    @Override // mi.g
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public c v2(a0 value) {
        s.k(value, "value");
        R();
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.sink.close();
        int i11 = this.stackSize;
        if (i11 > 1 || (i11 == 1 && this.scopes[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    @Override // mi.g
    public g e() {
        return p(1, 2, "]");
    }

    @Override // mi.g
    public g f() {
        c0();
        return H(1, "[");
    }

    @Override // mi.g
    public String getPath() {
        return v.y0(ni.b.f95051a.a(this.stackSize, this.scopes, this.pathNames, this.pathIndices), ".", null, null, 0, null, null, 62, null);
    }

    @Override // mi.g
    public g h() {
        c0();
        return H(3, "{");
    }

    @Override // mi.g
    public g j() {
        return p(3, 5, "}");
    }

    @Override // mi.g
    public g w(String value) {
        s.k(value, "value");
        c0();
        o();
        INSTANCE.c(this.sink, value);
        int[] iArr = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }
}
