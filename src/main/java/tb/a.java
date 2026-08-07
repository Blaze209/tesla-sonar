package tb;

import android.app.Application;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ltb/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "processName", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f113036a = new a();

    private a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        p013kotlin.jvm.internal.s.j(processName, "getProcessName(...)");
        return processName;
    }
}
