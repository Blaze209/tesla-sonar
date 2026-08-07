package ie0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u0017*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\nB\u001f\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0018"}, d2 = {"Lie0/j0;", "T", "", "value", "", "exception", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "b", "()Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getValue", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "", "c", "Z", "getHasValue", "()Z", "hasValue", DateTokenConverter.CONVERTER_KEY, "isFailure", "e", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable exception;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean hasValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isFailure;

    /* JADX INFO: renamed from: ie0.j0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lie0/j0$a;", "", "<init>", "()V", "T", "value", "Lie0/j0;", "b", "(Ljava/lang/Object;)Lie0/j0;", "", "exception", "a", "(Ljava/lang/Throwable;)Lie0/j0;", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> j0<T> a(Throwable exception) {
            p013kotlin.jvm.internal.s.k(exception, "exception");
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new j0<>(defaultConstructorMarker, exception, defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> j0<T> b(T value) {
            return new j0<>(value, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    public /* synthetic */ j0(Object obj, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, th2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final T b() throws Throwable {
        T t11 = this.value;
        if (t11 != null) {
            return t11;
        }
        Throwable th2 = this.exception;
        p013kotlin.jvm.internal.s.h(th2);
        throw th2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsFailure() {
        return this.isFailure;
    }

    private j0(T t11, Throwable th2) {
        this.value = t11;
        this.exception = th2;
        boolean z11 = t11 != null;
        this.hasValue = z11;
        this.isFailure = (th2 == null && z11) ? false : true;
    }

    /* synthetic */ j0(Object obj, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? null : th2);
    }
}
