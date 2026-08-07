package i3;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import x3.RotaryScrollEvent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000bH&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020+H&¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Li3/i;", "Li3/f;", "Landroidx/compose/ui/focus/d;", "focusDirection", "Lj3/i;", "previouslyFocusedRect", "", "g", "(Landroidx/compose/ui/focus/d;Lj3/i;)Z", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "c", "(ILj3/i;Lwn0/l;)Ljava/lang/Boolean;", "Ljn0/h0;", "q", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "f", "(ZZZI)Z", "o", "()Lj3/i;", "Lt3/b;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "n", "(Landroid/view/KeyEvent;Lwn0/a;)Z", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/KeyEvent;)Z", "Lx3/b;", "event", "k", "(Lx3/b;)Z", "node", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Li3/c;", "l", "(Li3/c;)V", "Li3/j;", IntegerTokenConverter.CONVERTER_KEY, "(Li3/j;)V", "Landroidx/compose/ui/d;", "e", "()Landroidx/compose/ui/d;", "modifier", "Li3/t;", "b", "()Li3/t;", "focusTransactionManager", "Li3/o;", "m", "()Li3/o;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface i extends f {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75581c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean p(i iVar, KeyEvent keyEvent, wn0.a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i11 & 2) != 0) {
            aVar = a.f75581c;
        }
        return iVar.n(keyEvent, aVar);
    }

    t b();

    Boolean c(int focusDirection, j3.i focusedRect, wn0.l<? super FocusTargetNode, Boolean> onFound);

    boolean d(KeyEvent keyEvent);

    androidx.compose.ui.d e();

    boolean f(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    boolean g(androidx.compose.ui.focus.d focusDirection, j3.i previouslyFocusedRect);

    void i(j node);

    void j(FocusTargetNode node);

    boolean k(RotaryScrollEvent event);

    void l(c node);

    o m();

    boolean n(KeyEvent keyEvent, wn0.a<Boolean> onFocusedItem);

    j3.i o();

    void q();
}
