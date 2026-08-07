package io.legere.pdfiumandroid;

import android.graphics.RectF;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/legere/pdfiumandroid/WordRangeRect;", "", "rangeStart", "", "rangeLength", "rect", "Landroid/graphics/RectF;", "<init>", "(IILandroid/graphics/RectF;)V", "getRangeStart", "()I", "getRangeLength", "getRect", "()Landroid/graphics/RectF;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WordRangeRect {
    private final int rangeLength;
    private final int rangeStart;
    private final RectF rect;

    public WordRangeRect(int i11, int i12, RectF rect) {
        s.k(rect, "rect");
        this.rangeStart = i11;
        this.rangeLength = i12;
        this.rect = rect;
    }

    public static /* synthetic */ WordRangeRect copy$default(WordRangeRect wordRangeRect, int i11, int i12, RectF rectF, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = wordRangeRect.rangeStart;
        }
        if ((i13 & 2) != 0) {
            i12 = wordRangeRect.rangeLength;
        }
        if ((i13 & 4) != 0) {
            rectF = wordRangeRect.rect;
        }
        return wordRangeRect.copy(i11, i12, rectF);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRangeStart() {
        return this.rangeStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRangeLength() {
        return this.rangeLength;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RectF getRect() {
        return this.rect;
    }

    public final WordRangeRect copy(int rangeStart, int rangeLength, RectF rect) {
        s.k(rect, "rect");
        return new WordRangeRect(rangeStart, rangeLength, rect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WordRangeRect)) {
            return false;
        }
        WordRangeRect wordRangeRect = (WordRangeRect) other;
        return this.rangeStart == wordRangeRect.rangeStart && this.rangeLength == wordRangeRect.rangeLength && s.f(this.rect, wordRangeRect.rect);
    }

    public final int getRangeLength() {
        return this.rangeLength;
    }

    public final int getRangeStart() {
        return this.rangeStart;
    }

    public final RectF getRect() {
        return this.rect;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.rangeStart) * 31) + Integer.hashCode(this.rangeLength)) * 31) + this.rect.hashCode();
    }

    public String toString() {
        return "WordRangeRect(rangeStart=" + this.rangeStart + ", rangeLength=" + this.rangeLength + ", rect=" + this.rect + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
