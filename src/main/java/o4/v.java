package o4;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006'"}, d2 = {"Lo4/v;", "Lo4/u;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "Ljn0/h0;", "b", "()V", "f", "e", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", DateTokenConverter.CONVERTER_KEY, "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "a", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "c", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/Lazy;", "h", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/core/view/h0;", "Landroidx/core/view/h0;", "softwareKeyboardControllerCompat", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v implements u {

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
            Object systemService = v.this.view.getContext().getSystemService("input_method");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public v(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new androidx.core.view.h0(view);
    }

    private final InputMethodManager h() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // o4.u
    public void a(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        h().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // o4.u
    public void b() {
        h().restartInput(this.view);
    }

    @Override // o4.u
    public void c(CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // o4.u
    public void d(int token, ExtractedText extractedText) {
        h().updateExtractedText(this.view, token, extractedText);
    }

    @Override // o4.u
    public void e() {
        this.softwareKeyboardControllerCompat.a();
    }

    @Override // o4.u
    public void f() {
        this.softwareKeyboardControllerCompat.b();
    }

    @Override // o4.u
    public boolean isActive() {
        return h().isActive(this.view);
    }
}
