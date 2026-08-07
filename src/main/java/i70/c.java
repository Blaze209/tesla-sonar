package i70;

import android.content.Context;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<d> f76088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<l> f76089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Map<Class<? extends StripeIntent.a>, f<StripeIntent>>> f76090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Boolean> f76091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Context> f76092e;

    public c(Provider<d> provider, Provider<l> provider2, Provider<Map<Class<? extends StripeIntent.a>, f<StripeIntent>>> provider3, Provider<Boolean> provider4, Provider<Context> provider5) {
        this.f76088a = provider;
        this.f76089b = provider2;
        this.f76090c = provider3;
        this.f76091d = provider4;
        this.f76092e = provider5;
    }

    public static c a(Provider<d> provider, Provider<l> provider2, Provider<Map<Class<? extends StripeIntent.a>, f<StripeIntent>>> provider3, Provider<Boolean> provider4, Provider<Context> provider5) {
        return new c(provider, provider2, provider3, provider4, provider5);
    }

    public static a c(d dVar, l lVar, Map<Class<? extends StripeIntent.a>, f<StripeIntent>> map, boolean z11, Context context) {
        return new a(dVar, lVar, map, z11, context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f76088a.get(), this.f76089b.get(), this.f76090c.get(), this.f76091d.get().booleanValue(), this.f76092e.get());
    }
}
