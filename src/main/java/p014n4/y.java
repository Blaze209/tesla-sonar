package p014n4;

import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Ln4/p;", "Ln4/e1;", "typefaceRequest", "Ln4/m;", "asyncTypefaceCache", "Ln4/m0;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "b", "(Ljava/util/List;Ln4/e1;Ln4/m;Ln4/m0;Lwn0/l;)Lkotlin/Pair;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<List<p>, Object> b(List<? extends p> list, TypefaceRequest typefaceRequest, m mVar, m0 m0Var, l<? super TypefaceRequest, ? extends Object> lVar) {
        Object result;
        Object objB;
        Object result2;
        int size = list.size();
        List listS = null;
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = list.get(i11);
            int loadingStrategy = pVar.getLoadingStrategy();
            z.Companion companion = z.INSTANCE;
            if (z.e(loadingStrategy, companion.b())) {
                synchronized (mVar.cacheLock) {
                    try {
                        m.Key key = new m.Key(pVar, m0Var.getCacheKey());
                        m.a aVar = (m.a) mVar.resultCache.d(key);
                        if (aVar == null) {
                            aVar = (m.a) mVar.permanentCache.b(key);
                        }
                        if (aVar != null) {
                            result = aVar.getResult();
                        } else {
                            h0 h0Var = h0.f84049a;
                            try {
                                Object objB2 = m0Var.b(pVar);
                                m.f(mVar, pVar, m0Var, objB2, false, 8, null);
                                result = objB2;
                            } catch (Exception e11) {
                                throw new IllegalStateException("Unable to load font " + pVar, e11);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (result != null) {
                    return x.a(listS, d0.a(typefaceRequest.getFontSynthesis(), result, pVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
                throw new IllegalStateException("Unable to load font " + pVar);
            }
            if (z.e(loadingStrategy, companion.c())) {
                synchronized (mVar.cacheLock) {
                    try {
                        m.Key key2 = new m.Key(pVar, m0Var.getCacheKey());
                        m.a aVar2 = (m.a) mVar.resultCache.d(key2);
                        if (aVar2 == null) {
                            aVar2 = (m.a) mVar.permanentCache.b(key2);
                        }
                        if (aVar2 != null) {
                            result2 = aVar2.getResult();
                        } else {
                            h0 h0Var2 = h0.f84049a;
                            try {
                                s.Companion companion2 = s.INSTANCE;
                                objB = s.b(m0Var.b(pVar));
                            } catch (Throwable th3) {
                                s.Companion companion3 = s.INSTANCE;
                                objB = s.b(t.a(th3));
                            }
                            Object obj = s.g(objB) ? null : objB;
                            m.f(mVar, pVar, m0Var, obj, false, 8, null);
                            result2 = obj;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (result2 != null) {
                    return x.a(listS, d0.a(typefaceRequest.getFontSynthesis(), result2, pVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!z.e(loadingStrategy, companion.a())) {
                    throw new IllegalStateException("Unknown font type " + pVar);
                }
                m.a aVarD = mVar.d(pVar, m0Var);
                if (aVarD != null) {
                    if (!m.a.e(aVarD.getResult()) && aVarD.getResult() != null) {
                        return x.a(listS, d0.a(typefaceRequest.getFontSynthesis(), aVarD.getResult(), pVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                    }
                } else if (listS == null) {
                    listS = v.s(pVar);
                } else {
                    listS.add(pVar);
                }
            }
        }
        return x.a(listS, lVar.invoke(typefaceRequest));
    }
}
