package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import r90.g;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Li90/d0;", "", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "e", "a", "()Li90/g0;", "identifier", "", "b", "()Z", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "()Lx30/c;", "mandateText", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static StateFlow<List<IdentifierSpec>> a(d0 d0Var) {
            return g.n(v.m());
        }
    }

    /* JADX INFO: renamed from: a */
    IdentifierSpec getIdentifier();

    /* JADX INFO: renamed from: b */
    boolean getAllowsUserInteraction();

    StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c();

    /* JADX INFO: renamed from: d */
    c getMandateText();

    StateFlow<List<IdentifierSpec>> e();
}
