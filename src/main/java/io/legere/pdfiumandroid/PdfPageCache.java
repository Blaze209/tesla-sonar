package io.legere.pdfiumandroid;

import io.legere.pdfiumandroid.util.PdfPageCacheBase;
import java.lang.AutoCloseable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/legere/pdfiumandroid/PdfPageCache;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "H", "Lio/legere/pdfiumandroid/util/PdfPageCacheBase;", "Lio/legere/pdfiumandroid/PdfDocument;", "pdfDocument", "Lkotlin/Function2;", "Lio/legere/pdfiumandroid/PdfPage;", "Lio/legere/pdfiumandroid/PdfTextPage;", "pageHolderFactory", "<init>", "(Lio/legere/pdfiumandroid/PdfDocument;Lwn0/p;)V", "", "pageIndex", "openPageAndText", "(I)Ljava/lang/AutoCloseable;", "Lio/legere/pdfiumandroid/PdfDocument;", "Lwn0/p;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfPageCache<H extends AutoCloseable> extends PdfPageCacheBase<H> {
    private final p<PdfPage, PdfTextPage, H> pageHolderFactory;
    private final PdfDocument pdfDocument;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdfPageCache(PdfDocument pdfDocument, p<? super PdfPage, ? super PdfTextPage, ? extends H> pageHolderFactory) {
        super(0L, 1, null);
        s.k(pdfDocument, "pdfDocument");
        s.k(pageHolderFactory, "pageHolderFactory");
        this.pdfDocument = pdfDocument;
        this.pageHolderFactory = pageHolderFactory;
    }

    @Override // io.legere.pdfiumandroid.util.PdfPageCacheBase
    protected H openPageAndText(int pageIndex) {
        PdfPage pdfPageOpenPage = this.pdfDocument.openPage(pageIndex);
        return this.pageHolderFactory.invoke(pdfPageOpenPage, pdfPageOpenPage.openTextPage());
    }
}
