package h70;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import w30.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: h70.a$a, reason: collision with other inner class name */
    private static final class C1486a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f70974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<String> f70975b;

        @Override // h70.c.a
        public c build() {
            qj0.h.a(this.f70974a, Context.class);
            qj0.h.a(this.f70975b, Set.class);
            return new b(this.f70974a, this.f70975b);
        }

        @Override // h70.c.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1486a a(Context context) {
            this.f70974a = (Context) qj0.h.b(context);
            return this;
        }

        @Override // h70.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1486a b(Set<String> set) {
            this.f70975b = (Set) qj0.h.b(set);
            return this;
        }

        private C1486a() {
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f70976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<String> f70977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f70978c;

        private o b() {
            return new o(f.a(), e.a());
        }

        private wn0.a<String> c() {
            return g.a(this.f70976a);
        }

        private PaymentAnalyticsRequestFactory d() {
            return new PaymentAnalyticsRequestFactory(this.f70976a, c(), this.f70977b);
        }

        private i e() {
            return new i(b(), d());
        }

        @Override // h70.c
        public h a() {
            return e();
        }

        private b(Context context, Set<String> set) {
            this.f70978c = this;
            this.f70976a = context;
            this.f70977b = set;
        }
    }

    public static c.a a() {
        return new C1486a();
    }
}
