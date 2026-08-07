package androidx.compose.ui.draw;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import h3.i;
import jn0.h0;
import m3.f;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "onDraw", "b", "(Landroidx/compose/ui/d;Lwn0/l;)Landroidx/compose/ui/d;", "Lh3/d;", "Lh3/i;", "onBuildDrawCache", "c", "Lh3/c;", "a", "(Lwn0/l;)Lh3/c;", "Lm3/c;", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final h3.c a(l<? super h3.d, i> lVar) {
        return new a(new h3.d(), lVar);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, l<? super f, h0> lVar) {
        return dVar.g(new DrawBehindElement(lVar));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, l<? super h3.d, i> lVar) {
        return dVar.g(new DrawWithCacheElement(lVar));
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, l<? super m3.c, h0> lVar) {
        return dVar.g(new DrawWithContentElement(lVar));
    }
}
