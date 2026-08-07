package e2;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$¨\u0006&"}, d2 = {"Le2/m0;", "Le2/l0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "Ljn0/h0;", "b", "()V", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", DateTokenConverter.CONVERTER_KEY, "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "a", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "c", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "e", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/Lazy;", "g", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/core/view/h0;", "Landroidx/core/view/h0;", "softwareKeyboardControllerCompat", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy imm = jn0.m.a(jn0.p.NONE, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.core.view.h0 softwareKeyboardControllerCompat;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "b", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = m0.this.view.getContext().getSystemService("input_method");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public m0(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new androidx.core.view.h0(view);
    }

    private final InputMethodManager g() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // e2.l0
    public void a(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        g().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // e2.l0
    public void b() {
        g().restartInput(this.view);
    }

    @Override // e2.l0
    public void c(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // e2.l0
    public void d(int token, ExtractedText extractedText) {
        g().updateExtractedText(this.view, token, extractedText);
    }

    @Override // e2.l0
    public void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            d.f61480a.a(g(), this.view);
        }
    }

    @Override // e2.l0
    public boolean isActive() {
        return g().isActive(this.view);
    }
}
