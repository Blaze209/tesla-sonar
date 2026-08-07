package xo0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wo0.JsonConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002\r\u0012\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0016H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000204H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020:H\u0014¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\u0007\"\u0004\b\u0000\u0010=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020BH\u0014¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u001dH\u0014¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020GH\u0014¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0014¢\u0006\u0004\bJ\u0010KJ'\u0010N\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u0016H\u0014¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020P2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020P2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bV\u0010Z\u001a\u0004\b[\u0010\\R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020a8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b[\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0011\u0010l\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\bj\u0010k\u0082\u0001\u0003mno¨\u0006p"}, d2 = {"Lxo0/e;", "Lvo0/x0;", "Lwo0/s;", "Lwo0/b;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "Ljn0/h0;", "nodeConsumer", "<init>", "(Lwo0/b;Lwn0/l;)V", "", "tag", "xo0/e$b", "v0", "(Ljava/lang/String;)Lxo0/e$b;", "Lto0/f;", "inlineDescriptor", "xo0/e$a", "u0", "(Ljava/lang/String;Lto0/f;)Lxo0/e$a;", "descriptor", "", "index", "b0", "(Lto0/f;I)Ljava/lang/String;", "element", "n", "(Lkotlinx/serialization/json/JsonElement;)V", "", "G", "(Lto0/f;I)Z", "parentName", "childName", "a0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", Action.KEY_ATTRIBUTE, "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "C", "()V", "w", "p0", "(Ljava/lang/String;)V", "value", "n0", "(Ljava/lang/String;I)V", "", "h0", "(Ljava/lang/String;B)V", "", "q0", "(Ljava/lang/String;S)V", "", "o0", "(Ljava/lang/String;J)V", "", "l0", "(Ljava/lang/String;F)V", "T", "Lro0/q;", "serializer", "s", "(Lro0/q;Ljava/lang/Object;)V", "", "j0", "(Ljava/lang/String;D)V", "g0", "(Ljava/lang/String;Z)V", "", "i0", "(Ljava/lang/String;C)V", "r0", "(Ljava/lang/String;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "k0", "(Ljava/lang/String;Lto0/f;I)V", "Luo0/f;", "m0", "(Ljava/lang/String;Lto0/f;)Luo0/f;", "E", "(Lto0/f;)Luo0/f;", "Luo0/d;", "b", "(Lto0/f;)Luo0/d;", Gender.UNKNOWN, "(Lto0/f;)V", "Lwo0/b;", DateTokenConverter.CONVERTER_KEY, "()Lwo0/b;", "c", "Lwn0/l;", "t0", "()Lwn0/l;", "Lwo0/f;", "Lwo0/f;", "configuration", "e", "Ljava/lang/String;", "polymorphicDiscriminator", "f", "polymorphicSerialName", "Lyo0/c;", "a", "()Lyo0/c;", "serializersModule", "Lxo0/e0;", "Lxo0/i0;", "Lxo0/k0;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class e extends vo0.x0 implements wo0.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wo0.b json;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<JsonElement, jn0.h0> nodeConsumer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    protected final JsonConfiguration configuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String polymorphicDiscriminator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String polymorphicSerialName;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"xo0/e$a", "Luo0/b;", "", "value", "Ljn0/h0;", "q", "(Ljava/lang/String;)V", "Lyo0/c;", "a", "()Lyo0/c;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends uo0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f123832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ to0.f f123833c;

        a(String str, to0.f fVar) {
            this.f123832b = str;
            this.f123833c = fVar;
        }

        @Override // uo0.f
        /* JADX INFO: renamed from: a */
        public yo0.c getSerializersModule() {
            return e.this.getJson().getSerializersModule();
        }

        @Override // uo0.b, uo0.f
        public void q(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            e.this.w0(this.f123832b, new wo0.v(value, false, this.f123833c));
        }
    }

    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"xo0/e$b", "Luo0/b;", "", "s", "Ljn0/h0;", "K", "(Ljava/lang/String;)V", "", "value", "o", "(I)V", "", "v", "(J)V", "", "f", "(B)V", "", "j", "(S)V", "Lyo0/c;", "a", "Lyo0/c;", "()Lyo0/c;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends uo0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final yo0.c serializersModule;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f123836c;

        b(String str) {
            this.f123836c = str;
            this.serializersModule = e.this.getJson().getSerializersModule();
        }

        public final void K(String s11) {
            p013kotlin.jvm.internal.s.k(s11, "s");
            e.this.w0(this.f123836c, new wo0.v(s11, false, null, 4, null));
        }

        @Override // uo0.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public yo0.c getSerializersModule() {
            return this.serializersModule;
        }

        @Override // uo0.b, uo0.f
        public void f(byte value) {
            K(jn0.y.e(jn0.y.b(value)));
        }

        @Override // uo0.b, uo0.f
        public void j(short value) {
            K(jn0.f0.e(jn0.f0.b(value)));
        }

        @Override // uo0.b, uo0.f
        public void o(int value) {
            K(Long.toString(((long) jn0.a0.b(value)) & 4294967295L, 10));
        }

        @Override // uo0.b, uo0.f
        public void v(long value) {
            K(h.a(jn0.c0.b(value), 10));
        }
    }

    public /* synthetic */ e(wo0.b bVar, wn0.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f0(e eVar, JsonElement node) {
        p013kotlin.jvm.internal.s.k(node, "node");
        eVar.w0(eVar.V(), node);
        return jn0.h0.f84049a;
    }

    private final a u0(String tag, to0.f inlineDescriptor) {
        return new a(tag, inlineDescriptor);
    }

    private final b v0(String tag) {
        return new b(tag);
    }

    @Override // vo0.d2, uo0.f
    public uo0.f E(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        if (W() == null) {
            return new e0(this.json, this.nodeConsumer).E(descriptor);
        }
        if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = descriptor.getSerialName();
        }
        return super.E(descriptor);
    }

    @Override // uo0.d
    public boolean G(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // vo0.d2
    protected void U(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this.nodeConsumer.invoke(s0());
    }

    @Override // uo0.f
    /* JADX INFO: renamed from: a */
    public final yo0.c getSerializersModule() {
        return this.json.getSerializersModule();
    }

    @Override // vo0.x0
    protected String a0(String parentName, String childName) {
        p013kotlin.jvm.internal.s.k(parentName, "parentName");
        p013kotlin.jvm.internal.s.k(childName, "childName");
        return childName;
    }

    @Override // uo0.f
    public uo0.d b(to0.f descriptor) {
        e k0Var;
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        wn0.l<JsonElement, jn0.h0> lVar = W() == null ? this.nodeConsumer : new wn0.l() { // from class: xo0.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return e.f0(this.f123824a, (JsonElement) obj);
            }
        };
        to0.n kind = descriptor.getKind();
        if (p013kotlin.jvm.internal.s.f(kind, to0.o.b.f114907a) || (kind instanceof to0.d)) {
            k0Var = new k0(this.json, lVar);
        } else if (p013kotlin.jvm.internal.s.f(kind, to0.o.c.f114908a)) {
            wo0.b bVar = this.json;
            to0.f fVarA = b1.a(descriptor.d(0), bVar.getSerializersModule());
            to0.n kind2 = fVarA.getKind();
            if ((kind2 instanceof to0.e) || p013kotlin.jvm.internal.s.f(kind2, to0.n.b.f114905a)) {
                k0Var = new m0(this.json, lVar);
            } else {
                if (!bVar.getConfiguration().getAllowStructuredMapKeys()) {
                    throw z.d(fVarA);
                }
                k0Var = new k0(this.json, lVar);
            }
        } else {
            k0Var = new i0(this.json, lVar);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (k0Var instanceof m0) {
                m0 m0Var = (m0) k0Var;
                m0Var.w0(Action.KEY_ATTRIBUTE, wo0.j.c(str));
                String serialName = this.polymorphicSerialName;
                if (serialName == null) {
                    serialName = descriptor.getSerialName();
                }
                m0Var.w0("value", wo0.j.c(serialName));
            } else {
                String serialName2 = this.polymorphicSerialName;
                if (serialName2 == null) {
                    serialName2 = descriptor.getSerialName();
                }
                k0Var.w0(str, wo0.j.c(serialName2));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return k0Var;
    }

    @Override // vo0.x0
    protected String b0(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return b0.h(descriptor, this.json, index);
    }

    @Override // wo0.s
    /* JADX INFO: renamed from: d, reason: from getter */
    public final wo0.b getJson() {
        return this.json;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, boolean value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.a(Boolean.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, byte value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.b(Byte.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, char value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.c(String.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, double value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.b(Double.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw z.c(Double.valueOf(value), tag, s0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, to0.f enumDescriptor, int ordinal) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(enumDescriptor, "enumDescriptor");
        w0(tag, wo0.j.c(enumDescriptor.f(ordinal)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void O(String tag, float value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.b(Float.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw z.c(Float.valueOf(value), tag, s0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public uo0.f P(String tag, to0.f inlineDescriptor) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(inlineDescriptor, "inlineDescriptor");
        if (s0.b(inlineDescriptor)) {
            return v0(tag);
        }
        return s0.a(inlineDescriptor) ? u0(tag, inlineDescriptor) : super.P(tag, inlineDescriptor);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, int value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.b(Integer.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, long value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.b(Long.valueOf(value)));
    }

    protected void p0(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void S(String tag, short value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        w0(tag, wo0.j.b(Short.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.d2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void T(String tag, String value) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(value, "value");
        w0(tag, wo0.j.c(value));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vo0.d2, uo0.f
    public <T> void s(ro0.q<? super T> serializer, T value) {
        String strC;
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        if (W() == null && z0.c(b1.a(serializer.getDescriptor(), getSerializersModule()))) {
            new e0(this.json, this.nodeConsumer).s(serializer, value);
            return;
        }
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

    public abstract JsonElement s0();

    protected final wn0.l<JsonElement, jn0.h0> t0() {
        return this.nodeConsumer;
    }

    @Override // uo0.f
    public void w() {
        String strW = W();
        if (strW == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            p0(strW);
        }
    }

    public abstract void w0(String key, JsonElement element);

    /* JADX WARN: Multi-variable type inference failed */
    private e(wo0.b bVar, wn0.l<? super JsonElement, jn0.h0> lVar) {
        this.json = bVar;
        this.nodeConsumer = lVar;
        this.configuration = bVar.getConfiguration();
    }

    @Override // uo0.f
    public void C() {
    }
}
