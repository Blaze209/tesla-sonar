package o50;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlinx.coroutines.flow.SharedFlow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lo50/f;", "", "", PlaceTypes.ROUTE, "Lo50/i;", "popUpTo", "", "isSingleTop", "Ljn0/h0;", "a", "(Ljava/lang/String;Lo50/i;Z)V", "c", "()V", "Lkotlinx/coroutines/flow/SharedFlow;", "Lo50/e;", "b", "()Lkotlinx/coroutines/flow/SharedFlow;", "navigationFlow", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface f {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(f fVar, String str, i iVar, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryNavigateTo");
            }
            if ((i11 & 2) != 0) {
                iVar = null;
            }
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            fVar.a(str, iVar, z11);
        }
    }

    void a(String route, i popUpTo, boolean isSingleTop);

    SharedFlow<e> b();

    void c();
}
