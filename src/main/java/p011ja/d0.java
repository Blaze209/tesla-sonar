package p011ja;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jn0.h0;
import p011ja.r;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u000b,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R$\u0010/\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Lja/d0;", "Lja/r;", "D", "", "<init>", "()V", "Lja/f0;", "state", "Ljn0/h0;", "f", "(Lja/f0;)V", "a", "()Lja/r;", "", "Lja/k;", "entries", "Lja/y;", "navOptions", "Lja/d0$a;", "navigatorExtras", "e", "(Ljava/util/List;Lja/y;Lja/d0$a;)V", "backStackEntry", "g", "(Lja/k;)V", "destination", "Landroid/os/Bundle;", "args", DateTokenConverter.CONVERTER_KEY, "(Lja/r;Landroid/os/Bundle;Lja/y;Lja/d0$a;)Lja/r;", "popUpTo", "", "savedState", "j", "(Lja/k;Z)V", "k", "()Z", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "Lja/f0;", "_state", "<set-?>", "b", "Z", "c", "isAttached", "()Lja/f0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class d0<D extends r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private f0 _state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lja/d0$a;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lja/d0$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lja/r;", "D", "Lja/k;", "backStackEntry", "a", "(Lja/k;)Lja/k;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<k, k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0<D> f83221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y f83222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f83223e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d0<D> d0Var, y yVar, a aVar) {
            super(1);
            this.f83221c = d0Var;
            this.f83222d = yVar;
            this.f83223e = aVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke(k backStackEntry) {
            r rVarD;
            s.k(backStackEntry, "backStackEntry");
            r rVarE = backStackEntry.getDestination();
            if (rVarE == null) {
                rVarE = null;
            }
            if (rVarE == null || (rVarD = this.f83221c.d(rVarE, backStackEntry.c(), this.f83222d, this.f83223e)) == null) {
                return null;
            }
            return s.f(rVarD, rVarE) ? backStackEntry : this.f83221c.b().a(rVarD, rVarD.h(backStackEntry.c()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lja/r;", "D", "Lja/z;", "Ljn0/h0;", "a", "(Lja/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<z, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f83224c = new d();

        d() {
            super(1);
        }

        public final void a(z navOptions) {
            s.k(navOptions, "$this$navOptions");
            navOptions.e(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(z zVar) {
            a(zVar);
            return h0.f84049a;
        }
    }

    public abstract D a();

    protected final f0 b() {
        f0 f0Var = this._state;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public r d(D destination, Bundle args, y navOptions, a navigatorExtras) {
        s.k(destination, "destination");
        return destination;
    }

    public void e(List<k> entries, y navOptions, a navigatorExtras) {
        s.k(entries, "entries");
        Iterator it = ho0.l.J(ho0.l.U(v.e0(entries), new c(this, navOptions, navigatorExtras))).iterator();
        while (it.hasNext()) {
            b().j((k) it.next());
        }
    }

    public void f(f0 state) {
        s.k(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void g(k backStackEntry) {
        s.k(backStackEntry, "backStackEntry");
        r rVarE = backStackEntry.getDestination();
        if (rVarE == null) {
            rVarE = null;
        }
        if (rVarE == null) {
            return;
        }
        d(rVarE, null, Function1.a(d.f83224c), null);
        b().f(backStackEntry);
    }

    public void h(Bundle savedState) {
        s.k(savedState, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(k popUpTo, boolean savedState) {
        s.k(popUpTo, "popUpTo");
        List<k> value = b().b().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<k> listIterator = value.listIterator(value.size());
        k kVarPrevious = null;
        while (k()) {
            kVarPrevious = listIterator.previous();
            if (s.f(kVarPrevious, popUpTo)) {
                break;
            }
        }
        if (kVarPrevious != null) {
            b().g(kVarPrevious, savedState);
        }
    }

    public boolean k() {
        return true;
    }
}
