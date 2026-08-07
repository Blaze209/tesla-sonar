package aj0;

import oi0.SubmitButtonComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Laj0/p3$a;", "", "componentName", "b", "(Laj0/p3$a;Ljava/lang/String;)Laj0/p3$a;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements wn0.l<SubmitButtonComponent, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1236a = new a();

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return Boolean.TRUE;
        }
    }

    public static final p3.Displaying b(p3.Displaying displaying, final String str) {
        oi0.h hVar;
        p013kotlin.jvm.internal.s.k(displaying, "<this>");
        if (str != null) {
            hVar = (oi0.h) pi0.g.a(displaying.getComponents(), p013kotlin.jvm.internal.o0.b(oi0.h.class), new wn0.l() { // from class: aj0.c1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(d1.d(str, (oi0.h) obj));
                }
            });
            if (hVar == null) {
                return displaying;
            }
        } else {
            hVar = (SubmitButtonComponent) pi0.g.a(displaying.getComponents(), p013kotlin.jvm.internal.o0.b(SubmitButtonComponent.class), a.f1236a);
            if (hVar == null) {
                return displaying;
            }
        }
        return p3.Displaying.b(displaying, null, null, null, null, null, null, new p3.Displaying.AutoSubmit(hVar, 0, null), null, false, false, null, null, null, 8095, null);
    }

    public static /* synthetic */ p3.Displaying c(p3.Displaying displaying, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return b(displaying, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(String str, oi0.h it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return p013kotlin.jvm.internal.s.f(it.getName(), str);
    }
}
