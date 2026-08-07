package c40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0006\u0007J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lc40/j;", "T", "", "Ljn0/s;", "a", "()Ljava/lang/Object;", "c", DateTokenConverter.CONVERTER_KEY, "Lc40/j$c;", "Lc40/j$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f18701a;

    /* JADX INFO: renamed from: c40.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0001\u0010\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc40/j$a;", "", "<init>", "()V", "T", "value", "Lc40/j$d;", "b", "(Ljava/lang/Object;)Lc40/j$d;", "", "cause", "", "displayMessage", "Lc40/j$c;", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Lc40/j$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18701a = new Companion();

        private Companion() {
        }

        public final <T> Failure<T> a(Throwable cause, String displayMessage) {
            s.k(cause, "cause");
            return new Failure<>(cause, displayMessage);
        }

        public final <T> Success<T> b(T value) {
            return new Success<>(value);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public static <T> Object a(j<T> jVar) {
            if (jVar instanceof Success) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(((Success) jVar).b());
            }
            if (!(jVar instanceof Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(((Failure) jVar).getCause()));
        }
    }

    /* JADX INFO: renamed from: c40.j$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lc40/j$c;", "T", "Lc40/j;", "", "cause", "", "displayMessage", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "c", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure<T> implements j<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayMessage;

        public Failure(Throwable cause, String str) {
            s.k(cause, "cause");
            this.cause = cause;
            this.displayMessage = str;
        }

        @Override // c40.j
        public Object a() {
            return b.a(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDisplayMessage() {
            return this.displayMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return s.f(this.cause, failure.cause) && s.f(this.displayMessage, failure.displayMessage);
        }

        public int hashCode() {
            int iHashCode = this.cause.hashCode() * 31;
            String str = this.displayMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Failure(cause=" + this.cause + ", displayMessage=" + this.displayMessage + ")";
        }
    }

    /* JADX INFO: renamed from: c40.j$d, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc40/j$d;", "T", "Lc40/j;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<T> implements j<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final T value;

        public Success(T t11) {
            this.value = t11;
        }

        @Override // c40.j
        public Object a() {
            return b.a(this);
        }

        public final T b() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && s.f(this.value, ((Success) other).value);
        }

        public int hashCode() {
            T t11 = this.value;
            if (t11 == null) {
                return 0;
            }
            return t11.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ")";
        }
    }

    Object a();
}
