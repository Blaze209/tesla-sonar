package p007h2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import p013kotlin.Metadata;
import t4.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010)R\u0011\u0010,\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u0011\u00101\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b!\u00100¨\u00062"}, d2 = {"Lh2/l;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Li4/m0;", "textLayoutResult", "<init>", "(JIIIILi4/m0;)V", "other", "", "m", "(Lh2/l;)Z", "offset", "Lh2/m$a;", "a", "(I)Lh2/m$a;", "", "toString", "()Ljava/lang/String;", "J", "h", "()J", "b", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "c", "g", DateTokenConverter.CONVERTER_KEY, "e", "f", "Li4/m0;", "k", "()Li4/m0;", "Lt4/i;", "j", "()Lt4/i;", "startRunDirection", "endRunDirection", "inputText", "l", "textLength", "Lh2/e;", "()Lh2/e;", "rawCrossStatus", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f70332g = TextLayoutResult.f75762g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int slot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int rawStartHandleOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int rawEndHandleOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int rawPreviousHandleOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    public l(long j11, int i11, int i12, int i13, int i14, TextLayoutResult textLayoutResult) {
        this.selectableId = j11;
        this.slot = i11;
        this.rawStartHandleOffset = i12;
        this.rawEndHandleOffset = i13;
        this.rawPreviousHandleOffset = i14;
        this.textLayoutResult = textLayoutResult;
    }

    private final i b() {
        return z.b(this.textLayoutResult, this.rawEndHandleOffset);
    }

    private final i j() {
        return z.b(this.textLayoutResult, this.rawStartHandleOffset);
    }

    public final Selection.AnchorInfo a(int offset) {
        return new Selection.AnchorInfo(z.b(this.textLayoutResult, offset), offset, this.selectableId);
    }

    public final String c() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final e d() {
        int i11 = this.rawStartHandleOffset;
        int i12 = this.rawEndHandleOffset;
        if (i11 < i12) {
            return e.NOT_CROSSED;
        }
        return i11 > i12 ? e.CROSSED : e.COLLAPSED;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSelectableId() {
        return this.selectableId;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSlot() {
        return this.slot;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(l other) {
        return (this.selectableId == other.selectableId && this.rawStartHandleOffset == other.rawStartHandleOffset && this.rawEndHandleOffset == other.rawEndHandleOffset) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + CoreConstants.DASH_CHAR + j() + CoreConstants.COMMA_CHAR + this.rawEndHandleOffset + CoreConstants.DASH_CHAR + b() + "), prevOffset=" + this.rawPreviousHandleOffset + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
