package o4;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k3.n3;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001.B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 JM\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0014J!\u00103\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010!2\u0006\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108JK\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u000205H\u0016¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010HR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010IR(\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010KR\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010KR$\u0010P\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010QR\"\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000e0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lo4/s0;", "Lo4/j0;", "Landroid/view/View;", "view", "Lv3/l0;", "rootPositionCalculator", "Lo4/u;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Lv3/l0;Lo4/u;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Lv3/l0;)V", "Lo4/s0$a;", "command", "Ljn0/h0;", "v", "(Lo4/s0$a;)V", "s", "()V", "u", "", "visible", "x", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "o", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "r", "()Z", "Lo4/o0;", "value", "Lo4/s;", "imeOptions", "Lkotlin/Function1;", "", "Lo4/i;", "onEditCommand", "Lo4/r;", "onImeActionPerformed", "e", "(Lo4/o0;Lo4/s;Lwn0/l;Lwn0/l;)V", DateTokenConverter.CONVERTER_KEY, "a", "h", "f", "oldValue", "newValue", "g", "(Lo4/o0;Lo4/o0;)V", "Lj3/i;", "rect", "b", "(Lj3/i;)V", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Lk3/n3;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "c", "(Lo4/o0;Lo4/f0;Li4/m0;Lwn0/l;Lj3/i;Lj3/i;)V", "Landroid/view/View;", "q", "()Landroid/view/View;", "Lo4/u;", "Ljava/util/concurrent/Executor;", "Z", "editorHasFocus", "Lwn0/l;", "<set-?>", "Lo4/o0;", "getState$ui_release", "()Lo4/o0;", "state", "Lo4/s;", "", "Ljava/lang/ref/WeakReference;", "Lo4/k0;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Lkotlin/Lazy;", "p", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "focusedRect", "Lo4/e;", "l", "Lo4/e;", "cursorAnchorInfoController", "Lt2/b;", "m", "Lt2/b;", "textInputCommandQueue", "Ljava/lang/Runnable;", "n", "Ljava/lang/Runnable;", "frameCallback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u inputMethodManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor inputCommandProcessorExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean editorHasFocus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super List<? extends i>, jn0.h0> onEditCommand;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super r, jn0.h0> onImeActionPerformed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<k0>> ics;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy baseInputConnection;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Rect focusedRect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final o4.e cursorAnchorInfoController;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t2.b<a> textInputCommandQueue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Runnable frameCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lo4/s0$a;", "", "<init>", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96494a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96494a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "b", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<BaseInputConnection> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(s0.this.getView(), false);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"o4/s0$d", "Lo4/t;", "", "Lo4/i;", "editCommands", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)V", "Lo4/r;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lo4/k0;", "inputConnection", "e", "(Lo4/k0;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements t {
        d() {
        }

        @Override // o4.t
        public void a(KeyEvent event) {
            s0.this.p().sendKeyEvent(event);
        }

        @Override // o4.t
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            s0.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // o4.t
        public void c(int imeAction) {
            s0.this.onImeActionPerformed.invoke(r.j(imeAction));
        }

        @Override // o4.t
        public void d(List<? extends i> editCommands) {
            s0.this.onEditCommand.invoke(editCommands);
        }

        @Override // o4.t
        public void e(k0 inputConnection) {
            int size = s0.this.ics.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (p013kotlin.jvm.internal.s.f(((WeakReference) s0.this.ics.get(i11)).get(), inputConnection)) {
                    s0.this.ics.remove(i11);
                    return;
                }
            }
        }
    }

    public s0(View view, v3.l0 l0Var, u uVar, Executor executor) {
        this.view = view;
        this.inputMethodManager = uVar;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = e.f96497c;
        this.onImeActionPerformed = f.f96498c;
        this.state = new TextFieldValue("", i4.p0.INSTANCE.a(), (i4.p0) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.INSTANCE.a();
        this.ics = new ArrayList();
        this.baseInputConnection = jn0.m.a(jn0.p.NONE, new c());
        this.cursorAnchorInfoController = new o4.e(l0Var, uVar);
        this.textInputCommandQueue = new t2.b<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void s() {
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        p013kotlin.jvm.internal.n0 n0Var2 = new p013kotlin.jvm.internal.n0();
        t2.b<a> bVar = this.textInputCommandQueue;
        int size = bVar.getSize();
        if (size > 0) {
            a[] aVarArrM = bVar.m();
            int i11 = 0;
            do {
                t(aVarArrM[i11], n0Var, n0Var2);
                i11++;
            } while (i11 < size);
        }
        this.textInputCommandQueue.h();
        if (p013kotlin.jvm.internal.s.f(n0Var.f86529a, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) n0Var2.f86529a;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (p013kotlin.jvm.internal.s.f(n0Var.f86529a, Boolean.FALSE)) {
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void t(a aVar, p013kotlin.jvm.internal.n0<Boolean> n0Var, p013kotlin.jvm.internal.n0<Boolean> n0Var2) {
        int i11 = b.f96494a[aVar.ordinal()];
        if (i11 == 1) {
            ?? r11 = Boolean.TRUE;
            n0Var.f86529a = r11;
            n0Var2.f86529a = r11;
        } else if (i11 == 2) {
            ?? r12 = Boolean.FALSE;
            n0Var.f86529a = r12;
            n0Var2.f86529a = r12;
        } else if ((i11 == 3 || i11 == 4) && !p013kotlin.jvm.internal.s.f(n0Var.f86529a, Boolean.FALSE)) {
            n0Var2.f86529a = Boolean.valueOf(aVar == a.ShowKeyboard);
        }
    }

    private final void u() {
        this.inputMethodManager.b();
    }

    private final void v(a command) {
        this.textInputCommandQueue.b(command);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: o4.r0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.w(this.f96471a);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(s0 s0Var) {
        s0Var.frameCallback = null;
        s0Var.s();
    }

    private final void x(boolean visible) {
        if (visible) {
            this.inputMethodManager.f();
        } else {
            this.inputMethodManager.e();
        }
    }

    @Override // o4.j0
    public void a() {
        this.editorHasFocus = false;
        this.onEditCommand = g.f96499c;
        this.onImeActionPerformed = h.f96500c;
        this.focusedRect = null;
        v(a.StopInput);
    }

    @Override // o4.j0
    @jn0.e
    public void b(j3.i rect) {
        Rect rect2;
        this.focusedRect = new Rect(yn0.a.d(rect.getLeft()), yn0.a.d(rect.getTop()), yn0.a.d(rect.getRight()), yn0.a.d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // o4.j0
    public void c(TextFieldValue textFieldValue, f0 offsetMapping, TextLayoutResult textLayoutResult, wn0.l<? super n3, jn0.h0> textFieldToRootTransform, j3.i innerTextFieldBounds, j3.i decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    @Override // o4.j0
    public void d() {
        v(a.StartInput);
    }

    @Override // o4.j0
    public void e(TextFieldValue value, ImeOptions imeOptions, wn0.l<? super List<? extends i>, jn0.h0> onEditCommand, wn0.l<? super r, jn0.h0> onImeActionPerformed) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        v(a.StartInput);
    }

    @Override // o4.j0
    public void f() {
        v(a.HideKeyboard);
    }

    @Override // o4.j0
    public void g(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z11 = (i4.p0.g(this.state.getSelection(), newValue.getSelection()) && p013kotlin.jvm.internal.s.f(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i11 = 0; i11 < size; i11++) {
            k0 k0Var = this.ics.get(i11).get();
            if (k0Var != null) {
                k0Var.f(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (p013kotlin.jvm.internal.s.f(oldValue, newValue)) {
            if (z11) {
                u uVar = this.inputMethodManager;
                int iL = i4.p0.l(newValue.getSelection());
                int iK = i4.p0.k(newValue.getSelection());
                i4.p0 composition = this.state.getComposition();
                int iL2 = composition != null ? i4.p0.l(composition.getPackedValue()) : -1;
                i4.p0 composition2 = this.state.getComposition();
                uVar.a(iL, iK, iL2, composition2 != null ? i4.p0.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!p013kotlin.jvm.internal.s.f(oldValue.h(), newValue.h()) || (i4.p0.g(oldValue.getSelection(), newValue.getSelection()) && !p013kotlin.jvm.internal.s.f(oldValue.getComposition(), newValue.getComposition())))) {
            u();
            return;
        }
        int size2 = this.ics.size();
        for (int i12 = 0; i12 < size2; i12++) {
            k0 k0Var2 = this.ics.get(i12).get();
            if (k0Var2 != null) {
                k0Var2.g(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // o4.j0
    public void h() {
        v(a.ShowKeyboard);
    }

    public final InputConnection o(EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        v0.h(outAttrs, this.imeOptions, this.state);
        v0.i(outAttrs);
        k0 k0Var = new k0(this.state, new d(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(k0Var));
        return k0Var;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    public /* synthetic */ s0(View view, v3.l0 l0Var, u uVar, Executor executor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, l0Var, uVar, (i11 & 8) != 0 ? v0.d(Choreographer.getInstance()) : executor);
    }

    public s0(View view, v3.l0 l0Var) {
        this(view, l0Var, new v(view), null, 8, null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo4/i;", "it", "Ljn0/h0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends i>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f96497c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(List<? extends i> list) {
            a(list);
            return jn0.h0.f84049a;
        }

        public final void a(List<? extends i> list) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/r;", "it", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<r, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f96498c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(r rVar) {
            a(rVar.getValue());
            return jn0.h0.f84049a;
        }

        public final void a(int i11) {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo4/i;", "it", "Ljn0/h0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends i>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f96499c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(List<? extends i> list) {
            a(list);
            return jn0.h0.f84049a;
        }

        public final void a(List<? extends i> list) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/r;", "it", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<r, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f96500c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(r rVar) {
            a(rVar.getValue());
            return jn0.h0.f84049a;
        }

        public final void a(int i11) {
        }
    }
}
