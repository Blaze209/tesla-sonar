package io.legere.pdfiumandroid.util;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.d;
import com.google.common.cache.f;
import com.google.common.cache.o;
import com.google.common.cache.p;
import java.lang.AutoCloseable;
import ou.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH$¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/legere/pdfiumandroid/util/PdfPageCacheBase;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "H", "", "maxSize", "<init>", "(J)V", "", "pageIndex", "openPageAndText", "(I)Ljava/lang/AutoCloseable;", "get", "Ljn0/h0;", "close", "()V", "Lcom/google/common/cache/o;", "removalListener", "Lcom/google/common/cache/o;", "Lcom/google/common/cache/f;", "pageCache", "Lcom/google/common/cache/f;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PdfPageCacheBase<H extends AutoCloseable> implements AutoCloseable {
    private final f<Integer, H> pageCache;
    private final o<Integer, H> removalListener;

    public PdfPageCacheBase() {
        this(0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AutoCloseable pageCache$lambda$0(PdfPageCacheBase pdfPageCacheBase, Integer pageIndex) {
        s.k(pageIndex, "pageIndex");
        return pdfPageCacheBase.openPageAndText(pageIndex.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removalListener$lambda$0(p it) throws Exception {
        s.k(it, "it");
        AutoCloseable autoCloseable = (AutoCloseable) it.getValue();
        if (autoCloseable != null) {
            z6.b.a(autoCloseable);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.pageCache.b();
    }

    public final H get(int pageIndex) {
        H h11 = this.pageCache.get(Integer.valueOf(pageIndex));
        s.j(h11, "get(...)");
        return h11;
    }

    protected abstract H openPageAndText(int pageIndex);

    public PdfPageCacheBase(long j11) {
        o<Integer, H> oVar = new o() { // from class: io.legere.pdfiumandroid.util.a
            @Override // com.google.common.cache.o
            public final void onRemoval(p pVar) throws Exception {
                PdfPageCacheBase.removalListener$lambda$0(pVar);
            }
        };
        this.removalListener = oVar;
        f<Integer, H> fVarB = d.t().s(j11).u(oVar).b(CacheLoader.a(new h() { // from class: io.legere.pdfiumandroid.util.b
            @Override // ou.h
            public final Object apply(Object obj) {
                return PdfPageCacheBase.pageCache$lambda$0(this.f78861a, (Integer) obj);
            }
        }));
        s.j(fVarB, "build(...)");
        this.pageCache = fVarB;
    }

    public /* synthetic */ PdfPageCacheBase(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 64L : j11);
    }
}
