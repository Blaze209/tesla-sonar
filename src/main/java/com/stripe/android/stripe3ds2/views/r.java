package com.stripe.android.stripe3ds2.views;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/r;", "", "Landroidx/fragment/app/u;", "activity", "<init>", "(Landroidx/fragment/app/u;)V", "Lq80/p;", "toolbarCustomization", "Lq80/b;", "cancelButtonCustomization", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "a", "(Lq80/p;Lq80/b;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "Landroidx/fragment/app/u;", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.fragment.app.u activity;

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/r$a;", "", "<init>", "()V", "Landroidx/appcompat/app/c;", "activity", "Lq80/p;", "toolbarCustomization", "Ljn0/h0;", "a", "(Landroidx/appcompat/app/c;Lq80/p;)V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(androidx.appcompat.app.c activity, q80.p toolbarCustomization) {
            p013kotlin.jvm.internal.s.k(activity, "activity");
            p013kotlin.jvm.internal.s.k(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.a() != null) {
                v80.a.f118417a.i(activity, Color.parseColor(toolbarCustomization.a()));
            } else if (toolbarCustomization.e() != null) {
                int color = Color.parseColor(toolbarCustomization.e());
                v80.a aVar = v80.a.f118417a;
                aVar.i(activity, aVar.c(color));
            }
        }

        private Companion() {
        }
    }

    public r(androidx.fragment.app.u activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        this.activity = activity;
    }

    public final ThreeDS2Button a(q80.p toolbarCustomization, q80.b cancelButtonCustomization) {
        ActionBar supportActionBar;
        String string;
        androidx.fragment.app.u uVar = this.activity;
        androidx.appcompat.app.c cVar = uVar instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) uVar : null;
        if (cVar == null || (supportActionBar = cVar.getSupportActionBar()) == null) {
            return null;
        }
        ThreeDS2Button threeDS2Button = new ThreeDS2Button(new n.c(this.activity, n80.g.f93677a), null, 0, 6, null);
        threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
        threeDS2Button.setButtonCustomization(cancelButtonCustomization);
        supportActionBar.s(threeDS2Button, new ActionBar.a(-2, -2, 8388629));
        supportActionBar.v(true);
        if (toolbarCustomization == null) {
            supportActionBar.A(n80.f.f93676h);
            threeDS2Button.setText(n80.f.f93675g);
            return threeDS2Button;
        }
        String strA = toolbarCustomization.A();
        if (strA == null || p013kotlin.text.t.y0(strA)) {
            threeDS2Button.setText(n80.f.f93675g);
        } else {
            threeDS2Button.setText(toolbarCustomization.A());
        }
        String strE = toolbarCustomization.e();
        if (strE != null) {
            supportActionBar.r(new ColorDrawable(Color.parseColor(strE)));
            INSTANCE.a(cVar, toolbarCustomization);
        }
        String strH = toolbarCustomization.h();
        if (strH == null || p013kotlin.text.t.y0(strH)) {
            string = this.activity.getString(n80.f.f93676h);
            p013kotlin.jvm.internal.s.h(string);
        } else {
            string = toolbarCustomization.h();
            p013kotlin.jvm.internal.s.h(string);
        }
        supportActionBar.B(v80.a.f118417a.b(this.activity, string, toolbarCustomization));
        return threeDS2Button;
    }
}
