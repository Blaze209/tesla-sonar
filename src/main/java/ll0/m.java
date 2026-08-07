package ll0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001d\u0010\t\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b*\n\u0010\u000b\"\u00020\n2\u00020\n¨\u0006\f"}, d2 = {"", "other", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Ljava/lang/reflect/Method;", "Lkotlin/Lazy;", "b", "()Ljava/lang/reflect/Method;", "AddSuppressedMethod", "Ljava/io/Closeable;", "Closeable", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f90241a = jn0.m.b(a.f90242c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Method> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f90242c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static final void a(Throwable th2, Throwable other) throws IllegalAccessException, InvocationTargetException {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        Method methodB = b();
        if (methodB != null) {
            methodB.invoke(th2, other);
        }
    }

    private static final Method b() {
        return (Method) f90241a.getValue();
    }
}
