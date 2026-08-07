package rm0;

import io.reactivex.rxjava3.core.s;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public enum i {
    COMPLETE;

    static final class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final am0.b f108626a;

        a(am0.b bVar) {
            this.f108626a = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f108626a + "]";
        }
    }

    static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f108627a;

        b(Throwable th2) {
            this.f108627a = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f108627a, ((b) obj).f108627a);
            }
            return false;
        }

        public int hashCode() {
            return this.f108627a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f108627a + "]";
        }
    }

    static final class c implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.c f108628a;

        c(nr0.c cVar) {
            this.f108628a = cVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f108628a + "]";
        }
    }

    public static <T> boolean accept(Object obj, nr0.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            bVar.onError(((b) obj).f108627a);
            return true;
        }
        bVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, nr0.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            bVar.onError(((b) obj).f108627a);
            return true;
        }
        if (obj instanceof c) {
            bVar.onSubscribe(((c) obj).f108628a);
            return false;
        }
        bVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(am0.b bVar) {
        return new a(bVar);
    }

    public static Object error(Throwable th2) {
        return new b(th2);
    }

    public static am0.b getDisposable(Object obj) {
        return ((a) obj).f108626a;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f108627a;
    }

    public static nr0.c getSubscription(Object obj) {
        return ((c) obj).f108628a;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static Object subscription(nr0.c cVar) {
        return new c(cVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, s<? super T> sVar) {
        if (obj == COMPLETE) {
            sVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            sVar.onError(((b) obj).f108627a);
            return true;
        }
        sVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, s<? super T> sVar) {
        if (obj == COMPLETE) {
            sVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            sVar.onError(((b) obj).f108627a);
            return true;
        }
        if (obj instanceof a) {
            sVar.onSubscribe(((a) obj).f108626a);
            return false;
        }
        sVar.onNext(obj);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t11) {
        return t11;
    }
}
