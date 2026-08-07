package c10;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00120\u0010\b\u001a,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR>\u0010\b\u001a,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lc10/e;", "", "Landroid/widget/EditText;", "editText", "Lkotlin/Function6;", "", "", "Ljn0/h0;", "action", "<init>", "(Landroid/widget/EditText;Lwn0/t;)V", "j", "()V", IntegerTokenConverter.CONVERTER_KEY, "a", "Landroid/widget/EditText;", "b", "Lwn0/t;", "c", "I", "lastSelectionStart", DateTokenConverter.CONVERTER_KEY, "lastSelectionEnd", "e", "lastEditTextHeight", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "f", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "preDrawListener", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EditText editText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t<Integer, Integer, Double, Double, Double, Double, h0> action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastSelectionStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastSelectionEnd;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastEditTextHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c10/e$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int paddingTop;
            int paddingTop2;
            Drawable textCursorDrawable;
            int selectionStart = e.this.editText.getSelectionStart();
            int selectionEnd = e.this.editText.getSelectionEnd();
            int height = e.this.editText.getHeight();
            EditText editText = e.this.editText;
            Layout layout = editText.getLayout();
            if (layout == null) {
                return true;
            }
            if (e.this.lastSelectionStart != selectionStart || e.this.lastSelectionEnd != selectionEnd || e.this.lastEditTextHeight != height) {
                e.this.lastSelectionStart = selectionStart;
                e.this.lastSelectionEnd = selectionEnd;
                e.this.lastEditTextHeight = height;
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                int lineTop = layout.getLineTop(layout.getLineForOffset(iMin));
                int height2 = layout.getHeight();
                int intrinsicWidth = 0;
                if (Build.VERSION.SDK_INT >= 29 && (textCursorDrawable = editText.getTextCursorDrawable()) != null) {
                    intrinsicWidth = textCursorDrawable.getIntrinsicWidth();
                }
                int gravity = e.this.editText.getGravity() & 112;
                int paddingTop3 = e.this.editText.getPaddingTop() + e.this.editText.getPaddingBottom();
                int lineHeight = e.this.editText.getLineHeight() / 2;
                int i11 = height - paddingTop3;
                if (height2 > i11) {
                    paddingTop = e.this.editText.getPaddingTop();
                } else if (gravity != 16) {
                    if (gravity != 80) {
                        paddingTop = e.this.editText.getPaddingTop();
                    } else {
                        paddingTop2 = e.this.editText.getPaddingTop() + (i11 - height2) + lineHeight;
                    }
                    e.this.action.i(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(d.a(layout.getPrimaryHorizontal(iMin))), Double.valueOf(d.a((lineTop + paddingTop2) - editText.getScrollY())), Double.valueOf(d.a(layout.getPrimaryHorizontal(iMax) + intrinsicWidth)), Double.valueOf(d.a((layout.getLineBottom(layout.getLineForOffset(iMax)) + paddingTop2) - editText.getScrollY())));
                } else {
                    paddingTop = ((i11 - height2) / 2) + e.this.editText.getPaddingTop();
                }
                paddingTop2 = paddingTop + lineHeight;
                e.this.action.i(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(d.a(layout.getPrimaryHorizontal(iMin))), Double.valueOf(d.a((lineTop + paddingTop2) - editText.getScrollY())), Double.valueOf(d.a(layout.getPrimaryHorizontal(iMax) + intrinsicWidth)), Double.valueOf(d.a((layout.getLineBottom(layout.getLineForOffset(iMax)) + paddingTop2) - editText.getScrollY())));
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(EditText editText, t<? super Integer, ? super Integer, ? super Double, ? super Double, ? super Double, ? super Double, h0> action) {
        s.k(editText, "editText");
        s.k(action, "action");
        this.editText = editText;
        this.action = action;
        this.lastSelectionStart = -1;
        this.lastSelectionEnd = -1;
        this.lastEditTextHeight = -1;
        this.preDrawListener = new a();
    }

    public final void i() {
        this.editText.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
    }

    public final void j() {
        this.editText.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }
}
