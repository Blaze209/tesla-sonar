package pb;

import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import sb.m0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lpb/e;", "", "Landroidx/work/e;", CryptoServicesPermission.CONSTRAINTS, "Lkotlinx/coroutines/flow/Flow;", "Lob/b;", "b", "(Landroidx/work/e;)Lkotlinx/coroutines/flow/Flow;", "Lsb/m0;", "workSpec", "", "c", "(Lsb/m0;)Z", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {
    boolean a(m0 workSpec);

    Flow<ob.b> b(androidx.work.e constraints);

    boolean c(m0 workSpec);
}
