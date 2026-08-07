package p014n4;

import android.graphics.Typeface;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import q4.k;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln4/l0;", "", "<init>", "()V", "Ln4/e1;", "typefaceRequest", "Ln4/m0;", "platformFontLoader", "Lkotlin/Function1;", "Ln4/g1$b;", "Ljn0/h0;", "onAsyncCompletion", "createDefaultTypeface", "Ln4/g1;", "a", "(Ln4/e1;Ln4/m0;Lwn0/l;Lwn0/l;)Ln4/g1;", "Ln4/o0;", "Ln4/o0;", "platformTypefaceResolver", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o0 platformTypefaceResolver = r0.a();

    public g1 a(TypefaceRequest typefaceRequest, m0 platformFontLoader, l<? super g1.b, h0> onAsyncCompletion, l<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        Typeface typefaceA;
        q fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof n) {
            typefaceA = this.platformTypefaceResolver.a(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else if (fontFamily instanceof j0) {
            typefaceA = this.platformTypefaceResolver.b((j0) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            u0 typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            s.i(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceA = ((k) typeface).a(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle(), typefaceRequest.getFontSynthesis());
        }
        return new g1.b(typefaceA, false, 2, null);
    }
}
