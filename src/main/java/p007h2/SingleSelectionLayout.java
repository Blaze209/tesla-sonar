package p007h2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: renamed from: h2.f0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010&\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0014\u0010)\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010(R\u0014\u0010,\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010+R\u0014\u00101\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010+¨\u00062"}, d2 = {"Lh2/f0;", "Lh2/y;", "", "isStartHandle", "", "startSlot", "endSlot", "Lh2/m;", "previousSelection", "Lh2/l;", "info", "<init>", "(ZIILh2/m;Lh2/l;)V", "Lkotlin/Function1;", "Ljn0/h0;", "block", "k", "(Lwn0/l;)V", "other", "c", "(Lh2/y;)Z", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "I", "h", "()I", "j", DateTokenConverter.CONVERTER_KEY, "Lh2/m;", "e", "()Lh2/m;", "Lh2/l;", "getSize", "size", "Lh2/e;", "()Lh2/e;", "crossStatus", "g", "()Lh2/l;", "startInfo", "f", "endInfo", "currentInfo", IntegerTokenConverter.CONVERTER_KEY, "firstInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SingleSelectionLayout implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startSlot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endSlot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Selection previousSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final l info;

    public SingleSelectionLayout(boolean z11, int i11, int i12, Selection selection, l lVar) {
        this.isStartHandle = z11;
        this.startSlot = i11;
        this.endSlot = i12;
        this.previousSelection = selection;
        this.info = lVar;
    }

    @Override // p007h2.y
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // p007h2.y
    /* JADX INFO: renamed from: b, reason: from getter */
    public l getInfo() {
        return this.info;
    }

    @Override // p007h2.y
    public boolean c(y other) {
        if (getPreviousSelection() == null || other == null || !(other instanceof SingleSelectionLayout)) {
            return true;
        }
        SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) other;
        return (getStartSlot() == singleSelectionLayout.getStartSlot() && getEndSlot() == singleSelectionLayout.getEndSlot() && getIsStartHandle() == singleSelectionLayout.getIsStartHandle() && !this.info.m(singleSelectionLayout.info)) ? false : true;
    }

    @Override // p007h2.y
    public e d() {
        if (getStartSlot() < getEndSlot()) {
            return e.NOT_CROSSED;
        }
        return getStartSlot() > getEndSlot() ? e.CROSSED : this.info.d();
    }

    @Override // p007h2.y
    /* JADX INFO: renamed from: e, reason: from getter */
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // p007h2.y
    public l f() {
        return this.info;
    }

    @Override // p007h2.y
    public l g() {
        return this.info;
    }

    @Override // p007h2.y
    public int getSize() {
        return 1;
    }

    @Override // p007h2.y
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // p007h2.y
    public l i() {
        return this.info;
    }

    @Override // p007h2.y
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getEndSlot() {
        return this.endSlot;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + getIsStartHandle() + ", crossed=" + d() + ", info=\n\t" + this.info + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p007h2.y
    public void k(l<? super l, h0> block) {
    }
}
