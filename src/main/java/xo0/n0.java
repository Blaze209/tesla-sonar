package xo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wo0.JsonConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lxo0/n0;", "", "Lwo0/f;", "configuration", "Lxo0/a;", "lexer", "<init>", "(Lwo0/f;Lxo0/a;)V", "Lkotlinx/serialization/json/JsonElement;", IntegerTokenConverter.CONVERTER_KEY, "()Lkotlinx/serialization/json/JsonElement;", "Ljn0/c;", "Ljn0/h0;", "h", "(Ljn0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "j", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", "g", "e", "a", "Lxo0/a;", "b", "Z", "isLenient", "c", "trailingCommaAllowed", "", DateTokenConverter.CONVERTER_KEY, "I", "stackDepth", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JsonReader lexer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isLenient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean trailingCommaAllowed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int stackDepth;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljn0/c;", "Ljn0/h0;", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends RestrictedSuspendLambda implements wn0.q<jn0.c<jn0.h0, JsonElement>, jn0.h0, Continuation<? super JsonElement>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123868n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f123869o;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(jn0.c<jn0.h0, JsonElement> cVar, jn0.h0 h0Var, Continuation<? super JsonElement> continuation) {
            a aVar = n0.this.new a(continuation);
            aVar.f123869o = cVar;
            return aVar.invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f123868n;
            if (i11 == 0) {
                jn0.t.b(obj);
                jn0.c cVar = (jn0.c) this.f123869o;
                byte bF = n0.this.lexer.F();
                if (bF == 1) {
                    return n0.this.j(true);
                }
                if (bF == 0) {
                    return n0.this.j(false);
                }
                if (bF != 6) {
                    if (bF == 8) {
                        return n0.this.f();
                    }
                    JsonReader.x(n0.this.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                n0 n0Var = n0.this;
                this.f123868n = 1;
                obj = n0Var.h(cVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return (JsonElement) obj;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0}, l = {24}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f123871n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f123872o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f123873p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f123874q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f123875r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f123877t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f123875r = obj;
            this.f123877t |= Integer.MIN_VALUE;
            return n0.this.h(null, this);
        }
    }

    public n0(JsonConfiguration configuration, JsonReader lexer) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.getIsLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement f() {
        byte bJ = this.lexer.j();
        if (this.lexer.F() == 4) {
            JsonReader.x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.e()) {
            arrayList.add(e());
            bJ = this.lexer.j();
            if (bJ != 4) {
                JsonReader jsonReader = this.lexer;
                boolean z11 = bJ == 9;
                int i11 = jsonReader.currentPosition;
                if (!z11) {
                    JsonReader.x(jsonReader, "Expected end of the array or comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bJ == 8) {
            this.lexer.k((byte) 9);
        } else if (bJ == 4) {
            if (!this.trailingCommaAllowed) {
                z.h(this.lexer, "array");
                throw new KotlinNothingValueException();
            }
            this.lexer.k((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement g() {
        return (JsonElement) jn0.b.b(new jn0.a(new a(null)), jn0.h0.f84049a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(jn0.c<jn0.h0, kotlinx.serialization.json.JsonElement> r20, p013kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r21) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xo0.n0.h(jn0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final JsonElement i() {
        byte bK = this.lexer.k((byte) 6);
        if (this.lexer.F() == 4) {
            JsonReader.x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.lexer.e()) {
            String strQ = this.isLenient ? this.lexer.q() : this.lexer.o();
            this.lexer.k((byte) 5);
            linkedHashMap.put(strQ, e());
            bK = this.lexer.j();
            if (bK != 4) {
                if (bK == 7) {
                    break;
                }
                JsonReader.x(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        if (bK == 6) {
            this.lexer.k((byte) 7);
        } else if (bK == 4) {
            if (!this.trailingCommaAllowed) {
                z.i(this.lexer, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.lexer.k((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive j(boolean isString) {
        String strQ = (this.isLenient || !isString) ? this.lexer.q() : this.lexer.o();
        return (isString || !p013kotlin.jvm.internal.s.f(strQ, Address.ADDRESS_NULL_PLACEHOLDER)) ? new wo0.v(strQ, isString, null, 4, null) : JsonNull.INSTANCE;
    }

    public final JsonElement e() {
        byte bF = this.lexer.F();
        if (bF == 1) {
            return j(true);
        }
        if (bF == 0) {
            return j(false);
        }
        if (bF == 6) {
            int i11 = this.stackDepth + 1;
            this.stackDepth = i11;
            JsonElement jsonElementG = i11 == 200 ? g() : i();
            this.stackDepth--;
            return jsonElementG;
        }
        if (bF == 8) {
            return f();
        }
        JsonReader.x(this.lexer, "Cannot read Json element because of unexpected " + xo0.b.c(bF), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
