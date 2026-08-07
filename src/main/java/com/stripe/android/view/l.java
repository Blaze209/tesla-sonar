package com.stripe.android.view;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/l;", "", "", "message", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface l {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/l$a;", "Lcom/stripe/android/view/l;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "message", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "Landroid/app/Activity;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Activity activity;

        public a(Activity activity) {
            p013kotlin.jvm.internal.s.k(activity, "activity");
            this.activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DialogInterface dialogInterface, int i11) {
            dialogInterface.dismiss();
        }

        @Override // com.stripe.android.view.l
        public void a(String message) {
            p013kotlin.jvm.internal.s.k(message, "message");
            if (this.activity.isFinishing()) {
                return;
            }
            new androidx.appcompat.app.b.a(this.activity, f30.e0.f63987a).f(message).b(true).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    l.a.c(dialogInterface, i11);
                }
            }).create().show();
        }
    }

    void a(String message);
}
