package cu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import du.t;
import du.v;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"RestrictedApi"})
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final du.i f59186c = new du.i("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    t f59187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59188b;

    /* JADX WARN: Type inference failed for: r7v0, types: [cu.h] */
    public l(Context context) {
        this.f59188b = context.getPackageName();
        if (v.a(context)) {
            this.f59187a = new t(context, f59186c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: cu.h
            }, null);
        }
    }

    public final Task a() {
        String str = this.f59188b;
        du.i iVar = f59186c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f59187a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new ReviewException(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59187a.s(new i(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
