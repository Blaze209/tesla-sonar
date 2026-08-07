package v3;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000f\u001a\u00020\u000e2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/d;", "", "key1", "Lkotlin/Function2;", "Lv3/f0;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "block", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;Ljava/lang/Object;Lwn0/p;)Landroidx/compose/ui/d;", "key2", "c", "(Landroidx/compose/ui/d;Ljava/lang/Object;Ljava/lang/Object;Lwn0/p;)Landroidx/compose/ui/d;", "pointerInputHandler", "Lv3/q0;", "a", "(Lwn0/p;)Lv3/q0;", "Lv3/m;", "Lv3/m;", "EmptyPointerEvent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f117722a = new m(p013kotlin.collections.v.m());

    public static final q0 a(wn0.p<? super f0, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        return new r0(null, null, null, pVar);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, Object obj, Object obj2, wn0.p<? super f0, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        return dVar.g(new SuspendPointerInputElement(obj, obj2, null, pVar, 4, null));
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, Object obj, wn0.p<? super f0, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        return dVar.g(new SuspendPointerInputElement(obj, null, null, pVar, 6, null));
    }
}
