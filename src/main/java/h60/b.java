package h60;

import h70.h;
import java.util.Locale;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import qj0.e;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.a<String>> f70966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.a<String>> f70967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<g> f70968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<m80.a> f70969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f70970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<Locale> f70971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<h> f70972g;

    public b(Provider<wn0.a<String>> provider, Provider<wn0.a<String>> provider2, Provider<g> provider3, Provider<m80.a> provider4, Provider<CoroutineContext> provider5, Provider<Locale> provider6, Provider<h> provider7) {
        this.f70966a = provider;
        this.f70967b = provider2;
        this.f70968c = provider3;
        this.f70969d = provider4;
        this.f70970e = provider5;
        this.f70971f = provider6;
        this.f70972g = provider7;
    }

    public static b a(Provider<wn0.a<String>> provider, Provider<wn0.a<String>> provider2, Provider<g> provider3, Provider<m80.a> provider4, Provider<CoroutineContext> provider5, Provider<Locale> provider6, Provider<h> provider7) {
        return new b(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static a c(wn0.a<String> aVar, wn0.a<String> aVar2, g gVar, m80.a aVar3, CoroutineContext coroutineContext, Locale locale, h hVar) {
        return new a(aVar, aVar2, gVar, aVar3, coroutineContext, locale, hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f70966a.get(), this.f70967b.get(), this.f70968c.get(), this.f70969d.get(), this.f70970e.get(), this.f70971f.get(), this.f70972g.get());
    }
}
