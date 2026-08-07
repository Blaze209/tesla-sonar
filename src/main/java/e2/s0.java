package e2;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.b2;
import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k3.n3;
import o4.ImeOptions;
import o4.TextFieldValue;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJU\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J5\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020$¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R(\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010CR$\u0010J\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010KR\"\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0M0L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010NR\u001b\u0010S\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bF\u0010RR$\u0010Z\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\\¨\u0006^"}, d2 = {"Le2/s0;", "Landroidx/compose/ui/platform/b2;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lk3/n3;", "Ljn0/h0;", "localToScreen", "Le2/l0;", "inputMethodManager", "<init>", "(Landroid/view/View;Lwn0/l;Le2/l0;)V", "k", "()V", "Lo4/o0;", "value", "Le2/q0$a;", "textInputNode", "Lo4/s;", "imeOptions", "", "Lo4/i;", "onEditCommand", "Lo4/r;", "onImeActionPerformed", "l", "(Lo4/o0;Le2/q0$a;Lo4/s;Lwn0/l;Lwn0/l;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttributes", "Le2/u0;", "g", "(Landroid/view/inputmethod/EditorInfo;)Le2/u0;", "oldValue", "newValue", "m", "(Lo4/o0;Lo4/o0;)V", "Lj3/i;", "rect", "j", "(Lj3/i;)V", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "innerTextFieldBounds", "decorationBoxBounds", "n", "(Lo4/o0;Lo4/f0;Li4/m0;Lj3/i;Lj3/i;)V", "a", "Landroid/view/View;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/view/View;", "b", "Le2/l0;", "c", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "Lb2/b0;", "e", "Lb2/b0;", "legacyTextFieldState", "Lh2/h0;", "f", "Lh2/h0;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/e3;", "Landroidx/compose/ui/platform/e3;", "viewConfiguration", "<set-?>", "h", "Lo4/o0;", "getState", "()Lo4/o0;", "state", "Lo4/s;", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "Lkotlin/Lazy;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "getFocusedRect$foundation_release", "()Landroid/graphics/Rect;", "setFocusedRect$foundation_release", "(Landroid/graphics/Rect;)V", "focusedRect", "Le2/p0;", "Le2/p0;", "cursorAnchorInfoController", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s0 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 inputMethodManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private kotlin.b0 legacyTextFieldState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p007h2.h0 textFieldSelectionManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private e3 viewConfiguration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Rect focusedRect;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0 cursorAnchorInfoController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super List<? extends o4.i>, jn0.h0> onEditCommand = c.f61543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super o4.r, jn0.h0> onImeActionPerformed = d.f61544c;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue state = new TextFieldValue("", i4.p0.INSTANCE.a(), (i4.p0) null, 4, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions = ImeOptions.INSTANCE.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<u0>> ics = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy baseInputConnection = jn0.m.a(jn0.p.NONE, new a());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "b", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<BaseInputConnection> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(s0.this.getView(), false);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"e2/s0$b", "Le2/k0;", "", "Lo4/i;", "editCommands", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)V", "Lo4/r;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Le2/u0;", "inputConnection", "e", "(Le2/u0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements k0 {
        b() {
        }

        @Override // e2.k0
        public void a(KeyEvent event) {
            s0.this.h().sendKeyEvent(event);
        }

        @Override // e2.k0
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            s0.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // e2.k0
        public void c(int imeAction) {
            s0.this.onImeActionPerformed.invoke(o4.r.j(imeAction));
        }

        @Override // e2.k0
        public void d(List<? extends o4.i> editCommands) {
            s0.this.onEditCommand.invoke(editCommands);
        }

        @Override // e2.k0
        public void e(u0 inputConnection) {
            int size = s0.this.ics.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (p013kotlin.jvm.internal.s.f(((WeakReference) s0.this.ics.get(i11)).get(), inputConnection)) {
                    s0.this.ics.remove(i11);
                    return;
                }
            }
        }
    }

    public s0(View view, wn0.l<? super n3, jn0.h0> lVar, l0 l0Var) {
        this.view = view;
        this.inputMethodManager = l0Var;
        this.cursorAnchorInfoController = new p0(lVar, l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection h() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    private final void k() {
        this.inputMethodManager.b();
    }

    @Override // androidx.compose.ui.platform.b2
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public u0 a(EditorInfo outAttributes) {
        r.c(outAttributes, this.state.h(), this.state.getSelection(), this.imeOptions, null, 8, null);
        r0.d(outAttributes);
        u0 u0Var = new u0(this.state, new b(), this.imeOptions.getAutoCorrect(), this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(u0Var));
        return u0Var;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final void j(j3.i rect) {
        Rect rect2;
        this.focusedRect = new Rect(yn0.a.d(rect.getLeft()), yn0.a.d(rect.getTop()), yn0.a.d(rect.getRight()), yn0.a.d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void l(TextFieldValue value, q0.a textInputNode, ImeOptions imeOptions, wn0.l<? super List<? extends o4.i>, jn0.h0> onEditCommand, wn0.l<? super o4.r, jn0.h0> onImeActionPerformed) {
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        this.legacyTextFieldState = textInputNode != null ? textInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = textInputNode != null ? textInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = textInputNode != null ? textInputNode.getViewConfiguration() : null;
    }

    public final void m(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z11 = (i4.p0.g(this.state.getSelection(), newValue.getSelection()) && p013kotlin.jvm.internal.s.f(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i11 = 0; i11 < size; i11++) {
            u0 u0Var = this.ics.get(i11).get();
            if (u0Var != null) {
                u0Var.g(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (p013kotlin.jvm.internal.s.f(oldValue, newValue)) {
            if (z11) {
                l0 l0Var = this.inputMethodManager;
                int iL = i4.p0.l(newValue.getSelection());
                int iK = i4.p0.k(newValue.getSelection());
                i4.p0 composition = this.state.getComposition();
                int iL2 = composition != null ? i4.p0.l(composition.getPackedValue()) : -1;
                i4.p0 composition2 = this.state.getComposition();
                l0Var.a(iL, iK, iL2, composition2 != null ? i4.p0.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!p013kotlin.jvm.internal.s.f(oldValue.h(), newValue.h()) || (i4.p0.g(oldValue.getSelection(), newValue.getSelection()) && !p013kotlin.jvm.internal.s.f(oldValue.getComposition(), newValue.getComposition())))) {
            k();
            return;
        }
        int size2 = this.ics.size();
        for (int i12 = 0; i12 < size2; i12++) {
            u0 u0Var2 = this.ics.get(i12).get();
            if (u0Var2 != null) {
                u0Var2.h(this.state, this.inputMethodManager);
            }
        }
    }

    public final void n(TextFieldValue textFieldValue, o4.f0 offsetMapping, TextLayoutResult textLayoutResult, j3.i innerTextFieldBounds, j3.i decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo4/i;", "it", "Ljn0/h0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends o4.i>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f61543c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(List<? extends o4.i> list) {
            a(list);
            return jn0.h0.f84049a;
        }

        public final void a(List<? extends o4.i> list) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/r;", "it", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<o4.r, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f61544c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(o4.r rVar) {
            a(rVar.getValue());
            return jn0.h0.f84049a;
        }

        public final void a(int i11) {
        }
    }
}
