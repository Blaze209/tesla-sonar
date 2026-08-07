package o4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextLayoutResult;
import k3.n3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lo4/w0;", "", "Lo4/q0;", "textInputService", "Lo4/j0;", "platformTextInputService", "<init>", "(Lo4/q0;Lo4/j0;)V", "Ljn0/h0;", "a", "()V", "Lj3/i;", "rect", "", "c", "(Lj3/i;)Z", "Lo4/o0;", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Lkotlin/Function1;", "Lk3/n3;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "e", "(Lo4/o0;Lo4/f0;Li4/m0;Lwn0/l;Lj3/i;Lj3/i;)Z", "oldValue", "newValue", DateTokenConverter.CONVERTER_KEY, "(Lo4/o0;Lo4/o0;)Z", "Lo4/q0;", "b", "Lo4/j0;", "()Z", "isOpen", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q0 textInputService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j0 platformTextInputService;

    public w0(q0 q0Var, j0 j0Var) {
        this.textInputService = q0Var;
        this.platformTextInputService = j0Var;
    }

    public final void a() {
        this.textInputService.g(this);
    }

    public final boolean b() {
        return p013kotlin.jvm.internal.s.f(this.textInputService.a(), this);
    }

    public final boolean c(j3.i rect) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.b(rect);
        }
        return zB;
    }

    public final boolean d(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.g(oldValue, newValue);
        }
        return zB;
    }

    public final boolean e(TextFieldValue textFieldValue, f0 offsetMapping, TextLayoutResult textLayoutResult, wn0.l<? super n3, jn0.h0> textFieldToRootTransform, j3.i innerTextFieldBounds, j3.i decorationBoxBounds) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.c(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
        }
        return zB;
    }
}
