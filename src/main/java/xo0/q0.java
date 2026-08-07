package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Gender;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import wo0.JsonConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J=\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u00109\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010!J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u00105J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010\u001cJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010'J\u0017\u0010S\u001a\u00020R2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010[R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u0010\\R\u001a\u0010`\u001a\u00020]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010^\u001a\u0004\bW\u0010_R\u0016\u0010c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010dR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010k\u001a\u0004\u0018\u00010i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010j¨\u0006l"}, d2 = {"Lxo0/q0;", "Lwo0/h;", "", "Luo0/a;", "Lwo0/b;", "json", "Lxo0/a1;", "mode", "Lxo0/a;", "lexer", "Lto0/f;", "descriptor", "Lxo0/q0$a;", "discriminatorHolder", "<init>", "(Lwo0/b;Lxo0/a1;Lxo0/a;Lto0/f;Lxo0/q0$a;)V", "", "unknownKey", "", "S", "(Lxo0/q0$a;Ljava/lang/String;)Z", "Ljn0/h0;", "R", "(Lto0/f;)V", "K", "()V", "", Gender.NONE, "()I", "index", "L", "(Lto0/f;I)Z", Gender.OTHER, "(Lto0/f;)I", Action.KEY_ATTRIBUTE, "Q", "(Ljava/lang/String;)Z", Gender.MALE, "P", "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "y", "()Lkotlinx/serialization/json/JsonElement;", "T", "Lro0/c;", "deserializer", "o", "(Lro0/c;)Ljava/lang/Object;", "Luo0/c;", "b", "(Lto0/f;)Luo0/c;", "c", "E", "()Z", "", "f", "()Ljava/lang/Void;", "previousValue", "n", "(Lto0/f;ILro0/c;Ljava/lang/Object;)Ljava/lang/Object;", "A", "C", "", "H", "()B", "", "k", "()S", "z", "", "h", "()J", "", "B", "()F", "", "l", "()D", "", "m", "()C", "r", "Luo0/e;", "q", "(Lto0/f;)Luo0/e;", "enumDescriptor", "x", "a", "Lwo0/b;", DateTokenConverter.CONVERTER_KEY, "()Lwo0/b;", "Lxo0/a1;", "Lxo0/a;", "Lyo0/c;", "Lyo0/c;", "()Lyo0/c;", "serializersModule", "e", "I", "currentIndex", "Lxo0/q0$a;", "Lwo0/f;", "g", "Lwo0/f;", "configuration", "Lxo0/y;", "Lxo0/y;", "elementMarker", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class q0 extends uo0.a implements wo0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wo0.b json;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a1 mode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final JsonReader lexer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo0.c serializersModule;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a discriminatorHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JsonConfiguration configuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y elementMarker;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxo0/q0$a;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String discriminatorToSkip;

        public a(String str) {
            this.discriminatorToSkip = str;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123891a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a1.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f123891a = iArr;
        }
    }

    public q0(wo0.b json, a1 mode, JsonReader lexer, to0.f descriptor, a aVar) {
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(mode, "mode");
        p013kotlin.jvm.internal.s.k(lexer, "lexer");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = aVar;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new y(descriptor);
    }

    private final void K() {
        if (this.lexer.F() != 4) {
            return;
        }
        JsonReader.x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean L(to0.f descriptor, int index) {
        String strG;
        wo0.b bVar = this.json;
        boolean zI = descriptor.i(index);
        to0.f fVarD = descriptor.d(index);
        if (zI && !fVarD.b() && this.lexer.N(true)) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(fVarD.getKind(), to0.n.b.f114905a) || ((fVarD.b() && this.lexer.N(false)) || (strG = this.lexer.G(this.configuration.getIsLenient())) == null)) {
            return false;
        }
        int i11 = b0.i(fVarD, bVar, strG);
        boolean z11 = !bVar.getConfiguration().getExplicitNulls() && fVarD.b();
        if (i11 == -3 && (zI || z11)) {
            this.lexer.o();
            return true;
        }
        return false;
    }

    private final int M() {
        boolean zM = this.lexer.M();
        if (!this.lexer.e()) {
            if (!zM || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            z.h(this.lexer, "array");
            throw new KotlinNothingValueException();
        }
        int i11 = this.currentIndex;
        if (i11 != -1 && !zM) {
            JsonReader.x(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i12 = i11 + 1;
        this.currentIndex = i12;
        return i12;
    }

    private final int N() {
        int i11 = this.currentIndex;
        boolean zM = false;
        boolean z11 = i11 % 2 != 0;
        if (!z11) {
            this.lexer.l(CoreConstants.COLON_CHAR);
        } else if (i11 != -1) {
            zM = this.lexer.M();
        }
        if (!this.lexer.e()) {
            if (!zM || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            z.i(this.lexer, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z11) {
            if (this.currentIndex == -1) {
                JsonReader jsonReader = this.lexer;
                int i12 = jsonReader.currentPosition;
                if (zM) {
                    JsonReader.x(jsonReader, "Unexpected leading comma", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                JsonReader jsonReader2 = this.lexer;
                boolean z12 = zM;
                int i13 = jsonReader2.currentPosition;
                if (!z12) {
                    JsonReader.x(jsonReader2, "Expected comma after the key-value pair", i13, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i14 = this.currentIndex + 1;
        this.currentIndex = i14;
        return i14;
    }

    private final int O(to0.f descriptor) {
        boolean zM;
        boolean zM2 = this.lexer.M();
        while (true) {
            boolean z11 = true;
            if (!this.lexer.e()) {
                if (zM2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                    z.i(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                y yVar = this.elementMarker;
                if (yVar != null) {
                    return yVar.d();
                }
                return -1;
            }
            String strP = P();
            this.lexer.l(CoreConstants.COLON_CHAR);
            int i11 = b0.i(descriptor, this.json, strP);
            if (i11 == -3) {
                zM = false;
            } else {
                if (!this.configuration.getCoerceInputValues() || !L(descriptor, i11)) {
                    y yVar2 = this.elementMarker;
                    if (yVar2 != null) {
                        yVar2.c(i11);
                    }
                    return i11;
                }
                zM = this.lexer.M();
                z11 = false;
            }
            zM2 = z11 ? Q(strP) : zM;
        }
    }

    private final String P() {
        return this.configuration.getIsLenient() ? this.lexer.r() : this.lexer.i();
    }

    private final boolean Q(String key) {
        if (this.configuration.getIgnoreUnknownKeys() || S(this.discriminatorHolder, key)) {
            this.lexer.I(this.configuration.getIsLenient());
        } else {
            this.lexer.A(key);
        }
        return this.lexer.M();
    }

    private final void R(to0.f descriptor) {
        while (A(descriptor) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !p013kotlin.jvm.internal.s.f(aVar.discriminatorToSkip, str)) {
            return false;
        }
        aVar.discriminatorToSkip = null;
        return true;
    }

    @Override // uo0.c
    public int A(to0.f descriptor) {
        int iN;
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        int i11 = b.f123891a[this.mode.ordinal()];
        if (i11 != 2) {
            iN = i11 != 4 ? M() : O(descriptor);
        } else {
            iN = N();
        }
        if (this.mode != a1.MAP) {
            this.lexer.path.g(iN);
        }
        return iN;
    }

    @Override // uo0.a, uo0.e
    public float B() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            float f11 = Float.parseFloat(strQ);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return f11;
            }
            if (!Float.isInfinite(f11) && !Float.isNaN(f11)) {
                return f11;
            }
            z.l(this.lexer, Float.valueOf(f11));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type '" + InquiryField.FloatField.TYPE + "' for input '" + strQ + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // uo0.a, uo0.e
    public boolean C() {
        return this.lexer.g();
    }

    @Override // uo0.a, uo0.e
    public boolean E() {
        y yVar = this.elementMarker;
        return ((yVar != null ? yVar.getIsUnmarkedNull() : false) || JsonReader.O(this.lexer, false, 1, null)) ? false : true;
    }

    @Override // uo0.a, uo0.e
    public byte H() {
        long jM = this.lexer.m();
        byte b11 = (byte) jM;
        if (jM == b11) {
            return b11;
        }
        JsonReader.x(this.lexer, "Failed to parse byte for input '" + jM + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // uo0.e, uo0.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public yo0.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // uo0.a, uo0.e
    public uo0.c b(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        a1 a1VarB = b1.b(this.json, descriptor);
        this.lexer.path.c(descriptor);
        this.lexer.l(a1VarB.begin);
        K();
        int i11 = b.f123891a[a1VarB.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return new q0(this.json, a1VarB, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == a1VarB && this.json.getConfiguration().getExplicitNulls()) ? this : new q0(this.json, a1VarB, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // uo0.a, uo0.c
    public void c(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            R(descriptor);
        }
        if (this.lexer.M() && !this.json.getConfiguration().getAllowTrailingComma()) {
            z.h(this.lexer, "");
            throw new KotlinNothingValueException();
        }
        this.lexer.l(this.mode.end);
        this.lexer.path.b();
    }

    @Override // wo0.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final wo0.b getJson() {
        return this.json;
    }

    @Override // uo0.a, uo0.e
    public Void f() {
        return null;
    }

    @Override // uo0.a, uo0.e
    public long h() {
        return this.lexer.m();
    }

    @Override // uo0.a, uo0.e
    public short k() {
        long jM = this.lexer.m();
        short s11 = (short) jM;
        if (jM == s11) {
            return s11;
        }
        JsonReader.x(this.lexer, "Failed to parse short for input '" + jM + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // uo0.a, uo0.e
    public double l() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            double d11 = Double.parseDouble(strQ);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return d11;
            }
            if (!Double.isInfinite(d11) && !Double.isNaN(d11)) {
                return d11;
            }
            z.l(this.lexer, Double.valueOf(d11));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'double' for input '" + strQ + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // uo0.a, uo0.e
    public char m() {
        String strQ = this.lexer.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        JsonReader.x(this.lexer, "Expected single char, but got '" + strQ + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // uo0.a, uo0.c
    public <T> T n(to0.f descriptor, int index, ro0.c<? extends T> deserializer, T previousValue) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        boolean z11 = this.mode == a1.MAP && (index & 1) == 0;
        if (z11) {
            this.lexer.path.d();
        }
        T t11 = (T) super.n(descriptor, index, deserializer, previousValue);
        if (z11) {
            this.lexer.path.f(t11);
        }
        return t11;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0156  */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0157, please report this as an issue */
    @Override // uo0.a, uo0.e
    public <T> T o(ro0.c<? extends T> deserializer) {
        String message;
        JsonPrimitive jsonPrimitiveP;
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        try {
            if ((deserializer instanceof vo0.b) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
                String strC = o0.c(((vo0.b) deserializer).getDescriptor(), this.json);
                String strE = this.lexer.E(strC, this.configuration.getIsLenient());
                if (strE != null) {
                    try {
                        ro0.c cVarA = ro0.i.a((vo0.b) deserializer, this, strE);
                        p013kotlin.jvm.internal.s.i(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                        this.discriminatorHolder = new a(strC);
                        return (T) cVarA.deserialize(this);
                    } catch (SerializationException e11) {
                        String message2 = e11.getMessage();
                        p013kotlin.jvm.internal.s.h(message2);
                        String strW0 = p013kotlin.text.t.W0(p013kotlin.text.t.y1(message2, '\n', null, 2, null), ".");
                        String message3 = e11.getMessage();
                        p013kotlin.jvm.internal.s.h(message3);
                        JsonReader.x(this.lexer, strW0, 0, p013kotlin.text.t.o1(message3, '\n', ""), 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                if (getJson().getConfiguration().getUseArrayPolymorphism()) {
                    return deserializer.deserialize(this);
                }
                String strC2 = o0.c(((vo0.b) deserializer).getDescriptor(), getJson());
                JsonElement jsonElementY = y();
                String serialName = ((vo0.b) deserializer).getDescriptor().getSerialName();
                if (jsonElementY instanceof JsonObject) {
                    JsonObject jsonObject = (JsonObject) jsonElementY;
                    JsonElement jsonElement = (JsonElement) jsonObject.get(strC2);
                    try {
                        ro0.c cVarA2 = ro0.i.a((vo0.b) deserializer, this, (jsonElement == null || (jsonPrimitiveP = wo0.j.p(jsonElement)) == null) ? null : wo0.j.h(jsonPrimitiveP));
                        p013kotlin.jvm.internal.s.i(cVarA2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                        return (T) x0.b(getJson(), strC2, jsonObject, cVarA2);
                    } catch (SerializationException e12) {
                        String message4 = e12.getMessage();
                        p013kotlin.jvm.internal.s.h(message4);
                        throw z.f(-1, message4, jsonObject.toString());
                    }
                }
                throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonObject.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementY.getClass()).l() + " as the serialized body of " + serialName + " at element: " + this.lexer.path.a(), jsonElementY.toString());
                message = e.getMessage();
                p013kotlin.jvm.internal.s.h(message);
                if (p013kotlin.text.t.h0(message, "at path", false, 2, null)) {
                    throw e;
                }
                throw new MissingFieldException(e.a(), e.getMessage() + " at path: " + this.lexer.path.a(), e);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e13) {
            message = e13.getMessage();
            p013kotlin.jvm.internal.s.h(message);
            if (p013kotlin.text.t.h0(message, "at path", false, 2, null)) {
                throw e13;
            }
            throw new MissingFieldException(e13.a(), e13.getMessage() + " at path: " + this.lexer.path.a(), e13);
        }
    }

    @Override // uo0.a, uo0.e
    public uo0.e q(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return s0.b(descriptor) ? new x(this.lexer, this.json) : super.q(descriptor);
    }

    @Override // uo0.a, uo0.e
    public String r() {
        return this.configuration.getIsLenient() ? this.lexer.r() : this.lexer.o();
    }

    @Override // uo0.a, uo0.e
    public int x(to0.f enumDescriptor) {
        p013kotlin.jvm.internal.s.k(enumDescriptor, "enumDescriptor");
        return b0.j(enumDescriptor, this.json, r(), " at path " + this.lexer.path.a());
    }

    @Override // wo0.h
    public JsonElement y() {
        return new n0(this.json.getConfiguration(), this.lexer).e();
    }

    @Override // uo0.a, uo0.e
    public int z() {
        long jM = this.lexer.m();
        int i11 = (int) jM;
        if (jM == i11) {
            return i11;
        }
        JsonReader.x(this.lexer, "Failed to parse int for input '" + jM + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
