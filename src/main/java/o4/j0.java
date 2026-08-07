package o4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextLayoutResult;
import java.util.List;
import k3.n3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JM\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0016\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010%\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lo4/j0;", "", "Lo4/o0;", "value", "Lo4/s;", "imeOptions", "Lkotlin/Function1;", "", "Lo4/i;", "Ljn0/h0;", "onEditCommand", "Lo4/r;", "onImeActionPerformed", "e", "(Lo4/o0;Lo4/s;Lwn0/l;Lwn0/l;)V", DateTokenConverter.CONVERTER_KEY, "()V", "a", "h", "f", "oldValue", "newValue", "g", "(Lo4/o0;Lo4/o0;)V", "Lj3/i;", "rect", "b", "(Lj3/i;)V", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Lk3/n3;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "c", "(Lo4/o0;Lo4/f0;Li4/m0;Lwn0/l;Lj3/i;Lj3/i;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface j0 {
    void a();

    void e(TextFieldValue value, ImeOptions imeOptions, wn0.l<? super List<? extends i>, jn0.h0> onEditCommand, wn0.l<? super r, jn0.h0> onImeActionPerformed);

    void f();

    void g(TextFieldValue oldValue, TextFieldValue newValue);

    void h();

    default void d() {
    }

    default void b(j3.i rect) {
    }

    default void c(TextFieldValue textFieldValue, f0 offsetMapping, TextLayoutResult textLayoutResult, wn0.l<? super n3, jn0.h0> textFieldToRootTransform, j3.i innerTextFieldBounds, j3.i decorationBoxBounds) {
    }
}
