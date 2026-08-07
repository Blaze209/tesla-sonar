package g4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lg4/c;", "", "", "rowIndex", "rowSpan", "columnIndex", "columnSpan", "<init>", "(IIII)V", "a", "I", "c", "()I", "b", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int rowIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int rowSpan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int columnIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int columnSpan;

    public c(int i11, int i12, int i13, int i14) {
        this.rowIndex = i11;
        this.rowSpan = i12;
        this.columnIndex = i13;
        this.columnSpan = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColumnIndex() {
        return this.columnIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getColumnSpan() {
        return this.columnSpan;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRowIndex() {
        return this.rowIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRowSpan() {
        return this.rowSpan;
    }
}
