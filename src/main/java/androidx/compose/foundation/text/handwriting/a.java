package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import c2.c;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "", "enabled", "Lkotlin/Function0;", "onHandwritingSlopExceeded", "c", "(Landroidx/compose/ui/d;ZLwn0/a;)Landroidx/compose/ui/d;", "Lw4/h;", "a", Gender.FEMALE, "b", "()F", "HandwritingBoundsVerticalOffset", "HandwritingBoundsHorizontalOffset", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f4945a = h.g(40);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f4946b = h.g(10);

    public static final float a() {
        return f4946b;
    }

    public static final float b() {
        return f4945a;
    }

    public static final d c(d dVar, boolean z11, wn0.a<Boolean> aVar) {
        return (z11 && c.a()) ? t.j(dVar.g(new StylusHandwritingElementWithNegativePadding(aVar)), f4946b, f4945a) : dVar;
    }
}
