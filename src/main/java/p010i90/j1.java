package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H&¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Li90/j1;", "", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "Li90/l1;", "h", "()Li90/l1;", "", "", "rawValuesMap", "Ljn0/h0;", "g", "(Ljava/util/Map;)V", "e", "a", "()Li90/g0;", "identifier", "", "f", "()Z", "shouldRenderOutsideCard", "b", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "()Lx30/c;", "mandateText", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface j1 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static boolean a(j1 j1Var) {
            return false;
        }
    }

    IdentifierSpec a();

    boolean b();

    StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c();

    c d();

    StateFlow<List<IdentifierSpec>> e();

    boolean f();

    void g(Map<IdentifierSpec, String> rawValuesMap);

    l1 h();
}
