package c40;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lcom/stripe/android/customersheet/b$c;", "Lc40/j;", "b", "(Lcom/stripe/android/customersheet/b$c;)Lc40/j;", "Ljn0/s;", "c", "(Ljava/lang/Object;)Lc40/j;", "Lc40/j$c;", "a", "(Lc40/j;)Lc40/j$c;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k {
    public static final <T> j.Failure<T> a(j<T> jVar) {
        s.k(jVar, "<this>");
        if (jVar instanceof j.Failure) {
            return (j.Failure) jVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> j<T> b(com.stripe.android.customersheet.b.c<T> cVar) {
        s.k(cVar, "<this>");
        if (cVar instanceof com.stripe.android.customersheet.b.c.C0805c) {
            return j.INSTANCE.b(((com.stripe.android.customersheet.b.c.C0805c) cVar).a());
        }
        if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0804b)) {
            throw new NoWhenBranchMatchedException();
        }
        com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar;
        return j.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
    }

    public static final <T> j<T> c(Object obj) {
        Throwable thE = jn0.s.e(obj);
        return thE == null ? j.INSTANCE.b(obj) : j.INSTANCE.a(thE, null);
    }
}
