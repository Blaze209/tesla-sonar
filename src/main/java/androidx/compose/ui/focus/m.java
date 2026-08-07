package androidx.compose.ui.focus;

import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/k;", "Ljn0/h0;", "scope", "a", "(Landroidx/compose/ui/d;Lwn0/l;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a implements i3.l, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f5380a;

        a(wn0.l lVar) {
            this.f5380a = lVar;
        }

        @Override // i3.l
        public final /* synthetic */ void a(k kVar) {
            this.f5380a.invoke(kVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof i3.l) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f5380a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, wn0.l<? super k, h0> lVar) {
        return dVar.g(new FocusPropertiesElement(new a(lVar)));
    }
}
