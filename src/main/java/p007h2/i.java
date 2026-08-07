package p007h2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextLayoutResult;
import p013kotlin.Metadata;
import w4.r;
import wn0.a;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u00020\u000b*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, d2 = {"Lh2/i;", "Lh2/k;", "", "selectableId", "Lkotlin/Function0;", "Lz3/v;", "coordinatesCallback", "Li4/m0;", "layoutResultCallback", "<init>", "(JLwn0/a;Lwn0/a;)V", "", "a", "()I", "J", "getSelectableId", "()J", "b", "Lwn0/a;", "c", DateTokenConverter.CONVERTER_KEY, "Li4/m0;", "_previousTextLayoutResult", "e", "I", "_previousLastVisibleOffset", "(Li4/m0;)I", "lastVisibleOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<v> coordinatesCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a<TextLayoutResult> layoutResultCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult _previousTextLayoutResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int _previousLastVisibleOffset = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public i(long j11, a<? extends v> aVar, a<TextLayoutResult> aVar2) {
        this.selectableId = j11;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
    }

    private final synchronized int b(TextLayoutResult textLayoutResult) {
        int iN;
        try {
            if (this._previousTextLayoutResult != textLayoutResult) {
                if (!textLayoutResult.f() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    iN = textLayoutResult.n() - 1;
                } else {
                    int iJ = n.j(textLayoutResult.r(r.f(textLayoutResult.getSize())), textLayoutResult.n() - 1);
                    while (iJ >= 0 && textLayoutResult.v(iJ) >= r.f(textLayoutResult.getSize())) {
                        iJ--;
                    }
                    iN = n.f(iJ, 0);
                }
                this._previousLastVisibleOffset = textLayoutResult.o(iN, true);
                this._previousTextLayoutResult = textLayoutResult;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // p007h2.k
    public int a() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return 0;
        }
        return b(textLayoutResultInvoke);
    }
}
