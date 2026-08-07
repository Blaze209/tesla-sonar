package aj0;

import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class k5 implements i5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j5 f1451a;

    k5(j5 j5Var) {
        this.f1451a = j5Var;
    }

    public static qj0.i<i5.a> b(j5 j5Var) {
        return qj0.f.a(new k5(j5Var));
    }

    @Override // aj0.i5.a
    public i5 a(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return this.f1451a.b(str, str2, str3, str4, map);
    }
}
