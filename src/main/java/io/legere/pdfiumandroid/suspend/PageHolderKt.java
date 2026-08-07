package io.legere.pdfiumandroid.suspend;

import ch.qos.logback.core.CoreConstants;
import java.lang.AutoCloseable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\f\b\u0001\u0010\u0004*\u00060\u0001j\u0002`\u00022\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PageHolderKt;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "TPage", "TTextPage", "page", "textPage", "<init>", "(Ljava/lang/AutoCloseable;Ljava/lang/AutoCloseable;)V", "Ljn0/h0;", "close", "()V", "component1", "()Ljava/lang/AutoCloseable;", "component2", "copy", "(Ljava/lang/AutoCloseable;Ljava/lang/AutoCloseable;)Lio/legere/pdfiumandroid/suspend/PageHolderKt;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/AutoCloseable;", "getPage", "getTextPage", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PageHolderKt<TPage extends AutoCloseable, TTextPage extends AutoCloseable> implements AutoCloseable {
    private final TPage page;
    private final TTextPage textPage;

    public PageHolderKt(TPage page, TTextPage textPage) {
        s.k(page, "page");
        s.k(textPage, "textPage");
        this.page = page;
        this.textPage = textPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageHolderKt copy$default(PageHolderKt pageHolderKt, AutoCloseable autoCloseable, AutoCloseable autoCloseable2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            autoCloseable = pageHolderKt.page;
        }
        if ((i11 & 2) != 0) {
            autoCloseable2 = pageHolderKt.textPage;
        }
        return pageHolderKt.copy(autoCloseable, autoCloseable2);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        try {
            z6.b.a(this.textPage);
        } finally {
            z6.b.a(this.page);
        }
    }

    public final TPage component1() {
        return this.page;
    }

    public final TTextPage component2() {
        return this.textPage;
    }

    public final PageHolderKt<TPage, TTextPage> copy(TPage page, TTextPage textPage) {
        s.k(page, "page");
        s.k(textPage, "textPage");
        return new PageHolderKt<>(page, textPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageHolderKt)) {
            return false;
        }
        PageHolderKt pageHolderKt = (PageHolderKt) other;
        return s.f(this.page, pageHolderKt.page) && s.f(this.textPage, pageHolderKt.textPage);
    }

    public final TPage getPage() {
        return this.page;
    }

    public final TTextPage getTextPage() {
        return this.textPage;
    }

    public int hashCode() {
        return (this.page.hashCode() * 31) + this.textPage.hashCode();
    }

    public String toString() {
        return "PageHolderKt(page=" + this.page + ", textPage=" + this.textPage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
