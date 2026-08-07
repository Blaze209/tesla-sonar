package e2;

import android.view.inputmethod.EditorInfo;
import com.plaid.internal.EnumC4419g;
import o4.ImeOptions;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Li4/p0;", "selection", "Lo4/s;", "imeOptions", "", "", "contentMimeTypes", "Ljn0/h0;", "b", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLo4/s;[Ljava/lang/String;)V", "", "bits", "flag", "", "a", "(II)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {
    private static final boolean a(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    public static final void b(EditorInfo editorInfo, CharSequence charSequence, long j11, ImeOptions imeOptions, String[] strArr) {
        int imeAction = imeOptions.getImeAction();
        o4.r.Companion companion = o4.r.INSTANCE;
        int i11 = 3;
        int i12 = 6;
        if (o4.r.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i12 = 0;
            }
        } else if (o4.r.m(imeAction, companion.e())) {
            i12 = 1;
        } else if (o4.r.m(imeAction, companion.c())) {
            i12 = 2;
        } else if (o4.r.m(imeAction, companion.d())) {
            i12 = 5;
        } else if (o4.r.m(imeAction, companion.f())) {
            i12 = 7;
        } else if (o4.r.m(imeAction, companion.g())) {
            i12 = 3;
        } else if (o4.r.m(imeAction, companion.h())) {
            i12 = 4;
        } else if (!o4.r.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i12;
        imeOptions.g();
        t0.f61545a.a(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        o4.y.Companion companion2 = o4.y.INSTANCE;
        if (o4.y.n(keyboardType, companion2.h())) {
            i11 = 1;
        } else if (o4.y.n(keyboardType, companion2.a())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (o4.y.n(keyboardType, companion2.d())) {
            i11 = 2;
        } else if (!o4.y.n(keyboardType, companion2.g())) {
            if (o4.y.n(keyboardType, companion2.j())) {
                i11 = 17;
            } else if (o4.y.n(keyboardType, companion2.c())) {
                i11 = 33;
            } else if (o4.y.n(keyboardType, companion2.f())) {
                i11 = EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
            } else if (o4.y.n(keyboardType, companion2.e())) {
                i11 = 18;
            } else {
                if (!o4.y.n(keyboardType, companion2.b())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i11 = 8194;
            }
        }
        editorInfo.inputType = i11;
        if (!imeOptions.getSingleLine() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (o4.r.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            o4.x.Companion companion3 = o4.x.INSTANCE;
            if (o4.x.i(capitalization, companion3.a())) {
                editorInfo.inputType |= 4096;
            } else if (o4.x.i(capitalization, companion3.e())) {
                editorInfo.inputType |= PKIFailureInfo.certRevoked;
            } else if (o4.x.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = i4.p0.n(j11);
        editorInfo.initialSelEnd = i4.p0.i(j11);
        b6.c.f(editorInfo, charSequence);
        if (strArr != null) {
            b6.c.d(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!c2.c.a() || o4.y.n(imeOptions.getKeyboardType(), companion2.f()) || o4.y.n(imeOptions.getKeyboardType(), companion2.e())) {
            b6.c.g(editorInfo, false);
        } else {
            b6.c.g(editorInfo, true);
            q.f61524a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j11, ImeOptions imeOptions, String[] strArr, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j11, imeOptions, strArr);
    }
}
