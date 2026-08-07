package n30;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln30/d;", "", "<init>", "()V", "", "customerSessionClientSecret", "Ln30/d$a;", "a", "(Ljava/lang/String;)Ln30/d$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f92877a = new d();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Ln30/d$a;", "", "a", "Ln30/a;", "Ln30/b;", "Ln30/c;", "Ln30/d$a$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: n30.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln30/d$a$a;", "Ln30/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class C1983a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1983a f92878a = new C1983a();

            private C1983a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1983a);
            }

            public int hashCode() {
                return -1106243723;
            }

            public String toString() {
                return "Valid";
            }
        }
    }

    private d() {
    }

    public final a a(String customerSessionClientSecret) {
        s.k(customerSessionClientSecret, "customerSessionClientSecret");
        if (t.y0(customerSessionClientSecret)) {
            return n30.a.f92874a;
        }
        if (t.b0(customerSessionClientSecret, "ek_", false, 2, null)) {
            return b.f92875a;
        }
        return !t.b0(customerSessionClientSecret, "cuss_", false, 2, null) ? c.f92876a : a.C1983a.f92878a;
    }
}
