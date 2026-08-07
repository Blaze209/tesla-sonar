package k70;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements qj0.e<i70.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f85298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Context> f85299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Boolean> f85300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<CoroutineContext> f85301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f85302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<Map<String, String>> f85303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f85304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<wn0.a<String>> f85305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<Set<String>> f85306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<Boolean> f85307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<Boolean> f85308k;

    public o(l lVar, Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3, Provider<CoroutineContext> provider4, Provider<Map<String, String>> provider5, Provider<PaymentAnalyticsRequestFactory> provider6, Provider<wn0.a<String>> provider7, Provider<Set<String>> provider8, Provider<Boolean> provider9, Provider<Boolean> provider10) {
        this.f85298a = lVar;
        this.f85299b = provider;
        this.f85300c = provider2;
        this.f85301d = provider3;
        this.f85302e = provider4;
        this.f85303f = provider5;
        this.f85304g = provider6;
        this.f85305h = provider7;
        this.f85306i = provider8;
        this.f85307j = provider9;
        this.f85308k = provider10;
    }

    public static o a(l lVar, Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3, Provider<CoroutineContext> provider4, Provider<Map<String, String>> provider5, Provider<PaymentAnalyticsRequestFactory> provider6, Provider<wn0.a<String>> provider7, Provider<Set<String>> provider8, Provider<Boolean> provider9, Provider<Boolean> provider10) {
        return new o(lVar, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static i70.h c(l lVar, Context context, boolean z11, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, wn0.a<String> aVar, Set<String> set, boolean z12, boolean z13) {
        return (i70.h) qj0.h.d(lVar.c(context, z11, coroutineContext, coroutineContext2, map, paymentAnalyticsRequestFactory, aVar, set, z12, z13));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i70.h get() {
        return c(this.f85298a, this.f85299b.get(), this.f85300c.get().booleanValue(), this.f85301d.get(), this.f85302e.get(), this.f85303f.get(), this.f85304g.get(), this.f85305h.get(), this.f85306i.get(), this.f85307j.get().booleanValue(), this.f85308k.get().booleanValue());
    }
}
