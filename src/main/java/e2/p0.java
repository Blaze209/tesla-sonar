package e2;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextLayoutResult;
import k3.n3;
import o4.TextFieldValue;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Le2/p0;", "", "Lkotlin/Function1;", "Lk3/n3;", "Ljn0/h0;", "localToScreen", "Le2/l0;", "inputMethodManager", "<init>", "(Lwn0/l;Le2/l0;)V", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lo4/o0;", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Lj3/i;", "innerTextFieldBounds", "decorationBoxBounds", DateTokenConverter.CONVERTER_KEY, "(Lo4/o0;Lo4/f0;Li4/m0;Lj3/i;Lj3/i;)V", "a", "Lwn0/l;", "Le2/l0;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Lo4/o0;", "k", "Li4/m0;", "l", "Lo4/f0;", "m", "Lj3/i;", "n", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "p", "[F", "matrix", "Landroid/graphics/Matrix;", "q", "Landroid/graphics/Matrix;", "androidMatrix", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<n3, jn0.h0> localToScreen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 inputMethodManager;

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
    private o4.f0 offsetMapping;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private j3.i innerTextFieldBounds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private j3.i decorationBoxBounds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float[] matrix = n3.c(null, 1, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public p0(wn0.l<? super n3, jn0.h0> lVar, l0 l0Var) {
        this.localToScreen = lVar;
        this.inputMethodManager = l0Var;
    }

    private final void c() {
        if (!this.inputMethodManager.isActive() || this.textFieldValue == null || this.offsetMapping == null || this.textLayoutResult == null || this.innerTextFieldBounds == null || this.decorationBoxBounds == null) {
            return;
        }
        n3.j(this.matrix);
        this.localToScreen.invoke(n3.a(this.matrix));
        float[] fArr = this.matrix;
        j3.i iVar = this.decorationBoxBounds;
        p013kotlin.jvm.internal.s.h(iVar);
        float f11 = -iVar.getLeft();
        j3.i iVar2 = this.decorationBoxBounds;
        p013kotlin.jvm.internal.s.h(iVar2);
        n3.r(fArr, f11, -iVar2.getTop(), BitmapDescriptorFactory.HUE_RED);
        k3.o0.a(this.androidMatrix, this.matrix);
        l0 l0Var = this.inputMethodManager;
        CursorAnchorInfo.Builder builder = this.builder;
        TextFieldValue textFieldValue = this.textFieldValue;
        p013kotlin.jvm.internal.s.h(textFieldValue);
        o4.f0 f0Var = this.offsetMapping;
        p013kotlin.jvm.internal.s.h(f0Var);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        p013kotlin.jvm.internal.s.h(textLayoutResult);
        Matrix matrix = this.androidMatrix;
        j3.i iVar3 = this.innerTextFieldBounds;
        p013kotlin.jvm.internal.s.h(iVar3);
        j3.i iVar4 = this.decorationBoxBounds;
        p013kotlin.jvm.internal.s.h(iVar4);
        l0Var.c(o0.b(builder, textFieldValue, f0Var, textLayoutResult, matrix, iVar3, iVar4, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }

    public final void a() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
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

    public final void d(TextFieldValue textFieldValue, o4.f0 offsetMapping, TextLayoutResult textLayoutResult, j3.i innerTextFieldBounds, j3.i decorationBoxBounds) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
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
}
