package p013kotlin.jvm.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import co0.f;
import co0.q;
import co0.s;
import co0.t;
import java.lang.annotation.Annotation;
import java.util.List;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import vn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001aR\u001c\u00101\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u00105¨\u00067"}, d2 = {"Lkotlin/jvm/internal/x0;", "Lco0/q;", "Lco0/f;", "classifier", "", "Lco0/s;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lco0/f;Ljava/util/List;Lco0/q;I)V", "", "isMarkedNullable", "(Lco0/f;Ljava/util/List;Z)V", "convertPrimitiveToWrapper", "", "g", "(Z)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Lco0/s;)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lco0/f;", "getClassifier", "()Lco0/f;", "b", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "c", "Lco0/q;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lco0/q;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "Ljava/lang/Class;", "k", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "", "getAnnotations", "annotations", "()Z", "e", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f classifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<s> arguments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q platformTypeUpperBound;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86545a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86545a = iArr;
        }
    }

    public x0(f classifier, List<s> arguments, q qVar, int i11) {
        s.k(classifier, "classifier");
        s.k(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = qVar;
        this.flags = i11;
    }

    private final String d(s sVar) {
        String strValueOf;
        if (sVar.d() == null) {
            return Marker.ANY_MARKER;
        }
        q qVarC = sVar.c();
        x0 x0Var = qVarC instanceof x0 ? (x0) qVarC : null;
        if (x0Var == null || (strValueOf = x0Var.g(true)) == null) {
            strValueOf = String.valueOf(sVar.c());
        }
        t tVarD = sVar.d();
        int i11 = tVarD == null ? -1 : b.f86545a[tVarD.ordinal()];
        if (i11 == 1) {
            return strValueOf;
        }
        if (i11 == 2) {
            return "in " + strValueOf;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    private final String g(boolean convertPrimitiveToWrapper) {
        String name;
        f classifier = getClassifier();
        d dVar = classifier instanceof d ? (d) classifier : null;
        Class<?> clsB = dVar != null ? a.b(dVar) : null;
        if (clsB == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = k(clsB);
        } else if (convertPrimitiveToWrapper && clsB.isPrimitive()) {
            f classifier2 = getClassifier();
            s.i(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = a.c((d) classifier2).getName();
        } else {
            name = clsB.getName();
        }
        String str = name + (getArguments().isEmpty() ? "" : v.y0(getArguments(), ", ", "<", ">", 0, null, new l() { // from class: kotlin.jvm.internal.w0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x0.i(this.f86539a, (s) obj);
            }
        }, 24, null)) + (getIsMarkedNullable() ? CallerData.NA : "");
        q qVar = this.platformTypeUpperBound;
        if (!(qVar instanceof x0)) {
            return str;
        }
        String strG = ((x0) qVar).g(true);
        if (s.f(strG, str)) {
            return str;
        }
        if (s.f(strG, str + '?')) {
            return str + '!';
        }
        return CoreConstants.LEFT_PARENTHESIS_CHAR + str + CallerDataConverter.DEFAULT_RANGE_DELIMITER + strG + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(x0 x0Var, s it) {
        s.k(it, "it");
        return x0Var.d(it);
    }

    private final String k(Class<?> cls) {
        if (s.f(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (s.f(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (s.f(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (s.f(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (s.f(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (s.f(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (s.f(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return s.f(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean equals(Object other) {
        if (!(other instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) other;
        return s.f(getClassifier(), x0Var.getClassifier()) && s.f(getArguments(), x0Var.getArguments()) && s.f(this.platformTypeUpperBound, x0Var.platformTypeUpperBound) && this.flags == x0Var.flags;
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        return v.m();
    }

    @Override // co0.q
    public List<s> getArguments() {
        return this.arguments;
    }

    @Override // co0.q
    public f getClassifier() {
        return this.classifier;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    @Override // co0.q
    /* JADX INFO: renamed from: isMarkedNullable */
    public boolean getIsMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    public String toString() {
        return g(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(f classifier, List<s> arguments, boolean z11) {
        this(classifier, arguments, null, z11 ? 1 : 0);
        s.k(classifier, "classifier");
        s.k(arguments, "arguments");
    }
}
