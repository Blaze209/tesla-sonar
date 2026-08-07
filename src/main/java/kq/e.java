package kq;

import android.app.Activity;
import android.content.Context;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R+\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u0016\u0010 ¨\u0006\""}, d2 = {"Lkq/e;", "Lkq/f;", "", "permission", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", "activity", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V", "Lkq/g;", "b", "()Lkq/g;", "Ljn0/h0;", "c", "()V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "Landroid/content/Context;", "Landroid/app/Activity;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Lr2/p1;", "getStatus", "e", "(Lkq/g;)V", PermissionsResponse.STATUS_KEY, "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher$permissions_release", "()Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launcher", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String permission;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<String> launcher;

    public e(String permission, Context context, Activity activity) {
        s.k(permission, "permission");
        s.k(context, "context");
        s.k(activity, "activity");
        this.permission = permission;
        this.context = context;
        this.activity = activity;
        this.status = s3.d(b(), null, 2, null);
    }

    private final g b() {
        return i.d(this.context, getPermission()) ? g.b.f89321a : new g.Denied(i.h(this.activity, getPermission()));
    }

    @Override // kq.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getPermission() {
        return this.permission;
    }

    public final void c() {
        e(b());
    }

    public final void d(ActivityResultLauncher<String> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public void e(g gVar) {
        s.k(gVar, "<set-?>");
        this.status.setValue(gVar);
    }

    @Override // kq.f
    public g getStatus() {
        return (g) this.status.getValue();
    }
}
