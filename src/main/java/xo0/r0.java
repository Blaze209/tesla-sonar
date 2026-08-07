package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import wo0.JsonConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020\u0013\"\u0004\b\u0000\u0010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010 JA\u0010.\u001a\u00020\u0013\"\b\b\u0000\u0010!*\u00020-2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00132\u0006\u0010$\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010$\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010$\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00132\u0006\u0010$\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00132\u0006\u0010$\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00132\u0006\u0010$\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010UR\u001e\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010VR\u001a\u0010[\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bP\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010]R\u0016\u0010`\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010b¨\u0006f"}, d2 = {"Lxo0/r0;", "Lwo0/s;", "Luo0/b;", "Lxo0/n;", "composer", "Lwo0/b;", "json", "Lxo0/a1;", "mode", "", "modeReuseCache", "<init>", "(Lxo0/n;Lwo0/b;Lxo0/a1;[Lwo0/s;)V", "Lxo0/w;", "output", "(Lxo0/w;Lwo0/b;Lxo0/a1;[Lwo0/s;)V", "", "discriminator", "serialName", "Ljn0/h0;", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonElement;", "element", "n", "(Lkotlinx/serialization/json/JsonElement;)V", "Lto0/f;", "descriptor", "", "index", "", "G", "(Lto0/f;I)Z", "T", "Lro0/q;", "serializer", "value", "s", "(Lro0/q;Ljava/lang/Object;)V", "Luo0/d;", "b", "(Lto0/f;)Luo0/d;", "c", "(Lto0/f;)V", "H", "", "y", "(Lto0/f;ILro0/q;Ljava/lang/Object;)V", "Luo0/f;", "E", "(Lto0/f;)Luo0/f;", "w", "()V", "l", "(Z)V", "", "f", "(B)V", "", "j", "(S)V", "o", "(I)V", "", "v", "(J)V", "", "m", "(F)V", "", "r", "(D)V", "", "B", "(C)V", "q", "(Ljava/lang/String;)V", "enumDescriptor", "g", "(Lto0/f;I)V", "a", "Lxo0/n;", "Lwo0/b;", DateTokenConverter.CONVERTER_KEY, "()Lwo0/b;", "Lxo0/a1;", "[Lwo0/s;", "Lyo0/c;", "e", "Lyo0/c;", "()Lyo0/c;", "serializersModule", "Lwo0/f;", "Lwo0/f;", "configuration", "Z", "forceQuoting", "h", "Ljava/lang/String;", "polymorphicDiscriminator", IntegerTokenConverter.CONVERTER_KEY, "polymorphicSerialName", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 extends uo0.b implements wo0.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n composer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wo0.b json;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a1 mode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wo0.s[] modeReuseCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo0.c serializersModule;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final JsonConfiguration configuration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean forceQuoting;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String polymorphicDiscriminator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String polymorphicSerialName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123902a;

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
            f123902a = iArr;
        }
    }

    public r0(n composer, wo0.b json, a1 mode, wo0.s[] sVarArr) {
        p013kotlin.jvm.internal.s.k(composer, "composer");
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = sVarArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = mode.ordinal();
        if (sVarArr != null) {
            wo0.s sVar = sVarArr[iOrdinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[iOrdinal] = this;
        }
    }

    private final void K(String discriminator, String serialName) {
        this.composer.c();
        q(discriminator);
        this.composer.f(CoreConstants.COLON_CHAR);
        this.composer.p();
        q(serialName);
    }

    @Override // uo0.b, uo0.f
    public void B(char value) {
        q(String.valueOf(value));
    }

    @Override // uo0.b, uo0.f
    public uo0.f E(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        if (s0.b(descriptor)) {
            n rVar = this.composer;
            if (!(rVar instanceof r)) {
                rVar = new r(rVar.writer, this.forceQuoting);
            }
            return new r0(rVar, getJson(), this.mode, (wo0.s[]) null);
        }
        if (s0.a(descriptor)) {
            n oVar = this.composer;
            if (!(oVar instanceof o)) {
                oVar = new o(oVar.writer, this.forceQuoting);
            }
            return new r0(oVar, getJson(), this.mode, (wo0.s[]) null);
        }
        if (this.polymorphicDiscriminator == null) {
            return super.E(descriptor);
        }
        this.polymorphicSerialName = descriptor.getSerialName();
        return this;
    }

    @Override // uo0.b, uo0.d
    public boolean G(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // uo0.b
    public boolean H(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        int i11 = a.f123902a[this.mode.ordinal()];
        if (i11 != 1) {
            boolean z11 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.f(CoreConstants.COMMA_CHAR);
                    }
                    this.composer.c();
                    q(b0.h(descriptor, getJson(), index));
                    this.composer.f(CoreConstants.COLON_CHAR);
                    this.composer.p();
                } else {
                    if (index == 0) {
                        this.forceQuoting = true;
                    }
                    if (index == 1) {
                        this.composer.f(CoreConstants.COMMA_CHAR);
                        this.composer.p();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.c();
            } else {
                if (index % 2 == 0) {
                    this.composer.f(CoreConstants.COMMA_CHAR);
                    this.composer.c();
                    z11 = true;
                } else {
                    this.composer.f(CoreConstants.COLON_CHAR);
                    this.composer.p();
                }
                this.forceQuoting = z11;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.f(CoreConstants.COMMA_CHAR);
            }
            this.composer.c();
        }
        return true;
    }

    @Override // uo0.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public yo0.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // uo0.b, uo0.f
    public uo0.d b(to0.f descriptor) {
        wo0.s sVar;
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        a1 a1VarB = b1.b(getJson(), descriptor);
        char c11 = a1VarB.begin;
        if (c11 != 0) {
            this.composer.f(c11);
            this.composer.b();
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            String serialName = this.polymorphicSerialName;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            K(str, serialName);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == a1VarB) {
            return this;
        }
        wo0.s[] sVarArr = this.modeReuseCache;
        return (sVarArr == null || (sVar = sVarArr[a1VarB.ordinal()]) == null) ? new r0(this.composer, getJson(), a1VarB, this.modeReuseCache) : sVar;
    }

    @Override // uo0.b, uo0.d
    public void c(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.q();
            this.composer.d();
            this.composer.f(this.mode.end);
        }
    }

    @Override // wo0.s
    /* JADX INFO: renamed from: d, reason: from getter */
    public wo0.b getJson() {
        return this.json;
    }

    @Override // uo0.b, uo0.f
    public void f(byte value) {
        if (this.forceQuoting) {
            q(String.valueOf((int) value));
        } else {
            this.composer.e(value);
        }
    }

    @Override // uo0.b, uo0.f
    public void g(to0.f enumDescriptor, int index) {
        p013kotlin.jvm.internal.s.k(enumDescriptor, "enumDescriptor");
        q(enumDescriptor.f(index));
    }

    @Override // uo0.b, uo0.f
    public void j(short value) {
        if (this.forceQuoting) {
            q(String.valueOf((int) value));
        } else {
            this.composer.l(value);
        }
    }

    @Override // uo0.b, uo0.f
    public void l(boolean value) {
        if (this.forceQuoting) {
            q(String.valueOf(value));
        } else {
            this.composer.m(value);
        }
    }

    @Override // uo0.b, uo0.f
    public void m(float value) {
        if (this.forceQuoting) {
            q(String.valueOf(value));
        } else {
            this.composer.h(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw z.b(Float.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // wo0.s
    public void n(JsonElement element) {
        p013kotlin.jvm.internal.s.k(element, "element");
        if (this.polymorphicDiscriminator == null || (element instanceof JsonObject)) {
            s(wo0.q.f122156a, element);
        } else {
            o0.d(this.polymorphicSerialName, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // uo0.b, uo0.f
    public void o(int value) {
        if (this.forceQuoting) {
            q(String.valueOf(value));
        } else {
            this.composer.i(value);
        }
    }

    @Override // uo0.b, uo0.f
    public void q(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.composer.n(value);
    }

    @Override // uo0.b, uo0.f
    public void r(double value) {
        if (this.forceQuoting) {
            q(String.valueOf(value));
        } else {
            this.composer.g(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw z.b(Double.valueOf(value), this.composer.writer.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uo0.b, uo0.f
    public <T> void s(ro0.q<? super T> serializer, T value) {
        String strC;
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, value);
            return;
        }
        boolean z11 = serializer instanceof vo0.b;
        if (!z11) {
            int i11 = o0.a.f123879a[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                to0.n kind = serializer.getDescriptor().getKind();
                strC = (p013kotlin.jvm.internal.s.f(kind, to0.o.a.f114906a) || p013kotlin.jvm.internal.s.f(kind, to0.o.d.f114909a)) ? o0.c(serializer.getDescriptor(), getJson()) : null;
            }
        } else if (getJson().getConfiguration().getClassDiscriminatorMode() != wo0.a.NONE) {
        }
        if (z11) {
            vo0.b bVar = (vo0.b) serializer;
            if (value == 0) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            ro0.q<? super T> qVarB = ro0.i.b(bVar, this, value);
            if (strC != null) {
                o0.e(serializer, qVarB, strC);
            }
            o0.b(qVarB.getDescriptor().getKind());
            p013kotlin.jvm.internal.s.i(qVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = qVarB;
        }
        if (strC != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = strC;
            this.polymorphicSerialName = serialName;
        }
        serializer.serialize(this, value);
    }

    @Override // uo0.b, uo0.f
    public void v(long value) {
        if (this.forceQuoting) {
            q(String.valueOf(value));
        } else {
            this.composer.j(value);
        }
    }

    @Override // uo0.b, uo0.f
    public void w() {
        this.composer.k(Address.ADDRESS_NULL_PLACEHOLDER);
    }

    @Override // uo0.b, uo0.d
    public <T> void y(to0.f descriptor, int index, ro0.q<? super T> serializer, T value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.y(descriptor, index, serializer, value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(w output, wo0.b json, a1 mode, wo0.s[] modeReuseCache) {
        this(t.a(output, json), json, mode, modeReuseCache);
        p013kotlin.jvm.internal.s.k(output, "output");
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(mode, "mode");
        p013kotlin.jvm.internal.s.k(modeReuseCache, "modeReuseCache");
    }
}
