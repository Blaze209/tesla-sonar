package fh0;

import androidx.p003lifecycle.s0;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<s0> f65997a;

    public j(qj0.i<s0> iVar) {
        this.f65997a = iVar;
    }

    public static j a(qj0.i<s0> iVar) {
        return new j(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.fallbackmode.i c(List<? extends NextStep> list, String str, s0 s0Var) {
        return new com.withpersona.sdk2.inquiry.internal.fallbackmode.i(list, str, s0Var);
    }

    public com.withpersona.sdk2.inquiry.internal.fallbackmode.i b(List<? extends NextStep> list, String str) {
        return c(list, str, this.f65997a.get());
    }
}
