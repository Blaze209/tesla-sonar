package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import lb.e1;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\tH&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\u00172\u0006\u0010\u0016\u001a\u00020\rH&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/work/s0;", "", "<init>", "()V", "Landroidx/work/u0;", "request", "Landroidx/work/d0;", "a", "(Landroidx/work/u0;)Landroidx/work/d0;", "", "requests", "b", "(Ljava/util/List;)Landroidx/work/d0;", "", "uniqueWorkName", "Landroidx/work/l;", "existingWorkPolicy", "Landroidx/work/c0;", "c", "(Ljava/lang/String;Landroidx/work/l;Landroidx/work/c0;)Landroidx/work/d0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Landroidx/work/l;Ljava/util/List;)Landroidx/work/d0;", "tag", "Lcom/google/common/util/concurrent/s;", "Landroidx/work/r0;", "f", "(Ljava/lang/String;)Lcom/google/common/util/concurrent/s;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.s0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/work/s0$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/s0;", "a", "(Landroid/content/Context;)Landroidx/work/s0;", "Landroidx/work/c;", "configuration", "Ljn0/h0;", "b", "(Landroid/content/Context;Landroidx/work/c;)V", "", "c", "()Z", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public s0 a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            e1 e1VarS = e1.s(context);
            p013kotlin.jvm.internal.s.j(e1VarS, "getInstance(...)");
            return e1VarS;
        }

        public void b(Context context, c configuration) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(configuration, "configuration");
            e1.g(context, configuration);
        }

        public boolean c() {
            return e1.h();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/s0$b;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    public static s0 e(Context context) {
        return INSTANCE.a(context);
    }

    public static void g(Context context, c cVar) {
        INSTANCE.b(context, cVar);
    }

    public static boolean h() {
        return INSTANCE.c();
    }

    public final d0 a(u0 request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        return b(p013kotlin.collections.v.e(request));
    }

    public abstract d0 b(List<? extends u0> requests);

    public d0 c(String uniqueWorkName, l existingWorkPolicy, c0 request) {
        p013kotlin.jvm.internal.s.k(uniqueWorkName, "uniqueWorkName");
        p013kotlin.jvm.internal.s.k(existingWorkPolicy, "existingWorkPolicy");
        p013kotlin.jvm.internal.s.k(request, "request");
        return d(uniqueWorkName, existingWorkPolicy, p013kotlin.collections.v.e(request));
    }

    public abstract d0 d(String uniqueWorkName, l existingWorkPolicy, List<c0> requests);

    public abstract com.google.common.util.concurrent.s<List<r0>> f(String tag);
}
