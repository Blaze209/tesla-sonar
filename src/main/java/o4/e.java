package o4;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import k3.n3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010@\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Lo4/e;", "", "Lv3/l0;", "rootPositionCalculator", "Lo4/u;", "inputMethodManager", "<init>", "(Lv3/l0;Lo4/u;)V", "Ljn0/h0;", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lo4/o0;", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Lkotlin/Function1;", "Lk3/n3;", "textFieldToRootTransform", "Lj3/i;", "innerTextFieldBounds", "decorationBoxBounds", DateTokenConverter.CONVERTER_KEY, "(Lo4/o0;Lo4/f0;Li4/m0;Lwn0/l;Lj3/i;Lj3/i;)V", "a", "Lv3/l0;", "Lo4/u;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Lo4/o0;", "k", "Li4/m0;", "l", "Lo4/f0;", "m", "Lwn0/l;", "n", "Lj3/i;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "q", "[F", "matrix", "Landroid/graphics/Matrix;", "r", "Landroid/graphics/Matrix;", "androidMatrix", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v3.l0 rootPositionCalculator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u inputMethodManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean monitorEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hasPendingImmediateRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean includeInsertionMarker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean includeCharacterBounds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean includeEditorBounds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean includeLineBounds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue textFieldValue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private f0 offsetMapping;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private j3.i innerTextFieldBounds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private j3.i decorationBoxBounds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super n3, jn0.h0> textFieldToRootTransform = b.f96406c;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final float[] matrix = n3.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    public e(v3.l0 l0Var, u uVar) {
        this.rootPositionCalculator = l0Var;
        this.inputMethodManager = uVar;
    }

    private final void c() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(n3.a(this.matrix));
            this.rootPositionCalculator.o(this.matrix);
            k3.o0.a(this.androidMatrix, this.matrix);
            u uVar = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            p013kotlin.jvm.internal.s.h(textFieldValue);
            f0 f0Var = this.offsetMapping;
            p013kotlin.jvm.internal.s.h(f0Var);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            p013kotlin.jvm.internal.s.h(textLayoutResult);
            Matrix matrix = this.androidMatrix;
            j3.i iVar = this.innerTextFieldBounds;
            p013kotlin.jvm.internal.s.h(iVar);
            j3.i iVar2 = this.decorationBoxBounds;
            p013kotlin.jvm.internal.s.h(iVar2);
            uVar.c(d.b(builder, textFieldValue, f0Var, textLayoutResult, matrix, iVar, iVar2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void a() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = a.f96405c;
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    public final void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = includeInsertionMarker;
                this.includeCharacterBounds = includeCharacterBounds;
                this.includeEditorBounds = includeEditorBounds;
                this.includeLineBounds = includeLineBounds;
                if (immediate) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        c();
                    }
                }
                this.monitorEnabled = monitor;
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(TextFieldValue textFieldValue, f0 offsetMapping, TextLayoutResult textLayoutResult, wn0.l<? super n3, jn0.h0> textFieldToRootTransform, j3.i innerTextFieldBounds, j3.i decorationBoxBounds) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.textFieldToRootTransform = textFieldToRootTransform;
                this.innerTextFieldBounds = innerTextFieldBounds;
                this.decorationBoxBounds = decorationBoxBounds;
                if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                    c();
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/n3;", "it", "Ljn0/h0;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<n3, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96405c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(n3 n3Var) {
            a(n3Var.getValues());
            return jn0.h0.f84049a;
        }

        public final void a(float[] fArr) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/n3;", "it", "Ljn0/h0;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<n3, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f96406c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(n3 n3Var) {
            a(n3Var.getValues());
            return jn0.h0.f84049a;
        }

        public final void a(float[] fArr) {
        }
    }
}
