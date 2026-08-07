package o4;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.Executor;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/inputmethod/EditorInfo;)V", "Lo4/s;", "imeOptions", "Lo4/o0;", "textFieldValue", "h", "(Landroid/view/inputmethod/EditorInfo;Lo4/s;Lo4/o0;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "g", "(II)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v0 {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: o4.t0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                v0.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: o4.u0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                v0.f(runnable, j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j11) {
        runnable.run();
    }

    private static final boolean g(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    public static final void h(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int imeAction = imeOptions.getImeAction();
        r.Companion companion = r.INSTANCE;
        int i11 = 6;
        if (r.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i11 = 0;
            }
        } else if (r.m(imeAction, companion.e())) {
            i11 = 1;
        } else if (r.m(imeAction, companion.c())) {
            i11 = 2;
        } else if (r.m(imeAction, companion.d())) {
            i11 = 5;
        } else if (r.m(imeAction, companion.f())) {
            i11 = 7;
        } else if (r.m(imeAction, companion.g())) {
            i11 = 3;
        } else if (r.m(imeAction, companion.h())) {
            i11 = 4;
        } else if (!r.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i11;
        imeOptions.g();
        int keyboardType = imeOptions.getKeyboardType();
        y.Companion companion2 = y.INSTANCE;
        if (y.n(keyboardType, companion2.h())) {
            editorInfo.inputType = 1;
        } else if (y.n(keyboardType, companion2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (y.n(keyboardType, companion2.d())) {
            editorInfo.inputType = 2;
        } else if (y.n(keyboardType, companion2.g())) {
            editorInfo.inputType = 3;
        } else if (y.n(keyboardType, companion2.j())) {
            editorInfo.inputType = 17;
        } else if (y.n(keyboardType, companion2.c())) {
            editorInfo.inputType = 33;
        } else if (y.n(keyboardType, companion2.f())) {
            editorInfo.inputType = EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
        } else if (y.n(keyboardType, companion2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!y.n(keyboardType, companion2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (r.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            x.Companion companion3 = x.INSTANCE;
            if (x.i(capitalization, companion3.a())) {
                editorInfo.inputType |= 4096;
            } else if (x.i(capitalization, companion3.e())) {
                editorInfo.inputType |= PKIFailureInfo.certRevoked;
            } else if (x.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = i4.p0.n(textFieldValue.getSelection());
        editorInfo.initialSelEnd = i4.p0.i(textFieldValue.getSelection());
        b6.c.f(editorInfo, textFieldValue.h());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.i()) {
            androidx.emoji2.text.e.c().r(editorInfo);
        }
    }
}
